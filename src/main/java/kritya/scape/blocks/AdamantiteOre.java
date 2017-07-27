package kritya.scape.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AdamantiteOre extends Block{

	public AdamantiteOre() {
		super(Material.ROCK);
		setUnlocalizedName(ScapeBlocks.ADAMANTITEORE.getUnlocalizedName());
		setRegistryName(ScapeBlocks.ADAMANTITEORE.getRegistryName());
	}
}

