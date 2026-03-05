class SmartBottle {

    public static String getBottleModel() {
        System.out.println("getBottleModel() invoked");
        System.out.println("HydroTrack B2");
        return "HydroTrack B2";
    }

    public static double getBottlePrice() {
        System.out.println("getBottlePrice() invoked");
        System.out.println(3499.75);
        return 3499.75;
    }

    public static int getBottleCapacity() {
        System.out.println("getBottleCapacity() invoked");
        System.out.println(750);
        return 750; // ml
    }

    public static boolean hasHydrationReminder() {
        System.out.println("hasHydrationReminder() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean supportsTemperatureDisplay() {
        System.out.println("supportsTemperatureDisplay() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean isInsulated() {
        System.out.println("isInsulated() invoked");
        System.out.println(true);
        return true;
    }
}

