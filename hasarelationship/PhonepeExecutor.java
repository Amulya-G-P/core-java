class PhonepeExecutor
{
	public static void main(String[] args)
	{

		Phonepe p1 = new Phonepe();
		p1.phonepeId = 1;
		p1.userName = "Ravi"; 
		p1.mobileNumber = "90001";
		p1.walletBalance = 5000;

		Phonepe p2 = new Phonepe();
		p2.phonepeId = 2; 
		p2.userName = "Priya";
		p2.mobileNumber = "90002"; 
		p2.walletBalance = 6000;

		Phonepe p3 = new Phonepe();
		p3.phonepeId = 3;
		p3.userName = "Amit"; 
		p3.mobileNumber = "90003"; 
		p3.walletBalance = 7000;

		Phonepe p4 = new Phonepe();
		p4.phonepeId = 4;
		p4.userName = "Sneha";
		p4.mobileNumber = "90004";
		p4.walletBalance = 8000;

		Phonepe p5 = new Phonepe();
		p5.phonepeId = 5; 
		p5.userName = "Kiran"; 
		p5.mobileNumber = "90005";
		p5.walletBalance = 5500;

		Phonepe p6 = new Phonepe();
		p6.phonepeId = 6;
		p6.userName = "Arjun";
		p6.mobileNumber = "90006"; 
		p6.walletBalance = 6500;

		Phonepe p7 = new Phonepe();
		p7.phonepeId = 7;
		p7.userName = "Meena";
		p7.mobileNumber = "90007"; 
		p7.walletBalance = 7200;

		Phonepe p8 = new Phonepe();
		p8.phonepeId = 8;
		p8.userName = "Rahul";
		p8.mobileNumber = "90008"; p8.walletBalance = 4000;

		Phonepe p9 = new Phonepe();
		p9.phonepeId = 9; 
		p9.userName = "Pooja"; 
		p9.mobileNumber = "90009";
		p9.walletBalance = 3000;

		Phonepe p10 = new Phonepe();
		p10.phonepeId = 10;
		p10.userName = "Vikram"; 
		p10.mobileNumber = "90010";
		p10.walletBalance = 4500;

		Phonepe p11 = new Phonepe();
		p11.phonepeId = 11;
		p11.userName = "Anita";
		p11.mobileNumber = "90011";
		p11.walletBalance = 3800;

		Phonepe p12 = new Phonepe();
		p12.phonepeId = 12;
		p12.userName = "Deepak";
		p12.mobileNumber = "90012";
		p12.walletBalance = 4700;

		Phonepe p13 = new Phonepe();
		p13.phonepeId = 13;
		p13.userName = "Neha";
		p13.mobileNumber = "90013";
		p13.walletBalance = 5200;

		Phonepe p14 = new Phonepe();
		p14.phonepeId = 14;
		p14.userName = "Suresh"; 
		p14.mobileNumber = "90014";
		p14.walletBalance = 6100;

		Phonepe p15 = new Phonepe();
		p15.phonepeId = 15;
		p15.userName = "Lakshmi";
		p15.mobileNumber = "90015"; 
		p15.walletBalance = 2900;

		Phonepe p16 = new Phonepe();
		p16.phonepeId = 16;
		p16.userName = "Manoj";
		p16.mobileNumber = "90016";
		p16.walletBalance = 3100;

		Phonepe p17 = new Phonepe();
		p17.phonepeId = 17;
		p17.userName = "Divya";
		p17.mobileNumber = "90017";
		p17.walletBalance = 3300;

		Phonepe p18 = new Phonepe();
		p18.phonepeId = 18;
		p18.userName = "Karthik";
		p18.mobileNumber = "90018"; 
		p18.walletBalance = 3600;

		Phonepe p19 = new Phonepe();
		p19.phonepeId = 19;
		p19.userName = "Swathi"; 
		p19.mobileNumber = "90019"; 
		p19.walletBalance = 4100;

		Phonepe p20 = new Phonepe();
		p20.phonepeId = 20;
		p20.userName = "Ramesh";
		p20.mobileNumber = "90020"; 
		p20.walletBalance = 9000;


		History h1 = new History();
		h1.transactionId = 101;
		h1.amount = 500;
		h1.transactionType = "Recharge";
		h1.status = "Success"; 
		h1.rewardPoints = 5;

		History h2 = new History();
		h2.transactionId = 102; 
		h2.amount = 700;
		h2.transactionType = "BillPay";
		h2.status = "Success";
		h2.rewardPoints = 7;

		History h3 = new History();
		h3.transactionId = 103; 
		h3.amount = 300; 
		h3.transactionType = "Transfer";
		h3.status = "Failed"; 
		h3.rewardPoints = 2;

		History h4 = new History();
		h4.transactionId = 104;
		h4.amount = 900; 
		h4.transactionType = "Shopping";
		h4.status = "Success"; 
		h4.rewardPoints = 9;

		History h5 = new History();
		h5.transactionId = 105; 
		h5.amount = 400; 
		h5.transactionType = "Recharge"; 
		h5.status = "Pending";
		h5.rewardPoints = 4;

		History h6 = new History();
		h6.transactionId = 106; 
		h6.amount = 650;
		h6.transactionType = "BillPay"; 
		h6.status = "Success"; 
		h6.rewardPoints = 6;

		History h7 = new History();
		h7.transactionId = 107;
		h7.amount = 800;
		h7.transactionType = "Transfer";
		h7.status = "Success"; 
		h7.rewardPoints = 8;

		History h8 = new History();
		h8.transactionId = 108;
		h8.amount = 200;
		h8.transactionType = "Shopping";
		h8.status = "Failed"; 
		h8.rewardPoints = 1;

		History h9 = new History();
		h9.transactionId = 109; 
		h9.amount = 1000; 
		h9.transactionType = "Recharge"; 
		h9.status = "Success";
		h9.rewardPoints = 10;

		History h10 = new History();
		h10.transactionId = 110; 
		h10.amount = 550;
		h10.transactionType = "BillPay";
		h10.status = "Success";
		h10.rewardPoints = 5;

		History h11 = new History();
		h11.transactionId = 111; 
		h11.amount = 350; 
		h11.transactionType = "Transfer"; 
		h11.status = "Pending";
		h11.rewardPoints = 3;

		History h12 = new History();
		h12.transactionId = 112;
		h12.amount = 780;
		h12.transactionType = "Shopping";
		h12.status = "Success";
		h12.rewardPoints = 7;

		History h13 = new History();
		h13.transactionId = 113; 
		h13.amount = 420; 
		h13.transactionType = "Recharge";
		h13.status = "Failed";
		h13.rewardPoints = 2;

		History h14 = new History();
		h14.transactionId = 114;
		h14.amount = 610;
		h14.transactionType = "BillPay";
		h14.status = "Success"; 
		h14.rewardPoints = 6;

		History h15 = new History();
		h15.transactionId = 115;
		h15.amount = 290;
		h15.transactionType = "Transfer"; 
		h15.status = "Success";
		h15.rewardPoints = 3;

		History h16 = new History();
		h16.transactionId = 116; 
		h16.amount = 310;
		h16.transactionType = "Shopping";
		h16.status = "Pending";
		h16.rewardPoints = 3;

		History h17 = new History();
		h17.transactionId = 117;
		h17.amount = 330;
		h17.transactionType = "Recharge";
		h17.status = "Success"; 
		h17.rewardPoints = 3;

		History h18 = new History();
		h18.transactionId = 118; 
		h18.amount = 360; 
		h18.transactionType = "BillPay";
		h18.status = "Success";
		h18.rewardPoints = 4;

		History h19 = new History();
		h19.transactionId = 119;
		h19.amount = 410;
		h19.transactionType = "Transfer";
		h19.status = "Failed"; 
		h19.rewardPoints = 2;

		History h20 = new History();
		h20.transactionId = 120;
		h20.amount = 900; 
		h20.transactionType = "Shopping"; 
		h20.status = "Success"; 
		h20.rewardPoints = 9;


		p1.history = h1;
		p1.getPhonepeDetails();
		p2.history = h2;
		p2.getPhonepeDetails();
		p3.history = h3; 
		p3.getPhonepeDetails();
		p4.history = h4; 
		p4.getPhonepeDetails();
		p5.history = h5;
		p5.getPhonepeDetails();
		p6.history = h6;
		p6.getPhonepeDetails();
		p7.history = h7;
		p7.getPhonepeDetails();
		p8.history = h8; 
		p8.getPhonepeDetails();
		p9.history = h9; 
		p9.getPhonepeDetails();
		p10.history = h10; 
		p10.getPhonepeDetails();
		p11.history = h11;
		p11.getPhonepeDetails();
		p12.history = h12;
		p12.getPhonepeDetails();
		p13.history = h13;
		p13.getPhonepeDetails();
		p14.history = h14;
		p14.getPhonepeDetails();
		p15.history = h15;
		p15.getPhonepeDetails();
		p16.history = h16;
		p16.getPhonepeDetails();
		p17.history = h17;
		p17.getPhonepeDetails();
		p18.history = h18;
		p18.getPhonepeDetails();
		p19.history = h19;
		p19.getPhonepeDetails();
		p20.history = h20;
		p20.getPhonepeDetails();
	}
}