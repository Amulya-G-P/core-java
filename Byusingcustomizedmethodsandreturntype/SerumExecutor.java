class SerumExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Main Started");

		System.out.println("Manufacturer : " + Serum.getManufacturer());
		System.out.println("Country Of Origin : " + Serum.getCountryOfOrigin());
		System.out.println("Item Model Number : " + Serum.getItemModelNumber());
		System.out.println("Product Dimensions : " + Serum.getProductDimensions());
		System.out.println("ASIN : " + Serum.getAsin());

		System.out.println("Main Ended");
	}
}