class AnimalRunner 
{
    public static void main(String[] ar)
	{
        Animal one = new Animal();
        one.name = "Dog";

        Animal two = new Animal();
        two.name = "Cat";
		
		Animal three = new Animal();
		three.name = "Elephant";
		
		Animal four = new Animal();
		four.name = "Tiger";
		
		Animal five = new Animal();
		five.name = "Lion";
		
		Animal six = new Animal();
		six.name = "Zebra";
		
		Animal seven = new Animal();
		seven.name = "Horse";
		
		Animal eight = new Animal();
		eight.name = "Monkey";
		
		Animal nine = new Animal();
		nine.name ="Giraffe";
		
		Animal ten = new Animal();
		ten.name = "Bear";
		
		Animal eleven = new Animal();
		eleven.name = "Fox";
		
		Animal twelve = new Animal();
		twelve.name = "Wolf";
		
		Animal thirteen = new Animal();
		thirteen.name = "Deer";
		
		Animal fourteen = new Animal();
		fourteen.name = "Rabbit";
		
		Animal fifteen = new Animal();
		fifteen.name = "Cow";
		
        Animal animals[] = new Animal[15];
		animals[0] = one;
		animals[1] = two;
		animals[2] = three;
		animals[3] = four;
		animals[4] = five;
		animals[5] = six;
		animals[6] = seven;
		animals[7] = eight;
		animals[8] = nine;
		animals[9] = ten;
		animals[10] = eleven;
		animals[11] = twelve;
		animals[12] = thirteen;
		animals[13] = fourteen;
		animals[14] = fifteen;

        for (Animal animal : animals) 
		{
            System.out.println(animal.name);
        }
    }
}