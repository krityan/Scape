package kritya.scape.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MithrilOre extends Block{

	public MithrilOre() {
		super(Material.ROCK);
		setUnlocalizedName(ScapeBlocks.MITHRILORE.getUnlocalizedName());
		setRegistryName(ScapeBlocks.MITHRILORE.getRegistryName());
	}
}
