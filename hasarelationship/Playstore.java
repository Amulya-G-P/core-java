class Playstore
{
	int playStoreId;
	Application application;
	
	public void getDetails()
	{
		System.out.println("The Playstore id " + playStoreId);
		application.getApplicationInfo();
	}
}