class IceCreamRunner 
{
    public static void main(String[] ir) 
	{

        IceCream iceOne = new IceCream();
		iceOne.flavor="Vanilla";
		iceOne.id=1;
		iceOne.price=50.0;
		
        IceCream iceTwo = new IceCream(); 
		iceTwo.flavor="Chocolate";
		iceTwo.id=2;
		iceTwo.price=60.0;
		
        IceCream iceThree = new IceCream();
		iceThree.flavor="Strawberry";
		iceThree.id=3;
		iceThree.price=55.0;
		
        IceCream iceFour = new IceCream(); 
		iceFour.flavor="Mango";
		iceFour.id=4;
		iceFour.price=50.0;
		
        IceCream iceFive = new IceCream();
		iceFive.flavor="Butterscotch";
		iceFive.id=5;
		iceFive.price=65.0;
		
        IceCream iceSix = new IceCream();
		iceSix.flavor="Black Currant";
		iceSix.id=6;
		iceSix.price=70.0;
		
        IceCream iceSeven = new IceCream();
		iceSeven.flavor="Pista";
		iceSeven.id=7;
		iceSeven.price=60.0;
		
        IceCream iceEight = new IceCream(); 
		iceEight.flavor="Caramel";
		iceEight.id=8;
		iceEight.price=75.0;
		
        IceCream iceNine = new IceCream();
		iceNine.flavor="Coffee";
		iceNine.id=9;
		iceNine.price=65.0;
		
        IceCream iceTen = new IceCream(); 
		iceTen.flavor="Blueberry";
		iceTen.id=10;
		iceTen.price=80.0;
		
        IceCream iceEleven = new IceCream(); 
		iceEleven.flavor="Mint";
		iceEleven.id=11;
		iceEleven.price=55.0;
		
        IceCream iceTwelve = new IceCream();
		iceTwelve.flavor="Chocolate Chip";
		iceTwelve.id=12;
		iceTwelve.price=70.0;
		
        IceCream iceThirteen = new IceCream();
		iceThirteen.flavor="Cookies";
		iceThirteen.id=13;
		iceThirteen.price=75.0;
		
        IceCream iceFourteen = new IceCream(); 
		iceFourteen.flavor="Raspberry";
		iceFourteen.id=14;
		iceFourteen.price=80.0;
		
        IceCream iceFifteen = new IceCream();
		iceFifteen.flavor="Kulfi";
		iceFifteen.id=15;
		iceFifteen.price=50.0;

        IceCream icecreams[] = new IceCream[15];
        icecreams[0]=iceOne;
		icecreams[1]=iceTwo; 
		icecreams[2]=iceThree; 
		icecreams[3]=iceFour; 
		icecreams[4]=iceFive;
        icecreams[5]=iceSix;
		icecreams[6]=iceSeven;
		icecreams[7]=iceEight;
		icecreams[8]=iceNine; 
		icecreams[9]=iceTen;
        icecreams[10]=iceEleven;
		icecreams[11]=iceTwelve;
		icecreams[12]=iceThirteen;
		icecreams[13]=iceFourteen;
		icecreams[14]=iceFifteen;

        for(IceCream ice : icecreams){
            System.out.println(ice.flavor);
			System.out.println(ice.id);
			System.out.println(ice.price);
        }
    }
}