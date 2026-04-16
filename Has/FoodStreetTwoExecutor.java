class FoodStreetTwoExecutor 
{
    public static void main(String[] args)
	{
        FoodStreet food = new FoodStreet();
        Stall stall = new Stall();

        stall.stallId = 2;
        stall.foodType = "Chinese";

        food.createStall(stall);
        food.getFoodStreetDetails();
    }
}

