class Door
{
	int doorId;
	String doorName;
	String doorColor;
	int doorPrice;
	Lock lock;
	
	
	public void getDoorDetails()
	{
	System.out.println("Door details");
	System.out.println("door Id is :"+doorId);
	System.out.println("door Name is :"+doorName);
	System.out.println("door Color is :"+doorColor);
	System.out.println("door Price is :"+doorPrice);
	lock.getLockDetails();
	}
}