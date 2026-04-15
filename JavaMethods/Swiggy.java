class Swiggy
{
	static double search(String itemName)
	{
		double price = 0.0;

		if(itemName == "Falooda") {
		price = 120.0;
		return price;
		}else if(itemName == "Lassi"){
		price = 60.0;
		return price;
		}else if(itemName == "Cold Coffee"){
		price = 90.0;
		return price;
		}else if(itemName == "Milkshake"){
		price = 110.0;
		return price;
		}else if(itemName == "Fruit Salad"){
		price = 80.0;
		return price;
		}else if(itemName == "Pani Puri"){
		price = 50.0;
		return price;
		}else if(itemName == "Bhel Puri"){
		price = 55.0;
		return price;
		}else if(itemName == "Sev Puri"){
		price = 60.0;
		return price;
		}else if(itemName == "Dahi Puri"){
		price = 65.0;
		return price;
		}else if(itemName == "Aloo Chaat"){
		price = 70.0;
		return price;
		}else if(itemName == "Samosa") {
		price = 25.0;
		return price;
		}else if(itemName == "Kachori"){
		price = 30.0;
		return price;
		}else if(itemName == "Pav Bhaji"){
		price = 120.0;
		return price;
		}else if(itemName == "Misal Pav"){
		price = 100.0;
		return price;
		}else if(itemName == "Vada Pav"){
		price = 40.0;
		return price;
		}else if(itemName == "Maggi"){
		price = 70.0;
		return price;
		}else if(itemName == "Omelette"){
		price = 50.0;
		return price;
		}else if(itemName == "Boiled Egg"){
		price = 20.0;
		return price;
		}else if(itemName == "Chicken Roll"){
		price = 130.0;
		return price;
		}else if(itemName == "Egg Roll") {
		price = 90.0;
		return price;
		}else if(itemName == "Veg Roll"){
		price = 80.0;
		return price;
		}else if(itemName == "Paneer Roll") {
		price = 100.0;
		return price;
		}else if(itemName == "Mushroom Roll"){
		price = 95.0;
		return price;
		}else if(itemName == "Frankie"){
		price = 85.0;
		return price;
		}else if(itemName == "Tacos"){
		price = 140.0;
		return price;
		}else if(itemName == "Quesadilla") {
		price = 150.0;
		return price;
		}else if(itemName == "Burrito") {
		price = 160.0;
		return price;
		}else if(itemName == "Nacho Chaat"){
		price = 90.0;
		return price;
		}else if(itemName == "Corn Chat"){
		price = 70.0;
		return price;
		}else if(itemName == "Sweet Corn"){
		price = 60.0;
		return price;
		}else if(itemName == "Popcorn"){
		price = 50.0;
		return price;
		}else if(itemName == "Masala Corn") {
		price = 65.0;
		return price;
		}else if(itemName == "Chocolate Shake"){
		price = 120.0;
		return price;
		}else if(itemName == "Oreo Shake") {
		price = 130.0;
		return price;
		}else if(itemName == "Kitkat Shake"){
		price = 140.0;
		return price;
		}else if(itemName == "Strawberry Shake"){
		price = 110.0;
		return price;
		}else if(itemName == "Mango Shake"){
		price = 100.0;
		return price;
		}else if(itemName == "Banana Shake") {
		price = 90.0;
		return price;
		}else if(itemName == "Pineapple Juice") {
		price = 80.0;
		return price;
		}else if(itemName == "Orange Juice"){
		price = 85.0;
		return price;
		}else if(itemName == "Watermelon Juice"){
		price = 75.0;
		return price;
		}else if(itemName == "Lemon Juice"){
		price = 40.0;
		return price;
		}else if(itemName == "Sugarcane Juice"){
		price = 50.0;
		return price;
		}else if(itemName == "Buttermilk") {
		price = 30.0;
		return price;
		}else if(itemName == "Green Tea"){
		price = 40.0;
		return price;
		}else if(itemName == "Black Tea"){
		price = 35.0;
		return price;
		}else if(itemName == "Masala Tea"){
		price = 45.0;
		return price;
		}else if(itemName == "Filter Coffee"){
		price = 50.0;
		return price;
		}else if(itemName == "Espresso"){ 
		price = 90.0;
		return price;
		}else if(itemName == "Cappuccino") {
		price = 120.0;
		return price;
		}else if(itemName == "Latte"){
		price = 110.0;
		return price;
		}else if(itemName == "Mocha"){
		price = 130.0;
		return price;
		}else if(itemName == "Hot Chocolate"){
		price = 140.0;
		return price;
		}else if(itemName == "Iced Tea"){
		price = 80.0;
		return price;
		}else if(itemName == "Iced Latte") {
		price = 100.0;
		return price;
		}else if(itemName == "Energy Drink"){
		price = 150.0;
		return price;
		}else if(itemName == "Smoothie Bowl"){
		price = 180.0;
		return price;
		}else if(itemName == "Granola Bowl"){
		price = 170.0;
		return price;
		}else if(itemName == "Protein Shake"){
		price = 200.0;
		return price;
		}else{
		System.out.println("Item not found");
		}
		return price;
	}

	static double search(String itemName, int quantity)
{
    double price = 0;

    if(itemName == "Falooda") {
        price = 120.0;
        return price * quantity;
    } else if(itemName == "Lassi") {
        price = 60.0;
        return price * quantity;
    } else if(itemName == "Cold Coffee") {
        price = 90.0;
        return price * quantity;
    } else if(itemName == "Milkshake") {
        price = 110.0;
        return price * quantity;
    } else if(itemName == "Fruit Salad") {
        price = 80.0;
        return price * quantity;
    } else if(itemName == "Pani Puri") {
        price = 50.0;
        return price * quantity;
    } else if(itemName == "Bhel Puri") {
        price = 55.0;
        return price * quantity;
    } else if(itemName == "Sev Puri") {
        price = 60.0;
        return price * quantity;
    } else if(itemName == "Dahi Puri") {
        price = 65.0;
        return price * quantity;
    } else if(itemName == "Aloo Chaat") {
        price = 70.0;
        return price * quantity;
    } else if(itemName == "Samosa") {
        price = 25.0;
        return price * quantity;
    } else if(itemName == "Kachori") {
        price = 30.0;
        return price * quantity;
    } else if(itemName == "Pav Bhaji") {
        price = 120.0;
        return price * quantity;
    } else if(itemName == "Misal Pav") {
        price = 100.0;
        return price * quantity;
    } else if(itemName == "Vada Pav") {
        price = 40.0;
        return price * quantity;
    } else if(itemName == "Maggi") {
        price = 70.0;
        return price * quantity;
    } else if(itemName == "Omelette") {
        price = 50.0;
        return price * quantity;
    } else if(itemName == "Boiled Egg") {
        price = 20.0;
        return price * quantity;
    } else if(itemName == "Chicken Roll") {
        price = 130.0;
        return price * quantity;
    } else if(itemName == "Egg Roll") {
        price = 90.0;
        return price * quantity;
    } else if(itemName == "Veg Roll") {
        price = 80.0;
        return price * quantity;
    } else if(itemName == "Paneer Roll") {
        price = 100.0;
        return price * quantity;
    } else if(itemName == "Mushroom Roll") {
        price = 95.0;
        return price * quantity;
    } else if(itemName == "Frankie") {
        price = 85.0;
        return price * quantity;
    } else if(itemName == "Tacos") {
        price = 140.0;
        return price * quantity;
    } else if(itemName == "Quesadilla") {
        price = 150.0;
        return price * quantity;
    } else if(itemName == "Burrito") {
        price = 160.0;
        return price * quantity;
    } else if(itemName == "Nacho Chaat") {
        price = 90.0;
        return price * quantity;
    } else if(itemName == "Corn Chat") {
        price = 70.0;
        return price * quantity;
    } else if(itemName == "Sweet Corn") {
        price = 60.0;
        return price * quantity;
    } else if(itemName == "Popcorn") {
        price = 50.0;
        return price * quantity;
    } else if(itemName == "Masala Corn") {
        price = 65.0;
        return price * quantity;
    } else if(itemName == "Chocolate Shake") {
        price = 120.0;
        return price * quantity;
    } else if(itemName == "Oreo Shake") {
        price = 130.0;
        return price * quantity;
    } else if(itemName == "Kitkat Shake") {
        price = 140.0;
        return price * quantity;
    } else if(itemName == "Strawberry Shake") {
        price = 110.0;
        return price * quantity;
    } else if(itemName == "Mango Shake") {
        price = 100.0;
        return price * quantity;
    } else if(itemName == "Banana Shake") {
        price = 90.0;
        return price * quantity;
    } else if(itemName == "Pineapple Juice") {
        price = 80.0;
        return price * quantity;
    } else if(itemName == "Orange Juice") {
        price = 85.0;
        return price * quantity;
    } else if(itemName == "Watermelon Juice") {
        price = 75.0;
        return price * quantity;
    } else if(itemName == "Lemon Juice") {
        price = 40.0;
        return price * quantity;
    } else if(itemName == "Sugarcane Juice") {
        price = 50.0;
        return price * quantity;
    } else if(itemName == "Buttermilk") {
        price = 30.0;
        return price * quantity;
    } else if(itemName == "Green Tea") {
        price = 40.0;
        return price * quantity;
    } else if(itemName == "Black Tea") {
        price = 35.0;
        return price * quantity;
    } else if(itemName == "Masala Tea") {
        price = 45.0;
        return price * quantity;
    } else if(itemName == "Filter Coffee") {
        price = 50.0;
        return price * quantity;
    } else if(itemName == "Espresso") {
        price = 90.0;
        return price * quantity;
    } else if(itemName == "Cappuccino") {
        price = 120.0;
        return price * quantity;
    } else if(itemName == "Latte") {
        price = 110.0;
        return price * quantity;
    } else if(itemName == "Mocha") {
        price = 130.0;
        return price * quantity;
    } else if(itemName == "Hot Chocolate") {
        price = 140.0;
        return price * quantity;
    } else if(itemName == "Iced Tea") {
        price = 80.0;
        return price * quantity;
    } else if(itemName == "Iced Latte") {
        price = 100.0;
        return price * quantity;
    } else if(itemName == "Energy Drink") {
        price = 150.0;
        return price * quantity;
    } else if(itemName == "Smoothie Bowl") {
        price = 180.0;
        return price * quantity;
    } else if(itemName == "Granola Bowl") {
        price = 170.0;
        return price * quantity;
    } else if(itemName == "Protein Shake") {
        price = 200.0;
        return price * quantity;
    } else {
        System.out.println("Item not found");
        return price * quantity;
    }
}
}