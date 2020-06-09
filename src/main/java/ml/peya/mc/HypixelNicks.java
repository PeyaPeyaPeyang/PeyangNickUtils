package ml.peya.mc;

import net.minecraft.util.*;

public class HypixelNicks
{
    public static String convertRankName(String name)
    {

        switch (name.toLowerCase())
        {
            case "default":
            case "def":
                return "default";
            case "vip":
                return "vip";

            case "vip_plus":
            case "vip+":
            case "vipplus":
                return "vip_plus";
            case "mvp":
                return "mvp";
            case "mvp+":
            case "mvp_plus":
            case "mvpplus":
                return "mvp_plus";
            default:
                return "unknown";
        }
    }

    public static void setNick(String rank, String skin, String name)
    {
        new Thread(() ->
        {
            try
            {
                switch (name)
                {
                    case "bypass":
                        Players.send(EnumChatFormatting.GREEN + "ランダム生成中…");
                        Players.runCommand("/nick random");
                        Thread.sleep(1000);
                        break;
                    case "random":
                        Players.send(EnumChatFormatting.GREEN + "ランダム生成中…");
                        Players.runCommand("/nick help setrandom");
                        Thread.sleep(1000);
                        break;
                    case "processing":
                        Players.send(EnumChatFormatting.GREEN + "ニックネームの更新は行わず、スキンとランクのみを変更します。");
                        break;
                }

                setSkin(skin);
                Thread.sleep(1000);
                setRank(rank);
                Thread.sleep(1000);
                Players.send(EnumChatFormatting.AQUA + "ニックネームを正常に設定しました！");
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }).start();

    }

    public static void setSkin(String name)
    {
        new Thread(() ->
        {
            try
            {

                Players.send(EnumChatFormatting.GREEN + "スキンを設定中…");
                Players.send(name);
                if (!Skins.getAllSkinNames().contains(name))
                {
                    Players.send(EnumChatFormatting.RED + "エラー：認識できないスキン名です。最初からやり直してください。");
                    return;
                }
                Players.runCommand("/nick skin " + name);
                Thread.sleep(500);
                Players.send(EnumChatFormatting.AQUA + "スキンを正常に設定しました！");

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }).start();
    }

    public static void setRank(String rank)
    {
        new Thread(() ->
        {
            try
            {
                if (convertRankName(rank).equals("unknown"))
                {
                    Players.send(EnumChatFormatting.RED + "エラー：認識できないランクです。最初からやり直してください。");
                    return;
                }
                Players.send(EnumChatFormatting.GREEN + "ランクを設定中…");
                Players.runCommand("/nick rank " + rank);
                Thread.sleep(500);
                Players.send(EnumChatFormatting.AQUA + "ランクを正常に設定しました！");

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }).start();
    }
}
