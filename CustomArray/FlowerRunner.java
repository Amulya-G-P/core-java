class FlowerRunner 
{
    public static void main(String[] fr) 
	{

        Flower one = new Flower();
        one.name = "Rose";

        Flower two = new Flower();
        two.name = "Lily";
		
		Flower three = new Flower();
		three.name = "Lotus";
		
		Flower four = new Flower();
		four.name = "Sunflower";
		
		Flower five = new Flower();
		five.name = "Jasmine";
		
		Flower six = new Flower();
		six.name = "Tulip";
		
		Flower seven = new Flower();
		seven.name = "Daisy";
		
		Flower eight = new Flower();
		eight.name = "Orchid";
		
		Flower nine = new Flower();
		nine.name ="Marigold";
		
		Flower ten = new Flower();
		ten.name = "Lavender";
		
		Flower eleven = new Flower();
		eleven.name = "Hibiscus";
		
		Flower twelve = new Flower();
		twelve.name = "Bluebell";
		
		Flower thirteen = new Flower();
		thirteen.name = "Chrysanthemum";
		
		Flower fourteen = new Flower();
		fourteen.name = "Peony";
		
		Flower fifteen = new Flower();
		fifteen.name = "Daffodil";
		
        Flower flowers[] = new Flower[15];
		flowers[0] = one;
		flowers[1] = two;
		flowers[2] = three;
		flowers[3] = four;
		flowers[4] = five;
		flowers[5] = six;
		flowers[6] = seven;
		flowers[7] = eight;
		flowers[8] = nine;
		flowers[9] = ten;
		flowers[10] = eleven;
		flowers[11] = twelve;
		flowers[12] = thirteen;
		flowers[13] = fourteen;
		flowers[14] = fifteen;

        for (Flower flower : flowers) 
		{
            System.out.println(flower.name);
        }
    }
}