package moe.eod.mc.helloworld;
import  moe.eod.mc.helloworld.common.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

/**
 * @author ustc_zzzz
 */
@Mod(modid = mainClass.MODID, name = mainClass.NAME, version = mainClass.VERSION, acceptedMinecraftVersions = "1.7.10")
public class mainClass
{
    public static final String MODID = "helloworld";
    public static final String NAME = "Helloworld";
    public static final String VERSION = "1.0.0";
    @SidedProxy(clientSide = "moe.eod.mc.helloworld.client.ClientProxy", 
            serverSide = "moe.eod.mc.helloworld.common.CommonProxy")
    public static CommonProxy proxy;
    @Instance(mainClass.MODID)
    public static mainClass instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    }
}