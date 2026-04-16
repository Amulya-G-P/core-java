class Fan
{
	int fanId;
	String fanName;
	String fanColor;
	int fanPrice;
	Capacitor capacitor;
	
	
	public void getFanDetails()
	{
	System.out.println("Fan details");
	System.out.println("fan Id is :"+fanId);
	System.out.println("fan Name is :"+fanName);
	System.out.println("fan Color is :"+fanColor);
	System.out.println("fan Price is :"+fanPrice);
	capacitor.getCapacitorDetails();
	}
}