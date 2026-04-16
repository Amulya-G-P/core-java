class BrandExecutor 
{
    public static void main(String[] args) {

        Bed b = new Bed();
        boolean added;

        added = b.addBrand("Sleepwell");
        System.out.println(added);
        added = b.addBrand("Wakefit");
        System.out.println(added);
        added = b.addBrand("Pepperfry");
        System.out.println(added);
        added = b.addBrand("IKEA");
        System.out.println(added);
        added = b.addBrand("Nilkamal");
        System.out.println(added);
        added = b.addBrand("Durian");
        System.out.println(added);
        added = b.addBrand("Urban Ladder");
        System.out.println(added);
        added = b.addBrand("Godrej Interio");
        System.out.println(added);
        added = b.addBrand("Wooden Street");
        System.out.println(added);
        added = b.addBrand("HomeTown");
        System.out.println(added);

        b.getBrands();

        String brand = b.getBrandByName("IKEA");
        System.out.println(brand + " is available");

        boolean updated = b.updateBrand("Durian", "Durian Furniture");
        System.out.println(updated);

        b.getBrands();

        boolean deleted = b.deleteBrand("Nilkamal");
        System.out.println(deleted + " is deleted");

        b.getBrands();
    }
}