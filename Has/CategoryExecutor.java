class CategoryExecutor
{
	public static void main(String[] ae)
	{
		System.out.println(" Amazon and Category");
		
		Amazon amazon=new Amazon();
		amazon.amazonId=10;
		amazon.amazonName="Amazon";
		amazon.amazonId=11;
		amazon.amazonName="Amazon App";
		
		Category category=new Category();
		category.categoryId=01;
		category.categoryName="Electronics";
		category.categoryId=05;
		category.categoryName="Party Wears";
		
		amazon.category=category;
		amazon.getAmazonDetails();
		
	}
}