class Ipl2022Executor
{
	public static void main(String[] ie)
	{
		String gt[]={"won","won","won","loss","won"};
		String rr[]={"won","won","loss","won","loss"};
		String lsg[]={"won","loss","won","won","loss"};
		String rcb[]={"loss","won","won","loss","won"};
		String dc[]={"won","loss","loss","won","loss"};
		String pbks[]={"loss","won","loss","loss","won"};
		String kkr[]={"loss","loss","won","loss","won"};
		String srh[]={"loss","won","loss","loss","loss"};
		String csk[]={"loss","loss","loss","won","loss"};
		String mi[]={"loss","loss","loss","loss","won"};
			
		Team2022 teamOne=new Team2022();
		teamOne.name="GT";
		teamOne.playedMatches=5;
		teamOne.won=4;
		teamOne.loss=1;
		teamOne.nrr=0.980;
		teamOne.points=8;
		teamOne.last5=gt;
		
		Team2022 teamTwo=new Team2022();
		teamTwo.name="RR";
		teamTwo.playedMatches=5;
		teamTwo.won=3;
		teamTwo.loss=2;
		teamTwo.nrr=0.720;
		teamTwo.points=6;
		teamTwo.last5=rr;
		
		Team2022 teamThree=new Team2022();
		teamThree.name="LSG";
		teamThree.playedMatches=5;
		teamThree.won=3;
		teamThree.loss=2;
		teamThree.nrr=0.650;
		teamThree.points=6;
		teamThree.last5=lsg;
		
		Team2022 teamFour=new Team2022();
		teamFour.name="RCB";
		teamFour.playedMatches=5;
		teamFour.won=3;
		teamFour.loss=2;
		teamFour.nrr=0.500;
		teamFour.points=6;
		teamFour.last5=rcb;
		
		Team2022 teamFive=new Team2022();
		teamFive.name="DC";
		teamFive.playedMatches=5;
		teamFive.won=2;
		teamFive.loss=3;
		teamFive.nrr=0.100;
		teamFive.points=4;
		teamFive.last5=dc;
		
		Team2022 teamSix=new Team2022();
		teamSix.name="PBKS";
		teamSix.playedMatches=5;
		teamSix.won=2;
		teamSix.loss=3;
		teamSix.nrr=-0.050;
		teamSix.points=4;
		teamSix.last5=pbks;
		
		Team2022 teamSeven=new Team2022();
		teamSeven.name="KKR";
		teamSeven.playedMatches=5;
		teamSeven.won=2;
		teamSeven.loss=3;
		teamSeven.nrr=-0.200;
		teamSeven.points=4;
		teamSeven.last5=kkr;
		
		Team2022 teamEight=new Team2022();
		teamEight.name="SRH";
		teamEight.playedMatches=5;
		teamEight.won=1;
		teamEight.loss=4;
		teamEight.nrr=-0.500;
		teamEight.points=2;
		teamEight.last5=srh;
		
		Team2022 teamNine=new Team2022();
		teamNine.name="CSK";
		teamNine.playedMatches=5;
		teamNine.won=1;
		teamNine.loss=4;
		teamNine.nrr=-0.650;
		teamNine.points=2;
		teamNine.last5=csk;
		
		Team2022 teamTen=new Team2022();
		teamTen.name="MI";
		teamTen.playedMatches=5;
		teamTen.won=1;
		teamTen.loss=4;
		teamTen.nrr=-0.800;
		teamTen.points=2;
		teamTen.last5=mi;
		
		Team2022 teams[]=new Team2022[10];
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
		 
		Table2022 table =new Table2022();
		table.teams = teams;
		
		Season2022 season=new Season2022();
		season.table = table;
			
		Ipl2022 ipl=new Ipl2022();
		ipl.season = season;
		 
		ipl.getIplDetails();
	}
}

