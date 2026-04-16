class FoodRunner 
{
    public static void main(String[] args) 
	{
        Food one = new Food();
        one.name = "Pizza";

        Food two = new Food();
        two.name = "Burger";
		
		Food three = new Food();
		three.name = "Pasta";
		
		Food four = new Food();
		four.name = "Biryani";
		
		Food five = new Food();
		five.name = "Dosa";
		
		Food six = new Food();
		six.name = "Idli";
		
		Food seven = new Food();
		seven.name = "Noodles";
		
		Food eight = new Food();
		eight.name = "Sandwich";
		
		Food nine = new Food();
		nine.name ="Fried Rice";
		
		Food ten = new Food();
		ten.name = "Paneer";
		
		Food eleven = new Food();
		eleven.name = "Chicken Curry";
		
		Food twelve = new Food();
		twelve.name = "Ice Cream";
		
		Food thirteen = new Food();
		thirteen.name = "Salad";
		
		Food fourteen = new Food();
		fourteen.name = "Soup";
		
		Food fifteen = new Food();
		fifteen.name = "Paratha";
		
        Food foods[] = new Food[15];
		foods[0] = one;
		foods[1] = two;
		foods[2] = three;
		foods[3] = four;
		foods[4] = five;
		foods[5] = six;
		foods[6] = seven;
		foods[7] = eight;
		foods[8] = nine;
		foods[9] = ten;
		foods[10] = eleven;
		foods[11] = twelve;
		foods[12] = thirteen;
		foods[13] = fourteen;
		foods[14] = fifteen;

        for (Food food : foods) 
		{
            System.out.println(food.name);
        }
    }
}