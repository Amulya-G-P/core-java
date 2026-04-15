class UberEATS
{
	static double search(String itemName)
	{
		double price = 0.0;

		if(itemName == "Idli") {
			price = 40.0;
			return price;
		}
		else if(itemName == "Vada") {
			price = 35.0;
			return price;
		}
		else if(itemName == "Plain Dosa") {
			price = 60.0;
			return price;
		}
		else if(itemName == "Masala Dosa") {
			price = 80.0;
			return price;
		}
		else if(itemName == "Set Dosa") {
			price = 90.0;
			return price;
		}
		else if(itemName == "Rava Dosa") {
			price = 85.0;
			return price;
		}
		else if(itemName == "Onion Dosa") {
			price = 90.0;
			return price;
		}
		else if(itemName == "Paper Dosa") {
			price = 100.0;
			return price;
		}
		else if(itemName == "Ghee Roast") {
			price = 110.0;
			return price;
		}
		else if(itemName == "Upma") {
			price = 50.0;
			return price;
		}
		else if(itemName == "Kesari Bath") {
			price = 60.0;
			return price;
		}
		else if(itemName == "Khara Bath") {
			price = 60.0;
			return price;
		}
		else if(itemName == "Chow Chow Bath") {
			price = 80.0;
			return price;
		}
		else if(itemName == "Bisibele Bath") {
			price = 90.0;
			return price;
		}
		else if(itemName == "Pongal") {
			price = 70.0;
			return price;
		}
		else if(itemName == "Curd Rice") {
			price = 60.0;
			return price;
		}
		else if(itemName == "Lemon Rice") {
			price = 65.0;
			return price;
		}
		else if(itemName == "Tamarind Rice") {
			price = 65.0;
			return price;
		}
		else if(itemName == "Vegetable Pulao") {
			price = 100.0;
			return price;
		}
		else if(itemName == "Jeera Rice") {
			price = 90.0;
			return price;
		}
		else if(itemName == "Gobi Manchurian") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Chilli Paneer") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Paneer Tikka") {
			price = 160.0;
			return price;
		}
		else if(itemName == "Veg Kebab") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Spring Rolls") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Veg Momos") {
			price = 110.0;
			return price;
		}
		else if(itemName == "Chicken Momos") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Fried Momos") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Veg Noodles") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Chicken Noodles") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Egg Noodles") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Veg Fried Rice") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Chicken Fried Rice") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Egg Fried Rice") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Schezwan Rice") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Manchurian Rice") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Chilli Chicken") {
			price = 170.0;
			return price;
		}
		else if(itemName == "Pepper Chicken") {
			price = 180.0;
			return price;
		}
		else if(itemName == "Chicken 65") {
			price = 160.0;
			return price;
		}
		else if(itemName == "Tandoori Chicken") {
			price = 220.0;
			return price;
		}
		else if(itemName == "Butter Chicken") {
			price = 200.0;
			return price;
		}
		else if(itemName == "Kadai Chicken") {
			price = 190.0;
			return price;
		}
		else if(itemName == "Chicken Curry") {
			price = 180.0;
			return price;
		}
		else if(itemName == "Mutton Curry") {
			price = 250.0;
			return price;
		}
		else if(itemName == "Fish Curry") {
			price = 220.0;
			return price;
		}
		else if(itemName == "Prawn Curry") {
			price = 260.0;
			return price;
		}
		else if(itemName == "Egg Curry") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Dal Fry") {
			price = 100.0;
			return price;
		}
		else if(itemName == "Dal Tadka") {
			price = 110.0;
			return price;
		}
		else if(itemName == "Palak Paneer") {
			price = 160.0;
			return price;
		}
		else if(itemName == "Aloo Gobi") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Bhindi Fry") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Baingan Bharta") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Veg Curry") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Mixed Veg") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Chapati") {
			price = 20.0;
			return price;
		}
		else if(itemName == "Tandoori Roti") {
			price = 25.0;
			return price;
		}
		else if(itemName == "Butter Naan") {
			price = 40.0;
			return price;
		}
		else if(itemName == "Garlic Naan") {
			price = 50.0;
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
		if(itemName == "Idli") {
			price = 40.0;
			return price *quantity;
		}
		else if(itemName == "Vada") {
			price = 35.0;
			return price *quantity;
		}
		else if(itemName == "Plain Dosa") {
			price = 60.0;
			return price *quantity;
		}
		else if(itemName == "Masala Dosa") {
			price = 80.0;
			return price *quantity;
		}
		else if(itemName == "Set Dosa") {
			price = 90.0;
			return price *quantity;
		}
		else if(itemName == "Rava Dosa") {
			price = 85.0;
			return price *quantity;
		}
		else if(itemName == "Onion Dosa") {
			price = 90.0;
			return price *quantity;
		}
		else if(itemName == "Paper Dosa") {
			price = 100.0;
			return price *quantity;
		}
		else if(itemName == "Ghee Roast") {
			price = 110.0;
			return price *quantity;
		}
		else if(itemName == "Upma") {
			price = 50.0;
			return price*quantity;
		}
		else if(itemName == "Kesari Bath") {
			price = 60.0;
			return price*quantity;
		}
		else if(itemName == "Khara Bath") {
			price = 60.0;
			return price*quantity;
		}
		else if(itemName == "Chow Chow Bath") {
			price = 80.0;
			return price*quantity;
		}
		else if(itemName == "Bisibele Bath") {
			price = 90.0;
			return price*quantity;
		}
		else if(itemName == "Pongal") {
			price = 70.0;
			return price*quantity;
		}
		else if(itemName == "Curd Rice") {
			price = 60.0;
			return price*quantity;
		}
		else if(itemName == "Lemon Rice") {
			price = 65.0;
			return price*quantity;
		}
		else if(itemName == "Tamarind Rice") {
			price = 65.0;
			return price*quantity;
		}
		else if(itemName == "Vegetable Pulao") {
			price = 100.0;
			return price*quantity;
		}
		else if(itemName == "Jeera Rice") {
			price = 90.0;
			return price*quantity;
		}
		else if(itemName == "Gobi Manchurian") {
			price = 120.0;
			return price*quantity;
		}
		else if(itemName == "Chilli Paneer") {
			price = 140.0;
			return price*quantity;
		}
		else if(itemName == "Paneer Tikka") {
			price = 160.0;
			return price*quantity;
		}
		else if(itemName == "Veg Kebab") {
			price = 130.0;
			return price*quantity;
		}
		else if(itemName == "Spring Rolls") {
			price = 120.0;
			return price*quantity;
		}
		else if(itemName == "Veg Momos") {
			price = 110.0;
			return price*quantity;
		}
		else if(itemName == "Chicken Momos") {
			price = 130.0;
			return price*quantity;
		}
		else if(itemName == "Fried Momos") {
			price = 140.0;
			return price*quantity;
		}
		else if(itemName == "Veg Noodles") {
			price = 120.0;
			return price*quantity;
		}
		else if(itemName == "Chicken Noodles") {
			price = 150.0;
			return price*quantity;
		}
		else if(itemName == "Egg Noodles") {
			price = 130.0;
			return price*quantity;
		}
		else if(itemName == "Veg Fried Rice") {
			price = 120.0;
			return price*quantity;
		}
		else if(itemName == "Chicken Fried Rice") {
			price = 150.0;
			return price*quantity;
		}
		else if(itemName == "Egg Fried Rice") {
			price = 130.0;
			return price*quantity;
		}
		else if(itemName == "Schezwan Rice") {
			price = 140.0;
			return price*quantity;
		}
		else if(itemName == "Manchurian Rice") {
			price = 140.0;
			return price*quantity;
		}
		else if(itemName == "Chilli Chicken") {
			price = 170.0;
			return price*quantity;
		}
		else if(itemName == "Pepper Chicken") {
			price = 180.0;
			return price*quantity;
		}
		else if(itemName == "Chicken 65") {
			price = 160.0;
			return price*quantity;
		}
		else if(itemName == "Tandoori Chicken") {
			price = 220.0;
			return price*quantity;
		}
		else if(itemName == "Butter Chicken") {
			price = 200.0;
			return price*quantity;
		}
		else if(itemName == "Kadai Chicken") {
			price = 190.0;
			return price*quantity;
		}
		else if(itemName == "Chicken Curry") {
			price = 180.0;
			return price*quantity;
		}
		else if(itemName == "Mutton Curry") {
			price = 250.0;
			return price*quantity;
		}
		else if(itemName == "Fish Curry") {
			price = 220.0;
			return price*quantity;
		}
		else if(itemName == "Prawn Curry") {
			price = 260.0;
			return price*quantity;
		}
		else if(itemName == "Egg Curry") {
			price = 120.0;
			return price*quantity;
		}
		else if(itemName == "Dal Fry") {
			price = 100.0;
			return price*quantity;
		}
		else if(itemName == "Dal Tadka") {
			price = 110.0;
			return price*quantity;
		}
		else if(itemName == "Palak Paneer") {
			price = 160.0;
			return price*quantity;
		}
		else if(itemName == "Aloo Gobi") {
			price = 120.0;
			return price*quantity;
		}
		else if(itemName == "Bhindi Fry") {
			price = 130.0;
			return price*quantity;
		}
		else if(itemName == "Baingan Bharta") {
			price = 140.0;
			return price*quantity;
		}
		else if(itemName == "Veg Curry") {
			price = 120.0;
			return price*quantity;
		}
		else if(itemName == "Mixed Veg") {
			price = 130.0;
			return price*quantity;
		}
		else if(itemName == "Chapati") {
			price = 20.0;
			return price*quantity;
		}
		else if(itemName == "Tandoori Roti") {
			price = 25.0;
			return price*quantity;
		}
		else if(itemName == "Butter Naan") {
			price = 40.0;
			return price*quantity;
		}
		else if(itemName == "Garlic Naan") {
			price = 50.0;
			return price*quantity;
		}
		else {
			System.out.println("Item not found");
		}
		return price*quantity;
		
    }

        
}