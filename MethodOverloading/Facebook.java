class Facebook
{
	public static void logIn(String email, String password)
	{
		System.out.println("Accepted email and Passwords");
		System.out.println(email);
		System.out.println(password);
		
	}
	public static void logIn(long phoneNumber, String password)
	{
		System.out.println("Accepted Phone number and Passwords");
		System.out.println(phoneNumber);
		System.out.println(password);
	}
}