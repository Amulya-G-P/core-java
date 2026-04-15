class DispatchVehicle
{
	public static void outOfDelivery()
	{
		System.out.println("Out Of Delivery");
		DeliveryAgent.reachDoorStep();
	}
}