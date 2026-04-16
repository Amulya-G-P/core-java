class FacebookExecutor
{
	public static void main(String[] any)
	{
		String user1Interests[] = {"Music","Travel"};
		String user2Interests[] = {"Gaming","Coding"};
		String user3Interests[] = {"Reading","Writing"};
		String user4Interests[] = {"Fitness","Yoga"};
		String user5Interests[] = {"Movies","Photography"};

		Facebook facebook = new Facebook();

		Account acc1 = new Account();
		acc1.accountId = 1;
		acc1.userName = "Sanjana";
		acc1.email = "sanjana@gmail.com";
		acc1.password = "pass123";
		acc1.gender = "Female";
		acc1.age = 22;
		acc1.interests = user1Interests;

		boolean isAdded1 = facebook.createAccount(acc1);
		System.out.println(isAdded1);

		Account acc2 = new Account();
		acc2.accountId = 2;
		acc2.userName = "Rahul";
		acc2.email = "rahul@gmail.com";
		acc2.password = "pass456";
		acc2.gender = "Male";
		acc2.age = 25;
		acc2.interests = user2Interests;

		boolean isAdded2 = facebook.createAccount(acc2);
		System.out.println(isAdded2);

		Account acc3 = new Account();
		acc3.accountId = 3;
		acc3.userName = "Anu";
		acc3.email = "anu@gmail.com";
		acc3.password = "pass789";
		acc3.gender = "Female";
		acc3.age = 23;
		acc3.interests = user3Interests;

		boolean isAdded3 = facebook.createAccount(acc3);
		System.out.println(isAdded3);

		Account acc4 = new Account();
		acc4.accountId = 4;
		acc4.userName = "Kiran";
		acc4.email = "kiran@gmail.com";
		acc4.password = "pass111";
		acc4.gender = "Male";
		acc4.age = 27;
		acc4.interests = user4Interests;

		boolean isAdded4 = facebook.createAccount(acc4);
		System.out.println(isAdded4);

		Account acc5 = new Account();
		acc5.accountId = 5;
		acc5.userName = "Meena";
		acc5.email = "meena@gmail.com";
		acc5.password = "pass222";
		acc5.gender = "Female";
		acc5.age = 24;
		acc5.interests = user5Interests;

		boolean isAdded5 = facebook.createAccount(acc5);
		System.out.println(isAdded5);

		facebook.getAllAccountDetails();
	}
}