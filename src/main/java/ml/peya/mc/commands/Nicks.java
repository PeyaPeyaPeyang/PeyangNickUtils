package ml.peya.mc.commands;

import ml.peya.mc.*;
import ml.peya.mc.commands.Commands.*;
import net.minecraft.command.*;
import net.minecraft.util.*;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class Nicks extends CommandBase
{
    @Override
    public String getCommandName()
    {
        return "nicks";
    }

    @Override
    public String getCommandUsage(ICommandSender iCommandSender)
    {
        return "nicks";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args)
    {

        if (args.length == 0)
        {
            String text = EnumChatFormatting.AQUA + "===== " +
                    EnumChatFormatting.GREEN + "[" +
                    EnumChatFormatting.BLUE + "PeyangNickUtils" +
                    EnumChatFormatting.GREEN + "]" +
                    EnumChatFormatting.AQUA + " =====";
            Players.send(text);
            Players.send(EnumChatFormatting.AQUA + "操作を選択してください！\n");

            Players.send(Texts.getCommandText(EnumChatFormatting.GREEN + "ニックネームを設定する",
                    "/nicks help",
                    EnumChatFormatting.GREEN + "ニックネームを設定する"));

            Players.send(Texts.getCommandText(EnumChatFormatting.GREEN + "ニックネーム用のスキンを検索する",
                    "/nicks search",
                    EnumChatFormatting.GREEN + "ニックネーム用のスキンを検索する"));

            Players.send(Texts.getCommandText(EnumChatFormatting.RED + "ニックネームをリセットする",
                    "/nicks reset",
                    EnumChatFormatting.RED + "ニックネームをリセットする"));


            return;
        }
        else if (PeyangNickutils.isSkin)
        {
            PeyangNickutils.isSkin = false;
            final String command = PeyangNickutils.command;
            final String arg = String.join(" ", args);
            final String execCmd = command + arg;
            Players.runCommand(execCmd, sender);
            return;
        }

        switch (args[0])
        {
            case "reset":
                Reset.run(args);
                return;
            case "search":
                Search.run(args);
                return;
            case "skin":
                Skin.run(args);
                return;
            case "help":
                Help.run(args);
                return;
        }

        Default.run(args);
}

    @Override
    public int getRequiredPermissionLevel()
    {
        return 0;
    }

    @Override
    public List<String> addTabCompletionOptions(ICommandSender sender, String[] input, BlockPos pos)
    {
        if (!PeyangNickutils.isSkin)
            return new ArrayList<>();

        ArrayList<String> list = Skins.getAllSkinNames();
        ArrayList<String> response = new ArrayList<>();
        if (input.length == 0)
            return list;
        String inputed = input[0].toUpperCase();

        for (String name: list)
        {
            if (name.startsWith(inputed))
                response.add(name);
        }

        return response;
    }

}
