package moe.eod.mc.helloworld.misc;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class clsCreativeTabLoader {
	public static CreativeTabs tabHelloworld;
	public clsCreativeTabLoader(FMLPreInitializationEvent event)
    {
		tabHelloworld = new clsCreativeTab();
    }
}
