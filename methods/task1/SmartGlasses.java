class SmartGlasses {

    public static String getGlassesModel() {
        System.out.println("getGlassesModel() invoked");
        System.out.println("VisionLens G2");
        return "VisionLens G2";
    }

    public static double getGlassesPrice() {
        System.out.println("getGlassesPrice() invoked");
        System.out.println(45999.75);
        return 45999.75;
    }

    public static boolean supportsARDisplay() {
        System.out.println("supportsARDisplay() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean hasVoiceAssistant() {
        System.out.println("hasVoiceAssistant() invoked");
        System.out.println(true);
        return true;
    }

    public static int getBatteryLife() {
        System.out.println("getBatteryLife() invoked");
        System.out.println(8);
        return 8; // hours
    }

    public static boolean hasCamera() {
        System.out.println("hasCamera() invoked");
        System.out.println(true);
        return true;
    }
}

