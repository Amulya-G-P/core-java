class Phonepe
{
	int phonepeId;
	String userName;
	String mobileNumber;
	int walletBalance;
	History history;

	public void getPhonepeDetails()
	{
		System.out.println("PhonePe Id: " + phonepeId);
		System.out.println("User Name: " + userName);
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Wallet Balance: " + walletBalance);

		history.getHistoryDetails();
	}
}