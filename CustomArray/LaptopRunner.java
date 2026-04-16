class LaptopRunner 
{
    public static void main(String[] args) 
	{
        Laptop one = new Laptop();
        one.brand = "Dell";

        Laptop two = new Laptop();
        two.brand = "HP";
		
		Laptop three = new Laptop();
		three.brand = "Lenovo";
		
		Laptop four = new Laptop();
		four.brand = "Apple";
		
		Laptop five = new Laptop();
		five.brand = "Asus";
		
		Laptop six = new Laptop();
		six.brand = "Acer";
		
		Laptop seven = new Laptop();
		seven.brand = "MSI";
		
		Laptop eight = new Laptop();
		eight.brand = "Samsung";
		
		Laptop nine = new Laptop();
		nine.brand ="Microsoft";
		
		Laptop ten = new Laptop();
		ten.brand = "Razer";
		
		Laptop eleven = new Laptop();
		eleven.brand = "LG";
		
		Laptop twelve = new Laptop();
		twelve.brand = "Huawei";
		
		Laptop thirteen = new Laptop();
		thirteen.brand = "Toshiba";
		
		Laptop fourteen = new Laptop();
		fourteen.brand = "Alienware";
		
		Laptop fifteen = new Laptop();
		fifteen.brand = "Chromebook";
		
        Laptop laptops[] = new Laptop[15];
		laptops[0] = one;
		laptops[1] = two;
		laptops[2] = three;
		laptops[3] = four;
		laptops[4] = five;
		laptops[5] = six;
		laptops[6] = seven;
		laptops[7] = eight;
		laptops[8] = nine;
		laptops[9] = ten;
		laptops[10] = eleven;
		laptops[11] = twelve;
		laptops[12] = thirteen;
		laptops[13] = fourteen;
		laptops[14] = fifteen;

        for (Laptop laptop : laptops) 
		{
            System.out.println(laptop.brand);
        }
    }
}