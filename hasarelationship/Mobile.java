class Mobile
{
	int mobileId;
	String brand;
	String color;
	int price;
	Sim sim;

	public void getMobileDetails()
	{
		System.out.println("Mobile Id: " + mobileId);
		System.out.println("Brand: " + brand);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);

		sim.getSimDetails();
	}
}