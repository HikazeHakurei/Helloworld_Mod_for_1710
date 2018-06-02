package moe.eod.mc.helloworld.misc;
import moe.eod.mc.helloworld.item.clsItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class clsCreativeTab extends CreativeTabs {
	public clsCreativeTab() {
		super("helloworld");
	}
	@Override
	public Item getTabIconItem() {
		return clsItemLoader.helloworldItem;
	}
}
