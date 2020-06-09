package ml.peya.mc;

import ml.peya.mc.commands.*;
import ml.peya.mc.commands.Nicks;
import ml.peya.mc.exception.*;
import net.minecraft.client.*;
import net.minecraft.client.entity.*;
import net.minecraft.crash.*;
import net.minecraft.util.*;
import net.minecraftforge.client.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.*;
import net.minecraftforge.event.entity.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.relauncher.*;

import javax.swing.text.html.parser.*;
import java.util.logging.*;

@Mod(modid = PeyangNickutils.MOD_ID,
        name = PeyangNickutils.MOD_NAME,
        version = PeyangNickutils.MOD_VERSION,
        acceptedMinecraftVersions = PeyangNickutils.MOD_ACCEPTED_MC_VERSIONS,
        useMetadata = true)
public class PeyangNickutils
{
    public static final String MOD_ID = "peyangnickutils";
    public static final String MOD_NAME = "PeyangNickUtils";
    public static final String MOD_VERSION = "1.1";
    public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.8,)";
    public static Logger logger;
    public static boolean isSkin;
    public static String command;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        if(e.getSide() == Side.SERVER)
        {
            System.out.println("This Forge Mod is not server compatible. Only client side compatible.");
            Minecraft.getMinecraft().crashed(new CrashReport("This Forge Mod is not server compatible. Only client side compatible.",
                    new BadSideException("This Forge Mod is not server compatible. Only client side compatible.")));
        }
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        ClientCommandHandler.instance.registerCommand(new Nicks());
        logger = Logger.getLogger(MOD_ID);
        command = "";
        isSkin = false;
    }
}
