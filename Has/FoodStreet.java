class FoodStreet 
{
    int streetId;
    String name;
    Stall stall;

    public void getFoodStreetDetails() 
	{
        System.out.println("Street Id: " + streetId);
        System.out.println("Name: " + name);
        stall.getStallDetails();
    }

    FoodStreet() {}

    FoodStreet(int streetId, String name, Stall stall) 
	{
        this.streetId = streetId;
        this.name = name;
        this.stall = stall;
    }

    public boolean createStall(Stall stall) 
	{
        this.stall = stall;
        return true;
    }
}

