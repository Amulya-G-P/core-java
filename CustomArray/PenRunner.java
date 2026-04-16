class PenRunner 
{
    public static void main(String[] pr) 
	{
        Pen one = new Pen();
        one.brand = "Reynolds";

        Pen two = new Pen();
        two.brand = "Cello";
		
		Pen three = new Pen();
		three.brand = "Parker";
		
		Pen four = new Pen();
		four.brand = "Pilot";
		
		Pen five = new Pen();
		five.brand = "Flair";
		
		Pen six = new Pen();
		six.brand = "Luxor";
		
		Pen seven = new Pen();
		seven.brand = "Add Gel";
		
		Pen eight = new Pen();
		eight.brand = "Classmate";
		
		Pen nine = new Pen();
		nine.brand ="Pentonic";
		
		Pen ten = new Pen();
		ten.brand = "Montex";
		
		Pen eleven = new Pen();
		eleven.brand = "Camlin";
		
		Pen twelve = new Pen();
		twelve.brand = "Faber-Castell";
		
		Pen thirteen = new Pen();
		thirteen.brand = "Linc";
		
		Pen fourteen = new Pen();
		fourteen.brand = "Hauser";
		
		Pen fifteen = new Pen();
		fifteen.brand = "Zebra";
		
        Pen pens[] = new Pen[15];
		pens[0] = one;
		pens[1] = two;
		pens[2] = three;
		pens[3] = four;
		pens[4] = five;
		pens[5] = six;
		pens[6] = seven;
		pens[7] = eight;
		pens[8] = nine;
		pens[9] = ten;
		pens[10] = eleven;
		pens[11] = twelve;
		pens[12] = thirteen;
		pens[13] = fourteen;
		pens[14] = fifteen;

        for (Pen pen : pens) 
		{
            System.out.println(pen.brand);
        }
    }
}