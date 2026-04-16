class Flipkart
{
	int flipkartId;
	String flipkartName;
	Product product;
	
	public void getFlipkartDetails()
	{
		System.out.println("Method Invoked");
		System.out.println("The Flipkart Id is " + flipkartId);
		System.out.println("The Flipkart Name is " + flipkartName);
		
		product.getProductDetails();
		System.out.println("Method Stopped");
	}
}