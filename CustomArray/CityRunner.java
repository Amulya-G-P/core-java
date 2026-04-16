class CityRunner 
{
    public static void main(String[] cr) 
	{
        City one = new City();
        one.name = "Bangalore";

        City two = new City();
        two.name = "Delhi";
		
		City three = new City();
		three.name = "Mumbai";
		
		City four = new City();
		four.name = "Chennai";
		
		City five = new City();
		five.name = "Hyderabad";
		
		City six = new City();
		six.name = "Kolkata";
		
		City seven = new City();
		seven.name = "Pune";
		
		City eight = new City();
		eight.name = "Jaipur";
		
		City nine = new City();
		nine.name ="Ahmedabad";
		
		City ten = new City();
		ten.name = "Surat";
		
		City eleven = new City();
		eleven.name = "Lucknow";
		
		City twelve = new City();
		twelve.name = "Bhopal";
		
		City thirteen = new City();
		thirteen.name = "Indore";
		
		City fourteen = new City();
		fourteen.name = "Nagpur";
		
		City fifteen = new City();
		fifteen.name = "Mysore";
		
        City cities[] = new City[15];
		cities[0] = one;
		cities[1] = two;
		cities[2] = three;
		cities[3] = four;
		cities[4] = five;
		cities[5] = six;
		cities[6] = seven;
		cities[7] = eight;
		cities[8] = nine;
		cities[9] = ten;
		cities[10] = eleven;
		cities[11] = twelve;
		cities[12] = thirteen;
		cities[13] = fourteen;
		cities[14] = fifteen;

        for (City city : cities) 
		{
            System.out.println(city.name);
        }
    }
}