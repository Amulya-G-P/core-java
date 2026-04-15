class EatSure
{
	static double search(String itemName)
	{
		double price = 0;

		if(itemName == "Buddha Bowl") {
		price = 180.0;
		return price;
		}
		else if(itemName == "Kale Salad") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Tofu Stir Fry") {
			price = 170.0;
			return price;
		}
		else if(itemName == "Veg Sushi Roll") {
			price = 160.0;
			return price;
		}
		else if(itemName == "Chicken Sushi Roll") {
			price = 190.0;
			return price;
		}
		else if(itemName == "Dragon Roll") {
			price = 220.0;
			return price;
		}
		else if(itemName == "Rainbow Roll") {
			price = 230.0;
			return price;
		}
		else if(itemName == "Teriyaki Chicken") {
			price = 200.0;
			return price;
		}
		else if(itemName == "Teriyaki Tofu") {
			price = 180.0;
			return price;
		}
		else if(itemName == "Miso Soup") {
			price = 90.0;
			return price;
		}
		else if(itemName == "Clear Soup") {
			price = 80.0;
			return price;
		}
		else if(itemName == "Corn Soup") {
			price = 85.0;
			return price;
		}
		else if(itemName == "Hot and Sour Soup") {
			price = 100.0;
			return price;
		}
		else if(itemName == "Sweet Corn Chicken Soup") {
			price = 110.0;
			return price;
		}
		else if(itemName == "Chicken Wings") {
			price = 170.0;
			return price;
		}
		else if(itemName == "Honey Chicken") {
			price = 180.0;
			return price;
		}
		else if(itemName == "Lemon Chicken") {
			price = 175.0;
			return price;
		}
		else if(itemName == "Garlic Chicken") {
			price = 185.0;
			return price;
		}
		else if(itemName == "Black Pepper Chicken") {
			price = 190.0;
			return price;
		}
		else if(itemName == "Kung Pao Chicken") {
			price = 200.0;
			return price;
		}
		else if(itemName == "Veg Spring Roll") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Chicken Spring Roll") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Crispy Corn") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Cheese Corn Balls") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Paneer Pakoda") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Aloo Tikki") {
			price = 100.0;
			return price;
		}
		else if(itemName == "Dahi Puri") {
			price = 90.0;
			return price;
		}
		else if(itemName == "Sev Puri") {
			price = 85.0;
			return price;
		}
		else if(itemName == "Pani Puri") {
			price = 80.0;
			return price;
		}
		else if(itemName == "Bhel Puri") {
			price = 75.0;
			return price;
		}
		else if(itemName == "Masala Corn") {
			price = 90.0;
			return price;
		}
		else if(itemName == "Butter Corn") {
			price = 95.0;
			return price;
		}
		else if(itemName == "Veg Hot Dog") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Chicken Hot Dog") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Loaded Nachos") {
			price = 160.0;
			return price;
		}
		else if(itemName == "Cheese Nachos") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Veg Queso Dip") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Chicken Queso Dip") {
			price = 160.0;
			return price;
		}
		else if(itemName == "BBQ Chicken Pizza") {
			price = 250.0;
			return price;
		}
		else if(itemName == "Farmhouse Pizza") {
			price = 230.0;
			return price;
		}
		else if(itemName == "Mexican Pizza") {
			price = 240.0;
			return price;
		}
		else if(itemName == "Cheese Burst Pizza") {
			price = 260.0;
			return price;
		}
		else if(itemName == "Veggie Delight Pizza") {
			price = 220.0;
			return price;
		}
		else if(itemName == "Chicken Sausage Pizza") {
			price = 250.0;
			return price;
		}
		else if(itemName == "Peri Peri Fries") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Cajun Fries") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Curly Fries") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Potato Wedges") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Cheese Wedges") {
			price = 150.0;
			return price;
		}
		else if(itemName == "Choco Lava Cake") {
			price = 110.0;
			return price;
		}
		else if(itemName == "Red Velvet Cake") {
			price = 140.0;
			return price;
		}
		else if(itemName == "Black Forest Cake") {
			price = 130.0;
			return price;
		}
		else if(itemName == "White Forest Cake") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Strawberry Cake") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Vanilla Cupcake") {
			price = 80.0;
			return price;
		}
		else if(itemName == "Chocolate Cupcake") {
			price = 90.0;
			return price;
		}
		else if(itemName == "Butterscotch Cake") {
			price = 130.0;
			return price;
		}
		else if(itemName == "Mango Mousse") {
			price = 120.0;
			return price;
		}
		else if(itemName == "Chocolate Truffle") {
			price = 150.0;
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

			if(itemName == "Buddha Bowl") {
				price = 180.0;
				return price * quantity;
			}
			else if(itemName == "Kale Salad") {
				price = 140.0;
				return price * quantity;
			}
			else if(itemName == "Tofu Stir Fry") {
				price = 170.0;
				return price * quantity;
			}
			else if(itemName == "Veg Sushi Roll") {
				price = 160.0;
				return price * quantity;
			}
			else if(itemName == "Chicken Sushi Roll") {
				price = 190.0;
				return price * quantity;
			}
			else if(itemName == "Dragon Roll") {
				price = 220.0;
				return price * quantity;
			}
			else if(itemName == "Rainbow Roll") {
				price = 230.0;
				return price * quantity;
			}
			else if(itemName == "Teriyaki Chicken") {
				price = 200.0;
				return price * quantity;
			}
			else if(itemName == "Teriyaki Tofu") {
				price = 180.0;
				return price * quantity;
			}
			else if(itemName == "Miso Soup") {
				price = 90.0;
				return price * quantity;
			}
			else if(itemName == "Clear Soup") {
				price = 80.0;
				return price * quantity;
			}
			else if(itemName == "Corn Soup") {
				price = 85.0;
				return price * quantity;
			}
			else if(itemName == "Hot and Sour Soup") {
				price = 100.0;
				return price * quantity;
			}
			else if(itemName == "Sweet Corn Chicken Soup") {
				price = 110.0;
				return price * quantity;
			}
			else if(itemName == "Chicken Wings") {
				price = 170.0;
				return price * quantity;
			}
			else if(itemName == "Honey Chicken") {
				price = 180.0;
				return price * quantity;
			}
			else if(itemName == "Lemon Chicken") {
				price = 175.0;
				return price * quantity;
			}
			else if(itemName == "Garlic Chicken") {
				price = 185.0;
				return price * quantity;
			}
			else if(itemName == "Black Pepper Chicken") {
				price = 190.0;
				return price * quantity;
			}
			else if(itemName == "Kung Pao Chicken") {
				price = 200.0;
				return price * quantity;
			}
			else if(itemName == "Veg Spring Roll") {
				price = 120.0;
				return price * quantity;
			}
			else if(itemName == "Chicken Spring Roll") {
				price = 140.0;
				return price * quantity;
			}
			else if(itemName == "Crispy Corn") {
				price = 130.0;
				return price * quantity;
			}
			else if(itemName == "Cheese Corn Balls") {
				price = 150.0;
				return price * quantity;
			}
			else if(itemName == "Paneer Pakoda") {
				price = 140.0;
				return price * quantity;
			}
			else if(itemName == "Aloo Tikki") {
				price = 100.0;
				return price * quantity;
			}
			else if(itemName == "Dahi Puri") {
				price = 90.0;
				return price * quantity;
			}
			else if(itemName == "Sev Puri") {
				price = 85.0;
				return price * quantity;
			}
			else if(itemName == "Pani Puri") {
				price = 80.0;
				return price * quantity;
			}
			else if(itemName == "Bhel Puri") {
				price = 75.0;
				return price * quantity;
			}
			else if(itemName == "Masala Corn") {
				price = 90.0;
				return price * quantity;
			}
			else if(itemName == "Butter Corn") {
				price = 95.0;
				return price * quantity;
			}
			else if(itemName == "Veg Hot Dog") {
				price = 120.0;
				return price * quantity;
			}
			else if(itemName == "Chicken Hot Dog") {
				price = 150.0;
				return price * quantity;
			}
			else if(itemName == "Loaded Nachos") {
				price = 160.0;
				return price * quantity;
			}
			else if(itemName == "Cheese Nachos") {
				price = 140.0;
				return price * quantity;
			}
			else if(itemName == "Veg Queso Dip") {
				price = 130.0;
				return price * quantity;
			}
			else if(itemName == "Chicken Queso Dip") {
				price = 160.0;
				return price * quantity;
			}
			else if(itemName == "BBQ Chicken Pizza") {
				price = 250.0;
				return price * quantity;
			}
			else if(itemName == "Farmhouse Pizza") {
				price = 230.0;
				return price * quantity;
			}
			else if(itemName == "Mexican Pizza") {
				price = 240.0;
				return price * quantity;
			}
			else if(itemName == "Cheese Burst Pizza") {
				price = 260.0;
				return price * quantity;
			}
			else if(itemName == "Veggie Delight Pizza") {
				price = 220.0;
				return price * quantity;
			}
			else if(itemName == "Chicken Sausage Pizza") {
				price = 250.0;
				return price * quantity;
			}
			else if(itemName == "Peri Peri Fries") {
				price = 120.0;
				return price * quantity;
			}
			else if(itemName == "Cajun Fries") {
				price = 130.0;
				return price * quantity;
			}
			else if(itemName == "Curly Fries") {
				price = 140.0;
				return price * quantity;
			}
			else if(itemName == "Potato Wedges") {
				price = 120.0;
				return price * quantity;
			}
			else if(itemName == "Cheese Wedges") {
				price = 150.0;
				return price * quantity;
			}
			else if(itemName == "Choco Lava Cake") {
				price = 110.0;
				return price * quantity;
			}
			else if(itemName == "Red Velvet Cake") {
				price = 140.0;
				return price * quantity;
			}
			else if(itemName == "Black Forest Cake") {
				price = 130.0;
				return price * quantity;
			}
			else if(itemName == "White Forest Cake") {
				price = 130.0;
				return price * quantity;
			}
			else if(itemName == "Strawberry Cake") {
				price = 120.0;
				return price * quantity;
			}
			else if(itemName == "Vanilla Cupcake") {
				price = 80.0;
				return price * quantity;
			}
			else if(itemName == "Chocolate Cupcake") {
				price = 90.0;
				return price * quantity;
			}
			else if(itemName == "Butterscotch Cake") {
				price = 130.0;
				return price * quantity;
			}
			else if(itemName == "Mango Mousse") {
				price = 120.0;
				return price * quantity;
			}
			else if(itemName == "Chocolate Truffle") {
				price = 150.0;
				return price * quantity;
			}
			else {
				System.out.println("Item not found");
				return price * quantity;
			}
		}
}