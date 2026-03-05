class VacuumCleaner {

    public static String getCleanerModel() {
        System.out.println("getCleanerModel() invoked");
        System.out.println("DustMaster V10");
        return "DustMaster V10";
    }

    public static double getCleanerPrice() {
        System.out.println("getCleanerPrice() invoked");
        System.out.println(15999.60);
        return 15999.60;
    }

    public static boolean supportsWetAndDryCleaning() {
        System.out.println("supportsWetAndDryCleaning() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean hasHEPAFilter() {
        System.out.println("hasHEPAFilter() invoked");
        System.out.println(true);
        return true;
    }

    public static int getDustCapacity() {
        System.out.println("getDustCapacity() invoked");
        System.out.println(3);
        return 3; 
    }

    public static boolean hasAutoCordRewind() {
        System.out.println("hasAutoCordRewind() invoked");
        System.out.println(true);
        return true;
    }
}


