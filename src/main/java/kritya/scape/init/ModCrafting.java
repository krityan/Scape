package kritya.scape.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

    public static void register() {
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.knife), "I ", " S", 'I', Items.IRON_INGOT, 'S', Items.STICK);
    }
}
