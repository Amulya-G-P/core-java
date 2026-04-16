class FacewashRunner 
{
    public static void main(String[] fr) 
	{

        Facewash fOne=new Facewash();
		fOne.id=1;
		fOne.brand="Himalaya";
		fOne.name="Neem Facewash";
		
        Facewash fTwo=new Facewash(); 
		fTwo.id=2;
		fTwo.brand="Clean & Clear";
		fTwo.name="Foaming Facewash";
		
        Facewash fThree=new Facewash();
		fThree.id=3;
		fThree.brand="Pond's";
		fThree.name="Bright Beauty";
		
        Facewash fFour=new Facewash();
		fFour.id=4;
		fFour.brand="Nivea";
		fFour.name="Milk Delights";
		
        Facewash fFive=new Facewash(); 
		fFive.id=5;
		fFive.brand="Garnier";
		fFive.name="Men Turbo";
		
        Facewash fSix=new Facewash(); 
		fSix.id=6;
		fSix.brand="Lakme";
		fSix.name="Blush Glow";
		
        Facewash fSeven=new Facewash(); 
		fSeven.id=7;
		fSeven.brand="Neutrogena";
		fSeven.name="Deep Clean";
		
        Facewash fEight=new Facewash();
		fEight.id=8;
		fEight.brand="Biotique";
		fEight.name="Honey Gel";
		
        Facewash fNine=new Facewash(); 
		fNine.id=9;
		fNine.brand="Mamaearth";
		fNine.name="Ubtan";
		
        Facewash fTen=new Facewash();
		fTen.id=10;
		fTen.brand="WOW";
		fTen.name="Vitamin C";
		
        Facewash fEleven=new Facewash(); 
		fEleven.id=11;
		fEleven.brand="Olay";
		fEleven.name="White Radiance";
		
        Facewash fTwelve=new Facewash();
		fTwelve.id=12;
		fTwelve.brand="Dove";
		fTwelve.name="Gentle Clean";
		
        Facewash fThirteen=new Facewash(); 
		fThirteen.id=13;
		fThirteen.brand="Cetaphil";
		fThirteen.name="Gentle Skin";
		
        Facewash fFourteen=new Facewash();
		fFourteen.id=14;
		fFourteen.brand="Minimalist";
		fFourteen.name="Salicylic Cleanser";
		
        Facewash fFifteen=new Facewash();
		fFifteen.id=15;
		fFifteen.brand="Plum";
		fFifteen.name="Green Tea";

        Facewash facewashes[] = new Facewash[15];
        facewashes[0]=fOne;
		facewashes[1]=fTwo; 
		facewashes[2]=fThree;
		facewashes[3]=fFour;
		facewashes[4]=fFive;
        facewashes[5]=fSix; 
		facewashes[6]=fSeven; 
		facewashes[7]=fEight; 
		facewashes[8]=fNine; 
		facewashes[9]=fTen;
        facewashes[10]=fEleven; 
		facewashes[11]=fTwelve;
		facewashes[12]=fThirteen;
		facewashes[13]=fFourteen;
		facewashes[14]=fFifteen;

        for(Facewash fw : facewashes)
		{
            System.out.println(fw.id);
            System.out.println(fw.brand);
            System.out.println(fw.name);
		
        }
    }
}