class BagRunner 
{
    public static void main(String[] br) 
	{
        Bag one = new Bag();
        one.type = "Backpack";

        Bag two = new Bag();
        two.type = "Handbag";
		
		Bag three = new Bag();
		three.type = "Laptop Bag";
		
		Bag four = new Bag();
		four.type = "Travel Bag";
		
		Bag five = new Bag();
		five.type = "School Bag";
		
		Bag six = new Bag();
		six.type = "Gym Bag";
		
		Bag seven = new Bag();
		seven.type = "Duffel Bag";
		
		Bag eight = new Bag();
		eight.type = "Tote Bag";
		
		Bag nine = new Bag();
		nine.type ="Messenger Bag";
		
		Bag ten = new Bag();
		ten.type = "Sling Bag";
		
		Bag eleven = new Bag();
		eleven.type = "Camera Bag";
		
		Bag twelve = new Bag();
		twelve.type = "Office Bag";
		
		Bag thirteen = new Bag();
		thirteen.type = "Shopping Bag";
		
		Bag fourteen = new Bag();
		fourteen.type = "Clutch";
		
		Bag fifteen = new Bag();
		fifteen.type = "Suitcase";
		
        Bag bags[] = new Bag[15];
		bags[0] = one;
		bags[1] = two;
		bags[2] = three;
		bags[3] = four;
		bags[4] = five;
		bags[5] = six;
		bags[6] = seven;
		bags[7] = eight;
		bags[8] = nine;
		bags[9] = ten;
		bags[10] = eleven;
		bags[11] = twelve;
		bags[12] = thirteen;
		bags[13] = fourteen;
		bags[14] = fifteen;

        for (Bag bag : bags) 
		{
            System.out.println(bag.type);
        }
    }
}