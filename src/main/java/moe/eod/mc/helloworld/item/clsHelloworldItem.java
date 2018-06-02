package moe.eod.mc.helloworld.item;
import net.minecraft.item.Item;
import moe.eod.mc.helloworld.misc.clsCreativeTabLoader;
public class clsHelloworldItem extends Item{
	public clsHelloworldItem() {
		 super();
	     this.setUnlocalizedName("Helloworld");
	     this.setCreativeTab(clsCreativeTabLoader.tabHelloworld);
	}
}
