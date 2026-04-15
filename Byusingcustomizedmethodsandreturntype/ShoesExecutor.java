class ShoesExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Main Started");

		System.out.println("Product Dimensions : " + Shoes.getProductDimensions());
		System.out.println("Date First Available : " + Shoes.getDateFirstAvailable());
		System.out.println("Manufacturer : " + Shoes.getManufacturer());
		System.out.println("ASIN : " + Shoes.getAsin());
		System.out.println("Item Model Number : " + Shoes.getItemModelNumber());

		System.out.println("Main Ended");
	}
}