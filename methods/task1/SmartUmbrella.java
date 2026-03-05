class SmartUmbrella {

    public static String getUmbrellaModel() {
        System.out.println("getUmbrellaModel() invoked");
        System.out.println("RainGuard U5");
        return "RainGuard U5";
    }

    public static double getUmbrellaPrice() {
        System.out.println("getUmbrellaPrice() invoked");
        System.out.println(2499.60);
        return 2499.60;
    }

    public static boolean hasWeatherAlert() {
        System.out.println("hasWeatherAlert() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean supportsAutoOpen() {
        System.out.println("supportsAutoOpen() invoked");
        System.out.println(true);
        return true;
    }

    public static int getWindResistanceLevel() {
        System.out.println("getWindResistanceLevel() invoked");
        System.out.println(80);
        return 80; // km/h
    }

    public static boolean hasLEDLight() {
        System.out.println("hasLEDLight() invoked");
        System.out.println(true);
        return true;
    }
}

