package ml.peya.mc.commands.Commands;

import ml.peya.mc.*;
import net.minecraft.util.*;

public class Skin
{
    public static void run(String[] args)
    {
        if (args.length != 2)
        {
            Players.send(EnumChatFormatting.RED + "エラー：引数の数が正しくありません！");
            return;
        }

        HypixelNicks.setSkin(args[1]);
    }
}
