package kritya.scape;

import kritya.scape.init.ModBlocks;
import kritya.scape.init.ModCrafting;
import kritya.scape.init.ModItems;
import kritya.scape.init.ModTools;
import kritya.scape.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference. NAME, version = Reference.VERSION)
public class Scape {
	
	@Instance
	public static Scape instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Pre Init");
		
		ModTools.init();
		ModTools.register();
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Init");
		
		proxy.init();
		ModCrafting.register();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Post Init");	
	}
}
