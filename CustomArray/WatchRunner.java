class WatchRunner 
{
    public static void main(String[] wr) 
	{
        Watch one = new Watch();
        one.brand = "Titan";

        Watch two = new Watch();
        two.brand = "Fastrack";
		
		Watch three = new Watch();
		three.brand = "Casio";
		
		Watch four = new Watch();
		four.brand = "Rolex";
		
		Watch five = new Watch();
		five.brand = "Timex";
		
		Watch six = new Watch();
		six.brand = "Sonata";
		
		Watch seven = new Watch();
		seven.brand = "Fossil";
		
		Watch eight = new Watch();
		eight.brand = "Seiko";
		
		Watch nine = new Watch();
		nine.brand ="Omega";
		
		Watch ten = new Watch();
		ten.brand = "Citizen";
		
		Watch eleven = new Watch();
		eleven.brand = "Daniel Wellington";
		
		Watch twelve = new Watch();
		twelve.brand = "Guess";
		
		Watch thirteen = new Watch();
		thirteen.brand = "Armani";
		
		Watch fourteen = new Watch();
		fourteen.brand = "Diesel";
		
		Watch fifteen = new Watch();
		fifteen.brand = "Skagen";
		
        Watch watches[] = new Watch[15];
		watches[0] = one;
		watches[1] = two;
		watches[2] = three;
		watches[3] = four;
		watches[4] = five;
		watches[5] = six;
		watches[6] = seven;
		watches[7] = eight;
		watches[8] = nine;
		watches[9] = ten;
		watches[10] = eleven;
		watches[11] = twelve;
		watches[12] = thirteen;
		watches[13] = fourteen;
		watches[14] = fifteen;

        for (Watch watch : watches)
		{
            System.out.println(watch.brand);
        }
    }
}