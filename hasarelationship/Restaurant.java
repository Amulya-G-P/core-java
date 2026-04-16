class Restaurant
{
    int restaurantId;
    String restaurantName;
    String location;
    String cuisineType;
    Chef chef;

    public void getRestaurantDetails()
    {
        System.out.println("Restaurant Id: " + restaurantId);
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Location: " + location);
        System.out.println("Cuisine Type: " + cuisineType);

        chef.getChefDetails();
    }
}