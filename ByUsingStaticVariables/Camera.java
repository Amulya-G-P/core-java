class Camera
{
	static String manufacturer;
	static 	String country_of_origin;
	static 	String language;
	static 	long item_model_number;
	static 	String product_dimensions;
	public static void main(String[] args)
	{
		manufacturer="polaroid";
		country_of_origin="China";
		language="English";
		item_model_number=6280L;
		product_dimensions="10.5*8.39*6.15cm 440g";
		System.out.println("The Manufacturer is : " + manufacturer);
		System.out.println("The Country Of Origin : " + country_of_origin);
		System.out.println("Language is : " + language);
		System.out.println("Item Model Number : " + item_model_number);
		System.out.println("Product Dimensions : " + product_dimensions);
	}
}