class FlipkartExecutor
{
	public static void main(String[] args)
	{
		Flipkart flipkart=new Flipkart();
		flipkart.flipkartId=1;
		flipkart.flipkartName="Flipkart App";
		
		Product prod=new Product();
		prod.productId=101;
		prod.productName="Laptop";
		
		flipkart.product=prod;
		flipkart.getFlipkartDetails();
	}
}