class DigitalzoneExecutor 
{
    public static void main(String[] args) {

        Digitalzone d = new Digitalzone();
        boolean added;

        added = d.addLaptopBrand("Dell"); 
		System.out.println(added);
        added = d.addLaptopBrand("HP"); 
		System.out.println(added);
        added = d.addLaptopBrand("Lenovo"); 
		System.out.println(added);
        added = d.addLaptopBrand("Asus");
		System.out.println(added);
        added = d.addLaptopBrand("Acer");
		System.out.println(added);
        added = d.addLaptopBrand("Apple");
		System.out.println(added);

        d.getLaptopBrands();

        String brand = d.getLaptopBrandByName("HP");
        System.out.println(brand + " is available");

        boolean updated = d.updateLaptopBrand("Acer", "Acer Nitro");
        System.out.println(updated);

        d.getLaptopBrands();

        boolean deleted = d.deleteLaptopBrand("Dell");
        System.out.println(deleted + " is deleted");

        d.getLaptopBrands();
    }
}