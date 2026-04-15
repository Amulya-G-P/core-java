class Olympics
{
	static String sportNames[]={"Swimming","Cycling","Running","Relay","Athlethes","Long Jump"};
	public static void getSportNames()
	{
		System.out.println("Get sports Method invoked");
		for(String sportName : sportNames){
			System.out.println(sportName);
		}
		System.out.println("End of invoke");

	}
}