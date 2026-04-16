class Ipl2024Executor
{
	public static void main(String[] ie)
	{
		String kkr[]={"won","won","won","loss","won"};
		String srh[]={"won","loss","won","won","won"};
		String rr[]={"won","won","loss","loss","won"};
		String rcb[]={"loss","won","won","won","won"};
		String csk[]={"won","loss","won","loss","won"};
		String dc[]={"loss","won","loss","won","loss"};
		String lsg[]={"won","loss","loss","loss","won"};
		String gt[]={"loss","loss","won","loss","loss"};
		String pbks[]={"loss","won","loss","loss","loss"};
		String mi[]={"loss","loss","loss","won","loss"};
			
		Team2024 teamOne=new Team2024();
		teamOne.name="KKR";
		teamOne.playedMatches=5;
		teamOne.won=4;
		teamOne.loss=1;
		teamOne.nrr=1.428;
		teamOne.points=8;
		teamOne.last5=kkr;
		
		Team2024 teamTwo=new Team2024();
		teamTwo.name="SRH";
		teamTwo.playedMatches=5;
		teamTwo.won=4;
		teamTwo.loss=1;
		teamTwo.nrr=1.210;
		teamTwo.points=8;
		teamTwo.last5=srh;
		
		Team2024 teamThree=new Team2024();
		teamThree.name="RR";
		teamThree.playedMatches=5;
		teamThree.won=3;
		teamThree.loss=2;
		teamThree.nrr=0.950;
		teamThree.points=6;
		teamThree.last5=rr;
		
		Team2024 teamFour=new Team2024();
		teamFour.name="RCB";
		teamFour.playedMatches=5;
		teamFour.won=3;
		teamFour.loss=2;
		teamFour.nrr=0.620;
		teamFour.points=6;
		teamFour.last5=rcb;
		
		Team2024 teamFive=new Team2024();
		teamFive.name="CSK";
		teamFive.playedMatches=5;
		teamFive.won=3;
		teamFive.loss=2;
		teamFive.nrr=0.480;
		teamFive.points=6;
		teamFive.last5=csk;
		
		Team2024 teamSix=new Team2024();
		teamSix.name="DC";
		teamSix.playedMatches=5;
		teamSix.won=2;
		teamSix.loss=3;
		teamSix.nrr=-0.120;
		teamSix.points=4;
		teamSix.last5=dc;
		
		Team2024 teamSeven=new Team2024();
		teamSeven.name="LSG";
		teamSeven.playedMatches=5;
		teamSeven.won=2;
		teamSeven.loss=3;
		teamSeven.nrr=-0.250;
		teamSeven.points=4;
		teamSeven.last5=lsg;
		
		Team2024 teamEight=new Team2024();
		teamEight.name="GT";
		teamEight.playedMatches=5;
		teamEight.won=1;
		teamEight.loss=4;
		teamEight.nrr=-0.600;
		teamEight.points=2;
		teamEight.last5=gt;
		
		Team2024 teamNine=new Team2024();
		teamNine.name="PBKS";
		teamNine.playedMatches=5;
		teamNine.won=1;
		teamNine.loss=4;
		teamNine.nrr=-0.750;
		teamNine.points=2;
		teamNine.last5=pbks;
		
		Team2024 teamTen=new Team2024();
		teamTen.name="MI";
		teamTen.playedMatches=5;
		teamTen.won=1;
		teamTen.loss=4;
		teamTen.nrr=-0.900;
		teamTen.points=2;
		teamTen.last5=mi;
		
		Team2024 teams[]=new Team2024[10];
		teams[0]=teamOne;
		teams[1]=teamTwo;
		teams[2]=teamThree;
		teams[3]=teamFour;
		teams[4]=teamFive;
		teams[5]=teamSix;
		teams[6]=teamSeven;
		teams[7]=teamEight;
		teams[8]=teamNine;
		teams[9]=teamTen;
		 
		Table2024 table =new Table2024();
		table.teams = teams;
		
		Season2024 season=new Season2024();
		season.table = table;
			
		Ipl2024 ipl=new Ipl2024();
		ipl.season = season;
		 
		ipl.getIplDetails();
	}
}

