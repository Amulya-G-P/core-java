class Maggie
{
	int maggieId;
	String maggieName;
	Ingredient ingredient;
	
	public void getMaggieDetails()
	{
		System.out.println("Method Invoked");
		System.out.println("The Maggie Id is " + maggieId);
		System.out.println("The Maggie Name is " + maggieName);
		
		ingredient.getIngredientDetails();
		System.out.println("Method Stopped");
	}
}
