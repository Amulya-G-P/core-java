class IplExecutor
{
	public static void main(String[] ae)
	{
		System.out.println(" IPL and RCB");
		
		Ipl ipl=new Ipl();
		ipl.iplId=1;
		ipl.iplName="IPL League";
		ipl.iplId=2;
		ipl.iplName="IPL T20";
		
		Rcb rcbOne=new Rcb();
		rcbOne.playerId=18;
		rcbOne.playerName="Virat Kohli";
		
		Rcb rcbTwo=new Rcb();
		rcbTwo.playerId=2;
		rcbTwo.playerName="Glenn Maxwell";
		
		Rcb rcbThree=new Rcb();
		rcbThree.playerId=3;
		rcbThree.playerName="Rajat Patidar";
		
		Rcb rcbFour=new Rcb();
		rcbFour.playerId=4;
		rcbFour.playerName="Dinesh Karthik";
		
		Rcb rcbFive=new Rcb();
		rcbFive.playerId=5;
		rcbFive.playerName="Mohammed Siraj";
		
		//class.class=object
		ipl.rcb=rcbFive;
		
		ipl.getIplDetails();
	}
}