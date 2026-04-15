class MagicPin
{
	static double search(String itemName)
	{
		double price = 0;
		if(itemName == "Masala Dosa") {
			price = 80.0;
			return price;
		}else if(itemName == "Rava Dosa") {
			price = 90.0;
			return price;
		}
		else if(itemName == "Onion Uttapam") {
			price = 100.0;
			return price;
		}
		else if(itemName == "Plain Uttapam") {
			price = 95.0;
			return price;
		}
		else if(itemName == "Set Dosa") {
			price = 85.0;
			return price;
		}
		else if(itemName == "Neer Dosa") {
			price = 90.0;
			return price;
		}
		else if(itemName == "Pesarattu") {
			price = 110.0;
			return price;
		}
		else if(itemName == "Idli Sambar") {
			price = 50.0;
			return price;
		}
		else if(itemName == "Vada Sambar") {
			price = 60.0;
			return price;
		}
		else if(itemName == "Medu Vada") {
			price = 55.0;
			return price;
		}
		else if(itemName == "Upma") {
			price = 70.0;
			return price;
		}
		else if(itemName == "Kesari Bath") {
			price = 65.0;
			return price;
		}
		else if(itemName == "Khara Bath") {
			price = 65.0;
			return price;
		}
		else if(itemName == "Bisibele Bath") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Curd Rice") {
			price = 80.0;
			return price;
		}
		else if(itemName == "Lemon Rice") {
			price = 75.0;
			return price;
		}
		else if(itemName == "Tamarind Rice") {
			price = 75.0;
			return price;
		}
		else if(itemName == "Tomato Rice") {
			price = 80.0;
			return price;
		}
		else if(itemName == "Veg Fried Rice") {
			price = 110.0;
			return price;
		}
		else if(itemName == "Egg Fried Rice") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Chicken Fried Rice") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Paneer Fried Rice") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Gobi Manchurian") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Paneer Manchurian") {
			price = 160.0;
			return price;
		}
		else if(itemName == "Chicken Manchurian") {
			price = 180.0;
			return price;
		}
		else if(itemName == "Chilli Paneer") {
			price = 170.0;
			return price;
		}
		else if(itemName == "Chilli Chicken") {
			price = 190.0;
			return price;
		}
		else if(itemName == "Hakka Noodles") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Schezwan Noodles") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Egg Noodles") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Chicken Noodles") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Paneer Noodles") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Veg Burger Deluxe") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Chicken Burger Deluxe") {
			price = 170.0;
			return price;
		}
		else if(itemName == "Paneer Burger Deluxe") {
			price = 160.0;
			return price;
		}
		else if(itemName == "French Fries Large") {
			price = 90.0;
			return price;
		}
		else if(itemName == "Peri Peri Fries") {
			price = 100.0;
			return price;
		}
		else if(itemName == "Cheese Fries") {
			price = 110.0;
			return price;
		}
		else if(itemName == "Loaded Nachos") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Chicken Nachos") {
			price = 160.0;
			return price;
		}
		else if(itemName == "Paneer Nachos") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Veg Pizza") {
			price = 180.0;
			return price;
		}
		else if(itemName == "Chicken Pizza") {
			price = 200.0;
			return price;
		}
		else if(itemName == "Pepperoni Pizza") {
			price = 220.0;
			return price;
		}
		else if(itemName == "Margherita Pizza") {
			price = 180.0;
			return price;
		}
		else if(itemName == "Farmhouse Pizza") {
			price = 250.0;
			return price;
		}
		else if(itemName == "BBQ Chicken Pizza") {
			price = 260.0;
			return price;
		}
		else if(itemName == "Paneer Tikka Pizza") {
			price = 240.0;
			return price;
		}
		else if(itemName == "Chocolate Brownie") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Ice Cream Sundae") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Vanilla Milkshake") {
			price = 90.0;
		}
		else if(itemName == "Strawberry Milkshake") {
			price = 100.0;
		}
		else if(itemName == "Mango Milkshake") {
			price = 110.0;
		}
		else if(itemName == "Cold Coffee") {
			price = 120.0;
		}
		else if(itemName == "Iced Tea") {
			price = 80.0;
			return price;
		}
		else if(itemName == "Lime Soda") {
			price = 60.0;
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

		if(itemName == "Masala Dosa") {
			price = 80.0;
			return price * quantity;
		}
		else if(itemName == "Rava Dosa") {
			price = 90.0;
			return price * quantity;
		}
		else if(itemName == "Onion Uttapam") {
			price = 100.0;
			return price * quantity;
		}
		else if(itemName == "Plain Uttapam") {
			price = 95.0;
			return price * quantity;
		}
		else if(itemName == "Set Dosa") {
			price = 85.0;
			return price * quantity;
		}
		else if(itemName == "Neer Dosa") {
			price = 90.0;
			return price * quantity;
		}
		else if(itemName == "Pesarattu") {
			price = 110.0;
			return price * quantity;
		}
		else if(itemName == "Idli Sambar") {
			price = 50.0;
			return price * quantity;
		}
		else if(itemName == "Vada Sambar") {
			price = 60.0;
			return price * quantity;
		}
		else if(itemName == "Medu Vada") {
			price = 55.0;
			return price * quantity;
		}
		else if(itemName == "Upma") {
			price = 70.0;
			return price * quantity;
		}
		else if(itemName == "Kesari Bath") {
			price = 65.0;
			return price * quantity;
		}
		else if(itemName == "Khara Bath") {
			price = 65.0;
			return price * quantity;
		}
		else if(itemName == "Bisibele Bath") {
			price = 120.0;
			return price * quantity;
		}
		else if(itemName == "Curd Rice") {
			price = 80.0;
			return price * quantity;
		}
		else if(itemName == "Lemon Rice") {
			price = 75.0;
			return price * quantity;
		}
		else if(itemName == "Tamarind Rice") {
			price = 75.0;
			return price * quantity;
		}
		else if(itemName == "Tomato Rice") {
			price = 80.0;
			return price * quantity;
		}
		else if(itemName == "Veg Fried Rice") {
			price = 110.0;
			return price * quantity;
		}
		else if(itemName == "Egg Fried Rice") {
			price = 120.0;
			return price * quantity;
		}
		else if(itemName == "Chicken Fried Rice") {
			price = 140.0;
			return price * quantity;
		}
		else if(itemName == "Paneer Fried Rice") {
			price = 130.0;
			return price * quantity;
		}
		else if(itemName == "Gobi Manchurian") {
			price = 150.0;
			return price * quantity;
		}
		else if(itemName == "Paneer Manchurian") {
			price = 160.0;
			return price * quantity;
		}
		else if(itemName == "Chicken Manchurian") {
			price = 180.0;
			return price * quantity;
		}
		else if(itemName == "Chilli Paneer") {
			price = 170.0;
			return price * quantity;
		}
		else if(itemName == "Chilli Chicken") {
			price = 190.0;
			return price * quantity;
		}
		else if(itemName == "Hakka Noodles") {
			price = 130.0;
			return price * quantity;
		}
		else if(itemName == "Schezwan Noodles") {
			price = 140.0;
			return price * quantity;
		}
		else if(itemName == "Egg Noodles") {
			price = 120.0;
			return price * quantity;
		}
		else if(itemName == "Chicken Noodles") {
			price = 150.0;
			return price * quantity;
		}
		else if(itemName == "Paneer Noodles") {
			price = 140.0;
			return price * quantity;
		}
		else if(itemName == "Veg Burger Deluxe") {
			price = 150.0;
			return price * quantity;
		}
		else if(itemName == "Chicken Burger Deluxe") {
			price = 170.0;
			return price * quantity;
		}
		else if(itemName == "Paneer Burger Deluxe") {
			price = 160.0;
			return price * quantity;
		}
		else if(itemName == "French Fries Large") {
			price = 90.0;
			return price * quantity;
		}
		else if(itemName == "Peri Peri Fries") {
			price = 100.0;
			return price * quantity;
		}
		else if(itemName == "Cheese Fries") {
			price = 110.0;
			return price * quantity;
		}
		else if(itemName == "Loaded Nachos") {
			price = 140.0;
			return price * quantity;
		}
		else if(itemName == "Chicken Nachos") {
			price = 160.0;
			return price * quantity;
		}
		else if(itemName == "Paneer Nachos") {
			price = 150.0;
			return price * quantity;
		}
		else if(itemName == "Veg Pizza") {
			price = 180.0;
			return price * quantity;
		}
		else if(itemName == "Chicken Pizza") {
			price = 200.0;
			return price * quantity;
		}
		else if(itemName == "Pepperoni Pizza") {
			price = 220.0;
			return price * quantity;
		}
		else if(itemName == "Margherita Pizza") {
			price = 180.0;
			return price * quantity;
		}
		else if(itemName == "Farmhouse Pizza") {
			price = 250.0;
			return price * quantity;
		}
		else if(itemName == "BBQ Chicken Pizza") {
			price = 260.0;
			return price * quantity;
		}
		else if(itemName == "Paneer Tikka Pizza") {
			price = 240.0;
			return price * quantity;
		}
		else if(itemName == "Chocolate Brownie") {
			price = 120.0;
			return price * quantity;
		}
		else if(itemName == "Ice Cream Sundae") {
			price = 150.0;
			return price * quantity;
		}
		else if(itemName == "Vanilla Milkshake") {
			price = 90.0;
			return price * quantity;
		}
		else if(itemName == "Strawberry Milkshake") {
			price = 100.0;
			return price * quantity;
		}
		else if(itemName == "Mango Milkshake") {
			price = 110.0;
			return price * quantity;
		}
		else if(itemName == "Cold Coffee") {
			price = 120.0;
			return price * quantity;
		}
		else if(itemName == "Iced Tea") {
			price = 80.0;
			return price * quantity;
		}
		else if(itemName == "Lime Soda") {
			price = 60.0;
			return price * quantity;
		}
		else {
			System.out.println("Item not found");
			return price;
		}
	}
}