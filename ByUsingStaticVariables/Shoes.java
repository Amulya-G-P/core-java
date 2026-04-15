class Shoes
{
	static String product_dimensions;
	static 	String date_first_available;
	static 	String manufacturer;
	static 	String asin;
	static 	String item_model_number;
	static 	String country_of_origin="India";
	static 	String department;
	static 	String manufacturer_location;
	static 	String packer;
	static 	String item_weight;
	static 	String item_dimensions;
	static 	String net_quantity;
	static 	String generic_name;
	static 	String best_sellers_rank;
	public static void main(String[] args)
	{
		product_dimensions="29*23*10 cm; 600g  ";
		date_first_available=" 26 December 2024";
		manufacturer=" Boldfit";
		asin="B0DRKKVB61 ";
		item_model_number="BSHawkeyBO8";
		country_of_origin="India";
		department="Mens";
		manufacturer_location=" Bangalore, 560041,support@boldfit.in,08043702806, Boldfit";
		packer="Boldfit, Bangalore, 560041,support@boldfit.in,08043702806";
		item_weight="600 g";
		item_dimensions="29 x 23 x 10 Millimeters ";
		net_quantity=" 1 Count";
		generic_name=" Badmiton Shoes";
		best_sellers_rank=" #2 in Shoes & Handbags (See Top 100 in Shoes & Handbags)#1 in Men's Badminton Shoes";
		System.out.println(" Product Dimensions is : " + product_dimensions);
		System.out.println(" Product Date First Available is : " + date_first_available);
		System.out.println(" Manufacturer is : " + manufacturer);
		System.out.println(" ASIN is : " + asin);
		System.out.println(" Item Model Number is : " + item_model_number);
		System.out.println(" Country Of Origin is : " + country_of_origin);
		System.out.println(" Department is : " + department);
		System.out.println(" Manufacturer is : " + manufacturer_location);
		System.out.println(" PACKER is : " + packer);
		System.out.println(" Item Weight is : " + item_weight);
		System.out.println(" Item Dimensions is : " + item_dimensions);
		System.out.println(" Net Quantity is : " + net_quantity);
		System.out.println(" Generic Name is : " + generic_name);
		System.out.println(" Best sellers Rank is : " + best_sellers_rank);
	}
}