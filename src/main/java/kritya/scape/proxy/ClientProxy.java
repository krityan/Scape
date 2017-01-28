package kritya.scape.proxy;

import kritya.scape.init.ModBlocks;
import kritya.scape.init.ModItems;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
}
