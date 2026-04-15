class JioHotstar
{	
	static String kannadamovies[]={"Mark","Su From So","Kirik Party","Naduve Antaravirali","Bhikshuka 2","Bell Bottom","777 Charlie","Parmathma","Tootu Madike","Neer Dose","Chamak","Galipata","Harikathe alla Girikathe","Dasavathaara","Petromax","Badava Rascal","Pogaru","Ayogya","Mungaru Male","Kranthiveera Sangoli","Jeevana Chitra","Aajay","1st Rank raju","Aakash","Just Math Mathalli","Manikya","Drushya","Kavacha","Buddivanta","Arashaka"};
	static	String hindimovies[]={"12th Fail","Shidaat","Hungama 2","Housefull4","Sarazameen","Robinhood","OMG 2","Super 30","Brahmastra","Laxmii","Aavesham","Bhediya","MS Dhoni","MaNan","Kabir Singh","Border","Cihichhore","Judwaa","Mujse Shaadi Karogi","Dabangg","Baghban","Andaz","Kagin Pyaar Na Ho Jaaye","Dulhan Hum Le Jayenge","Baabul","Partner","Ready","Ved","Dabangg 2","Tubelight"};
	static String tamilmovies[]={"Sweetheart","Shakthi Thirumagan","DNA","LOKAH","Vada Chennai","Aranmanai","Tourist Family","Siren108","Joe","Lubber Pabdhu","Vaazhai","Saba Nayagan","Lover","Paranthu Po","Premalu","Thuppakki","Baahubali 2:The conclusion","Kalvan","Mirai","Prince","Hridayapoorvam","Anbarivu","Lift","Geetha Govindam","Pichaikaran 2","MGR Magan","Kaithi","Boo","Nanban","Vikram"};
	static String telgumovies[]={"Romancham","Empuraan","King of Kotha","Baahubali - The Begginning","Baak","Bheemla Nayak","Liger-Sala Crossbreed","Seetimaarr","The Warriorr","Atharintiki Daaredi","Akhanda","Khiladi","Butterfly","S/o Satyamurthy","Dookudu","Raja Gari Gadhi 3","Mirchi","Naa Saami Ranga","Baapu -A Fathers Story","Sundarakanda","Bhadrakaali","Skanda","IB7I","Kill","Abhutham","Bhimaa","Verra Simha Reddy","Anand","Repeat","Bichagadu 2"};
	static String malyalammovies[]={"Neru","Avihitham","Padakkalam","Hridayapoorvam","Kishkindha Kaandam","Hridayam","Vaazha","Ronth","Romancham","Thudarum","Jaya jaya jaya jaya hey","Ponman","Premam","Falimy","Sookshmadarshini","Premalu","Kannur Squad","Abraham Ozler","Banglore Days","Bheeshma Parvam","Heaven","Nehru","Bro Daddy","Arm","Kammattipaadam","Ennu Ninte Moideen","Malikappuram","Monster","Rorschach","Manjummel Boys"};
	static String englishmovies[]={"Anora","Sinners","Rubaru Roshni","The Black Phone 2","Boston Strangler","No One Will Save You ","The Fantastic Four: First Steps","Superman: Legacy","Moana 2","The Wasp","Nomadland","Home Alone","Captain America: The First Avenger","Edward Scissorhands","Life of Pi","Doctor Strange in the Multiverse of Madness","Avengers: Endgame","Titanic","The Jungle Book","Maleficent","Interstellar","Fight Club","Dead Poets Society","The Finest Hours","Ready or Not","Bad Education","Independence Day","Signs","Pretty Woman","Black Panther"};
		
	public static void main(String[] args)
	{
		getKannadaMovies();
		getHindiMovies();
		getTamilMovies();
		getTelguMovies();
		getMalyalamMovies();
		getEnglishMovies();
	}
	static void getKannadaMovies()
	{
		System.out.println("Kannada Movies are:\n");
		for(String s:kannadamovies)
			System.out.println(s);
	}
	static void getHindiMovies()
	{
		System.out.println("Hindi Movies are:\n");
		for(String s:hindimovies)
			System.out.println(s);
	}
	static void getTamilMovies()
	{
		System.out.println("Tamil Movies are:\n");
		for(String s:tamilmovies)
			System.out.println(s);
	}
	static void getTelguMovies()
	{
		System.out.println("Telgu Movies are:\n");
		for(String s:telgumovies)
			System.out.println(s);
	}
	static void getMalyalamMovies()
	{
		System.out.println("Malyalam Movies are:\n");
		for(String s:malyalammovies)
			System.out.println(s);
	}
	static void getEnglishMovies()
	{
		System.out.println("English Movies are:\n");
		for(String s:englishmovies)
			System.out.println(s);
	}
}	
		