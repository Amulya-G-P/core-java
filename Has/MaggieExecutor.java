class MaggieExecutor
{
	public static void main(String[] args)
	{
		Maggie maggie=new Maggie();
		maggie.maggieId=1;
		maggie.maggieName="2 Minute Noodles";
		
		Ingredient ingredient=new Ingredient();
		ingredient.ingredientId=1;
		ingredient.ingredientName="Masala";
		
		maggie.ingredient=ingredient;
		maggie.getMaggieDetails();
	}
}