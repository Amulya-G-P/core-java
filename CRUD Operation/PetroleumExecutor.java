class PetroleumExecutor 
{
    public static void main(String[] args) {

        Petroleum p = new Petroleum();
        boolean added;

        added = p.addFeature("High Energy Density");
        System.out.println(added);
        added = p.addFeature("Flammable");
        System.out.println(added);
        added = p.addFeature("Non-renewable");
        System.out.println(added);
        added = p.addFeature("Liquid State");
        System.out.println(added);
        added = p.addFeature("Hydrocarbon Composition");
        System.out.println(added);
        added = p.addFeature("Used as Fuel");
        System.out.println(added);
        added = p.addFeature("Refinable");
        System.out.println(added);
        added = p.addFeature("High Calorific Value");
        System.out.println(added);
        added = p.addFeature("Transportable");
        System.out.println(added);
        added = p.addFeature("Widely Available");
        System.out.println(added);

        p.getFeatures();

        String feature = p.getFeatureByName("Flammable");
        System.out.println(feature + " is available");

        boolean updated = p.updateFeature("Liquid State", "Viscous Liquid");
        System.out.println(updated);

        p.getFeatures();

        boolean deleted = p.deleteFeature("Transportable");
        System.out.println(deleted + " is deleted");

        p.getFeatures();
    }
}