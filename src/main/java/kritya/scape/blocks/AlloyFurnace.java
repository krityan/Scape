package kritya.scape.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AlloyFurnace extends Block{
	
	public AlloyFurnace() {
		super(Material.IRON);
		setUnlocalizedName(ScapeBlocks.ALLOYFURNACE.getUnlocalizedName());
		setRegistryName(ScapeBlocks.ALLOYFURNACE.getRegistryName());
	}

}
