class Zomato
{
	int zomatoId;
	String zomatoName;
	Fish fish;
	
	public void getZomatoDetails()
	{
		System.out.println("Method Invoked");
		System.out.println("The Zomato Id is " + zomatoId);
		System.out.println("The Zomato Name is " + zomatoName);
		
		fish.getFishDetails();
		System.out.println("Method Stopped");
	}
}