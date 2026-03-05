class SmartBackpackExecutor {

    public static void main(String[] args) {

        System.out.println("main started");
        System.out.println("Backpack Model: " + SmartBackpack.getBackpackModel());
        System.out.println("Backpack Price: " + SmartBackpack.getBackpackPrice());
        System.out.println("USB Charging Port Available: " + SmartBackpack.hasUSBChargingPort());
        System.out.println("Storage Capacity: " + SmartBackpack.getStorageCapacity() + " liters");
        System.out.println("Anti-Theft Lock Available: " + SmartBackpack.hasAntiTheftLock());
        System.out.println("Water Resistant: " + SmartBackpack.isWaterResistant());
        System.out.println("main ended");
    }
}