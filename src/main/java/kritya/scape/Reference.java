package kritya.scape;

public class Reference {
	
	public static final String MODID = "scape";
	public static final String NAME = "Scape Overhaul Mod";
	public static final String VERSION = "0.1";
	
	public static final String CLIENT_PROXY_CLASS = "kritya.scape.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "kritya.scape.proxy.ServerProxy";
	
	public static enum ScapeItems {
		BRONZEBAR("bronzebar", "bronzebar"),
		STEELBAR("steelbar", "steelbar");
		
		private String unlocalizedName;
		private String registryName;
		
		ScapeItems(String unlocalizedName, String registryName)
		{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() 
		{
			return registryName;
		}
		
		public String getUnlocalizedName() 
		{
			return unlocalizedName;
		}
	}
}
