class PowerBank {

    public static String getPowerBankModel() {
        System.out.println("getPowerBankModel() invoked");
        System.out.println("ChargeBoost P20");
        return "ChargeBoost P20";
    }

    public static double getPowerBankPrice() {
        System.out.println("getPowerBankPrice() invoked");
        System.out.println(1999.99);
        return 1999.99;
    }

    public static boolean supportsFastCharging() {
        System.out.println("supportsFastCharging() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean hasMultipleUSBPorts() {
        System.out.println("hasMultipleUSBPorts() invoked");
        System.out.println(true);
        return true;
    }

    public static int getBatteryCapacity() {
        System.out.println("getBatteryCapacity() invoked");
        System.out.println(20000);
        return 20000; 
    }

    public static boolean hasLEDIndicator() {
        System.out.println("hasLEDIndicator() invoked");
        System.out.println(true);
        return true;
    }
}

