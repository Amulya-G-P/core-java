class FanTwoExecutor 
{
    public static void main(String[] args) 
	{
        Fan fan = new Fan();
        fan.fanId = 2;
        fan.brand = "Havells";
        fan.speed = 4;

        Capacitor capacitor = new Capacitor();
        capacitor.capacitorId = 102;
        capacitor.type = "Ceramic";
        capacitor.capacity = "3uF";

        boolean created = fan.createCapacitor(capacitor);
        System.out.println(created);

        fan.getFanDetails();
    }
}