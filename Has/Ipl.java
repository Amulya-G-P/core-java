class Ipl
{
	int iplId;
	String iplName;
	Rcb rcb;
	
	public void getIplDetails()
	{
		System.out.println("Method Invoked");
		System.out.println("The IPL Id is " + iplId);
		System.out.println("The IPL Name is " + iplName);
		
		rcb.getRcbDetails();
		System.out.println("Method Stopped");
	}
}

