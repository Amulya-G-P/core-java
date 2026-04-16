class FoodStreetOneExecutor 
{
    public static void main(String[] args) 
	{
        FoodStreet food = new FoodStreet();
        Stall stall = new Stall();

        stall.stallId = 1;
        stall.foodType = "Chats";

        food.streetId = 101;
        food.name = "VV Puram";
        food.stall = stall;

        food.getFoodStreetDetails();
    }
}

