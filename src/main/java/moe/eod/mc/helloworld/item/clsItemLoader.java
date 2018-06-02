package moe.eod.mc.helloworld.item;
import net.minecraft.item.Item;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
public class clsItemLoader {
	public static Item helloworldItem = new clsHelloworldItem();
	public clsItemLoader(FMLPreInitializationEvent event) {
		helloworldItem.setUnlocalizedName("helloworld");
		GameRegistry.registerItem(helloworldItem,helloworldItem.getUnlocalizedName());
	}
}
