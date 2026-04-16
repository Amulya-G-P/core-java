class FanThreeExecutor 
{
    public static void main(String[] args) 
	{

        Capacitor capacitor = new Capacitor();
        capacitor.capacitorId = 11;
        capacitor.type = "glue";
        capacitor.capacity = "3uF";

        Fan fan = new Fan(3, "part", 3, capacitor);

        fan.getFanDetails();
    }
}