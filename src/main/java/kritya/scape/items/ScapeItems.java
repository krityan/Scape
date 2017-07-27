package kritya.scape.items;

public enum ScapeItems {
	KNIFE("knife", "knife"),
	BRONZEBAR("bronzebar", "bronzebar"),
	STEELBAR("steelbar", "steelbar"),
	MITHRILBAR("mithrilbar", "mithrilbar"),
	ADAMANTITEBAR("adamantitebar", "adamantitebar");
	
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
