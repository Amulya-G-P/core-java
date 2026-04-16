class SteelExecutor 
{
    public static void main(String[] args) {

        Steel s = new Steel();
        boolean added;

        added = s.addFeature("High Strength");
        System.out.println(added);
        added = s.addFeature("Durability");
        System.out.println(added);
        added = s.addFeature("Corrosion Resistance");
        System.out.println(added);
        added = s.addFeature("Ductility");
        System.out.println(added);
        added = s.addFeature("Malleability");
        System.out.println(added);
        added = s.addFeature("Recyclable");
        System.out.println(added);
        added = s.addFeature("Heat Resistance");
        System.out.println(added);
        added = s.addFeature("Hardness");
        System.out.println(added);
        added = s.addFeature("Weldability");
        System.out.println(added);
        added = s.addFeature("Toughness");
        System.out.println(added);

        s.getFeatures();

        String feature = s.getFeatureByName("Durability");
        System.out.println(feature + " is available");

        boolean updated = s.updateFeature("Hardness", "Very High Hardness");
        System.out.println(updated);

        s.getFeatures();

        boolean deleted = s.deleteFeature("Ductility");
        System.out.println(deleted + " is deleted");

        s.getFeatures();
    }
}