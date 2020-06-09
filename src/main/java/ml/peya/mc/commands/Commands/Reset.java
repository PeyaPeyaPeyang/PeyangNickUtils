package ml.peya.mc.commands.Commands;

import ml.peya.mc.*;
import net.minecraft.util.*;

public class Reset
{
    public static void run(String[] args)
    {
        new Thread(() ->
        {

            try
            {
                Players.send(EnumChatFormatting.RED + "Nickをリセットしまていす。。。");
                Thread.sleep(1000);
                Players.runCommand("/nick reset");
                Thread.sleep(500);
                Players.send(EnumChatFormatting.AQUA + "ニックネームを正常にリセットしました！");
            }
            catch (InterruptedException ignored)
            {
            }
        }).start();
    }

}