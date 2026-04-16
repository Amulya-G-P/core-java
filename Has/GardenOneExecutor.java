class GardenOneExecutor 
{
    public static void main(String[] args) 
	{
        Garden g = new Garden();
        Flower f = new Flower();

        f.flowerId = 11;
        f.type = "Lotus";
        f.color = "Pink";

        g.gardenId = 101;
        g.name = "Lalbagh";
        g.location = "Bangalore";
        g.flower = f;

        g.getGardenDetails();
    }
}