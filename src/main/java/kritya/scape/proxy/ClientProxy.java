package kritya.scape.proxy;

import kritya.scape.init.ModBlocks;
import kritya.scape.init.ModItems;
import kritya.scape.init.ModTools;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModTools.registerRenders();
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
}
