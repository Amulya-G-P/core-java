class TarRunner 
{
    public static void main(String[] tr) 
	{

        Tar tarOne = new Tar(); 
		tarOne.type = "Coal Tar";
		tarOne.id=1;
		
		
        Tar tarTwo = new Tar(); 
		tarTwo.type = "Wood Tar";
		tarTwo.id=2;
	
		
        Tar tarThree = new Tar(); 
		tarThree.type = "Mineral Tar";
		tarThree.id=3;
		
		
        Tar tarFour = new Tar(); 
		tarFour.type = "Pine Tar";
		tarFour.id=4;
		
		
        Tar tarFive = new Tar(); 
		tarFive.type = "Asphalt";
		tarFive.id=5;
		
		
        Tar tarSix = new Tar();
		tarSix.type = "Bitumen";
		tarSix.id=6;
		
		
        Tar tarSeven = new Tar(); 
		tarSeven.type = "Road Tar";
		tarSeven.id=7;
		
		
        Tar tarEight = new Tar(); 
		tarEight.type = "Liquid Tar";
		tarEight.id=8;
		
		
        Tar tarNine = new Tar(); 
		tarNine.type = "Solid Tar";
		tarNine.id=9;
		
		
        Tar tarTen = new Tar();
		tarTen.type = "Natural Tar";
		tarTen.id=10;
		
		
        Tar tarEleven = new Tar(); 
		tarEleven.type = "Synthetic Tar";
		tarEleven.id=11;
		
		
        Tar tarTwelve = new Tar();
		tarTwelve.type = "Black Tar";
		tarTwelve.id=12;
		
		
        Tar tarThirteen = new Tar(); 
		tarThirteen.type = "Brown Tar";
		tarThirteen.id=13;
		
		
        Tar tarFourteen = new Tar(); 
		tarFourteen.type = "Sticky Tar";
		tarFourteen.id=14;
		
		
        Tar tarFifteen = new Tar(); 
		tarFifteen.type = "Hot Tar";
		tarFifteen.id=15;
		

        Tar tars[] = new Tar[15];
        tars[0]=tarOne;
		tars[1]=tarTwo;
		tars[2]=tarThree; 
		tars[3]=tarFour;
		tars[4]=tarFive;
        tars[5]=tarSix;
		tars[6]=tarSeven; 
		tars[7]=tarEight;
		tars[8]=tarNine;
		tars[9]=tarTen;
        tars[10]=tarEleven;
		tars[11]=tarTwelve; 
		tars[12]=tarThirteen; 
		tars[13]=tarFourteen; 
		tars[14]=tarFifteen;

        for(Tar tar : tars)
		{
            System.out.println(tar.type);
			System.out.println(tar.id);
        }
    }
}