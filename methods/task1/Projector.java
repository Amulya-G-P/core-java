class Projector {

    public static String getProjectorModel() {
        System.out.println("getProjectorModel() invoked");
        System.out.println("VisionBeam P500");
        return "VisionBeam P500";
    }

    public static double getProjectorPrice() {
        System.out.println("getProjectorPrice() invoked");
        System.out.println(38999.75);
        return 38999.75;
    }

    public static boolean supportsFullHD() {
        System.out.println("supportsFullHD() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean hasWiFiConnectivity() {
        System.out.println("hasWiFiConnectivity() invoked");
        System.out.println(true);
        return true;
    }

    public static int getBrightnessLevel() {
        System.out.println("getBrightnessLevel() invoked");
        System.out.println(3500);
        return 3500; 
    }

    public static boolean hasBuiltInSpeaker() {
        System.out.println("hasBuiltInSpeaker() invoked");
        System.out.println(true);
        return true;
    }
}

