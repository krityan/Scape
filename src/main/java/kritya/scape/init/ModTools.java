package kritya.scape.init;

import kritya.scape.items.tools.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTools {
	
	//tools
	public static Item steelSword;

	public static void init() {
		steelSword = new ModSword(ModMaterials.steelToolMaterial, ScapeTools.STEELSWORD.getRegistryName());
	}
	
	public static void register() {
		GameRegistry.register(steelSword);
	}
	
	public static void registerRenders() {
		registerRender(steelSword);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
