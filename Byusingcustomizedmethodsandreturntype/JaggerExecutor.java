class JaggerExecutor
{
	public static void main(String[] args)
	{
		System.out.println("Main Started");

		System.out.println("Brand : " + Jagger.getBrand());
		System.out.println("Material : " + Jagger.getMaterial());
		System.out.println("Product Dimensions : " + Jagger.getProductDimensions());
		System.out.println("Item Weight : " + Jagger.getItemWeight());
		System.out.println("ASIN : " + Jagger.getAsin());

		System.out.println("Main Ended");
	}
}