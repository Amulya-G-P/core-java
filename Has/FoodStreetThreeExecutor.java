class FoodStreetThreeExecutor 
{
    public static void main(String[] args)
	{
        Stall stall = new Stall();
        stall.stallId = 3;
        stall.foodType = "South Indian";

        FoodStreet food = new FoodStreet(102, "Indiranagar", stall);
        food.getFoodStreetDetails();
    }
}