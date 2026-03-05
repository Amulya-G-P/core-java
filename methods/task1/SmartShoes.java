class SmartShoes {

    public static String getShoeModel() {
        System.out.println("getShoeModel() invoked");
        System.out.println("RunTech S9");
        return "RunTech S9";
    }

    public static double getShoePrice() {
        System.out.println("getShoePrice() invoked");
        System.out.println(8999.90);
        return 8999.90;
    }

    public static boolean hasStepTracker() {
        System.out.println("hasStepTracker() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean supportsBluetooth() {
        System.out.println("supportsBluetooth() invoked");
        System.out.println(true);
        return true;
    }

    public static int getBatteryBackup() {
        System.out.println("getBatteryBackup() invoked");
        System.out.println(7);
        return 7; // days
    }

    public static boolean hasGPS() {
        System.out.println("hasGPS() invoked");
        System.out.println(true);
        return true;
    }
}

