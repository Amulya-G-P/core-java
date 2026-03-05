class ProjectorExecutor {

    public static void main(String[] args) {

        System.out.println("main started");
        System.out.println("Projector Model: " + Projector.getProjectorModel());
        System.out.println("Projector Price: " + Projector.getProjectorPrice());
        System.out.println("Full HD Supported: " + Projector.supportsFullHD());
        System.out.println("WiFi Connectivity Available: " + Projector.hasWiFiConnectivity());
        System.out.println("Brightness Level: " + Projector.getBrightnessLevel());
        System.out.println("Built-in Speaker Available: " + Projector.hasBuiltInSpeaker());
        System.out.println("main ended");
    }
}