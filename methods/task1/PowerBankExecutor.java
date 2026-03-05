class PowerBankExecutor {

    public static void main(String[] args) {

        System.out.println("main started");
        System.out.println("PowerBank Model: " + PowerBank.getPowerBankModel());
        System.out.println("PowerBank Price: " + PowerBank.getPowerBankPrice());
        System.out.println("Fast Charging Supported: " + PowerBank.supportsFastCharging());
        System.out.println("Multiple USB Ports Available: " + PowerBank.hasMultipleUSBPorts());
        System.out.println("Battery Capacity: " + PowerBank.getBatteryCapacity());
        System.out.println("LED Indicator Available: " + PowerBank.hasLEDIndicator());
        System.out.println("main ended");
    }
}