class IceCreamTwoExecutor 
{
    public static void main(String[] args) 
	{
        IceCream i = new IceCream();
        Flavour f = new Flavour();

        f.id = 2;
        f.name = "Vanilla";

        i.createFlavour(f);
        i.getDetails();
    }
}

