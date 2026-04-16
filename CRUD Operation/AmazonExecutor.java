class AmazonExecutor 
{
    public static void main(String[] args) 
	{

        Amazon a = new Amazon();
        boolean added;

        added = a.addCategory("Electronics"); 
		System.out.println(added);
        added = a.addCategory("Mobiles"); 
		System.out.println(added);
        added = a.addCategory("Laptops"); 
		System.out.println(added);
        added = a.addCategory("Fashion"); 
		System.out.println(added);
        added = a.addCategory("Men Clothing"); 
		System.out.println(added);
        added = a.addCategory("Women Clothing"); 
		System.out.println(added);
        added = a.addCategory("Kids Wear"); 
		System.out.println(added);
        added = a.addCategory("Home Appliances"); 
		System.out.println(added);
        added = a.addCategory("Kitchen"); 
		System.out.println(added);
        added = a.addCategory("Furniture"); 
		System.out.println(added);
        added = a.addCategory("Books");
		System.out.println(added);
        added = a.addCategory("Toys"); 
		System.out.println(added);
        added = a.addCategory("Sports");
		System.out.println(added);
        added = a.addCategory("Beauty"); 
		System.out.println(added);
        added = a.addCategory("Health"); 
		System.out.println(added);
        added = a.addCategory("Grocery"); 
		System.out.println(added);
        added = a.addCategory("Automotive"); 
		System.out.println(added);
        added = a.addCategory("Pet Supplies"); 
		System.out.println(added);
        added = a.addCategory("Office Products");
		System.out.println(added);
        added = a.addCategory("Music"); 
		System.out.println(added);
        added = a.addCategory("Gaming");
		System.out.println(added);

        a.getCategories();

        String category = a.getCategoryByName("Electronics");
        System.out.println(category + " is available");
		
        boolean updated = a.updateCategory("Gaming", "Gaming Accessories");
        System.out.println(updated);

        a.getCategories();

        boolean deleted = a.deleteCategory("Toys");
        System.out.println(deleted + " is deleted");

        a.getCategories();
    }
}