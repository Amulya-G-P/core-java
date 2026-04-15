class DoorDash
{
	static double search(String itemName)
	{
		double price = 0;

		if(itemName == "Croissant") {
			price = 80.0;
			return price;
		}
		else if(itemName == "Bagel") {
			price = 70.0;
			return price;
		}
		else if(itemName == "Donut") {
			price = 50.0;
			return price;
		}
		else if(itemName == "Waffle") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Pancake") {
			price = 110.0;
			return price;	
		}
		else if(itemName == "French Toast") {
			price = 130.0;
			return price;	
		}
		else if(itemName == "Grilled Cheese") {
			price = 90.0;
			return price;	
		}
		else if(itemName == "Club Sandwich") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Caesar Salad") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Greek Salad") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Coleslaw") {
			price = 60.0;
			return price;
		}
		else if(itemName == "Garlic Bread") {
			price = 80.0;
			return price;
		}
		else if(itemName == "Cheese Balls") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Onion Rings") {
			price = 100.0;
			return price;
		}
		else if(itemName == "Hash Browns") {
			price = 90.0;
			return price;
		}
		else if(itemName == "Mashed Potato") {
			price = 110.0;
			return price;
		}
		else if(itemName == "Baked Beans") {
			price = 95.0;
			return price;
		}
		else if(itemName == "Mac and Cheese") {
			price = 160.0;
			return price;
		}
		else if(itemName == "Spaghetti") {
			price = 180.0;
			return price;
		}
		else if(itemName == "Lasagna") {
			price = 200.0;
			return price;
		}
		else if(itemName == "Ravioli") {
			price = 190.0;
			return price;
		}
		else if(itemName == "Gnocchi") {
			price = 170.0;
			return price;
		}
		else if(itemName == "Risotto") {
			price = 210.0;
			return price;
		}
		else if(itemName == "Paella") {
			price = 220.0;
			return price;
		}
		else if(itemName == "Tapas") {
			price = 180.0;
			return price;
		}
		else if(itemName == "Falafel Wrap") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Hummus Plate") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Pita Bread") {
			price = 70.0;
			return price;
		}
		else if(itemName == "Shawarma") {
			price = 160.0;
			return price;
		}
		else if(itemName == "Grilled Fish") {
			price = 200.0;
			return price;
		}
		else if(itemName == "Steak") {
			price = 300.0;
			return price;
		}
		else if(itemName == "Roast Chicken") {
			price = 220.0;
			return price;
		}
		else if(itemName == "BBQ Wings") {
			price = 180.0;
			return price;
		}
		else if(itemName == "Buffalo Wings") {
			price = 190.0;
			return price;
		}
		else if(itemName == "Chicken Nuggets") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Hot Dog") {
			price = 100.0;
			return price;
		}
		else if(itemName == "Corn Dog") {
			price = 110.0;
			return price;
		}
		else if(itemName == "Tater Tots") {
			price = 90.0;
			return price;
		}
		else if(itemName == "Cheese Fries") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Loaded Fries") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Nachos") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Cheese Dip") {
			price = 100.0;
			return price;
		}
		else if(itemName == "Guacamole") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Salsa") {
			price = 80.0;
			return price;
		}
		else if(itemName == "Stuffed Peppers") {
			price = 160.0;
			return price;
		}
		else if(itemName == "Veg Lasagna") {
			price = 190.0;
			return price;
		}
		else if(itemName == "Chicken Alfredo") {
			price = 210.0;
			return price;
		}
		else if(itemName == "Penne Pasta") {
			price = 180.0;
			return price;
		}
		else if(itemName == "Fettuccine") {
			price = 190.0;
			return price;
		}
		else if(itemName == "Bruschetta") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Caprese Salad") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Minestrone Soup") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Tomato Soup") {
			price = 100.0;
			return price;
		}
		else if(itemName == "Chicken Soup") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Seafood Soup") {
			price = 160.0;
			return price;
		}
		else if(itemName == "Clam Chowder") {
			price = 170.0;
			return price;
		}
		else if(itemName == "Beef Stew") {
			price = 200.0;
			return price;
		}
		else if(itemName == "Veg Stew") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Roasted Vegetables") {
			price = 140.0;
			return price;
		}
		else {
			System.out.println("Item not found");
		}

		return price;
	}

	static double search(String itemName, int quantity)
	{
		double price = 0;

		if(itemName == "Croissant") {
			price = 80.0;
			return price * quantity;
		}
		else if(itemName == "Bagel") {
			price = 70.0;
			return price * quantity;
		}
		else if(itemName == "Donut") {
			price = 50.0;
			return price * quantity;
		}
		else if(itemName == "Waffle") {
			price = 120.0;
			return price * quantity;
		}
		else if(itemName == "Pancake") {
			price = 110.0;
			return price * quantity;	
		}
		else if(itemName == "French Toast") {
			price = 130.0;
			return price * quantity;	
		}
		else if(itemName == "Grilled Cheese") {
			price = 90.0;
			return price * quantity;	
		}
		else if(itemName == "Club Sandwich") {
			price = 150.0;
			return price * quantity;
		}
		else if(itemName == "Caesar Salad") {
			price = 140.0;
			return price * quantity;
		}
		else if(itemName == "Greek Salad") {
			price = 150.0;
			return price * quantity;
		}
		else if(itemName == "Coleslaw") {
			price = 60.0;
			return price * quantity;
		}
		else if(itemName == "Garlic Bread") {
			price = 80.0;
			return price * quantity;
		}
		else if(itemName == "Cheese Balls") {
			price = 120.0;
			return price * quantity;
		}
		else if(itemName == "Onion Rings") {
			price = 100.0;
			return price * quantity;
		}
		else if(itemName == "Hash Browns") {
			price = 90.0;
			return price * quantity;
		}
		else if(itemName == "Mashed Potato") {
			price = 110.0;
			return price * quantity;
		}
		else if(itemName == "Baked Beans") {
			price = 95.0;
			return price * quantity;
		}
		else if(itemName == "Mac and Cheese") {
			price = 160.0;
			return price * quantity;
		}
		else if(itemName == "Spaghetti") {
			price = 180.0;
			return price * quantity;
		}
		else if(itemName == "Lasagna") {
			price = 200.0;
			return price * quantity;
		}
		else if(itemName == "Ravioli") {
			price = 190.0;
			return price * quantity;
		}
		else if(itemName == "Gnocchi") {
			price = 170.0;
			return price * quantity;
		}
		else if(itemName == "Risotto") {
			price = 210.0;
			return price * quantity;
		}
		else if(itemName == "Paella") {
			price = 220.0;
			return price * quantity;
		}
		else if(itemName == "Tapas") {
			price = 180.0;
			return price * quantity;
		}
		else if(itemName == "Falafel Wrap") {
			price = 130.0;
			return price * quantity;
		}
		else if(itemName == "Hummus Plate") {
			price = 140.0;
			return price * quantity;
		}
		else if(itemName == "Pita Bread") {
			price = 70.0;
			return price * quantity;
		}
		else if(itemName == "Shawarma") {
			price = 160.0;
			return price * quantity;
		}
		else if(itemName == "Grilled Fish") {
			price = 200.0;
			return price * quantity;
		}
		else if(itemName == "Steak") {
			price = 300.0;
			return price * quantity;
		}
		else if(itemName == "Roast Chicken") {
			price = 220.0;
			return price * quantity;
		}
		else if(itemName == "BBQ Wings") {
			price = 180.0;
			return price * quantity;
		}
		else if(itemName == "Buffalo Wings") {
			price = 190.0;
			return price * quantity;
		}
		else if(itemName == "Chicken Nuggets") {
			price = 120.0;
			return price * quantity;
		}
		else if(itemName == "Hot Dog") {
			price = 100.0;
			return price * quantity;
		}
		else if(itemName == "Corn Dog") {
			price = 110.0;
			return price * quantity;
		}
		else if(itemName == "Tater Tots") {
			price = 90.0;
			return price * quantity;
		}
		else if(itemName == "Cheese Fries") {
			price = 130.0;
			return price * quantity;
		}
		else if(itemName == "Loaded Fries") {
			price = 150.0;
			return price * quantity;
		}
		else if(itemName == "Nachos") {
			price = 140.0;
			return price * quantity;
		}
		else if(itemName == "Cheese Dip") {
			price = 100.0;
			return price * quantity;
		}
		else if(itemName == "Guacamole") {
			price = 120.0;
			return price * quantity;
		}
		else if(itemName == "Salsa") {
			price = 80.0;
			return price * quantity;
		}
		else if(itemName == "Stuffed Peppers") {
			price = 160.0;
			return price * quantity;
		}
		else if(itemName == "Veg Lasagna") {
			price = 190.0;
			return price * quantity;
		}
		else if(itemName == "Chicken Alfredo") {
			price = 210.0;
			return price * quantity;
		}
		else if(itemName == "Penne Pasta") {
			price = 180.0;
			return price * quantity;
		}
		else if(itemName == "Fettuccine") {
			price = 190.0;
			return price * quantity;
		}
		else if(itemName == "Bruschetta") {
			price = 120.0;
			return price * quantity;
		}
		else if(itemName == "Caprese Salad") {
			price = 150.0;
			return price * quantity;
		}
		else if(itemName == "Minestrone Soup") {
			price = 130.0;
			return price * quantity;
		}
		else if(itemName == "Tomato Soup") {
			price = 100.0;
			return price * quantity;
		}
		else if(itemName == "Chicken Soup") {
			price = 120.0;
			return price * quantity;
		}
		else if(itemName == "Seafood Soup") {
			price = 160.0;
			return price * quantity;
		}
		else if(itemName == "Clam Chowder") {
			price = 170.0;
			return price * quantity;
		}
		else if(itemName == "Beef Stew") {
			price = 200.0;
			return price * quantity;
		}
		else if(itemName == "Veg Stew") {
			price = 150.0;
			return price * quantity;
		}
		else if(itemName == "Roasted Vegetables") {
			price = 140.0;
			return price * quantity;
		}
		else {
			System.out.println("Item not found");
		}
		return price * quantity;
	}
}