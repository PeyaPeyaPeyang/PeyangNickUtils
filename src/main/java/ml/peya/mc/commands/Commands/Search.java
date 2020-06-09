package ml.peya.mc.commands.Commands;

import ml.peya.mc.*;
import net.minecraft.event.*;
import net.minecraft.util.*;

import java.util.*;

public class Search
{
    public static void run(String[] args)
    {
        boolean sizeFlag = false;
        boolean regexFlag = false;
        if (args.length == 1)
        {
            String inputText = EnumChatFormatting.AQUA + "===================\n" +
                    EnumChatFormatting.AQUA + "スキンを検索します！\n" +
                    EnumChatFormatting.AQUA + "/nicks <検索語句> を入力してください！\n" +
                    EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC + "NOTE: /nicks @ <正規表現> を入力すると、正規表現検索ができます！";
            Players.send(inputText);
            PeyangNickutils.isSkin = true;
            PeyangNickutils.command = "/nicks search ";
            return;
        }
        else if (args[1].equals("AcceptSizeWarning"))
            sizeFlag = true;

        String searchWords = EnumChatFormatting.AQUA + "===================\n" +
                EnumChatFormatting.AQUA + "検索中です...";
        Players.send(searchWords);
        boolean finalSizeFlag = sizeFlag;
        new Thread(()->{
            ArrayList<String> words = new ArrayList<>(Arrays.asList(args));
            if (finalSizeFlag)
                words.remove(1);



            words.remove(0);

            ArrayList<String> skins = Skins.getAllSkinNames();

            skins.remove("reset");
            skins.remove("real");
            skins.remove("random");

            ArrayList<String> results = new ArrayList<>();

            for (String word: words)
            {
                for (String result: skins)
                {
                    if (result.contains(word))
                        results.add(result);
                    else if (word.startsWith("-"))
                    {
                        if (result.contains(word.replace("-", "")))
                            results.remove(result);
                    }
                }
            }


            Players.send(EnumChatFormatting.GRAY + "検索結果: " + results.size() + "件\n");
            if (results.size() == 0)
            {
                Players.send(EnumChatFormatting.GRAY + EnumChatFormatting.ITALIC.toString() + "    検索結果なし");
                return;
            }
            else if (results.size() > 20 && !finalSizeFlag)
            {
                Players.send(EnumChatFormatting.GRAY + "検索結果が、20件を超えています。表示しますか？");
                Players.send(Texts.getCommandText("    [" + EnumChatFormatting.GREEN + "はい" + EnumChatFormatting.WHITE + "]",
                        "/nicks search AcceptSizeWarning " + String.join(" ", words),
                        EnumChatFormatting.GREEN + "表示する"));
                return;
            }

            ChatComponentText result = new ChatComponentText("");
            int count = 0;
            for (String resultTxt: results)
            {
                ChatComponentText tmpResult = new ChatComponentText(EnumChatFormatting.GREEN + resultTxt + "   ");
                ChatStyle style = new ChatStyle();
                style.setChatHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
                        new ChatComponentText(EnumChatFormatting.GREEN + "スキンを " + resultTxt + " にセットする")));
                style.setChatClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/nicks skin " + resultTxt));
                tmpResult.setChatStyle(style);

                result.appendSibling(tmpResult);
                count++;
                if (count == 4)
                {
                    Players.send(result);
                    result = new ChatComponentText("");
                    count = 0;
                }
            }
            if (!result.equals(new ChatComponentText("")))
                Players.send(result);

        }).start();
    }
}
