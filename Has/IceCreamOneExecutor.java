class IceCreamOneExecutor 
{
    public static void main(String[] args) 
	{
        IceCream i = new IceCream();
        Flavour f = new Flavour();

        f.id = 1;
        f.name = "Chocolate";

        i.id = 101;
        i.brand = "Amul";
        i.flavour = f;

        i.getDetails();
    }
}

