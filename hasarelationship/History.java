class History
{
	int transactionId;
	int amount;
	String transactionType;
	String status;
	int rewardPoints;

	public void getHistoryDetails()
	{
		System.out.println("Transaction Id: " + transactionId);
		System.out.println("Amount: " + amount);
		System.out.println("Type: " + transactionType);
		System.out.println("Status: " + status);
		System.out.println("Reward Points: " + rewardPoints);
		System.out.println("-----------------------------------");
	}
}