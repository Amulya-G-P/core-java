class CarRunner 
{
    public static void main(String[] cr) 
	{
        Car one = new Car();
        one.brand = "Toyota";

        Car two = new Car();
        two.brand = "Honda";
		
		Car three = new Car();
		three.brand = "Hyundai";
		
		Car four = new Car();
		four.brand = "BMW";
		
		Car five = new Car();
		five.brand = "Audi";
		
		Car six = new Car();
		six.brand = "Mercedes";
		
		Car seven = new Car();
		seven.brand = "Ford";
		
		Car eight = new Car();
		eight.brand = "Tata";
		
		Car nine = new Car();
		nine.brand ="Mahindra";
		
		Car ten = new Car();
		ten.brand = "Kia";
		
		Car eleven = new Car();
		eleven.brand = "Skoda";
		
		Car twelve = new Car();
		twelve.brand = "Volkswagen";
		
		Car thirteen = new Car();
		thirteen.brand = "Nissan";
		
		Car fourteen = new Car();
		fourteen.brand = "Renault";
		
		Car fifteen = new Car();
		fifteen.brand = "Jeep";
		
        Car cars[] = new Car[15];
		cars[0] = one;
		cars[1] = two;
		cars[2] = three;
		cars[3] = four;
		cars[4] = five;
		cars[5] = six;
		cars[6] = seven;
		cars[7] = eight;
		cars[8] = nine;
		cars[9] = ten;
		cars[10] = eleven;
		cars[11] = twelve;
		cars[12] = thirteen;
		cars[13] = fourteen;
		cars[14] = fifteen;

        for (Car car : cars) 
		{
            System.out.println(car.brand);
        }
    }
}