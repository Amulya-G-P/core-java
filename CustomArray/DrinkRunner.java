class DrinkRunner 
{
    public static void main(String[] dr) 
	{
        Drink one = new Drink();
        one.name = "Tea";

        Drink two = new Drink();
        two.name = "Coffee";
		
		Drink three = new Drink();
		three.name = "Milk";
		
		Drink four = new Drink();
		four.name = "Juice";
		
		Drink five = new Drink();
		five.name = "Lassi";
		
		Drink six = new Drink();
		six.name = "Buttermilk";
		
		Drink seven = new Drink();
		seven.name = "Smoothie";
		
		Drink eight = new Drink();
		eight.name = "Soda";
		
		Drink nine = new Drink();
		nine.name ="Cola";
		
		Drink ten = new Drink();
		ten.name = "Milkshake";
		
		Drink eleven = new Drink();
		eleven.name = "Green Tea";
		
		Drink twelve = new Drink();
		twelve.name = "Black Coffee";
		
		Drink thirteen = new Drink();
		thirteen.name = "Cold Coffee";
		
		Drink fourteen = new Drink();
		fourteen.name = "Energy Drink";
		
		Drink fifteen = new Drink();
		fifteen.name = "Herbal Tea";
		
        Drink drinks[] = new Drink[15];
		drinks[0] = one;
		drinks[1] = two;
		drinks[2] = three;
		drinks[3] = four;
		drinks[4] = five;
		drinks[5] = six;
		drinks[6] = seven;
		drinks[7] = eight;
		drinks[8] = nine;
		drinks[9] = ten;
		drinks[10] = eleven;
		drinks[11] = twelve;
		drinks[12] = thirteen;
		drinks[13] = fourteen;
		drinks[14] = fifteen;

        for (Drink drink : drinks)
		{
            System.out.println(drink.name);
        }
    }
}