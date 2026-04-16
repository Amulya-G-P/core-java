class MapOneExecutor
{
	public static void main(String[] m)
	{
		Map map = new Map();
		map.mapId = 11;
		map.mapType = "Physical";
		map.scale = "1:5000";
		
		Location location = new Location();
		location.locationId = 10;
		location.name = "Mysure";
		location.coordinates = "13.97N, 37.59E";
		
		map.location = location;
		
		map.getMapDetails();
	}
}

