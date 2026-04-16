class IceCreamThreeExecutor 
{
    public static void main(String[] args)
	{
        Flavour f = new Flavour();
        f.id = 3;
        f.name = "Strawberry";

        IceCream i = new IceCream(102, "Kwality Walls", f);
        i.getDetails();
    }
}