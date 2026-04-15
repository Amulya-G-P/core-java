class Bank
{
	int bankId;
	String bankName;
	String bankLocation;
	int totalBalance;
	AccountHolder accountHolder;

	public void getBankDetails()
	{
		System.out.println("Bank Id: " + bankId);
		System.out.println("Bank Name: " + bankName);
		System.out.println("Location: " + bankLocation);
		System.out.println("Total Balance: " + totalBalance);

		accountHolder.getAccountHolderDetails();
	}
}