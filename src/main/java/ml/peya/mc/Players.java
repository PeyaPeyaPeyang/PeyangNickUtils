package ml.peya.mc;

import net.minecraft.client.*;
import net.minecraft.command.*;
import net.minecraft.util.*;
import net.minecraftforge.client.*;

import java.util.*;

public class Players
{
    public static void send(ChatComponentText component)
    {
        Minecraft.getMinecraft().thePlayer.addChatMessage(component);
    }

    public static void send(String component)
    {
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(component));
    }

    public static void runCommand(String command, ICommandSender sender)
    {
        ClientCommandHandler.instance.executeCommand(sender, command);
    }

    public static void runCommand(String command)
    {
        Minecraft.getMinecraft().thePlayer.sendChatMessage(command);
    }

}
