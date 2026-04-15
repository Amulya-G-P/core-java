class SmartWatchExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Main Started");

		System.out.println("Brand : " + SmartWatch.getBrand());
		System.out.println("Manufacturer : " + SmartWatch.getManufacturer());
		System.out.println("Series : " + SmartWatch.getSeries());
		System.out.println("Item Model Number : " + SmartWatch.getItemModelNumber());
		System.out.println("Country Of Origin : " + SmartWatch.getCountryOfOrigin());

		System.out.println("Main Ended");
	}
}