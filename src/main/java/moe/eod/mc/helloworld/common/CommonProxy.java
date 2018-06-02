package moe.eod.mc.helloworld.common;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import moe.eod.mc.helloworld.item.clsItemLoader;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event)
    {
    	new clsItemLoader(event);
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
