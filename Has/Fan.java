class Fan 
{
    int fanId;
    String brand;
    int speed;
    Capacitor capacitor;

    public void getFanDetails() 
	{
        System.out.println("Fan Details invoked");
        System.out.println("The Fan id is: " + fanId);
        System.out.println("The Fan brand is: " + brand);
        System.out.println("The Fan speed is: " + speed);
        capacitor.getCapacitorDetails();
        System.out.println("Fan Details ended");
    }

    Fan(int fanId, String brand, int speed, Capacitor capacitor) 
	{
        this.fanId = fanId;
        this.brand = brand;
        this.speed = speed;
        this.capacitor = capacitor;
    }

    Fan() 
	{

    }

    public boolean createCapacitor(Capacitor capacitor) 
	{
        this.capacitor = capacitor;
        return true;
    }
}

