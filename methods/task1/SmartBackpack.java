class SmartBackpack {

    public static String getBackpackModel() {
        System.out.println("getBackpackModel() invoked");
        System.out.println("TravelMate B1");
        return "TravelMate B1";
    }

    public static double getBackpackPrice() {
        System.out.println("getBackpackPrice() invoked");
        System.out.println(6999.85);
        return 6999.85;
    }

    public static boolean hasUSBChargingPort() {
        System.out.println("hasUSBChargingPort() invoked");
        System.out.println(true);
        return true;
    }

    public static int getStorageCapacity() {
        System.out.println("getStorageCapacity() invoked");
        System.out.println(35);
        return 35; 
    }

    public static boolean hasAntiTheftLock() {
        System.out.println("hasAntiTheftLock() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean isWaterResistant() {
        System.out.println("isWaterResistant() invoked");
        System.out.println(true);
        return true;
    }
}

