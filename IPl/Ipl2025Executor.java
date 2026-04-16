class Ipl2025Executor
{
	public static void main(String[] ie)
	{
		String rr[]={"won","won","loss","won","won"};
		String kkr[]={"won","won","won","loss","won"};
		String csk[]={"won","loss","won","won","loss"};
		String rcb[]={"loss","won","won","loss","won"};
		String mi[]={"won","loss","loss","won","loss"};
		String dc[]={"loss","won","loss","won","won"};
		String srh[]={"won","loss","loss","loss","won"};
		String lsg[]={"loss","loss","won","won","loss"};
		String gt[]={"loss","won","loss","loss","loss"};
		String pbks[]={"loss","loss","loss","won","loss"};
			
		Team2025 teamOne=new Team2025();
		teamOne.name="RR";
		teamOne.playedMatches=5;
		teamOne.won=4;
		teamOne.loss=1;
		teamOne.nrr=1.210;
		teamOne.points=8;
		teamOne.last5=rr;
		
		Team2025 teamTwo=new Team2025();
		teamTwo.name="KKR";
		teamTwo.playedMatches=5;
		teamTwo.won=4;
		teamTwo.loss=1;
		teamTwo.nrr=1.050;
		teamTwo.points=8;
		teamTwo.last5=kkr;
		
		Team2025 teamThree=new Team2025();
		teamThree.name="CSK";
		teamThree.playedMatches=5;
		teamThree.won=3;
		teamThree.loss=2;
		teamThree.nrr=0.620;
		teamThree.points=6;
		teamThree.last5=csk;
		
		Team2025 teamFour=new Team2025();
		teamFour.name="RCB";
		teamFour.playedMatches=5;
		teamFour.won=3;
		teamFour.loss=2;
		teamFour.nrr=0.450;
		teamFour.points=6;
		teamFour.last5=rcb;
		
		Team2025 teamFive=new Team2025();
		teamFive.name="MI";
		teamFive.playedMatches=5;
		teamFive.won=2;
		teamFive.loss=3;
		teamFive.nrr=0.120;
		teamFive.points=4;
		teamFive.last5=mi;
		
		Team2025 teamSix=new Team2025();
		teamSix.name="DC";
		teamSix.playedMatches=5;
		teamSix.won=2;
		teamSix.loss=3;
		teamSix.nrr=-0.050;
		teamSix.points=4;
		teamSix.last5=dc;
		
		Team2025 teamSeven=new Team2025();
		teamSeven.name="SRH";
		teamSeven.playedMatches=5;
		teamSeven.won=2;
		teamSeven.loss=3;
		teamSeven.nrr=-0.200;
		teamSeven.points=4;
		teamSeven.last5=srh;
		
		Team2025 teamEight=new Team2025();
		teamEight.name="LSG";
		teamEight.playedMatches=5;
		teamEight.won=2;
		teamEight.loss=3;
		teamEight.nrr=-0.300;
		teamEight.points=4;
		teamEight.last5=lsg;
		
		Team2025 teamNine=new Team2025();
		teamNine.name="GT";
		teamNine.playedMatches=5;
		teamNine.won=1;
		teamNine.loss=4;
		teamNine.nrr=-0.700;
		teamNine.points=2;
		teamNine.last5=gt;
		
		Team2025 teamTen=new Team2025();
		teamTen.name="PBKS";
		teamTen.playedMatches=5;
		teamTen.won=1;
		teamTen.loss=4;
		teamTen.nrr=-0.950;
		teamTen.points=2;
		teamTen.last5=pbks;
		
		Team2025 teams[]=new Team2025[10];
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
		 
		Table2025 table =new Table2025();
		table.teams = teams;
		
		Season2025 season=new Season2025();
		season.table = table;
			
		Ipl2025 ipl=new Ipl2025();
		ipl.season = season;
		 
		ipl.getIplDetails();
	}
}

