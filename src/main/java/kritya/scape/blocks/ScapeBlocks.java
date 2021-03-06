package kritya.scape.blocks;

public enum ScapeBlocks {

	ALLOYFURNACE("alloyfurnace", "alloyfurnace"),
	MITHRILORE("mithrilore", "mithrilore"),
	ADAMANTITEORE("adamantiteore", "adamantiteore");
	
	private String unlocalizedName;
	private String registryName;
	
	ScapeBlocks(String unlocalizedName, String registryName)
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
