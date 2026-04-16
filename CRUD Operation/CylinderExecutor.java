class CylinderExecutor 
{
    public static void main(String[] args) {

        Cylinder c = new Cylinder();
        boolean added;

        added = c.addCylinder("HP Gas");
        System.out.println(added);
        added = c.addCylinder("Indane Gas");
        System.out.println(added);
        added = c.addCylinder("Bharat Gas");
        System.out.println(added);
        added = c.addCylinder("Oxygen Cylinder");
        System.out.println(added);
        added = c.addCylinder("Nitrogen Cylinder");
        System.out.println(added);
        added = c.addCylinder("CO2 Cylinder");
        System.out.println(added);
        added = c.addCylinder("Helium Cylinder");
        System.out.println(added);
        added = c.addCylinder("Argon Cylinder");
        System.out.println(added);
        added = c.addCylinder("LPG Cylinder");
        System.out.println(added);
        added = c.addCylinder("Medical Oxygen");
        System.out.println(added);

        c.getCylinders();

        String cylinder = c.getCylinderByName("HP Gas");
        System.out.println(cylinder + " is available");

        boolean updated = c.updateCylinder("Indane Gas", "Indane LPG");
        System.out.println(updated);

        c.getCylinders();

        boolean deleted = c.deleteCylinder("CO2 Cylinder");
        System.out.println(deleted + " is deleted");

        c.getCylinders();
    }
}