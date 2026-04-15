class BankExecutor
{
	public static void main(String[] args)
	{
		Bank bank1 = new Bank();
		bank1.bankId = 1;
		bank1.bankName = "SBI";
		bank1.bankLocation = "Bangalore";
		bank1.totalBalance = 500000;

		Bank bank2 = new Bank();
		bank2.bankId = 2;
		bank2.bankName = "HDFC";
		bank2.bankLocation = "Chennai";
		bank2.totalBalance = 600000;

		Bank bank3 = new Bank();
		bank3.bankId = 3;
		bank3.bankName = "ICICI";
		bank3.bankLocation = "Hyderabad";
		bank3.totalBalance = 700000;

		Bank bank4 = new Bank();
		bank4.bankId = 4;
		bank4.bankName = "Axis";
		bank4.bankLocation = "Mumbai";
		bank4.totalBalance = 800000;

		Bank bank5 = new Bank();
		bank5.bankId = 5;
		bank5.bankName = "Canara";
		bank5.bankLocation = "Delhi";
		bank5.totalBalance = 550000;

		Bank bank6 = new Bank();
		bank6.bankId = 6;
		bank6.bankName = "PNB";
		bank6.bankLocation = "Pune";
		bank6.totalBalance = 650000;

		Bank bank7 = new Bank();
		bank7.bankId = 7;
		bank7.bankName = "Kotak";
		bank7.bankLocation = "Goa";
		bank7.totalBalance = 720000;

		Bank bank8 = new Bank();
		bank8.bankId = 8;
		bank8.bankName = "YesBank";
		bank8.bankLocation = "Noida";
		bank8.totalBalance = 400000;

		Bank bank9 = new Bank();
		bank9.bankId = 9;
		bank9.bankName = "Union";
		bank9.bankLocation = "Mysore";
		bank9.totalBalance = 300000;

		Bank bank10 = new Bank();
		bank10.bankId = 10;
		bank10.bankName = "BOB";
		bank10.bankLocation = "Ahmedabad";
		bank10.totalBalance = 450000;

		Bank bank11 = new Bank();
		bank11.bankId = 11;
		bank11.bankName = "IDBI";
		bank11.bankLocation = "Nagpur";
		bank11.totalBalance = 380000;

		Bank bank12 = new Bank();
		bank12.bankId = 12;
		bank12.bankName = "IndusInd";
		bank12.bankLocation = "Bhopal";
		bank12.totalBalance = 470000;

		Bank bank13 = new Bank();
		bank13.bankId = 13;
		bank13.bankName = "UCO";
		bank13.bankLocation = "Kolkata";
		bank13.totalBalance = 520000;

		Bank bank14 = new Bank();
		bank14.bankId = 14;
		bank14.bankName = "Central";
		bank14.bankLocation = "Lucknow";
		bank14.totalBalance = 610000;

		Bank bank15 = new Bank();
		bank15.bankId = 15;
		bank15.bankName = "SouthIndian";
		bank15.bankLocation = "Kerala";
		bank15.totalBalance = 290000;

		Bank bank16 = new Bank();
		bank16.bankId = 16;
		bank16.bankName = "Karur";
		bank16.bankLocation = "Coimbatore";
		bank16.totalBalance = 310000;

		Bank bank17 = new Bank();
		bank17.bankId = 17;
		bank17.bankName = "RBL";
		bank17.bankLocation = "Surat";
		bank17.totalBalance = 330000;

		Bank bank18 = new Bank();
		bank18.bankId = 18;
		bank18.bankName = "Bandhan";
		bank18.bankLocation = "Patna";
		bank18.totalBalance = 360000;

		Bank bank19 = new Bank();
		bank19.bankId = 19;
		bank19.bankName = "Federal";
		bank19.bankLocation = "Trivandrum";
		bank19.totalBalance = 410000;

		Bank bank20 = new Bank();
		bank20.bankId = 20;
		bank20.bankName = "DBS";
		bank20.bankLocation = "Singapore";
		bank20.totalBalance = 900000;


		AccountHolder a1 = new AccountHolder();
		a1.accountNumber = 101;
		a1.accountBalance = 10000;
		a1.accountHolderName = "Ravi";
		a1.accountType = "Savings";
		a1.age = 25;

		AccountHolder a2 = new AccountHolder();
		a2.accountNumber = 102;
		a2.accountBalance = 20000;
		a2.accountHolderName = "Priya";
		a2.accountType = "Current";
		a2.age = 28;

		AccountHolder a3 = new AccountHolder();
		a3.accountNumber = 103;
		a3.accountBalance = 15000;
		a3.accountHolderName = "Amit";
		a3.accountType = "Savings";
		a3.age = 30;

		AccountHolder a4 = new AccountHolder();
		a4.accountNumber = 104;
		a4.accountBalance = 25000;
		a4.accountHolderName = "Sneha";
		a4.accountType = "Current";
		a4.age = 27;

		AccountHolder a5 = new AccountHolder();
		a5.accountNumber = 105;
		a5.accountBalance = 18000;
		a5.accountHolderName = "Kiran";
		a5.accountType = "Savings";
		a5.age = 35;

		AccountHolder a6 = new AccountHolder();
		a6.accountNumber = 106;
		a6.accountBalance = 22000;
		a6.accountHolderName = "Arjun";
		a6.accountType = "Current";
		a6.age = 29;

		AccountHolder a7 = new AccountHolder();
		a7.accountNumber = 107;
		a7.accountBalance = 27000;
		a7.accountHolderName = "Meena";
		a7.accountType = "Savings";
		a7.age = 32;

		AccountHolder a8 = new AccountHolder();
		a8.accountNumber = 108;
		a8.accountBalance = 30000;
		a8.accountHolderName = "Rahul";
		a8.accountType = "Current";
		a8.age = 26;

		AccountHolder a9 = new AccountHolder();
		a9.accountNumber = 109;
		a9.accountBalance = 12000;
		a9.accountHolderName = "Pooja";
		a9.accountType = "Savings";
		a9.age = 24;

		AccountHolder a10 = new AccountHolder();
		a10.accountNumber = 110;
		a10.accountBalance = 35000;
		a10.accountHolderName = "Vikram";
		a10.accountType = "Current";
		a10.age = 40;

		AccountHolder a11 = new AccountHolder();
		a11.accountNumber = 111;
		a11.accountBalance = 16000;
		a11.accountHolderName = "Anita";
		a11.accountType = "Savings";
		a11.age = 31;

		AccountHolder a12 = new AccountHolder();
		a12.accountNumber = 112;
		a12.accountBalance = 21000;
		a12.accountHolderName = "Deepak";
		a12.accountType = "Current";
		a12.age = 33;

		AccountHolder a13 = new AccountHolder();
		a13.accountNumber = 113;
		a13.accountBalance = 14000;
		a13.accountHolderName = "Neha";
		a13.accountType = "Savings";
		a13.age = 22;

		AccountHolder a14 = new AccountHolder();
		a14.accountNumber = 114;
		a14.accountBalance = 26000;
		a14.accountHolderName = "Suresh";
		a14.accountType = "Current";
		a14.age = 45;

		AccountHolder a15 = new AccountHolder();
		a15.accountNumber = 115;
		a15.accountBalance = 17000;
		a15.accountHolderName = "Lakshmi";
		a15.accountType = "Savings";
		a15.age = 29;

		AccountHolder a16 = new AccountHolder();
		a16.accountNumber = 116;
		a16.accountBalance = 23000;
		a16.accountHolderName = "Manoj";
		a16.accountType = "Current";
		a16.age = 36;

		AccountHolder a17 = new AccountHolder();
		a17.accountNumber = 117;
		a17.accountBalance = 28000;
		a17.accountHolderName = "Divya";
		a17.accountType = "Savings";
		a17.age = 27;

		AccountHolder a18 = new AccountHolder();
		a18.accountNumber = 118;
		a18.accountBalance = 32000;
		a18.accountHolderName = "Karthik";
		a18.accountType = "Current";
		a18.age = 34;

		AccountHolder a19 = new AccountHolder();
		a19.accountNumber = 119;
		a19.accountBalance = 19000;
		a19.accountHolderName = "Swathi";
		a19.accountType = "Savings";
		a19.age = 26;

		AccountHolder a20 = new AccountHolder();
		a20.accountNumber = 120;
		a20.accountBalance = 40000;
		a20.accountHolderName = "Ramesh";
		a20.accountType = "Current";
		a20.age = 50;


		bank1.accountHolder = a1; 
		bank1.getBankDetails();
		bank2.accountHolder = a2;
		bank2.getBankDetails();
		bank3.accountHolder = a3;
		bank3.getBankDetails();
		bank4.accountHolder = a4;
		bank4.getBankDetails();
		bank5.accountHolder = a5;
		bank5.getBankDetails();
		bank6.accountHolder = a6;
		bank6.getBankDetails();
		bank7.accountHolder = a7;
		bank7.getBankDetails();
		bank8.accountHolder = a8;
		bank8.getBankDetails();
		bank9.accountHolder = a9;
		bank9.getBankDetails();
		bank10.accountHolder = a10;
		bank10.getBankDetails();
		bank11.accountHolder = a11;
		bank11.getBankDetails();
		bank12.accountHolder = a12;
		bank12.getBankDetails();
		bank13.accountHolder = a13;
		bank13.getBankDetails();
		bank14.accountHolder = a14;
		bank14.getBankDetails();
		bank15.accountHolder = a15;
		bank15.getBankDetails();
		bank16.accountHolder = a16;
		bank16.getBankDetails();
		bank17.accountHolder = a17;
		bank17.getBankDetails();
		bank18.accountHolder = a18;
		bank18.getBankDetails();
		bank19.accountHolder = a19;
		bank19.getBankDetails();
		bank20.accountHolder = a20;
		bank20.getBankDetails();
	}
}