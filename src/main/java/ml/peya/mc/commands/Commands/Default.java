package ml.peya.mc.commands.Commands;

import ml.peya.mc.*;
import net.minecraft.util.*;

public class Default
{
    public static void run(String[] args)
    {
        String bypassWarningMsg = EnumChatFormatting.RED + EnumChatFormatting.BOLD.toString() + "Bypassモード" +
                EnumChatFormatting.RESET + EnumChatFormatting.AQUA.toString() + "を使用します。\n" +
                EnumChatFormatting.RED + EnumChatFormatting.BOLD + "Bypassモードでは、既に認知されている" +
                EnumChatFormatting.RESET + EnumChatFormatting.DARK_RED + "バグを使用" +
                EnumChatFormatting.RED + "しています。\n" + EnumChatFormatting.BOLD + "本当に、" +
                EnumChatFormatting.RED + EnumChatFormatting.DARK_RED + "実行しますか?"; //Bypass用のやつ(適当

        if (args.length == 4)
        {
            if (!args[3].equals("AcceptBypassWarnings"))
            {
                Players.send(EnumChatFormatting.RED + "エラー: BypassWarningsに同意してください！");
                return;
            }
        }
        else if (args.length != 3)
        {
            Players.send(EnumChatFormatting.RED + "エラー引数の数が正しくありません！" + EnumChatFormatting.RED + "\n正しい形式は、/nicks <ランク> <スキン名 または、random> <random または、bypass> です!");
            return;
        }

        String rank = args[0];
        String skin = args[1];
        String name = args[2];
        boolean bypassFlag = args.length == 4;
        if (name.equals("bypass") && !bypassFlag)
        {
            Players.send(bypassWarningMsg);
            Players.send(Texts.getWarnings(String.format("/nicks %s %s %s AcceptBypassWarnings", rank, skin, name)));
            return;
        }

        HypixelNicks.setNick(HypixelNicks.convertRankName(rank), Skins.convertSkinName(skin.toUpperCase()), name);

    }
}
