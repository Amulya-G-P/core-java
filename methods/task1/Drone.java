class Drone {

    public static String getDroneModel() {
        System.out.println("getDroneModel() invoked");
        System.out.println("SkyFly D8");
        return "SkyFly D8";
    }

    public static double getDronePrice() {
        System.out.println("getDronePrice() invoked");
        System.out.println(65999.50);
        return 65999.50;
    }

    public static boolean has4KCamera() {
        System.out.println("has4KCamera() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean supportsGPS() {
        System.out.println("supportsGPS() invoked");
        System.out.println(true);
        return true;
    }

    public static int getFlightTime() {
        System.out.println("getFlightTime() invoked");
        System.out.println(35);
        return 35; 
    }

    public static boolean hasObstacleAvoidance() {
        System.out.println("hasObstacleAvoidance() invoked");
        System.out.println(true);
        return true;
    }
}

