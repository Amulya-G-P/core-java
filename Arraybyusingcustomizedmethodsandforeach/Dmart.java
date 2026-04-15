class Dmart
{
	static String shopNames[]={"Grocery","Dairy","Dmart Brand","Home personal care"};
	public static void getShopNames()
	{
		System.out.println("Get Shops Method invoked");
		for(String shopName : shopNames){
			System.out.println(shopName);
		}
		System.out.println("End of invoke");

	}
}