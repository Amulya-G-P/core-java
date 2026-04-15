class AccountHolder
{
	int accountNumber;
	int accountBalance;
	String accountHolderName;
	String accountType;
	int age;

	public void getAccountHolderDetails()
	{
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + accountBalance);
		System.out.println("Name: " + accountHolderName);
		System.out.println("Type: " + accountType);
		System.out.println("Age: " + age);
	}
}