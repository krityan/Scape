package kritya.scape.items.tools;

public enum ScapeTools {

	STEELSWORD("steelsword","steelsword");
	
	private String unlocalizedName;
	private String registryName;
	
	private ScapeTools(String unlocalizedName, String registryName)
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
