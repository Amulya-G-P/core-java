class Amazon
{
	int amazonId;
	String amazonName;
	Category category;
	
	public void getAmazonDetails()
	{
		System.out.println("Method Invoked");
		System.out.println("The Amazon Id is " + amazonId);
		System.out.println("The Amazon Id is " +  amazonName);
		
		category.getCategoryDetails();
		System.out.println("Method Stopped");
		
	}
}