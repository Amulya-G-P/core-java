class SmartBottleExecutor {

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Bottle Model: " + SmartBottle.getBottleModel());
        
        System.out.println("Bottle Price: " + SmartBottle.getBottlePrice());


        System.out.println("Bottle Capacity: " + SmartBottle.getBottleCapacity());
        
        System.out.println("Hydration Reminder Available: " + SmartBottle.hasHydrationReminder());
        

        System.out.println("Temperature Display Supported: " + SmartBottle.supportsTemperatureDisplay());
        

        System.out.println("Insulated Bottle: " + SmartBottle.isInsulated());
        

        System.out.println("main ended");
    }
}