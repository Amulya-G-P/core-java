class Hospital
{
	static String doctorNames[]={"Sanjana","Sonal","Chanchal","Shalini","Hemali","Yeshica"};
	public static void getDoctorNames()
	{
		System.out.println("Get Doctor Method invoked");
		for(String doctorName : doctorNames){
			System.out.println(doctorName);
		}
		System.out.println("End of invoke");

	}
}