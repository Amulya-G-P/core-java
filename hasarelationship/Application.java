class Application
{
	int applicationID;
	String version;
	String updatedon;
	String downloads;
	String requiredos;
	String offeredby;
	String releasedon;
	double ratings;
	
	public void getApplicationInfo()
	{
		System.out.println("The application Id is " + applicationID);
		System.out.println("The application version is " + version);
		System.out.println("The application Updated On " + updatedon);
		System.out.println("The application download " + downloads);
		System.out.println("The required OS is " + requiredos);
		System.out.println("The Offered By " + offeredby);
		System.out.println("The application released on " + releasedon);
		System.out.println("The application rating is " + ratings);
	}
}
	
	