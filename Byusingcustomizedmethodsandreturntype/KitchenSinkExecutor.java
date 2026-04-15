class KitchenSinkExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Main Started");

		System.out.println("Manufacturer : " + KitchenSink.getManufacturer());
		System.out.println("Country Of Origin : " + KitchenSink.getCountryOfOrigin());
		System.out.println("Item Model Number : " + KitchenSink.getItemModelNumber());
		System.out.println("Product Dimensions : " + KitchenSink.getProductDimensions());
		System.out.println("ASIN : " + KitchenSink.getAsin());

		System.out.println("Main Ended");
	}
}