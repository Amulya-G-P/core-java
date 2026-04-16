class Map
{
	int mapId;
	String mapType;
	String scale;
	Location location;
	
	public void getMapDetails()
	{
		System.out.println("Map Details invoked");
		System.out.println("The Map id is: " +mapId);
		System.out.println("The Map type is: " +mapType);
		System.out.println("The Map scale is: " +scale);
		location.getLocationDetails();
		System.out.println("Map Details ended");
	}
	
	Map(int mapId, String mapType, String scale, Location location)
	{
		this.mapId = mapId;
		this.mapType = mapType;
		this.scale = scale;
		this.location = location;
	}
	Map()
	{
		
	}
	
	public boolean createLocation(Location location)
	{
		this.location = location;
		return true;
	}

}

