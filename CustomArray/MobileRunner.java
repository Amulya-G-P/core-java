class MobileRunner
{
    public static void main(String[] mr) 
	{

        Mobile mobileOne = new Mobile();
        mobileOne.brand = "Samsung";

        Mobile mobileTwo = new Mobile();
        mobileTwo.brand = "Apple";
		
		Mobile mobileThree = new Mobile();
		mobileThree.brand = "OnePlus";
		
		Mobile mobileFour = new Mobile();
		mobileFour.brand = "Xiaomi";
		
		Mobile mobileFive = new Mobile();
		mobileFive.brand = "Realme";
		
		Mobile mobileSix = new Mobile();
		mobileSix.brand = "Oppo";
		
		Mobile mobileSeven = new Mobile();
		mobileSeven.brand = "Vivo";
		
		Mobile mobileEight = new Mobile();
		mobileEight.brand = "Nokia";
		
		Mobile mobileNine = new Mobile();
		mobileNine.brand ="Motorola";
		
		Mobile mobileTen = new Mobile();
		mobileTen.brand = "Google";
		
		Mobile mobileEleven = new Mobile();
		mobileEleven.brand = "Sony";
		
		Mobile mobileTwelve = new Mobile();
		mobileTwelve.brand = "LG";
		
		Mobile mobileThirteen = new Mobile();
		mobileThirteen.brand = "Asus";
		
		Mobile mobileFourteen = new Mobile();
		mobileFourteen.brand = "Honor";
		
		Mobile mobileFifteen = new Mobile();
		mobileFifteen.brand = "Huawei";
		
        Mobile mobiles[] = new Mobile[15];
		mobiles[0] = mobileOne;
		mobiles[1] = mobileTwo;
		mobiles[2] = mobileThree;
		mobiles[3] = mobileFour;
		mobiles[4] = mobileFive;
		mobiles[5] = mobileSix;
		mobiles[6] = mobileSeven;
		mobiles[7] = mobileEight;
		mobiles[8] = mobileNine;
		mobiles[9] = mobileTen;
		mobiles[10] = mobileEleven;
		mobiles[11] = mobileTwelve;
		mobiles[12] = mobileThirteen;
		mobiles[13] = mobileFourteen;
		mobiles[14] = mobileFifteen;

        for (Mobile mobile : mobiles) 
		{
            System.out.println(mobile.brand);
        }
    }
}