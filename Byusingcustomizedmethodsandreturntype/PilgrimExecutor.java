class PilgrimExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Main Started");

		System.out.println("Product Dimensions : " + Pilgrim.getProductDimensions());
		System.out.println("Date First Available : " + Pilgrim.getDateFirstAvailable());
		System.out.println("Manufacturer : " + Pilgrim.getManufacturer());
		System.out.println("ASIN : " + Pilgrim.getAsin());
		System.out.println("Item Model Number : " + Pilgrim.getItemModelNumber());

		System.out.println("Main Ended");
	}
}