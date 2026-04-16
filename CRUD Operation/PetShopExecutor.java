class PetShopExecutor
 {
    public static void main(String[] args) {

        PetShop p = new PetShop();
        boolean added;

        added = p.addAccessory("Dog Collar"); 
		System.out.println(added);
        added = p.addAccessory("Cat Toy"); 
		System.out.println(added);
        added = p.addAccessory("Bird Cage"); 
		System.out.println(added);
        added = p.addAccessory("Fish Tank"); 
		System.out.println(added);
        added = p.addAccessory("Pet Shampoo"); 
		System.out.println(added);
        added = p.addAccessory("Leash"); 
		System.out.println(added);
        added = p.addAccessory("Pet Bed"); 
		System.out.println(added);
        added = p.addAccessory("Food Bowl");
		System.out.println(added);
        added = p.addAccessory("Water Bottle"); 
		System.out.println(added);
        added = p.addAccessory("Dog Jacket"); 
		System.out.println(added);
        added = p.addAccessory("Cat Scratcher"); 
		System.out.println(added);
        added = p.addAccessory("Pet Carrier"); 
		System.out.println(added);
        added = p.addAccessory("Training Pads"); 
		System.out.println(added);
        added = p.addAccessory("Grooming Kit");
		System.out.println(added);
        added = p.addAccessory("Chew Toy"); 
		System.out.println(added);
        added = p.addAccessory("Pet Blanket"); 
		System.out.println(added);

        p.getAccessories();

        String acc = p.getAccessoryByName("Pet Bed");
        System.out.println(acc + " is available");

        boolean updated = p.updateAccessory("Fish Tank", "Large Fish Tank");
        System.out.println(updated);

        p.getAccessories();

        boolean deleted = p.deleteAccessory("Leash");
        System.out.println(deleted + " is deleted");

        p.getAccessories();
    }
}