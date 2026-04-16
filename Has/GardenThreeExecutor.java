class GardenThreeExecutor 
{
    public static void main(String[] args) 
	{
        Flower f = new Flower();
        f.flowerId = 3;
        f.type = "Lotus";
        f.color = "Pink";

        Garden g = new Garden(102, "Cubbon Park", "Bangalore", f);
        g.getGardenDetails();
    }
}