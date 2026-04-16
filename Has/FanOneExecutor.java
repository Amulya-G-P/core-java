class FanOneExecutor
 {
    public static void main(String[] args) 
	{
        Fan fan = new Fan();
        fan.fanId = 1;
        fan.brand = "Usha";
        fan.speed = 5;

        Capacitor capacitor = new Capacitor();
        capacitor.capacitorId = 101;
        capacitor.type = "Electrolytic";
        capacitor.capacity = "2.5uF";

        fan.capacitor = capacitor;

        fan.getFanDetails();
    }
}