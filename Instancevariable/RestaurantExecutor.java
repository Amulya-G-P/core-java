class RestaurantExecutor
{
    public static void main(String[] args)
    {
        Restaurant r1 = new Restaurant();
        r1.restaurantId = 1; 
		r1.restaurantName = "Spice Garden"; 
		r1.location = "Bangalore"; 
		r1.cuisineType = "Indian";

        Restaurant r2 = new Restaurant();
        r2.restaurantId = 2; 
		r2.restaurantName = "Pizza Corner";
		r2.location = "Mysore";
		r2.cuisineType = "Italian";

        Restaurant r3 = new Restaurant();
        r3.restaurantId = 3; 
		r3.restaurantName = "Dragon Wok"; 
		r3.location = "Chennai"; 
		r3.cuisineType = "Chinese";

        Restaurant r4 = new Restaurant();
        r4.restaurantId = 4;
		r4.restaurantName = "Burger Hub"; 
		r4.location = "Hyderabad"; 
		r4.cuisineType = "Fast Food";

        Restaurant r5 = new Restaurant();
        r5.restaurantId = 5; 
		r5.restaurantName = "Tandoori Treat"; 
		r5.location = "Delhi"; 
		r5.cuisineType = "North Indian";

        Restaurant r6 = new Restaurant();
        r6.restaurantId = 6; 
		r6.restaurantName = "Sea Food Bay";
		r6.location = "Goa"; 
		r6.cuisineType = "Sea Food";

        Restaurant r7 = new Restaurant();
        r7.restaurantId = 7;
		r7.restaurantName = "Dosa Palace"; 
		r7.location = "Bangalore";
		r7.cuisineType = "South Indian";

        Restaurant r8 = new Restaurant();
        r8.restaurantId = 8;
		r8.restaurantName = "BBQ Nation";
		r8.location = "Pune"; 
		r8.cuisineType = "BBQ";

        Restaurant r9 = new Restaurant();
        r9.restaurantId = 9;
		r9.restaurantName = "Sweet House";
		r9.location = "Kolkata"; 
		r9.cuisineType = "Desserts";

        Restaurant r10 = new Restaurant();
        r10.restaurantId = 10;
		r10.restaurantName = "Cafe Coffee"; 
		r10.location = "Mumbai"; 
		r10.cuisineType = "Cafe";

        Restaurant r11 = new Restaurant();
        r11.restaurantId = 11; 
		r11.restaurantName = "Food Court";
		r11.location = "Chandigarh"; 
		r11.cuisineType = "Multi Cuisine";

        Restaurant r12 = new Restaurant();
        r12.restaurantId = 12; 
		r12.restaurantName = "Biryani Zone";
		r12.location = "Hyderabad"; 
		r12.cuisineType = "Biryani";

        Restaurant r13 = new Restaurant();
        r13.restaurantId = 13; 
		r13.restaurantName = "Roll Center"; 
		r13.location = "Kolkata"; 
		r13.cuisineType = "Street Food";

        Restaurant r14 = new Restaurant();
        r14.restaurantId = 14; 
		r14.restaurantName = "Healthy Bowl"; 
		r14.location = "Delhi"; 
		r14.cuisineType = "Healthy Food";

        Restaurant r15 = new Restaurant();
        r15.restaurantId = 15;
		r15.restaurantName = "Punjabi Dhaba";
		r15.location = "Amritsar";
		r15.cuisineType = "Punjabi";

        Restaurant r16 = new Restaurant();
        r16.restaurantId = 16; 
		r16.restaurantName = "Noodle Bar";
		r16.location = "Chennai";
		r16.cuisineType = "Asian";

        Restaurant r17 = new Restaurant();
        r17.restaurantId = 17; 
		r17.restaurantName = "Ice Cream World";
		r17.location = "Surat"; 
		r17.cuisineType = "Ice Cream";

        Restaurant r18 = new Restaurant();
        r18.restaurantId = 18; 
		r18.restaurantName = "Momos Street";
		r18.location = "Darjeeling";
		r18.cuisineType = "Momos";

        Restaurant r19 = new Restaurant();
        r19.restaurantId = 19; 
		r19.restaurantName = "Juice Center"; 
		r19.location = "Jaipur"; 
		r19.cuisineType = "Juices";

        Restaurant r20 = new Restaurant();
        r20.restaurantId = 20;
		r20.restaurantName = "Veg Delight";
		r20.location = "Udupi"; 
		r20.cuisineType = "Vegetarian";


        Chef c1 = new Chef();
        c1.chefId = 101;
		c1.chefName = "Chef Arun";
		c1.specialty = "Indian";
		c1.experience = 10;

        Chef c2 = new Chef();
        c2.chefId = 102;
		c2.chefName = "Chef Ravi"; 
		c2.specialty = "Italian"; 
		c2.experience = 8;

        Chef c3 = new Chef();
        c3.chefId = 103;
		c3.chefName = "Chef Lee"; 
		c3.specialty = "Chinese";
		c3.experience = 12;

        Chef c4 = new Chef();
        c4.chefId = 104;
		c4.chefName = "Chef John"; 
		c4.specialty = "Fast Food";
		c4.experience = 7;

        Chef c5 = new Chef();
        c5.chefId = 105; 
		c5.chefName = "Chef Singh"; 
		c5.specialty = "North Indian"; 
		c5.experience = 15;

        Chef c6 = new Chef();
        c6.chefId = 106; 
		c6.chefName = "Chef Ramesh"; 
		c6.specialty = "Sea Food"; 
		c6.experience = 11;

        Chef c7 = new Chef();
        c7.chefId = 107; 
		c7.chefName = "Chef Manju"; 
		c7.specialty = "South Indian";
		c7.experience = 9;

        Chef c8 = new Chef();
        c8.chefId = 108; 
		c8.chefName = "Chef Ali"; 
		c8.specialty = "BBQ"; 
		c8.experience = 13;

        Chef c9 = new Chef();
        c9.chefId = 109; 
		c9.chefName = "Chef Meena";
		c9.specialty = "Desserts"; 
		c9.experience = 6;

        Chef c10 = new Chef();
        c10.chefId = 110; 
		c10.chefName = "Chef Kiran"; 
		c10.specialty = "Cafe"; 
		c10.experience = 5;

        Chef c11 = new Chef();
        c11.chefId = 111; 
		c11.chefName = "Chef Kumar"; 
		c11.specialty = "Multi Cuisine";
		c11.experience = 14;

        Chef c12 = new Chef();
        c12.chefId = 112; 
		c12.chefName = "Chef Rahman"; 
		c12.specialty = "Biryani"; 
		c12.experience = 16;

        Chef c13 = new Chef();
        c13.chefId = 113;
		c13.chefName = "Chef Das";
		c13.specialty = "Street Food";
		c13.experience = 8;

        Chef c14 = new Chef();
        c14.chefId = 114;
		c14.chefName = "Chef Pooja"; 
		c14.specialty = "Healthy Food"; 
		c14.experience = 7;

        Chef c15 = new Chef();
        c15.chefId = 115;
		c15.chefName = "Chef Gill"; 
		c15.specialty = "Punjabi"; 
		c15.experience = 18;

        Chef c16 = new Chef();
        c16.chefId = 116; 
		c16.chefName = "Chef Wang";
		c16.specialty = "Asian"; 
		c16.experience = 10;

        Chef c17 = new Chef();
        c17.chefId = 117;
		c17.chefName = "Chef Raju";
		c17.specialty = "Ice Cream";
		c17.experience = 6;

        Chef c18 = new Chef();
        c18.chefId = 118;
		c18.chefName = "Chef Sonam"; 
		c18.specialty = "Momos";
		c18.experience = 9;

        Chef c19 = new Chef();
        c19.chefId = 119;
		c19.chefName = "Chef Mohan"; 
		c19.specialty = "Juices"; 
		c19.experience = 5;

        Chef c20 = new Chef();
        c20.chefId = 120;
		c20.chefName = "Chef Umesh";
		c20.specialty = "Vegetarian"; 
		c20.experience = 12;


        r1.chef = c1; 
		r1.getRestaurantDetails();
        r2.chef = c2; 
		r2.getRestaurantDetails();
        r3.chef = c3; 
		r3.getRestaurantDetails();
        r4.chef = c4;
		r4.getRestaurantDetails();
        r5.chef = c5;
		r5.getRestaurantDetails();
        r6.chef = c6; 
		r6.getRestaurantDetails();
        r7.chef = c7; 
		r7.getRestaurantDetails();
        r8.chef = c8; 
		r8.getRestaurantDetails();
        r9.chef = c9; 
		r9.getRestaurantDetails();
        r10.chef = c10; 
		r10.getRestaurantDetails();
        r11.chef = c11; 
		r11.getRestaurantDetails();
        r12.chef = c12; 
		r12.getRestaurantDetails();
        r13.chef = c13; 
		r13.getRestaurantDetails();
        r14.chef = c14; 
		r14.getRestaurantDetails();
        r15.chef = c15; 
		r15.getRestaurantDetails();
        r16.chef = c16; 
		r16.getRestaurantDetails();
        r17.chef = c17;
		r17.getRestaurantDetails();
        r18.chef = c18;
		r18.getRestaurantDetails();
        r19.chef = c19; 
		r19.getRestaurantDetails();
        r20.chef = c20; 
		r20.getRestaurantDetails();
    }
}