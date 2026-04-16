class PastaExecutor 
{
    public static void main(String[] args) {

        Pasta p = new Pasta();
        boolean added;

        added = p.addIngredient("Pasta");
        System.out.println(added);
        added = p.addIngredient("Salt");
        System.out.println(added);
        added = p.addIngredient("Water");
        System.out.println(added);
        added = p.addIngredient("Olive Oil");
        System.out.println(added);
        added = p.addIngredient("Garlic");
        System.out.println(added);
        added = p.addIngredient("Onion");
        System.out.println(added);
        added = p.addIngredient("Tomato Sauce");
        System.out.println(added);
        added = p.addIngredient("Cheese");
        System.out.println(added);
        added = p.addIngredient("Pepper");
        System.out.println(added);
        added = p.addIngredient("Basil");
        System.out.println(added);

        p.getIngredients();

        String ingredient = p.getIngredientByName("Pasta");
        System.out.println(ingredient + " is available");

        boolean updated = p.updateIngredient("Cheese", "Mozzarella Cheese");
        System.out.println(updated);

        p.getIngredients();

        boolean deleted = p.deleteIngredient("Salt");
        System.out.println(deleted + " is deleted");

        p.getIngredients();
    }
}