class DroneExecutor {

    public static void main(String[] args) {

        System.out.println("main started");
        System.out.println("Drone Model: " + Drone.getDroneModel());
        System.out.println("Drone Price: " + Drone.getDronePrice());
        System.out.println("4K Camera Available: " + Drone.has4KCamera());
        System.out.println("GPS Supported: " + Drone.supportsGPS());
        System.out.println("Flight Time: " + Drone.getFlightTime() + " minutes");
        System.out.println("Obstacle Avoidance Available: " + Drone.hasObstacleAvoidance());
        System.out.println("main ended");
    }
}