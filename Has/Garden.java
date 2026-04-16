class Garden 
{
    int gardenId;
    String name;
    String location;
    Flower flower;

    public void getGardenDetails() 
	{
        System.out.println("Garden Id: " + gardenId);
        System.out.println("Garden Name: " + name);
        System.out.println("Location: " + location);
        flower.getFlowerDetails();
    }

    Garden() {}

    Garden(int gardenId, String name, String location, Flower flower) 
	{
        this.gardenId = gardenId;
        this.name = name;
        this.location = location;
        this.flower = flower;
    }

    public boolean createFlower(Flower flower) 
	{
        this.flower = flower;
        return true;
    }
}








