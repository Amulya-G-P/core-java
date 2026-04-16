class WeatherStationExecutor 
{
    public static void main(String[] args) 
	{

        WeatherStation w = new WeatherStation();
        boolean added;

        added = w.addTemperature("28 C"); 
		System.out.println(added);
        added = w.addTemperature("30 C"); 
		System.out.println(added);
        added = w.addTemperature("32 C"); 
		System.out.println(added);
        added = w.addTemperature("27 C"); 
		System.out.println(added);
        added = w.addTemperature("29 C"); 
		System.out.println(added);
        added = w.addTemperature("31 C"); 
		System.out.println(added);
        added = w.addTemperature("33 C"); 
		System.out.println(added);
        added = w.addTemperature("26 C");
		System.out.println(added);
        added = w.addTemperature("25 C"); 
		System.out.println(added);
        added = w.addTemperature("34 C"); 
		System.out.println(added);
        added = w.addTemperature("35 C"); 
		System.out.println(added);
        added = w.addTemperature("24 C"); 
		System.out.println(added);
        added = w.addTemperature("23 C"); 
		System.out.println(added);
        added = w.addTemperature("22 C"); 
		System.out.println(added);
        added = w.addTemperature("36 C"); 
		System.out.println(added);
        added = w.addTemperature("37 C"); 
		System.out.println(added);
        added = w.addTemperature("21 C"); 
		System.out.println(added);

        w.getTemperatures();

        String temp = w.getTemperatureByValue("30 C");
        System.out.println(temp + " is available");

        boolean updated = w.updateTemperature("25 C", "25.5 C");
        System.out.println(updated);

        w.getTemperatures();

        boolean deleted = w.deleteTemperature("33 C");
        System.out.println(deleted + " is deleted");

        w.getTemperatures();
    }
}