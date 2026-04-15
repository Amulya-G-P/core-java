class Cafe
{
	public static void main(String[] cafe)
	{

		System.out.println("List of Different Tea Names are:");
		// String cafeName="Cringe Cafe";
		// String amrutchai="Amrut Chai";
		// String elachichai="Elachi Chai";
		// String gingerchai="Ginger Chai";
		// String greenchai="Green Chai";
		// String masalachai="Masala Chai";
		// String lemonchai="lemonchai";
		//String properties[]={amrutchai,elachichai,gingerchai,greenchai,masalachai,lemonchai};
		
		
		String teaNames[]={"Amrut Chai", "Elachi Chai","Ginger Chai","Green Chai","Masala Chai","Lemon Chai"};
		//String coffeeNames[]={"Espresso","Americano","Latte","Cappuccino","Mocha","Flat White","Macchiato","Cartado","Red Eyes","Long Black","Lungo","Filter Coffee","Cold Brew","Doppio","Irish","Cold Coffee"};
		//String  snacks[]={"Cake","Desserts","Croissants","Sandwiches","toasties","Cookies","Pastries","Garlic Bread","Burger","Pizza","Tacos","Samosa","Pakoras","Kachori","Dhokla","Banana Chips"};
		getTeanames()
		System.out.println("List of Different Coffee Names are:");
		//System.out.println(coffeeNames[0]+ "\n "+
		String espresso="Espresso";
		String americano="Americano";
		String  latte="Latte";
		String cappuccino="Cappuccino";
		String mocha="Mocha";
		String flatwhite="Flat White";
		String machhito="Macchiato";
		String cartado="Cartado";
		String redeyes="Red Eyes";
		String longblack="Long Black";
		String lungo="Lungo";
		String filttercoffee="Filter Coffee";
		String coldbrew="Cold Brew";
		String doppio="Doppio";
		String irish="Irish";
		String coldcoffee="Cold Coffee";
		String methods[]={espresso,americano,latte,cappuccino,mocha,flatwhite,machhito,cartado,redeyes,longblack,lungo,filttercoffee,coldbrew,doppio,irish,coldcoffee};
		for(String method:methods)
			System.out.println(method);
		System.out.println("List of Different Snacks Names are:");
		String cake="Cake";
		String desserts="Desserts";
		String croissants="Croissants";
		String sandwiches="Sandwiches";
		String toast="toasties";
		String cookie="Cookies";
		String pastry="Pastries";
		String garlic="Garlic Bread";
		String burger="Burger";
		String pizza="Pizza";
		String tacos="Tacos";
		String samosa="Samosa";
		String pakoras="Pakoras";
		String kachori="Kachori";
		String dhokla="Dhokla";
		String bannanachips="Banana Chips";
		String groups[]={cake,desserts,croissants,sandwiches,toast,cookie,pastry,garlic,burger,pizza,tacos,samosa,pakoras,kachori,dhokla,bannanachips};
		for(String group:groups)
		System.out.println(group);
		/*
		System.out.println(teaNames[0]+ "\n "+
							teaNames[1]+ "\n "+
							teaNames[2]+"\n "+
							teaNames[3]+" \n" +
							teaNames[4]+ "\n"+
							teaNames[5]+"\n");
		
		coffeeNames[1]+"\n "+
		coffeeNames[2]+ "\n "+
		coffeeNames[3]+ "\n " +
		coffeeNames[4]+"\n "+
		coffeeNames[5]+ " \n" +
		coffeeNames[6]+"\n "+ 
		coffeeNames[7]+ "\n " +
		coffeeNames[8]+" " +
		coffeeNames[9]+ "\n" +
		coffeeNames[10]+ " \n" + 
		coffeeNames[11] + "\n "+
		coffeeNames[12]+ "\n " +
		coffeeNames[13]+ "\n "+
		coffeeNames[14] +"\n " +
		coffeeNames[15]+ "\n " +
		coffeeNames[16]+"\n");
		
		System.out.println(snacks[0]+"\n"+
							snacks[1]+"\n"+
							snacks[2]+"\n"+
							snacks[3]+"\n"+
							snacks[4]+"\n"+
							snacks[5]+"\n"+
							snacks[6]+"\n"+
							snacks[7]+"\n"+
							snacks[8]+"\n"+
							snacks[9]+"\n"+
							snacks[10]+"\n"+
							snacks[11]+"\n"+
							snacks[12]+"\n"+
							snacks[13]+"\n"+
							snacks[14]+"\n"+
							snacks[15]+"\n");*/
		
	}
	static void getTeanames(){
	for(String property:teaNames)
			System.out.println(property);
	}
}