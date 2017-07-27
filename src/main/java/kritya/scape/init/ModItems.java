package kritya.scape.init;

import kritya.scape.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	// all the items added by the mod
	public static Item bronzeBar;
	public static Item steelBar;
	public static Item mithrilBar;
	public static Item adamantiteBar;

	// intialise all the items
	public static void init() {
		bronzeBar = new BronzeBar();
		steelBar = new SteelBar();
		mithrilBar = new MithrilBar();
		adamantiteBar = new AdamantiteBar();
	}
	
	// register  all the items
	public static void register() {
		GameRegistry.register(bronzeBar);
		GameRegistry.register(steelBar);
		GameRegistry.register(mithrilBar);
		GameRegistry.register(adamantiteBar);
	}
	
	// register alll the items renders
	public static void registerRenders() {
		registerRender(bronzeBar);
		registerRender(steelBar);
		registerRender(mithrilBar);
		registerRender(adamantiteBar);
	}
	
	 /**
	  * register the render for the item passed as a parameter
	  * @param item the item to register the render for
	  */
	 private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
