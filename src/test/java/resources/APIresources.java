package resources;

public enum APIresources {
	
	RestAPI("/promotions?apikey=GDMSTGExy0sVDlZMzNDdUyZ");
	
	private String resource;
	
	APIresources(String resource)
	{
	this.resource = resource;
	}

	public String getResource()
	{
	return resource;
	}
}
