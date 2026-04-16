class Lakme
{
	int brandId;
	String brandName;
	Cream cream;
	
	public void getLakmeDetails()
	{
		System.out.println("Method Invoked");
		System.out.println("The Brand Id is " + brandId);
		System.out.println("The Brand Name is " + brandName);
		
		cream.getCreamDetails();
		System.out.println("Method Stopped");
	}
}
