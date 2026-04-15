class Jewellery
{
	static String is_discotinued_by_manufacturer;
	static String product_dimensions;
	static String date_first_available;
	static String manufacturer;
	static String asin;
	static String item_model_number;
	static String country_of_origin;
	static String department;
	static String manufacturer_contact_information;
	static String packer;
	static String item_weight;
	static String item_dimensions;
	static String net_quantity;
	static String components;
	static String generic_name;
	static String best_sellers_rank;
	public static void main(String[] args)
	{
		String is_discotinued_by_manufacturer="No";
		String product_dimensions="15 x 11 x 5 cm; 50 g";
		String date_first_available="5 December 2016";
		String manufacturer=" YouBella Jewellery & Lifestyle";
		String asin="B071CMQ6N2 ";
		String item_model_number="‎YBBN_91340A";
		String country_of_origin="India";
		String department="womens";
		String manufacturer_contact_information="YBJ Fashions Pvt Ltd, WZ 242A, Street No 7, R/P Pole No 209, Sadh Nagar, Palam colony, New Delhi 110045, YouBella Jewellery & Lifestyle";
		String packer="YBJ Fashions Pvt Ltd, WZ 242A, R/P Pole No 209 ,Street No 7, Sadh Nagar, Palam Colony, New Delhi - 110045";
		String item_weight="50 g";
		String item_dimensions=" 15 x 11 x 5 Centimeters";
		String net_quantity="1.00 Count";
		String components="1 Bracelet";
		String generic_name="Fashion Jewellery";
		String best_sellers_rank=" #3 in Jewellery (See Top 100 in Jewellery)#2 in Women's Bracelets";
		System.out.println("Is Discontinued by manufacturer: " + is_discotinued_by_manufacturer);
		System.out.println("Product Dimensions: " + product_dimensions);
		System.out.println("Date First available: " + date_first_available);
		System.out.println("Manufacturer  : " + manufacturer);
		System.out.println("Asin : " + asin);
		System.out.println("Item Model Number : " + item_model_number);
		System.out.println("Country of Origin : " + country_of_origin);
		System.out.println("Department: " + department);
		System.out.println("Manufaturer Contact Information : " + manufacturer_contact_information);
		System.out.println("Packer: " + packer);
		System.out.println("Item Weight: " + item_weight);
		System.out.println("Item Dimensions: " + item_dimensions);
		System.out.println("Net Quantity: " + net_quantity);
		System.out.println("Included Components: " + components);
		System.out.println("Generic Name: " + generic_name);
		System.out.println("Best sellers rank: " + best_sellers_rank);
	}
}