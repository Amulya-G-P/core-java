class Ola
{
	int olaId;
	String olaName;
	Driver driver;
	
	public void getOlaDetails()
	{
		System.out.println("Method Invoked");
		System.out.println("The Ola Id is " + olaId);
		System.out.println("The Ola Name is " + olaName);
		
		driver.getDriverDetails();
		System.out.println("Method Stopped");
	}
}