class GardenTwoExecutor 
{
    public static void main(String[] args)
	{
        Garden g = new Garden();
        Flower f = new Flower();

        f.flowerId = 2;
        f.type = "Rose";
        f.color = "Red";

        g.createFlower(f);
        g.getGardenDetails();
    }
}