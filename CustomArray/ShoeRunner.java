class ShoeRunner
{
    public static void main(String[] sr) 
	{

        Shoe one = new Shoe();
        one.brand = "Nike";

        Shoe two = new Shoe();
        two.brand = "Adidas";
		
		Shoe three = new Shoe();
		three.brand = "Puma";
		
		Shoe four = new Shoe();
		four.brand = "Reebok";
		
		Shoe five = new Shoe();
		five.brand = "Skechers";
		
		Shoe six = new Shoe();
		six.brand = "Woodland";
		
		Shoe seven = new Shoe();
		seven.brand = "Bata";
		
		Shoe eight = new Shoe();
		eight.brand = "Crocs";
		
		Shoe nine = new Shoe();
		nine.brand ="Converse";
		
		Shoe ten = new Shoe();
		ten.brand = "Fila";
		
		Shoe eleven = new Shoe();
		eleven.brand = "Under Armour";
		
		Shoe twelve = new Shoe();
		twelve.brand = "New Balance";
		
		Shoe thirteen = new Shoe();
		thirteen.brand = "Red Tape";
		
		Shoe fourteen = new Shoe();
		fourteen.brand = "Lee Cooper";
		
		Shoe fifteen = new Shoe();
		fifteen.brand = "Hush Puppies";
		
        Shoe shoes[] = new Shoe[15];
		shoes[0] = one;
		shoes[1] = two;
		shoes[2] = three;
		shoes[3] = four;
		shoes[4] = five;
		shoes[5] = six;
		shoes[6] = seven;
		shoes[7] = eight;
		shoes[8] = nine;
		shoes[9] = ten;
		shoes[10] = eleven;
		shoes[11] = twelve;
		shoes[12] = thirteen;
		shoes[13] = fourteen;
		shoes[14] = fifteen;

        for (Shoe shoe : shoes) 
		{
            System.out.println(shoe.brand);
        }
    }
}