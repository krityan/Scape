package kritya.scape.init;

import kritya.scape.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//items
	public static Item bronzeBar;
	public static Item steelBar;

	public static void init() {
		bronzeBar = new BronzeBar();
		steelBar = new SteelBar();
	}
	
	public static void register() {
		GameRegistry.register(bronzeBar);
		GameRegistry.register(steelBar);
	}
	
	public static void registerRenders() {
		registerRender(bronzeBar);
		registerRender(steelBar);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
