class Zomato
{
	public static double search(String itemName)
	{	
		double price=0.0;
		if(itemName == "Kulfi"){
			price=80.00;
			return price;
		}else if(itemName == "Waffles"){
			price=180.00;
			return price;
		}else if(itemName == "Donuts"){
			price=90.00;
			return price;
		}else if(itemName == "Cheesecake"){
			price=200.00;
			return price;
		}else if(itemName == "Ice Cream Sundae"){
			price = 180.00;
			return price;
		}else if(itemName == "Pastry"){
			price=100.00;
			return price;
		}else if(itemName == "Cake(slice)"){
			price=150.00;
			return price;
		}else if(itemName == "Brownie"){
			price=120.00;
			return price;
		}else if(itemName == "Rasgulla"){
			price=90.00;
			return price;
		}else if(itemName=="Gulab Jamun"){
			price=80.00;
			return price;
		}else if(itemName == "Paratha"){
			price=60.00;
			return price;
		}else if(itemName == "Poori Bhaji"){
			price=110.00;
			return price;
		}else if(itemName == "Appam"){
			price=120.00;
			return price;
		}else if(itemName == "Uttapam"){
			price=80.00;
			return price;
		}else if(itemName == "Pongal"){
			price=100.00;
			return price;
		}else if(itemName == "Upma"){
			price=80.00;
			return price;
		}else if(itemName=="Vada"){
			price=50.00;
			return price;
		}else if(itemName == "Idli"){
			price=60.00;
			return price;
		}else if(itemName == "Plain Dosa"){
			price=80.00;
			return price;
		}else if(itemName == "Masala Dosa"){
			price=110.00;
			return price;
		}else if(itemName == "Nachos"){
			price=180.00;
			return price;
		}else if(itemName == "Garlic Bread"){
			price=120.00;
			return price;
		}else if(itemName=="Pasta Arrabbiata"){
			price=200.00;
			return price;
		}else if(itemName == "Pasta Alfredo"){
			price=220.00;
			return price;
		}else if(itemName== "Wraps"){
			price=140.00;
			return price;
		}else if(itemName == "Sandwich Panner"){
			price=130.00;
			return price;
		}else if(itemName=="Hot Dog"){
			price=150.00;
			return price;
		}else if(itemName == "Cheese French Fries"){
			price = 100.00;
			return price;
		}else if(itemName=="Paneer Burger"){
			price=120.00;
			return price;
		}else if(itemName == "Pizza(regular)"){
			price=250.00;
			return price;
		}else if(itemName == "Sushi"){
			price=400.00;
			return price;
		}else if(itemName == "Thai Curry"){
			price=300.00;
			return price;
		}else if(itemName== "Ramen"){
			price=280.00;
			return price;
		}else if(itemName=="Momos"){
			price=120.00;
			return price;
		}else if(itemName=="Spring Rolls"){
			price=140.00;
			return price;
		}else if(itemName== "Chilli Chicken"){
			price=220.00;
			return price;
		}else if(itemName == "Veg Manchurian"){
			price=160.00;
			return price;
		}else if(itemName=="Fried Rice"){
			price=140.00;
			return price;
		}else if(itemName=="Schezwan Noodles"){
			price=170.00;
			return price;
		}else if(itemName=="Hakka Noodles"){
			price=150.00;
			return price;
		}else if(itemName=="Chicken Korma"){
			price=240.00;
			return price;
		}else if(itemName=="Mutton Rogan Josh"){
			price=320.00;
			return price;
		}else if(itemName=="Egg Curry"){
			price=140.00;
			return price;
		}else if(itemName=="Chicken Lolipop"){
			price=200.00;
			return price;
		}else if(itemName=="Tandoori Chicken"){
			price=260.00;
			return price;
		}else if(itemName=="Chicken kebab"){
			price=180.00;
			return price;
		}else if(itemName=="Prawns Masala"){
			price=320.00;
			return price;
		}else if(itemName=="Fish Fry"){
			price=250.00;
			return price;
		}else if(itemName=="Chicken Curry"){
			price=200.00;
			return price;
		}else if(itemName=="Chicken Tikka"){
			price=220.00;
			return price;
		}else if(itemName=="Butter Chicken"){
			price=240.00;
			return price;
		}else if(itemName=="Mutton Biryani"){
			price=300.00;
			return price;
		}else if(itemName=="Chicken Biryani"){
			price=250.00;
			return price;
		}else if(itemName=="Veg Biryani"){
			price=180.00;
			return price;
		}else if(itemName=="Rajma Chawal"){
			price=130.00;
			return price;
		}else if(itemName=="Chole Bhature"){
			price=120.00;
			return price;
		}else if(itemName=="Kadai Paneer"){
			price=170.00;
			return price;
		}else if(itemName=="Shahi Paneer"){
			price=190.00;
			return price;
		}else if(itemName=="Dal Makhani"){
			price=160.00;
			return price;
		}else if(itemName=="Paneer Butter Masala"){
			price=180.00;
			return price;
		}
			
		return price;
	}
	public static double search(String itemName,int quantity)
	{
		double price=0.0;
		if(itemName == "Kurkure"){
			price=18.00 * quantity;
			return price;
		}else if(itemName == "Sandwich"){
			price=50.00 * quantity;
			return price;
		}else if(itemName == "Burger"){
			price=70.00 * quantity;
			return price;
		}else if(itemName == "French fries"){
			price=80.00 * quantity;
			return price;
		}else if(itemName == "Coca Cola"){
			price = 30.00 * quantity;
			return price;
		}else if(itemName == "Apples"){
			price=120.00 * quantity;
			return price;
		}else if(itemName == "Bannanas"){
			price=50.00 * quantity;
			return price;
		}else if(itemName == "Oranges"){
			price=80.00 * quantity;
			return price;
		}else if(itemName == "Mangoes"){
			price=150 * quantity;
			return price;
		}else if(itemName=="Tomatoes"){
			price=32.00 * quantity;
			return price;
		}else if(itemName == "Potatoes"){
			price=36.00* quantity;
			return price;
		}else if(itemName == "Onions"){
			price=40.00 * quantity;
			return price;
		}else if(itemName == "Carrots"){
			price=40.00 * quantity;
			return price;
		}else if(itemName == "Spinach"){
			price=25.00 * quantity;
			return price;
		}else if(itemName == "Capsicum"){
			price=60.00 * quantity;
			return price;
		}else if(itemName == "Milk"){
			price=60.00 * quantity;
			return price;
		}else if(itemName=="Curd"){
			price=40.00 * quantity;
			return price;
		}else if(itemName == "Butter"){
			price=55 * quantity;
			return price;
		}else if(itemName == "Cheese"){
			price=120.00 * quantity;
			return price;
		}else if(itemName == "Paneer"){
			price=90.00 * quantity;
			return price;
		}else if(itemName == "Eggs"){
			price=75.00 * quantity;
			return price;
		}else if(itemName == "Bread"){
			price=40.00 * quantity;
			return price;
		}else if(itemName=="Cornflakes"){
			price=180.00 * quantity;
			return price;
		}else if(itemName == "Rice"){
			price=60.00 * quantity;
			return price;
		}else if(itemName== "Atta"){
			price=70.00 * quantity;
			return price;
		}else if(itemName == "Toor Dal"){
			price=137.00 * quantity;
			return price;
		}else if(itemName=="Moong Dal"){
			price=120.00 * quantity;
			return price;
		}else if(itemName == "Sugar"){
			price = 45.00 * quantity;
			return price;
		}else if(itemName=="Salt"){
			price=25.00 * quantity;
			return price;
		}else if(itemName == "Cooking oil"){
			price=136.00 * quantity;
			return price;
		}else if(itemName == "Dark fantasy"){
			price=30.00 * quantity;
			return price;
		}else if(itemName == "Dairy Milk"){
			price=50.00 * quantity;
			return price;
		}else if(itemName== "Chips"){
			price=20.00 * quantity;
			return price;
		}else if(itemName=="Namkeen"){
			price=60.00 * quantity;
			return price;
		}else if(itemName=="Instant noodles"){
			price=30.00 * quantity;
			return price;
		}else if(itemName== "Pasta"){
			price=80.00 * quantity;
			return price;
		}else if(itemName == "Oats"){
			price=150.00 * quantity;
			return price;
		}else if(itemName=="Tea"){
			price=120.00 * quantity;
			return price;
		}else if(itemName=="Coffee"){
			price=180.00 * quantity;
			return price;
		}else if(itemName=="Soft drinks"){
			price=40.00 * quantity;
			return price;
		}else if(itemName=="Fruit Juice"){
			price=100.00 * quantity;
			return price;
		}else if(itemName=="Energy Drink"){
			price=110.00 * quantity;
			return price;
		}else if(itemName=="Soap"){
			price=35.00 * quantity;
			return price;
		}else if(itemName=="Shampoo"){
			price=120.00 * quantity;
			return price;
		}else if(itemName=="Conditioner"){
			price=150.00 * quantity;
			return price;
		}else if(itemName=="Toothpaste"){
			price=110.00 * quantity;
			return price;
		}else if(itemName=="Toothbrush"){
			price=60.00 * quantity;
			return price;
		}else if(itemName=="Face Wash"){
			price=140.00 * quantity;
			return price;
		}else if(itemName=="Detergent powder"){
			price=150.00 * quantity;
			return price;
		}else if(itemName=="Dishwash liquid"){
			price=120.00 * quantity;
			return price;
		}else if(itemName=="Floor cleaner"){
			price=90.00 * quantity;
			return price;
		}else if(itemName=="Garbage bags"){
			price=90.00 * quantity;
			return price;
		}else if(itemName=="Tissue paper"){
			price=120.00 * quantity;
			return price;
		}else if(itemName=="Frozen peas"){
			price=120.00 * quantity;
			return price;
		}else if(itemName=="Frozen paratha"){
			price=100.00 * quantity;
			return price;
		}else if(itemName=="Ready meals"){
			price=150.00 * quantity;
			return price;
		}else if(itemName=="Pet food"){
			price=300.00 * quantity;
			return price;
		}else if(itemName=="Baby diapers"){
			price=350.00 * quantity;
			return price;
		}else if(itemName=="Sanitary pads"){
			price=120.00 * quantity;
			return price;
		}else if(itemName=="Ice cream"){
			price=200.00 * quantity;
			return price;
		}
		
		return price;
	}
		
}
