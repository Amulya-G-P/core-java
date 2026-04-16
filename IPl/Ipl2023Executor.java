class Ipl2023Executor
{
	public static void main(String[] ie)
	{
		String gt[]={"won","won","loss","won","won"};
		String csk[]={"won","loss","won","won","won"};
		String lsg[]={"won","won","loss","loss","won"};
		String mi[]={"loss","won","won","loss","won"};
		String rr[]={"won","loss","loss","won","loss"};
		String rcb[]={"loss","won","loss","won","loss"};
		String kkr[]={"loss","loss","won","loss","won"};
		String pbks[]={"won","loss","loss","loss","won"};
		String dc[]={"loss","loss","won","loss","loss"};
		String srh[]={"loss","loss","loss","won","loss"};
			
		Team2023 teamOne=new Team2023();
		teamOne.name="GT";
		teamOne.playedMatches=5;
		teamOne.won=4;
		teamOne.loss=1;
		teamOne.nrr=0.980;
		teamOne.points=8;
		teamOne.last5=gt;
		
		Team2023 teamTwo=new Team2023();
		teamTwo.name="CSK";
		teamTwo.playedMatches=5;
		teamTwo.won=4;
		teamTwo.loss=1;
		teamTwo.nrr=0.750;
		teamTwo.points=8;
		teamTwo.last5=csk;
		
		Team2023 teamThree=new Team2023();
		teamThree.name="LSG";
		teamThree.playedMatches=5;
		teamThree.won=3;
		teamThree.loss=2;
		teamThree.nrr=0.500;
		teamThree.points=6;
		teamThree.last5=lsg;
		
		Team2023 teamFour=new Team2023();
		teamFour.name="MI";
		teamFour.playedMatches=5;
		teamFour.won=3;
		teamFour.loss=2;
		teamFour.nrr=0.300;
		teamFour.points=6;
		teamFour.last5=mi;
		
		Team2023 teamFive=new Team2023();
		teamFive.name="RR";
		teamFive.playedMatches=5;
		teamFive.won=2;
		teamFive.loss=3;
		teamFive.nrr=0.100;
		teamFive.points=4;
		teamFive.last5=rr;
		
		Team2023 teamSix=new Team2023();
		teamSix.name="RCB";
		teamSix.playedMatches=5;
		teamSix.won=2;
		teamSix.loss=3;
		teamSix.nrr=-0.050;
		teamSix.points=4;
		teamSix.last5=rcb;
		
		Team2023 teamSeven=new Team2023();
		teamSeven.name="KKR";
		teamSeven.playedMatches=5;
		teamSeven.won=2;
		teamSeven.loss=3;
		teamSeven.nrr=-0.200;
		teamSeven.points=4;
		teamSeven.last5=kkr;
		
		Team2023 teamEight=new Team2023();
		teamEight.name="PBKS";
		teamEight.playedMatches=5;
		teamEight.won=2;
		teamEight.loss=3;
		teamEight.nrr=-0.350;
		teamEight.points=4;
		teamEight.last5=pbks;
		
		Team2023 teamNine=new Team2023();
		teamNine.name="DC";
		teamNine.playedMatches=5;
		teamNine.won=1;
		teamNine.loss=4;
		teamNine.nrr=-0.700;
		teamNine.points=2;
		teamNine.last5=dc;
		
		Team2023 teamTen=new Team2023();
		teamTen.name="SRH";
		teamTen.playedMatches=5;
		teamTen.won=1;
		teamTen.loss=4;
		teamTen.nrr=-0.850;
		teamTen.points=2;
		teamTen.last5=srh;
		
		Team2023 teams[]=new Team2023[10];
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
		 
		Table2023 table =new Table2023();
		table.teams = teams;
		
		Season2023 season=new Season2023();
		season.table = table;
			
		Ipl2023 ipl=new Ipl2023();
		ipl.season = season;
		 
		ipl.getIplDetails();
	}
}
