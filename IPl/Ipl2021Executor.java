class Ipl2021Executor
{
	public static void main(String[] ie)
	{
		String dc[]={"won","won","loss","won","won"};
		String csk[]={"won","loss","won","won","won"};
		String rcb[]={"won","won","loss","loss","won"};
		String kkr[]={"loss","won","loss","won","won"};
		String mi[]={"won","loss","loss","won","loss"};
		String pbks[]={"loss","won","loss","loss","won"};
		String rr[]={"loss","loss","won","loss","loss"};
		String srh[]={"loss","loss","loss","won","loss"};
			
		Team2021 teamOne=new Team2021();
		teamOne.name="DC";
		teamOne.playedMatches=5;
		teamOne.won=4;
		teamOne.loss=1;
		teamOne.nrr=0.900;
		teamOne.points=8;
		teamOne.last5=dc;
		
		Team2021 teamTwo=new Team2021();
		teamTwo.name="CSK";
		teamTwo.playedMatches=5;
		teamTwo.won=4;
		teamTwo.loss=1;
		teamTwo.nrr=0.750;
		teamTwo.points=8;
		teamTwo.last5=csk;
		
		Team2021 teamThree=new Team2021();
		teamThree.name="RCB";
		teamThree.playedMatches=5;
		teamThree.won=3;
		teamThree.loss=2;
		teamThree.nrr=0.500;
		teamThree.points=6;
		teamThree.last5=rcb;
		
		Team2021 teamFour=new Team2021();
		teamFour.name="KKR";
		teamFour.playedMatches=5;
		teamFour.won=3;
		teamFour.loss=2;
		teamFour.nrr=0.300;
		teamFour.points=6;
		teamFour.last5=kkr;
		
		Team2021 teamFive=new Team2021();
		teamFive.name="MI";
		teamFive.playedMatches=5;
		teamFive.won=2;
		teamFive.loss=3;
		teamFive.nrr=0.100;
		teamFive.points=4;
		teamFive.last5=mi;
		
		Team2021 teamSix=new Team2021();
		teamSix.name="PBKS";
		teamSix.playedMatches=5;
		teamSix.won=2;
		teamSix.loss=3;
		teamSix.nrr=-0.050;
		teamSix.points=4;
		teamSix.last5=pbks;
		
		Team2021 teamSeven=new Team2021();
		teamSeven.name="RR";
		teamSeven.playedMatches=5;
		teamSeven.won=1;
		teamSeven.loss=4;
		teamSeven.nrr=-0.400;
		teamSeven.points=2;
		teamSeven.last5=rr;
		
		Team2021 teamEight=new Team2021();
		teamEight.name="SRH";
		teamEight.playedMatches=5;
		teamEight.won=1;
		teamEight.loss=4;
		teamEight.nrr=-0.650;
		teamEight.points=2;
		teamEight.last5=srh;
		
		Team2021 teams[]=new Team2021[8];
		teams[0]=teamOne;
		teams[1]=teamTwo;
		teams[2]=teamThree;
		teams[3]=teamFour;
		teams[4]=teamFive;
		teams[5]=teamSix;
		teams[6]=teamSeven;
		teams[7]=teamEight;
		 
		Table2021 table =new Table2021();
		table.teams = teams;
		
		Season2021 season=new Season2021();
		season.table = table;
			
		Ipl2021 ipl=new Ipl2021();
		ipl.season = season;
		 
		ipl.getIplDetails();
	}
}





