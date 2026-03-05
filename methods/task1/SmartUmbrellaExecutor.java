class SmartUmbrellaExecutor {

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Umbrella Model: " + SmartUmbrella.getUmbrellaModel());
        System.out.println("Umbrella Price: " + SmartUmbrella.getUmbrellaPrice());
        System.out.println("Weather Alert Available: " + SmartUmbrella.hasWeatherAlert());
        System.out.println("Auto Open Supported: " + SmartUmbrella.supportsAutoOpen());
        System.out.println("Wind Resistance Level: " + SmartUmbrella.getWindResistanceLevel());
        System.out.println("LED Light Available: " + SmartUmbrella.hasLEDLight());
        System.out.println("main ended");
    }
}