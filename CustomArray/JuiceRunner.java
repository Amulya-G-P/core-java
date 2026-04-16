class JuiceRunner 
{
    public static void main(String[] jr) 
	{

        Juice juiceOne = new Juice(); 
		juiceOne.flavor = "Mango";
		juiceOne.juiceId = 1;
		juiceOne.price = 50.0;
		
		
        Juice juiceTwo = new Juice(); 
		juiceTwo.flavor = "Orange";
		juiceTwo.juiceId = 2;
		juiceTwo.price = 40.0;
		
		
        Juice juiceThree = new Juice();
		juiceThree.flavor = "Apple";
		juiceThree.juiceId = 3;
		juiceThree.price = 60.0;
		
		
        Juice juiceFour = new Juice();
		juiceFour.flavor = "Pineapple";
		juiceFour.juiceId = 4;
		juiceFour.price = 55.0;
		
		
        Juice juiceFive = new Juice(); 
		juiceFive.flavor = "Grape";
		juiceFive.juiceId = 5;
		juiceFive.price = 70.0;
		
		
        Juice juiceSix = new Juice(); 
		juiceSix.flavor = "Watermelon";
		juiceSix.juiceId = 6;
		juiceSix.price = 35.0;
		
		
        Juice juiceSeven = new Juice(); 
		juiceSeven.flavor = "Lemon";
		juiceSeven.juiceId = 7;
		juiceSeven.price = 30.0;
		
		
        Juice juiceEight = new Juice(); 
		juiceEight.flavor = "Strawberry";
		juiceEight.juiceId = 8;
		juiceEight.price = 80.0;
		
		
        Juice juiceNine = new Juice(); 
		juiceNine.flavor = "Guava";
		juiceNine.juiceId = 9;
		juiceNine.price = 45.0;
		
		
        Juice juiceTen = new Juice();
		juiceTen.flavor = "Papaya";
		juiceTen.juiceId = 10;
		juiceTen.price = 50.0;
		
		
        Juice juiceEleven = new Juice(); 
		juiceEleven.flavor = "Kiwi";
		juiceEleven.juiceId = 11;
		juiceEleven.price = 90.0;
		
		
        Juice juiceTwelve = new Juice(); 
		juiceTwelve.flavor = "Peach";
		juiceTwelve.juiceId = 12;
		juiceTwelve.price = 65.0;
		
		
        Juice juiceThirteen = new Juice(); 
		juiceThirteen.flavor = "Cherry";
		juiceThirteen.juiceId = 13;
		juiceThirteen.price = 85.0;
		
		
        Juice juiceFourteen = new Juice();
		juiceFourteen.flavor = "Coconut";
		juiceFourteen.juiceId = 14;
		juiceFourteen.price = 55.0;
		
		
        Juice juiceFifteen = new Juice();
		juiceFifteen.flavor = "Mixed Fruit";
		juiceFifteen.juiceId = 15;
		juiceFifteen.price = 75.0;


        Juice juices[] = new Juice[15];
        juices[0]=juiceOne;
		juices[1]=juiceTwo; 
		juices[2]=juiceThree; 
		juices[3]=juiceFour; 
		juices[4]=juiceFive;
        juices[5]=juiceSix; 
		juices[6]=juiceSeven; 
		juices[7]=juiceEight; 
		juices[8]=juiceNine; 
		juices[9]=juiceTen;
        juices[10]=juiceEleven; 
		juices[11]=juiceTwelve; 
		juices[12]=juiceThirteen;
		juices[13]=juiceFourteen;
		juices[14]=juiceFifteen;

        for(Juice juice : juices)
		{
            System.out.println(juice.flavor);
			System.out.println(juice.juiceId);
			System.out.println(juice.price);
        }
    }
}