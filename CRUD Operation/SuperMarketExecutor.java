class SuperMarketExecutor 
{
    public static void main(String[] args) {

        SuperMarket s = new SuperMarket();
        boolean added;

        added = s.addProduct("Rice"); 
		System.out.println(added);
        added = s.addProduct("Wheat");
		System.out.println(added);
        added = s.addProduct("Sugar");
		System.out.println(added);
        added = s.addProduct("Salt");
		System.out.println(added);
        added = s.addProduct("Oil"); 
		System.out.println(added);
        added = s.addProduct("Milk");
		System.out.println(added);
        added = s.addProduct("Bread");
		System.out.println(added);
        added = s.addProduct("Eggs"); 
		System.out.println(added);

        s.getProducts();

        String product = s.getProductByName("Milk");
        System.out.println(product + " is available");
		
        boolean updated = s.updateProduct("Sugar", "Brown Sugar");
        System.out.println(updated);

        s.getProducts();

        boolean deleted = s.deleteProduct("Salt");
        System.out.println(deleted + " is deleted");

        s.getProducts();
    }
}