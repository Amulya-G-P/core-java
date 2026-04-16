class Location
{
	int locationId;
	String name;
	String coordinates;
	
	public void getLocationDetails()
	{
		System.out.println("Location Details invoked");
		System.out.println("The location id is: " + locationId);
		System.out.println("The location name is: " +name);
		System.out.println("The location coordinates is: " +coordinates);
		System.out.println("Location Details ended");
	}
}

