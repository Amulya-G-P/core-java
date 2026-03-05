class VacuumCleanerExecutor {

    public static void main(String[] args) {

        System.out.println("main started");
        System.out.println("Cleaner Model: " + VacuumCleaner.getCleanerModel());
        System.out.println("Cleaner Price: " + VacuumCleaner.getCleanerPrice());
        System.out.println("Wet and Dry Cleaning Supported: " + VacuumCleaner.supportsWetAndDryCleaning());
        System.out.println("HEPA Filter Available: " + VacuumCleaner.hasHEPAFilter());
        System.out.println("Dust Capacity: " + VacuumCleaner.getDustCapacity() + " Liters");
        System.out.println("Auto Cord Rewind Available: " + VacuumCleaner.hasAutoCordRewind());
        System.out.println("main ended");
    }
}