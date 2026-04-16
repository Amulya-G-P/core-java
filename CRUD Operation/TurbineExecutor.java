class TurbineExecutor 
{
    public static void main(String[] args) {

        Turbine t = new Turbine();
        boolean added;

        added = t.addFeature("High Efficiency");
        System.out.println(added);
        added = t.addFeature("Low Noise");
        System.out.println(added);
        added = t.addFeature("Durable Blades");
        System.out.println(added);
        added = t.addFeature("Energy Saving");
        System.out.println(added);
        added = t.addFeature("Compact Design");
        System.out.println(added);
        added = t.addFeature("Corrosion Resistant");
        System.out.println(added);
        added = t.addFeature("High Speed Rotation");
        System.out.println(added);
        added = t.addFeature("Temperature Resistant");
        System.out.println(added);
        added = t.addFeature("Easy Maintenance");
        System.out.println(added);
        added = t.addFeature("Long Lifespan");
        System.out.println(added);

        t.getFeatures();

        String feature = t.getFeatureByName("High Efficiency");
        System.out.println(feature + " is available");

        boolean updated = t.updateFeature("Low Noise", "Ultra Low Noise");
        System.out.println(updated);

        t.getFeatures();

        boolean deleted = t.deleteFeature("Compact Design");
        System.out.println(deleted + " is deleted");

        t.getFeatures();
    }
}