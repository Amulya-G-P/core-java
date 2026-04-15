class Netflix
{
	static String kannadamovies[]={"Baghera","U-Turn","Govinda Govinda","Ayana","Mundina Nildana","Ondu Motteya Kathe","Thithi","Nathicharami","Minchu Murali","Annaatthe","","","","","","","","","","","","","","","","","","","",""};
	static String hindimovies[]={"Dhoom Dhaam","Vijay 69","Sector 36","Chor Nikal Ke Bhaga","haq","De De Pyaar De 2","Tere Ishk Mein","Mardaani ","Mardaani 2","Jolly LLB 3","Jogi","Barfi","Haseen Dillruba","Chopsticks","Raja Hindustani","Mohabbatein","Ajab Prem Ki Ghazab Kahani","Hum Dil De Chuke Sanam","Love Aaj Kal","Dhurandhar","Mission Majnu","Kohrra","Single Salma","Raat Akeli Hai – The Bansal Murders","Sunny Sanskari Ki Tulsi Kumari","Dhoom3","Tiger Zinda Hai","war","Bade Miyan Chote Miyan","Yeh Jawaani Hai Deewani"};
	static String tamilmovies[]={"Maharaja","Leo","Don","Doctor","Thunivu","Amaran","Love Today","Mandela","Kannum Kannum Kollaiyadithaal","Super Deluxe","Magamuni","Andhaghaaram","Oho Enthan Baby","Paava Kadhaigal","Revolver Rita","Good Bad Ugly","Thug life","Retro","VidaaMuyarchi","Kaantha","Bison","Dragon","Perusu","Untitled Pradeep Ranganathan Film","Kara","Suriya 46","Jigarthanda DoubleX","Visaranai","Sorgavasal","G.O.A.T"};
	static String telgumovies[]={"Major","Pitta Kathalu","Bhaje Vaayu Vegam","Gangs of Godavari","Anukokunda Oka Roju","Oh! Baby","Paragu","Seethamma Vakitlo Sirimalle Chettu","Bro","Sindhooram","Daaku","Virata Parvam","Dasara","Uma Maheswara Ugra Roopasya","Lucky Bhaska","Court: State vs A Nobody","Bhola Shankar","God Father","Khushi","Waltair Veerayya","Puspha","Saripodhaa Sanivaaram","Hit 3","Devara","Hi Nanna","RRR ","Salaar: Part 1 – Ceasefire","Guntur Kaaram","Cinema Bandi","Krishna and His Leela"};
	static String malyalammovies[]={"Minnal Murali","Irul","Kappela","Maniyarayile Ashokan","Jana Gana Mana","Nanpakal Nerathu Mayakkam","Thallumaala","Uyare","Nayattu","Virus","Thondimuthalum Driksakshiyum","Joji","Angamaly Diaries","Iratta","Rekha","Kumari","Ayalvaashi","Aarkkariyam","Aanum Pennum","Anjaam Pathiraa","Aravindante Athidhikal","Dear Friend","Ee.Ma.Yau","Forensic","Ezra","Halal Love Story","Luca","Hridayam","Maheshinte Prathikaaram","Meppadiyan"};
	static String englishmovies[]={"The Gray Man","Extraction","Red Notice","Army of the Dead","The Old Guard","Triple Frontier","6 Underground","Black Adam","The Night Comes for Us","Kate","Spider-Man: Into the Spider-Verse","Bright","project Power","The Adam Project","Enola Holmes 1 & 2","Gerald’s Game","Bird Box","Hush","The Platform","Cam","Fractured","I Am Mother","The Devil All the Time","Oxygen","Hypnotic","Roma","Murder Mystery 1 & 2","The Love Birds","Yes Day","Dolemite Is My Name"};
		
	public static void main(String[] prime)
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
		