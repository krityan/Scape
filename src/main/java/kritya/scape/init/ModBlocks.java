package kritya.scape.init;

import kritya.scape.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	//blocks
	public static Block alloyFurnace;
	public static Block mithrilOre;
	public static Block adamantiteOre;

	public static void init() {
		alloyFurnace = new AlloyFurnace();
		mithrilOre = new MithrilOre();
		adamantiteOre = new AdamantiteOre();
	}
	
	public static void register() {
		register(alloyFurnace);
		register(mithrilOre);
		register(adamantiteOre);
	}
	
	private static void register(Block block){
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(alloyFurnace);
		registerRender(mithrilOre);
		registerRender(adamantiteOre);
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}

