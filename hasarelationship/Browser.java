class Browser 
{
	int browserId;
	String browserName;
	String companyName;
	Internet internet;
	
	public void getInfo()
	{
		System.out.println("The Browser Id is " + browserId);
		System.out.println("The Browser Name is " + browserName);
		System.out.println("The Company Name is " + companyName);
		internet.getInformation();
	}
}