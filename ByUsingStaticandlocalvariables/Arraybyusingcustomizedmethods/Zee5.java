class Zee5
{
	static String kannadamovies[]={"Har Har Mahadev ","Vikrant Rona","RRR","Kaaneyadavara Bagge Prakatane","Garuda Gamana Vrishabha Vahana","Drishya 2","Arjun Gowda","Nodi Swamy Ivanu Irode Heege","Ek Love ya","Bhajarangi 2","Valimai","Mufti","Shivaji Surathkal","Mugilpete","Rider ","100","Hebbuli","Popcorn Monkey Tiger","Taledanda ","Sumathi Valavu","Ondu Sarala Prema Kathe","Window seat","Ninnila Ninnila","Kanguva","Udgharsha","Kannappa","Patre Loves Padma","Sarvam Maya","Ramarjuna","Naanu Matthu Gunda 2"};
	static String hindimovies[]={"Kyaa Kool Hain Hum 3","Commando ","Commando 2","Line of Descent","Jayantabhai Ki Luv Story","Banjo","Setters","Gangs Of Madras","Blank","Toilet: Ek Prem Katha","Hum Chaar","Iqbal","Kaashi in Search of Ganga","The Xpose","Hotel Milan","Hacked","Rustom","Nil Battey Sannata","Haseena Parkar","Shubh Mangal Saavdhan","Mitron","Simmba","Radhe","Uri","Do Lafzon Ki Kahani","Badnaam Gali","Khaali Peeli","Bareilly Ki Barfi","Shaadi Mein Zaroor Aana","Kaagaz"};
	static String tamilmovies[]={"Coffee with Kadhal","Kaari","Yaanai","Veetla Vishesham","Veeramae Vaagai Soodum","Captain","Aranmanai 3","My Dear Bootham","Mudhal Nee Mudivum Nee","Kamali From Nadukkaveri","Velan","Vinodhaya Sitham","Anandham Vilayadum Veedu","Kallan","Vikram Vedha","Enna Solla Pogirai","Oh My Kadavule","Sirai","Parasakthi","Mask","Middle class","Murugesan +2","Kudumbasthan","Brother","Raghu Thatha","Kingston","Demonte Colony 2","Kolamavu Kokila","Sethupathi","Nenjam Marappathillai"};
	static String telgumovies[]={"Sirai","Gurram Paapi Reddy","Date with saie","Bha. Bha. Ba","Sisu: Road to Revenge","Vikkatakavi","The Great Pre-Wedding Show","Rangbaaz: The Bihar Chapter","Bhagwat Chapter One – Raakshas","The Pet Detective","Sumathi Valavu","House Mates","Devil’s Double Next Level","Until Dawn","Demonte Colony 2","32 Malasana Street","Cheekati","Kanchana 3","Bhairavam","Meka Suri","Meka Suri 2","Battala Ramaswamy Biopikku","Dhrusti","Ala","Abadham Venuka","Oh My Friend","Tulasi Dalam","Rowdy Inspector","Anaganaga O Dheerudu","Bheemili Kabaddi Jattu"};
	static String malyalammovies[]={"And The Oscar Goes To","Moothon","Operation Java","Thattumpurath Achuthan","Krishnankutty Pani Thudangi","Pranaya Vilasam","My Santa","Adi","Keedam","Aaha","Mei Hoom Moosa","Prakashan Parakkatte","Kaari","Ente Peru Surya Ente Veedu India","Minnaminungu","Neeli","Kalam","Karam","Feminichi Fathima","Dies Irae","Shades of Life","Kishkindhapuri","Sumathi Valavu","Gurram Paapi Reddy","45","My Name is Azhakan","Ini Utharam","Paappan","Pakalum Paathiravum","Super Sharanya"};
	static String englishmovies[]={"Mission: Impossible – Fallout","Mission: Impossible – Dead Reckoning","Fast X / F9","Fast & Furious Presents: Hobbs & Shaw","Transformers: Rise of the Beasts","Transformers: Dark of the Moon","Spider-Man: No Way Home","Thor: Love and Thunder / Venom: Let There Be Carnage","Border Hunters","The Running Man","Kill ’Em All 2","Five Nights at Freddy’s 2","Black Phone 2","A Quiet Place: Day One","Halloween / Halloween Kills","The Pope’s Exorcist","Insidious: The Red Door","The Forever Purge","Pet Sematary: Bloodlines","Abigail","The Italian Job","Queen & Slim","Bad Boys: Ride or Die","Nobody","Let him go","The Accidental Getaway Driver","Promising Young Woman","Anthology of Julius","Lights out","Scam"};
		
	public static void main(String[] zee)
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
		