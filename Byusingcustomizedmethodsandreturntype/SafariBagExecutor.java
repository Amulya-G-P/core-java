class SafariBagExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Main Started");

		System.out.println("Department : " + SafariBag.getDepartment());
		System.out.println("Manufacturer : " + SafariBag.getManufacturer());
		System.out.println("Country Of Origin : " + SafariBag.getCountryOfOrigin());
		System.out.println("Item Model Number : " + SafariBag.getItemModelNumber());
		System.out.println("ASIN : " + SafariBag.getAsin());

		System.out.println("Main Ended");
	}
}