package ml.peya.mc;

import java.util.*;

public class Skins
{
    public static String convertSkinName(String name)
    {
        switch (name)
        {
            case "real":
            case "my":
                return "real";
            case "rand":
            case "random":
                return "random";
            default:
                return name;
        }
    }

    public static ArrayList<String> getAllSkinNames()
    {
        ArrayList<String> list =  new ArrayList<>();
        list.add("ABRAHAMLINCOLN");
        list.add("ABRAHAMLINCOLN_2");
        list.add("ADVENTURER");
        list.add("ANIMALHUNTER");
        list.add("ARCTICTRAVELLER");
        list.add("ARMYOFFICER");
        list.add("ARNOLDSCHWARZENEGGER");
        list.add("ASSASSIN");
        list.add("ASTRONAUT");
        list.add("AUTUMN");


        list.add("BANDANA");
        list.add("BANDIT");
        list.add("BARMAN");
        list.add("BATGIRL");
        list.add("BATTLEMONK");
        list.add("BIOHAZARDSUIT");
        list.add("BLACKANDBLUE");
        list.add("BLACKHOODIE");
        list.add("BLACKJACKET");
        list.add("BLACKSHIRT");
        list.add("BLONDEHAIR");
        list.add("BLONDETEENAGER");
        list.add("BLONDIE");
        list.add("BLUEANDWHITE");
        list.add("BLUEBOY");
        list.add("BLUEHOODIE");
        list.add("BLUESTRIPES");
        list.add("BLUETEENAGER");
        list.add("BOYHOODIE");
        list.add("BRIGHTGIRL");
        list.add("BUNNY");
        list.add("BUSINESSSUIT");
        list.add("BUTCHER");


        list.add("CANDYGIRL");
        list.add("CANDYPOP");
        list.add("CASUALGIRL");
        list.add("CASUALGUY");
        list.add("CASUALHOODIE");
        list.add("CAVEMAN");
        list.add("CHISAKI");
        list.add("CHRISTMASGIRL");
        list.add("CHUCKNORRIS");
        list.add("CLEOPATRA");
        list.add("COOLBLUEGUY");
        list.add("COOLBOY");
        list.add("COOLGAMER");
        list.add("COOLHOODIE");
        list.add("COUNTRYGIRL");
        list.add("COWBOY");
        list.add("CREEPER");
        list.add("CREEPERBOY");
        list.add("CTHULHU");
        list.add("CUPA");
        list.add("CUTEGIRL");


        list.add("DAEMONGHAST");
        list.add("DARKHOODIE");
        list.add("DARKKNIGHT");
        list.add("DINOBOY");
        list.add("DINOGIRL");
        list.add("DIVER");
        list.add("DJ");
        list.add("DRAGON");


        list.add("ELEVATORGUY");
        list.add("ENDERMANHUNTER");
        list.add("ESKIMO");


        list.add("FADEDTEEN");
        list.add("FADEDWINTER");
        list.add("FARMER");
        list.add("FIREMAGE");
        list.add("FIREMONSTER");
        list.add("FLORAL");
        list.add("FOX");
        list.add("FOXHOODIE");
        list.add("FOXYLADY");
        list.add("FROSTGIRL");


        list.add("GAMEBOYHOODIE");
        list.add("GAMERBOY");
        list.add("GAMERGIRL");
        list.add("GANGSTER");
        list.add("GHOSTBOY");
        list.add("GHOSTGIRL");
        list.add("GIRL");
        list.add("GLASSES");
        list.add("GOLDENHOODIE");
        list.add("GOLDENHOODIE_2");
        list.add("GOLDKNIGHT");
        list.add("GRAYHOODIE");
        list.add("GREENKNIGHT");
        list.add("GREENSHIRT");
        list.add("GREENTEEN");
        list.add("GRIEFER");
        list.add("GRIMREAPER");


        list.add("HARAMBE");
        list.add("HATSUNEMIKU");
        list.add("HIPSTERGUY");
        list.add("HUNGRYBOY");


        list.add("ICECRYSTALS");
        list.add("ICEPRINCESS");
        list.add("IRONMINER");


        list.add("LAVENDER");
        list.add("LIGHTBLUEHOODIE");
        list.add("LIMEHOODIE");
        list.add("LUMBERJACK");


        list.add("MAROON");
        list.add("MAROON_2");
        list.add("MARTIALARTIST");
        list.add("MINECONATTENDEE");
        list.add("MINECRAFTGAMER");
        list.add("MOANA");
        list.add("MODERNSOLDIER");
        list.add("MONK");
        list.add("MUDKIPGIRL");
        list.add("NAGISASHIOTA");


        list.add("NAPOLEON");
        list.add("NAVYCAPTAIN");
        list.add("NEILARMSTRONG");
        list.add("NFLPLAYER");
        list.add("NIGHTGIRL");
        list.add("NIGHTSKY");
        list.add("NIKEBOY");
        list.add("NINJAKID");
        list.add("NORMALGIRL");


        list.add("OCEANDUSK");
        list.add("OLDEXPLORER");
        list.add("OMBREBABE");
        list.add("ORANGEHOODIE");


        list.add("PARKOURTEEN");
        list.add("PETE");
        list.add("PIKAGIRL");
        list.add("PILOT");
        list.add("PINKHAIRBOY");
        list.add("PINKTUX");
        list.add("PLAIDBOY");
        list.add("PLAIDSHIRT");
        list.add("PLAYFULCHARM");
        list.add("POLICEMAN");
        list.add("PONYGIRL");
        list.add("PUMPKINBOSS");


        list.add("RAINBOOTS");
        list.add("RAINBOW");
        list.add("REDEYES");
        list.add("EDHOODIE");
        list.add("REDJACKET");
        list.add("REDJUMPER");
        list.add("REDROSES");
        list.add("REDSCARF");
        list.add("REDSTONEGUY");
        list.add("REDTEEN");
        list.add("RIOTPOLICE");
        list.add("RIPPEDJEANS");
        list.add("ROGUE");
        list.add("ROMANCITIZEN");


        list.add("SAFETYMINER");
        list.add("SAMURAI");
        list.add("SANTA");
        list.add("SCARF");
        list.add("SCIENTIST");
        list.add("SCOTTISHSTEVE");
        list.add("SIMPLUSPLAID");
        list.add("SKATERBOY");
        list.add("SKULLMAGE");
        list.add("SLIMEGIRL");
        list.add("SNOWSUIT");
        list.add("SPACEEXPLORER");
        list.add("SPLIT");
        list.add("SPORTYBOY");
        list.add("STARDUST");
        list.add("STRIPEDHOODIE");
        list.add("STRIPEDTEEN");
        list.add("SUMMERBOY");
        list.add("SURPRISEDDUDE");


        list.add("TECHARMOUR");
        list.add("TEENAGER");
        list.add("TEENMINER");
        list.add("TENNISPLAYER");
        list.add("THICKJACKET");
        list.add("TIGERONESIE");
        list.add("TOUGHTEEN");


        list.add("TUXEDO");


        list.add("VINTAGEROSES");


        list.add("WHITEHOODIE");
        list.add("WINTERDEAMS");
        list.add("WINTERPARKOUR");
        list.add("WINTERWONDERLAND");
        list.add("WOODCREEPER");


        list.add("YELLOWHOODIE");
        list.add("YELLOWSHOES");


        list.add("ZYRO");

        list.add("real");
        list.add("reset");
        list.add("random");

        return list;
    }
}
