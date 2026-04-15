class CarrierService
{
	public static void pickUpPackage()
	{
		System.out.println("Picking the Package");
		HubRouter.sortToZipCode();
	}
}