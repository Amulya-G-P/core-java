class Gym
{
	static String names[]={"Barbell","Dumbell","Rowing","Treadmill","Chest Press","Power Rack"};
	public static void getNames()
	{
		System.out.println("Get Method invoked");
		for(String name : names){
			System.out.println(name);
		}
		System.out.println("End of invoke");

	}
}