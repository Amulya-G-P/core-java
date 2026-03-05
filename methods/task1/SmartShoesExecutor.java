class SmartShoesExecutor {

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Shoe Model: " + SmartShoes.getShoeModel());
       

        System.out.println("Shoe Price: " + SmartShoes.getShoePrice());
        

        System.out.println("Step Tracker Available: " + SmartShoes.hasStepTracker());
       

        System.out.println("Bluetooth Supported: " + SmartShoes.supportsBluetooth());
        

        System.out.println("Battery Backup: " + SmartShoes.getBatteryBackup());
       
        System.out.println("GPS Available: " + SmartShoes.hasGPS());
       
        System.out.println("main ended");
    }
}