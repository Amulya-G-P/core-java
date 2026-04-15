class Grab
{
	static double search(String itemName)
	{
		double price = 0;

		if(itemName == "Avocado Toast") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Quinoa Salad") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Cauliflower Wings") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Zucchini Fries") {
			price = 110.0;
			return price;
		}
		else if(itemName == "Stuffed Mushrooms") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Veggie Wrap") {
			price = 100.0;
			return price;
		}
		else if(itemName == "Chicken Wrap") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Turkey Sandwich") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Beef Burger") {
			price = 180.0;
			return price;
		}
		else if(itemName == "Chicken Burger") {
			price = 160.0;
			return price;
		}
		else if(itemName == "Veggie Burger") {
			price = 140.0;
			return price;
		}
		else if(itemName == "BBQ Wings") {
			price = 170.0;
			return price;
		}
		else if(itemName == "Buffalo Wings") {
			price = 175.0;
			return price;
		}
		else if(itemName == "Grilled Chicken") {
			price = 200.0;
			return price;
		}
		else if(itemName == "Roast Beef") {
			price = 220.0;
			return price;
		}
		else if(itemName == "Lobster Roll") {
			price = 300.0;
			return price;
		}
		else if(itemName == "Clam Chowder") {
			price = 180.0;
			return price;
		}
		else if(itemName == "Seafood Platter") {
			price = 350.0;
			return price;
		}
		else if(itemName == "Grilled Shrimp") {
			price = 250.0;
			return price;
		}
		else if(itemName == "Fish Tacos") {
			price = 200.0;
			return price;
		}
		else if(itemName == "Chicken Alfredo") {
			price = 220.0;
			return price;
		}
		else if(itemName == "Veg Lasagna") {
			price = 180.0;
			return price;
		}
		else if(itemName == "Mushroom Risotto") {
			price = 190.0;
			return price;
		}
		else if(itemName == "Spinach Pasta") {
			price = 170.0;
			return price;
		}
		else if(itemName == "Pesto Pasta") {
			price = 180.0;
			return price;
		}
		else if(itemName == "Chocolate Muffin") {
			price = 90.0;
			return price;
		}
		else if(itemName == "Blueberry Muffin") {
			price = 95.0;
			return price;
		}
		else if(itemName == "Apple Pie") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Banana Bread") {
			price = 100.0;
			return price;
		}
		else if(itemName == "Cinnamon Roll") {
			price = 110.0;
			return price;
		}
		else {
			System.out.println("Item not found");
			return price;
		}
	}

	static double search(String itemName, int quantity)
	{
		double price = 0;

		if(itemName == "Avocado Toast") {
			price = 120.0;
			return price * quantity;
		}
		else if(itemName == "Quinoa Salad") {
			price = 150.0;
			return price * quantity;
		}
		else if(itemName == "Cauliflower Wings") {
			price = 130.0;
			return price * quantity;
		}
		else if(itemName == "Zucchini Fries") {
			price = 110.0;
			return price * quantity;
		}
		else if(itemName == "Stuffed Mushrooms") {
			price = 140.0;
			return price * quantity;
		}
		else if(itemName == "Veggie Wrap") {
			price = 100.0;
			return price * quantity;
		}
		else if(itemName == "Chicken Wrap") {
			price = 130.0;
			return price * quantity;
		}
		else if(itemName == "Turkey Sandwich") {
			price = 150.0;
			return price * quantity;
		}
		else if(itemName == "Beef Burger") {
			price = 180.0;
			return price * quantity;
		}
		else if(itemName == "Chicken Burger") {
			price = 160.0;
			return price * quantity;
		}
		else if(itemName == "Veggie Burger") {
			price = 140.0;
			return price * quantity;
		}
		else if(itemName == "BBQ Wings") {
			price = 170.0;
			return price * quantity;
		}
		else if(itemName == "Buffalo Wings") {
			price = 175.0;
			return price * quantity;
		}
		else if(itemName == "Grilled Chicken") {
			price = 200.0;
			return price * quantity;
		}
		else if(itemName == "Roast Beef") {
			price = 220.0;
			return price * quantity;
		}
		else if(itemName == "Lobster Roll") {
			price = 300.0;
			return price * quantity;
		}
		else if(itemName == "Clam Chowder") {
			price = 180.0;
			return price * quantity;
		}
		else if(itemName == "Seafood Platter") {
			price = 350.0;
			return price * quantity;
		}
		else if(itemName == "Grilled Shrimp") {
			price = 250.0;
			return price * quantity;
		}
		else if(itemName == "Fish Tacos") {
			price = 200.0;
			return price * quantity;
		}
		else if(itemName == "Chicken Alfredo") {
			price = 220.0;
			return price * quantity;
		}
		else if(itemName == "Veg Lasagna") {
			price = 180.0;
			return price * quantity;
		}
		else if(itemName == "Mushroom Risotto") {
			price = 190.0;
			return price * quantity;
		}
		else if(itemName == "Spinach Pasta") {
			price = 170.0;
			return price * quantity;
		}
		else if(itemName == "Pesto Pasta") {
			price = 180.0;
			return price * quantity;
		}
		else if(itemName == "Chocolate Muffin") {
			price = 90.0;
			return price * quantity;
		}
		else if(itemName == "Blueberry Muffin") {
			price = 95.0;
			return price * quantity;
		}
		else if(itemName == "Apple Pie") {
			price = 120.0;
			return price * quantity;
		}
		else if(itemName == "Banana Bread") {
			price = 100.0;
			return price * quantity;
		}
		else if(itemName == "Cinnamon Roll") {
			price = 110.0;
			return price * quantity;
		}
		else {
			System.out.println("Item not found");
			return price * quantity;
		}
	}

}