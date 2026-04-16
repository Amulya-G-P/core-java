class Capacitor 
{
    int capacitorId;
    String type;
    String capacity;

    public void getCapacitorDetails() 
	{
        System.out.println("Capacitor Details invoked");
        System.out.println("the capacitor id is: " + capacitorId);
        System.out.println("the capacitor type is: " + type);
        System.out.println("the capacitor capacity is: " + capacity);
        System.out.println("Capacitor Details ended");
    }
}