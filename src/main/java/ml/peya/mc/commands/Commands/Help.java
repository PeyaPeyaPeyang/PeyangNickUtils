package ml.peya.mc.commands.Commands;

import ml.peya.mc.*;
import net.minecraft.util.*;

public class Help
{
    public static void run(String[] args)
    {
        String bypassWarningMsg = EnumChatFormatting.RED + EnumChatFormatting.BOLD.toString() + "Bypassモード" +
                EnumChatFormatting.RESET + EnumChatFormatting.AQUA.toString() + "を使用します。\n" +
                EnumChatFormatting.RED + EnumChatFormatting.BOLD + "Bypassモードでは、既に認知されている" +
                EnumChatFormatting.RESET + EnumChatFormatting.DARK_RED + "バグを使用" +
                EnumChatFormatting.RED + "しています。\n" + EnumChatFormatting.BOLD + "本当に、" +
                EnumChatFormatting.RED + EnumChatFormatting.DARK_RED + "実行しますか?"; //Bypass用のやつ(適当

        switch (args.length)
        {
            case 1:
                Players.send(EnumChatFormatting.AQUA + "===================");
                Players.send(EnumChatFormatting.AQUA + "Nickをセットします！");
                Players.send(EnumChatFormatting.AQUA + "ランクを押してください！\n");

                Players.send(Texts.getRank(EnumChatFormatting.GRAY, "DEFAULT", "default"));
                Players.send(Texts.getRank(EnumChatFormatting.GREEN, "VIP", "vip"));
                Players.send(Texts.getRank(EnumChatFormatting.GREEN, "VIP" + EnumChatFormatting.GOLD + "+", "vip_plus"));
                Players.send(Texts.getRank(EnumChatFormatting.AQUA, "MVP", "mvp"));
                Players.send(Texts.getRank(EnumChatFormatting.AQUA, "MVP" + EnumChatFormatting.RED + "+", "mvp_plus"));
                break;
            case 2:
                String skinText = EnumChatFormatting.AQUA + "===================\n" +
                        EnumChatFormatting.AQUA + "続いて、スキンを選択してください！\n";
                Players.send(skinText);
                Players.send(Texts.getSkin("通常の自分のスキン", "を使用する", "real", args[1]));
                Players.send(Texts.getSkin("ランダムなスキン", "使用する", "random", args[1]));
                Players.send(Texts.getSkin("SteveかAlexのスキン", "を使用する", "reset", args[1]));
                Players.send(Texts.getSkin("スキン名を入力", "をする", "input", args[1]));
                break;
            case 3:
                if (args[2].equals("input"))
                {
                    String inputText = EnumChatFormatting.AQUA + "===================\n" +
                            EnumChatFormatting.AQUA + "/nicks <スキン名> を入力してください！\n";
                    Players.send(inputText);
                    PeyangNickutils.isSkin = true;
                    PeyangNickutils.command = "/nicks help " + args[1] + " ";
                    return;
                }
                String nameText = EnumChatFormatting.AQUA + "===================\n" +
                        EnumChatFormatting.GREEN + "続いて、名前の生成方法を選択してください！\n";
                Players.send(nameText);
                Players.send(Texts.getName("ランダムな名前を生成する", "random", "/nicks help " + args[1] + " " + args[2] + " ", false));
                Players.send(Texts.getName("ランダム名をバイパスする", "bypass", "/nicks help " + args[1] + " " + args[2] + " ", true));
                Players.send(Texts.getName("スキンまたはランクのみ変更する", "processing", "/nicks help " + args[1] + " " + args[2] + " ", false));
                break;
            case 4:
                String rank = args[1];
                String skin = args[2];
                String name = args[3];

                if (name.equals("bypass"))
                {
                    Players.send(bypassWarningMsg);
                    Players.send(Texts.getWarnings(String.format("/nicks help %s %s %s AcceptBypassWarnings", rank, skin, name)));
                    return;
                }

                HypixelNicks.setNick(rank, skin, name);
                break;
            case 5:
                if (args[3].equals("bypass"))
                {
                    if (!args[4].equals("AcceptBypassWarnings"))
                    {
                        Players.send(EnumChatFormatting.RED + "エラー: BypassWarningsに同意してください！");
                        return;
                    }

                    HypixelNicks.setNick(args[1], args[2], args[3]);
                }
                else
                    Players.send(EnumChatFormatting.RED + "エラー: 引数の指定が間違っています！");
        }
    }
}
