class OlaExecutor
{
	public static void main(String[] args)
	{
		System.out.println(" Ola and Driver");
		
		Ola ola=new Ola();
		ola.olaId=1;
		ola.olaName="Ola App";
		ola.olaId=2;
		ola.olaName="Ola Cabs";
		
		Driver driver=new Driver();
		driver.driverId=201;
		driver.driverName="Ramesh";
		driver.driverId=202;
		driver.driverName="Suresh";
		
		ola.driver=driver;
		
		ola.getOlaDetails();
	}
}