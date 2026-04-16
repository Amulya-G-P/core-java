class FeatureExecutor 
{
    public static void main(String[] args) {

        Kettel k = new Kettel();
        boolean added;

        added = k.addFeature("Fast Boiling");
        System.out.println(added);
        added = k.addFeature("Auto Shut-Off");
        System.out.println(added);
        added = k.addFeature("Energy Efficient");
        System.out.println(added);
        added = k.addFeature("Stainless Steel Body");
        System.out.println(added);
        added = k.addFeature("Temperature Control");
        System.out.println(added);
        added = k.addFeature("Cordless");
        System.out.println(added);
        added = k.addFeature("LED Indicator");
        System.out.println(added);
        added = k.addFeature("Lightweight");
        System.out.println(added);
        added = k.addFeature("Easy Cleaning");
        System.out.println(added);
        added = k.addFeature("Durable");
        System.out.println(added);

        k.getFeatures();

        String feature = k.getFeatureByName("Fast Boiling");
        System.out.println(feature + " is available");

        boolean updated = k.updateFeature("Cordless", "Cordless Operation");
        System.out.println(updated);

        k.getFeatures();

        boolean deleted = k.deleteFeature("LED Indicator");
        System.out.println(deleted + " is deleted");

        k.getFeatures();
    }
}