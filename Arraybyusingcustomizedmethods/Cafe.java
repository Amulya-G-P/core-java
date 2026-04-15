class Cafe
{
	public static void main(String[] cafe)
	{
		//datatype refName=ref;
		//local variable
		String cafeName="Cringe Cafe";
		String teaNames[]={"Amrut Chai", "Elachi Chai","Ginger Chai","Green Chai","Masala Chai","Lemon Chai"};
		String coffeeNames[]={"Espresso","Americano","Latte","Cappuccino","Mocha","Flat White","Macchiato","Cartado","Red Eyes","Long Black","Lungo","Filter Coffee","Cold Brew","Doppio","Affogato","Irish","Cold Coffee"};
		String  snacks[]={"Cake","Desserts","Croissants","Sandwiches","toasties","Cookies","Pastries","Garlic Bread","Burger","Pizza","Tacos","Samosa","Pakoras","Kachori","Dhokla","Banana Chips"};
		System.out.println("The Cafe Name is " + cafeName);
		System.out.println("List of Different Tea Names are:");
		getTeanames()
		// System.out.println("No of tea  added are : "+teaNames.length);
		// System.out.println(teaNames[0]+ "\n "+
							// teaNames[1]+ "\n "+
							// teaNames[2]+"\n "+
							// teaNames[3]+" \n" +
							// teaNames[4]+ "\n"+
							// teaNames[5]+"\n");
		System.out.println("List of Different Coffee Names are:");
		int nooOfcoffenames=coffeeNames.length;
		System.out.println("The number of coffeeNames :" + nooOfcoffenames);
		System.out.println(coffeeNames[0]+ "\n "+
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
		System.out.println("List of Different Snacks Names are:");
		byte nooOfsnakcsnames=(byte)snacks.length;
		System.out.println("The number of Snacks :" + nooOfsnakcsnames);
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
							snacks[15]+"\n");
		String amrut=teaNames[0];
		System.out.println(amrut);
		String elachi=teaNames[1];
		System.out.println(elachi);
		String ginger=teaNames[2];
		System.out.println(ginger);
		String green=teaNames[3];
		System.out.println(green);
		String masala=teaNames[4];
		System.out.println(masala);
		String lemon=teaNames[5];
		System.out.println(lemon);

		
		// for( String teaName :teaNames )
		// {
			// System.out.println(teaName);
		// }
		// for( String coffeeName :coffeeNames )
		// {
			// System.out.println(coffeeName);
		// }	
		// for( String snackName :snackNames )
		// {
			// System.out.println(snackName);
		// }
		static void getTeanames(){
		for(String property:teaNames)
			System.out.println(property);
	}
		
		
	}
}