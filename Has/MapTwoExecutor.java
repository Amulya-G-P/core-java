class MapTwoExecutor
{
	public static void main(String[] m)
	{
		Map map = new Map();
		map.mapId = 11;
		map.mapType = "Physical";
		map.scale = "1:50000";
		
		Location location = new Location();
		location.locationId = 12;
		location.name = "bengaluru";
		location.coordinates = "32.37N, 27.49E";
		
		boolean create = map.createLocation(location);
		System.out.println(create);
		
		map.getMapDetails();
		
	}
}
