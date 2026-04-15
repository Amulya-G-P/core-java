class SuperMarket{
	public static String[] SearchBrandByProduct(String product)
	{
	
	if(product=="biscuit"){
	String biscuitBrands[]={"Parle-G","Good Day","Happy Happy","Marie","BourBon","Oreo","Hide & Seek","Treat","Krackjack","Coconut Crunch","Wafer","Dark Fantasy","Nutri choice","Jim Jam","Butter Delight","Top","Mom's Magic","Salty","Lemon mazaa","50-50","Yummy","Fab","Cream bites","Fruit bix","Jeera","Lotus","Gobbles","Digestive","Tiger","Monaco"};
	return biscuitBrands;
	}
	
	if(product=="Shampoo"){
	String[] shampooBrands={"ClinicPlus","Sunsilk","Dove","Pantene","Tresemme",
            "Loreal","HeadShoulders","Meera","Chik","Nyle",
            "Himalaya","WOW","Mamaearth","Khadi","Biotique",
            "Vatika","Garnier","Matrix","Kerastase","Schwarzkopf",
            "Palmolive","Fiama","Ayush","Rejoice","Sebamed",
            "Arata","Indulekha","HerbalEssence","Enliven","ParkAvenue"};
	return shampooBrands;
	}
	if(product=="Soap"){
	String[] soapBrands={"Lux","Dove","Lifeboy","Pears","Dettol",
            "Santoor","Medimix","Hamam","Cinthol","MysoreSandal",
            "Fiama","GodrejNo1","Liril","Nivea","Ayush",
            "Neem","Chandrika","Palmolive","Khadi","Biotique",
            "Himalaya","ParkAvenue","Sebamed","Cetaphil","Olay",
            "IrishSpring","Dial","AloeVeda","Vivel","FreshGlow"};
	return soapBrands;
	}
	}
	public static void main(String[] as)
	{
		String[] biscuitBrands[]=SearchBrandByProduct("biscuit");
		for(String biscuitBrand : biscuitBrands)
			System.out.println(biscuitBrand);
	}
}