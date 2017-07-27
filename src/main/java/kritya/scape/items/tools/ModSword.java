package kritya.scape.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ModSword extends ItemSword{

	public ModSword(Item.ToolMaterial material, String name)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
