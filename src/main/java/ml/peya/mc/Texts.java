package ml.peya.mc;

import net.minecraft.event.*;
import net.minecraft.util.*;

public class Texts
{
    public static ChatComponentText getRank(EnumChatFormatting color, String name, String sysName)
    {
        return getCommandText(color + name,
                "/nicks help " + sysName,
                String.format("%s%s"+ EnumChatFormatting.GREEN + "にセット!", color, name));
    }

    public static ChatComponentText getSkin(String name, String suf, String sysName, String rank)
    {
        String format = String.format(EnumChatFormatting.GREEN + "%s" + suf, name);
        return getCommandText(format,
                "/nicks help " + rank + " " + sysName,
                format);
    }

    public static ChatComponentText getName(String name, String sysName, String command, boolean field_e38b58f)
    {
        String textStr = String.format((field_e38b58f ? (EnumChatFormatting.RED.toString() + EnumChatFormatting.BOLD): EnumChatFormatting.GREEN) + "%s", name);
        return getCommandText(textStr,
                command + sysName,
                textStr);
    }


    public static ChatComponentText getWarnings(String command)
    {
        String textStr = "    [" +
                EnumChatFormatting.DARK_RED + EnumChatFormatting.BOLD + "はい、私は危険を理解し、実行します。" +
                EnumChatFormatting.RESET + "]";
        return getCommandText(textStr,
                command,
                EnumChatFormatting.RED + EnumChatFormatting.BOLD.toString() + "実行する");

    }


    public static ChatComponentText getCommandText(String text, String command, String hover)
    {
        ChatComponentText texts = new ChatComponentText(text);
        ChatStyle style = new ChatStyle();
        style.setChatHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT,
                new ChatComponentText(hover)));
        style.setChatClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, command));
        texts.setChatStyle(style);
        return texts;
    }
}
