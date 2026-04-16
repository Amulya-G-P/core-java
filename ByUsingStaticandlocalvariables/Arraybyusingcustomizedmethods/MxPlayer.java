class MxPlayer
{
	static String kannadamovies[]={"J.S.K – Janaki v/s State of Kerala","Vritta","Kishkindhapuri","Lights, Camera, Achhan","Sumathi Valavu","Date with Saie","Green","Kona","Radheyaa","Usiru","Naanu Matthu Gunda 2","Ondu Sarala Prema Kathe","Girgitle","Dhruva IPS","Cinemadhavanu","Clue","Parasurama","Inspector Vikram","Kathopanishad","Anagha","Krishna Talkies","Babu Marley","Lucia","Agent Sai Srinivasa Athreya","Ulidavaru Kandanthe","Bettada Hoovu","Jatta","Shhh!","Tarka","Kirik Party"};
	static String hindimovies[]={"Pushpak","Jersy","96","Aruvi","Mike","Kaithi","Ijaazat","Temper","Agent Sai Srinivasa Athreya","Jaane Bhi Do Yaaro","Premam","Rehnaa Hai Terre Dil Mein","Evil Hunter","Haiwaan","Six","Shaheed E Azam","Freeky Night","Tumhare Hum Kaun Hai: A Love Arranged Story","Wish List","Balli Vs Birju","Yamla Pagla Deewana","Mangal Pandey: The Rising","Fool N Final","Luck","Bhagam Bhag","Sardaarji","Once Upon A Time In Mumbai","Kis Kisko Pyaar Karoon","Entertainment","Sweetie Weds NRI"};
	static String tamilmovies[]={"Pushpa: The Rise","Vada Chennai","Irumbu Thirai ","Namma Veettu Pillai","Ratsasan","Mankatha","Anniyan","Chandramukhi","Singam","Yaaradi Nee Mohini","Soodhu Kavvum","Kennedy Club","Ayan","Thambi","Dagaalty","Adutha Saattai","Balloon","Danny","Trip","Rajavamsam","Aaranya Kaandam","Thulladha Manamum Thullum","Baasha","Papanasam","Thani Oruvan","Chithiram Pesuthadi","Pudhupettai","Deiva Thirumagal","Jigarthanda","Vikram Vedha"};
	static String telgumovies[]={"C/o Kancharapalem","1 Nenokkadine","Arya","Eega","Magadheera","Run Raja Run","Gayatri","Brochevarevarura","Goodachari","Appatlo Okadundevadu","Needhi Naadi Oke Katha","PSV Garuda Vega","Nenu","Bindass","Express Raja","Pelli Choopulu","Manam","Kshanam","Businessman","Gopala Gopala","Dil","Oopiri / Tho Oopiri","Daan Veer","Ela Cheppanu","Krishnam Vande Jagadgurum","Main Hoon Rakshak","Simhadri","Chatrapathi","Racha","Silly Fellows"};
	static String malyalammovies[]={"Anjaam Pathiraa","Kodathi Samaksham Balan Vakkeel","Vellam","O.P.160/18 Kakshi: Amminippilla","28","Aakashaganga 2","Lift 8055","Pratheekaaram","Jan-e-Man","Vellam","O Ninnal Aran","Alt Ctrl Del","Vrithakrithyilulla Chathuram: A Minor Inconvenience","7.9 Gold Coins Comedy","Munnariyippu","Padmavyuhathile Abhimanyu","Vadakkunokkiyantram","Pranchiyettan And The Saint","Pennum Porattum","Pennu Case","Marconi Mathai","Uriyadi ","Adhyarathri","Pattabhiraman","Sathyam Paranja Viswasikuvvo?","I Am Kathalan","Anomie","Chatha Pacha: The Ring of Rowdies","Pennum Porattum","Bhoomiyile Manohara Swakaryam"};
	static String englishmovies[]={"DEVINENI","Drive","Stranger","Blue Eyes","The Hunger Games: Catching Fire ","Friends","Little women","A-X-L","Ethan","The White Orchid","Toxic Shark","Book of love","Trax: The Snow Bike Revolution","dragon warriors","Rowdy","Vikram Vedha","Tiger","Stranded","5.3 A-X-L","Send Help","Eternity","Avatar 3: Fire and Ash","Untitled Breaking Bad Film","Now You See Me: Now You Don’t","Strange","Predator: Badlands","Before the mask","The Black Phone 2","TRON: Ares","The Wolf of Wall Street"};
		
	public static void main(String[] player)
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
		