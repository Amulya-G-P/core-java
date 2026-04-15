class Sim
{
	int simId;
	int validity;
	String provider;
	String type;
	int data;

	public void getSimDetails()
	{
		System.out.println("Sim Id: " + simId);
		System.out.println("Validity: " + validity);
		System.out.println("Provider: " + provider);
		System.out.println("Type: " + type);
		System.out.println("Data: " + data + "GB");
		System.out.println("-----------------------------------");
	}
}