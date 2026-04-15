class Lock
{
	int lockModelNo;
	int lockPrice;
	String lockBrand;
	String lockType;
	int warranty;
	
	public void getLockDetails()
	{
	System.out.println("\n"+"Lock Details is");
	System.out.println("lock Model No is :"+lockModelNo);
	System.out.println("lock Price is :"+lockPrice);
	System.out.println("lock Brand is :"+lockBrand);
	System.out.println("lock Type is :"+lockType);
	System.out.println("warranty of the lock is :"+warranty);
	}
}