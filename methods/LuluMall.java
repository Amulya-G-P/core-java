class LuluMall
{
	static String shopNames[]={"Lulu Hypermarket","Lulu Fashion Store","Luly Connect","Burger King","Starbucks","McDonald's"};
	public static void getShopNames()
	{
		System.out.println("Get Shops Method invoked");
		for(String shopName : shopNames){
			System.out.println(shopName);
		}
		System.out.println("End of invoke");

	}
}