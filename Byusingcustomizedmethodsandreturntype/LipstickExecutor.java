class LipstickExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Main Started");

		System.out.println("Product Dimensions : " + Lipstick.getProductDimensions());
		System.out.println("Date First Available : " + Lipstick.getDateFirstAvailable());
		System.out.println("Manufacturer : " + Lipstick.getManufacturer());
		System.out.println("ASIN : " + Lipstick.getAsin());
		System.out.println("Item Model Number : " + Lipstick.getItemModelNumber());

		System.out.println("Main Ended");
	}
}