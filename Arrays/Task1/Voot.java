class Voot {
	
	static String newsClips[] = {"India Today Headlines", "NDTV News", "Times Now Live", "Republic TV Update", "Zee News Bulletin","CNN News 24x7", "ABP News Top Stories", "Mirror Now", "News18 India", "ET Now Business Update", "WION Global News", "BBC World News", "Al Jazeera Updates", "Fox News Live", "Sky News Headlines","NDTV Prime", "CNN-News18", "India TV", "Times Now Special", "Zee News Special Report", "Aaj Tak Fast News", "India Today Special", "Republic Bharat", "ABP Majha", "NewsX Update","DD News Live", "CNBC TV18", "Bloomberg QuickTake", "Lokmat News", "TV9 Bharatvarsh", "ETV News"};
	static String regionalFilms[] = {"KGF Chapter 2", "RRR", "Ponniyin Selvan", "Jersey", "Drishyam 2", "Pushpa", "Master", "Vikram", "Valimai", "Beast", "Leo", "Etharkkum Thunindhavan", "Sita Ramam",  "Salaar", "Spyder", "Vakeel Saab", "Sarkaru Vaari Paata", "Annaatthe", "Kaala",  "Theri", "Mersal", "Bigil", "Viswasam", "Thuppakki", "Vinnaithaandi Varuvaayaa", "Baahubali", "Magadheera", "Drishyam", "Uppena", "Arjun Reddy"};
	static String serials[] = {"Kumkum Bhagya", "Yeh Rishta Kya Kehlata Hai", "Anupamaa", "Taarak Mehta Ka Ooltah Chashmah","Kundali Bhagya", "Choti Sarrdaarni", "Ghum Hai Kisikey Pyaar Meiin", "Bade Achhe Lagte Hain",  "Naagin 6", "Katha Ankahee", "Pandya Store", "Saath Nibhaana Saathiya", "Kasautii Zindagii Kay", "Bhagyalaxmi", "Shubharambh", "Molkki", "Ek Nayi Pehchaan", "Imlie", "Mariam Khan", "Sasural Simar Ka","Rabb Se Hai Dua", "Dil Diyaan Gallaan", "Ziddi Dil Maane Na", "Teri Meri Ikk Jindri", "Pandya Store Special","Patiala Babes", "Ek Duje Ke Vaaste", "Udaariyaan", "Chhoti Sarrdaarni Special", "Ghum Hai Kisikey Special", "Kumkum Bhagya Twist"};
    static String talentShows[] = {"India's Got Talent", "Super Dancer", "Rising Star India", "Khatron Ke Khiladi", "India's Best Dancer", "The Great Indian Laughter Challenge", "MasterChef India", "Indian Pro Music League", "Chota Packet Bada Dhamaka", "MTV Roadies", "MTV Splitsvilla", "India's Raw Star", "Comedy Circus", "India's Next Top Model", "India's Laughter Champion", "Dance Plus", "Super Singer", "The Stage", "Rising Star Tamil", "Indian Idol Junior", "Sa Re Ga Ma Pa Li'l Champs","India's Got Talent Junior", "India's Best Dancer Season 2", "India's Next Dance Superstar", "Dance India Dance Li'l Masters", "Voice of India"};
	static String liveTV[] = {"Aaj Tak Live", "NDTV Live", "Times Now Live", "Zee News Live", "CNN-News18 Live", "Republic TV Live", "ABP News Live", "Mirror Now Live", "India Today Live", "BBC News Live","Al Jazeera Live", "Fox News Live", "Sky News Live", "DD National Live", "CNBC TV18 Live","Bloomberg Live", "ET Now Live", "TV9 Live", "NewsX Live", "Lokmat Live","India TV Live", "WION Live", "Republic Bharat Live", "ABP Majha Live", "News18 India Live","Zee Business Live", "NDTV Prime Live", "India Today Special Live", "Times Now Special Live", "Aaj Tak Special Live"};
	static String realityShows[] = {"Bigg Boss Hindi", "Bigg Boss Telugu", "Bigg Boss Tamil", "Kaun Banega Crorepati", "Fear Factor: Khatron Ke Khiladi","Dance India Dance", "MTV Roadies", "MTV Splitsvilla", "Indian Idol", "Sa Re Ga Ma Pa",  "India's Got Talent", "MasterChef India", "The Great Indian Laughter Challenge", "Super Dancer","The Voice India", "Rising Star India", "India's Best Dancer", "Comedy Nights Bachao", "India's Raw Star","India's Next Top Model", "India's Laughter Champion", "Dance Plus", "Super Singer", "The Stage","India's Got Talent Junior", "Indian Idol Junior", "India's Next Dance Superstar", "Dance India Dance Li'l Masters", "Voice of India", "India's Best Dancer Season 2"};
	
	
	public static void main(String[] args) {
		getnewsClips();
		getRegionalFlims();
		getSerials();
		getTalentShows();
		getLiveTv();
		getRealityShows();
		
		
		
		
		/*String indiaTodayHeadlines = "India Today Headlines";
        String ndtv = "NDTV News";
        String timesnow = "Times Now Live";
        String republictv = "Republic TV Update";
        String zee = "Zee News Bulletin";
        String cnn = "CNN News 24x7";
        String abp = "ABP News Top Stories";
        String mirror = "Mirror Now";
        String news18 = "News18 India";
        String etnow = "ET Now Business Update";
        String wion = "WION Global News";
        String bbc = "BBC World News";
        String aljazeera = "Al Jazeera Updates";
        String fox = "Fox News Live";
        String sky = "Sky News Headlines";
        String ndtvprime = "NDTV Prime";
        String cnn18 = "CNN-News18";
        String indiatv = "India TV";
        String timesnowspecial = "Times Now Special";
        String zeeSpecial = "Zee News Special Report";
        String aajtakfast = "Aaj Tak Fast News";
        String indiSpecial = "India Today Special";
        String republicbharat = "Republic Bharat";
        String abpmajha = "ABP Majha";
        String newsx = "NewsX Update";
        String ddnews = "DD News Live";
        String cnbc = "CNBC TV18";
        String bloomberg = "Bloomberg QuickTake";
        String lokmat = "Lokmat News";
        String tv9 = "TV9 Bharatvarsh";

        String newsClips[] = {"India Today Headlines", "NDTV News", "Times Now Live", "Republic TV Update", "Zee News Bulletin","CNN News 24x7", "ABP News Top Stories", "Mirror Now", "News18 India", "ET Now Business Update", "WION Global News", "BBC World News", "Al Jazeera Updates", "Fox News Live", "Sky News Headlines","NDTV Prime", "CNN-News18", "India TV", "Times Now Special", "Zee News Special Report", "Aaj Tak Fast News", "India Today Special", "Republic Bharat", "ABP Majha", "NewsX Update","DD News Live", "CNBC TV18", "Bloomberg QuickTake", "Lokmat News", "TV9 Bharatvarsh", "ETV News"};
        System.out.println("News Clips:");
        for (String news : newsClips) {
            System.out.println(news);
        }
		
		
		String kgf2 = "KGF Chapter 2";
        String rrr = "RRR";
        String ponniyin = "Ponniyin Selvan";
        String jersey = "Jersey";
        String drishyam2 = "Drishyam 2";
        String pushpa = "Pushpa";
        String master = "Master";
        String vikram = "Vikram";
        String valimai = "Valimai";
        String beast = "Beast";
        String leo = "Leo";
        String thunindhavan = "Etharkkum Thunindhavan";
        String sitaramam = "Sita Ramam";
        String salaar = "Salaar";
        String spyder = "Spyder";
        String vakeelsaab = "Vakeel Saab";
        String sarkaru = "Sarkaru Vaari Paata";
        String annaatthe = "Annaatthe";
        String kaala = "Kaala";
        String theri = "Theri";
        String mersal = "Mersal";
        String bigil = "Bigil";
        String viswasam = "Viswasam";
        String thuppakki = "Thuppakki";
        String vinnaithaandi = "Vinnaithaandi Varuvaayaa";
        String baahubali = "Baahubali";
        String magadheera = "Magadheera";
        String drishyam1 = "Drishyam";
        String uppena = "Uppena";
        String arjunreddy = "Arjun Reddy";

		String regionalFilms[] = {"KGF Chapter 2", "RRR", "Ponniyin Selvan", "Jersey", "Drishyam 2", "Pushpa", "Master", "Vikram", "Valimai", "Beast", "Leo", "Etharkkum Thunindhavan", "Sita Ramam",  "Salaar", "Spyder", "Vakeel Saab", "Sarkaru Vaari Paata", "Annaatthe", "Kaala",  "Theri", "Mersal", "Bigil", "Viswasam", "Thuppakki", "Vinnaithaandi Varuvaayaa", "Baahubali", "Magadheera", "Drishyam", "Uppena", "Arjun Reddy"};
        System.out.println("\nRegional Films:");
        for (String film : regionalFilms) {
            System.out.println(film);
        }
		
		
		String indianidol = "Indian Idol";
        String danceindia = "Dance India Dance";
        String saregama = "Sa Re Ga Ma Pa";
        String voiceindia = "The Voice India";
        String kumkum = "Kumkum Bhagya";
        String yehrishta = "Yeh Rishta Kya Kehlata Hai";
        String anupamaa = "Anupamaa";
        String taarak = "Taarak Mehta Ka Ooltah Chashmah";
        String kundali = "Kundali Bhagya";
        String choti = "Choti Sarrdaarni";
        String ghumhai = "Ghum Hai Kisikey Pyaar Meiin";
        String bade = "Bade Achhe Lagte Hain";
        String naagin = "Naagin 6";
        String katha = "Katha Ankahee";
        String pandya = "Pandya Store";
        String saath = "Saath Nibhaana Saathiya";
        String kasautii = "Kasautii Zindagii Kay";
        String bhagyalaxmi = "Bhagyalaxmi";
        String shubharambh = "Shubharambh";
        String molkki = "Molkki";
        String eknayi = "Ek Nayi Pehchaan";
        String imlie = "Imlie";
        String mariam = "Mariam Khan";
        String sasural = "Sasural Simar Ka";
        String rabb = "Rabb Se Hai Dua";
        String dil = "Dil Diyaan Gallaan";
        String ziddi = "Ziddi Dil Maane Na";
        String teri = "Teri Meri Ikk Jindri";
        String pandyaSpecial = "Pandya Store Special";
        String patiala = "Patiala Babes";
        String ekduje = "Ek Duje Ke Vaaste";
        String udaariyaan = "Udaariyaan";
        String chotiSpecial = "Chhoti Sarrdaarni Special";
        String ghumSpecial = "Ghum Hai Kisikey Special";

		String serials[] = {"Kumkum Bhagya", "Yeh Rishta Kya Kehlata Hai", "Anupamaa", "Taarak Mehta Ka Ooltah Chashmah","Kundali Bhagya", "Choti Sarrdaarni", "Ghum Hai Kisikey Pyaar Meiin", "Bade Achhe Lagte Hain",  "Naagin 6", "Katha Ankahee", "Pandya Store", "Saath Nibhaana Saathiya", "Kasautii Zindagii Kay", "Bhagyalaxmi", "Shubharambh", "Molkki", "Ek Nayi Pehchaan", "Imlie", "Mariam Khan", "Sasural Simar Ka","Rabb Se Hai Dua", "Dil Diyaan Gallaan", "Ziddi Dil Maane Na", "Teri Meri Ikk Jindri", "Pandya Store Special","Patiala Babes", "Ek Duje Ke Vaaste", "Udaariyaan", "Chhoti Sarrdaarni Special", "Ghum Hai Kisikey Special", "Kumkum Bhagya Twist"};
        System.out.println("\nSerials:");
        for (String serial : serials) {
            System.out.println(serial);
        }
		
        String gotTalent = "India's Got Talent";
        String superdancer = "Super Dancer";
        String risingstar = "Rising Star India";
        String khatron = "Khatron Ke Khiladi";
        String bestdancer = "India's Best Dancer";
        String laughterchallenge = "The Great Indian Laughter Challenge";
        String masterchef = "MasterChef India";
        String promusic = "Indian Pro Music League";
        String chotapacket = "Chota Packet Bada Dhamaka";
        String mtvroadies = "MTV Roadies";
        String mtvsplits = "MTV Splitsvilla";
        String rawstar = "India's Raw Star";
        String comedycircus = "Comedy Circus";
        String nextmodel = "India's Next Top Model";
        String laughterchamp = "India's Laughter Champion";
        String danceplus = "Dance Plus";
        String supersinger = "Super Singer";
        String thestage = "The Stage";
        String risingtamil = "Rising Star Tamil";
        String indianidoljunior = "Indian Idol Junior";
        String saregamalil = "Sa Re Ga Ma Pa Li'l Champs";
        String gottalentjunior = "India's Got Talent Junior";
        String bestdancer2 = "India's Best Dancer Season 2";
        String nextdance = "India's Next Dance Superstar";
        String danceLilMasters = "Dance India Dance Li'l Masters";
        String voiceofindia = "Voice of India";

		String talentShows[] = {"India's Got Talent", "Super Dancer", "Rising Star India", "Khatron Ke Khiladi", "India's Best Dancer", "The Great Indian Laughter Challenge", "MasterChef India", "Indian Pro Music League", "Chota Packet Bada Dhamaka", "MTV Roadies", "MTV Splitsvilla", "India's Raw Star", "Comedy Circus", "India's Next Top Model", "India's Laughter Champion", "Dance Plus", "Super Singer", "The Stage", "Rising Star Tamil", "Indian Idol Junior", "Sa Re Ga Ma Pa Li'l Champs","India's Got Talent Junior", "India's Best Dancer Season 2", "India's Next Dance Superstar", "Dance India Dance Li'l Masters", "Voice of India"};
        System.out.println("\nTalent Shows:");
        for (String show : talentShows) {
            System.out.println(show);
        }
		
		
		
		String aajtaklive = "Aaj Tak Live";
        String ndtvlive = "NDTV Live";
        String timesnowlive = "Times Now Live";
        String zeeLive = "Zee News Live";
        String cnnlive = "CNN-News18 Live";
        String republicLive = "Republic TV Live";
        String abplive = "ABP News Live";
        String mirrorlive = "Mirror Now Live";
        String indiatvlive = "India Today Live";
        String bbclive = "BBC News Live";
        String aljazeeralive = "Al Jazeera Live";
        String foxlive = "Fox News Live";
        String skylive = "Sky News Live";
        String ddnational = "DD National Live";
        String cnbclive = "CNBC TV18 Live";
        String bloomberglive = "Bloomberg Live";
        String etnowlive = "ET Now Live";
        String tv9live = "TV9 Live";
        String newsxlive = "NewsX Live";
        String lokmatlive = "Lokmat Live";
        String indiatvlive2 = "India TV Live";
        String wionlive = "WION Live";
        String republicbharatlive = "Republic Bharat Live";
        String abpmajhalive = "ABP Majha Live";
        String news18live = "News18 India Live";
        String zeebusiness = "Zee Business Live";
        String ndtvprimelive = "NDTV Prime Live";
        String indiSpecialLive = "India Today Special Live";
        String timesnowspeciallive = "Times Now Special Live";
        String aajtakspecial = "Aaj Tak Special Live";
		
		String liveTV[] = {"Aaj Tak Live", "NDTV Live", "Times Now Live", "Zee News Live", "CNN-News18 Live", "Republic TV Live", "ABP News Live", "Mirror Now Live", "India Today Live", "BBC News Live","Al Jazeera Live", "Fox News Live", "Sky News Live", "DD National Live", "CNBC TV18 Live","Bloomberg Live", "ET Now Live", "TV9 Live", "NewsX Live", "Lokmat Live","India TV Live", "WION Live", "Republic Bharat Live", "ABP Majha Live", "News18 India Live","Zee Business Live", "NDTV Prime Live", "India Today Special Live", "Times Now Special Live", "Aaj Tak Special Live"};
        System.out.println("\nLive TV:");
        for (String live : liveTV) {
            System.out.println(live);
        }
		String biggBossH = "Bigg Boss Hindi";
        String biggBossT = "Bigg Boss Telugu";
        String biggBossTa = "Bigg Boss Tamil";
        String kbc = "Kaun Banega Crorepati";
        String fearfactor = "Fear Factor: Khatron Ke Khiladi";
        String danceid = "Dance India Dance";
        String mtvroad = "MTV Roadies";
        String mtvsplit = "MTV Splitsvilla";
        String indianidol2 = "Indian Idol";
        String saregama2 = "Sa Re Ga Ma Pa";
        String gotTalent2 = "India's Got Talent";
        String masterchef2 = "MasterChef India";
        String laughterchallenge2 = "The Great Indian Laughter Challenge";
        String superdancer2 = "Super Dancer";
        String voiceindia2 = "The Voice India";
        String risingstar2 = "Rising Star India";
        String bestdancer3 = "India's Best Dancer";
        String comedy = "Comedy Nights Bachao";
        String rawstar2 = "India's Raw Star";
        String nextmodel2 = "India's Next Top Model";
        String laughterchamp2 = "India's Laughter Champion";
        String danceplus2 = "Dance Plus";
        String supersinger2 = "Super Singer";
        String thestage2 = "The Stage";
        String gotTalentJunior = "India's Got Talent Junior";
        String indianidolJunior = "Indian Idol Junior";
        String nextdance2 = "India's Next Dance Superstar";
        String danceLilMasters2 = "Dance India Dance Li'l Masters";
        String voiceofindia2 = "Voice of India";
        String bestdancerSeason2 = "India's Best Dancer Season 2";

		String realityShows[] = {"Bigg Boss Hindi", "Bigg Boss Telugu", "Bigg Boss Tamil", "Kaun Banega Crorepati", "Fear Factor: Khatron Ke Khiladi","Dance India Dance", "MTV Roadies", "MTV Splitsvilla", "Indian Idol", "Sa Re Ga Ma Pa",  "India's Got Talent", "MasterChef India", "The Great Indian Laughter Challenge", "Super Dancer","The Voice India", "Rising Star India", "India's Best Dancer", "Comedy Nights Bachao", "India's Raw Star","India's Next Top Model", "India's Laughter Champion", "Dance Plus", "Super Singer", "The Stage","India's Got Talent Junior", "Indian Idol Junior", "India's Next Dance Superstar", "Dance India Dance Li'l Masters", "Voice of India", "India's Best Dancer Season 2"};
        System.out.println("\nReality Shows:");
        for (String show : realityShows) {
            System.out.println(show);
        }
       /* System.out.println("List of News Clips are ");
        System.out.println(newsClips[0] + "\n" +
		newsClips[1] + "\n" +
		newsClips[2] + "\n" +
		newsClips[3] + "\n" + 
		newsClips[4] + "\n" +
        newsClips[5] + "\n" + 
		newsClips[6] + "\n" +
		newsClips[7] + "\n" +
		newsClips[8] + "\n" +
		newsClips[9] + "\n" +
        newsClips[10] + "\n" + 
		newsClips[11] + "\n" + 
		newsClips[12] + "\n" + 
		newsClips[13] + "\n" +
		newsClips[14] + "\n" +
        newsClips[15] + "\n" + 
		newsClips[16] + "\n" +
		newsClips[17] + "\n" + 
		newsClips[18] + "\n" + 
		newsClips[19] + "\n" +
        newsClips[20] + "\n" + 
		newsClips[21] + "\n" +
		newsClips[22] + "\n" + 
		newsClips[23] + "\n" +
		newsClips[24] + "\n" +
        newsClips[25] + "\n" + 
		newsClips[26] + "\n" + 
		newsClips[27] + "\n" + 
		newsClips[28] + "\n" + 
		newsClips[29]);

        System.out.println("List of Regional Films are ");
        System.out.println(regionalFilms[0] + "\n" +
		regionalFilms[1] + "\n" +
		regionalFilms[2] +"\n" + 
		regionalFilms[3] + "\n" +
		regionalFilms[4] + "\n" +
        regionalFilms[5] + "\n" + 
		regionalFilms[6] + "\n" + 
		regionalFilms[7] + "\n" + 
		regionalFilms[8] + "\n" +
		regionalFilms[9] + "\n" +
        regionalFilms[10] + "\n" +
		regionalFilms[11] + "\n" + 
		regionalFilms[12] + "\n" + 
		regionalFilms[13] + "\n" +
		regionalFilms[14] + "\n" +
        regionalFilms[15] + "\n" +
		regionalFilms[16] + "\n" + 
		regionalFilms[17] + "\n" + 
		regionalFilms[18] + "\n" +
		regionalFilms[19] + "\n" +
        regionalFilms[20] + "\n" +
		regionalFilms[21] + "\n" +
		regionalFilms[22] + "\n" + 
		regionalFilms[23] + "\n" + 
		regionalFilms[24] + "\n" +
        regionalFilms[25] + "\n" + 
		regionalFilms[26] + "\n" + 
		regionalFilms[27] + "\n" + 
		regionalFilms[28] + "\n" + 
		regionalFilms[29]);

        System.out.println("List of Serials are ");
        System.out.println(serials[0] + "\n" + 
		serials[1] + "\n" +
		serials[2] + "\n" + 
		serials[3] + "\n" + 
		serials[4] + "\n" +
        serials[5] + "\n" + 
		serials[6] + "\n" + 
		serials[7] + "\n" + 
		serials[8] + "\n" +
		serials[9] + "\n" +
        serials[10] + "\n" +
		serials[11] + "\n" + 
		serials[12] + "\n" +
		serials[13] + "\n" +
		serials[14] + "\n" +
        serials[15] + "\n" +
		serials[16] + "\n" + 
		serials[17] + "\n" + 
		serials[18] + "\n" +
		serials[19] + "\n" +
        serials[20] + "\n" + 
		serials[21] + "\n" + 
		serials[22] + "\n" + 
		serials[23] + "\n" +
		serials[24] + "\n" +
        serials[25] + "\n" + 
		serials[26] + "\n" + 
		serials[27] + "\n" + 
		serials[28] + "\n" + 
		serials[29]);

        System.out.println("List of Talent Shows are ");
        System.out.println(talentShows[0] + "\n" +
		talentShows[1] + "\n" + 
		talentShows[2] + "\n" +
		talentShows[3] + "\n" + 
		talentShows[4] + "\n" +
        talentShows[5] + "\n" + 
		talentShows[6] + "\n" +
		talentShows[7] + "\n" +
		talentShows[8] + "\n" +
		talentShows[9] + "\n" +
        talentShows[10] + "\n" +
		talentShows[11] + "\n" + 
		talentShows[12] + "\n" +
		talentShows[13] + "\n" + 
		talentShows[14] + "\n" +
        talentShows[15] + "\n" + 
		talentShows[16] + "\n" +
		talentShows[17] + "\n" + 
		talentShows[18] + "\n" +
		talentShows[19] + "\n" +
        talentShows[20] + "\n" +
		talentShows[21] + "\n" +
		talentShows[22] + "\n" + 
		talentShows[23] + "\n" + 
		talentShows[24] + "\n" +
        talentShows[25] + "\n" + 
		talentShows[26] + "\n" + 
		talentShows[27] + "\n" + 
		talentShows[28] + "\n" + 
		talentShows[29]);

        System.out.println("List of Live TV Channels are ");
        System.out.println(liveTV[0] + "\n" +
		liveTV[1] + "\n" + 
		liveTV[2] + "\n" +
		liveTV[3] + "\n" + 
	    liveTV[4] + "\n" +
        liveTV[5] + "\n" + 
		liveTV[6] + "\n" +
		liveTV[7] + "\n" + 
		liveTV[8] + "\n" +
		liveTV[9] + "\n" +
        liveTV[10] + "\n" +
		liveTV[11] + "\n" +
		liveTV[12] + "\n" +
		liveTV[13] + "\n" +
		liveTV[14] + "\n" +
        liveTV[15] + "\n" + 
		liveTV[16] + "\n" +
		liveTV[17] + "\n" +
		liveTV[18] + "\n" + 
		liveTV[19] + "\n" +
        liveTV[20] + "\n" + 
		liveTV[21] + "\n" + 
		liveTV[22] + "\n" + 
		liveTV[23] + "\n" +
		liveTV[24] + "\n" +
        liveTV[25] + "\n" +
		liveTV[26] + "\n" + 
		liveTV[27] + "\n" + 
		liveTV[28] + "\n" + 
		liveTV[29]);

        System.out.println("List of Reality Shows are ");
        System.out.println(realityShows[0] + "\n" +
		realityShows[1] + "\n" + 
		realityShows[2] + "\n" + 
		realityShows[3] + "\n" + 
		realityShows[4] + "\n" +
        realityShows[5] + "\n" +
		realityShows[6] + "\n" + 
		realityShows[7] + "\n" +
		realityShows[8] + "\n" +
		realityShows[9] + "\n" +
        realityShows[10] + "\n" +
		realityShows[11] + "\n" + 
		realityShows[12] + "\n" + 
		realityShows[13] + "\n" + 
		realityShows[14] + "\n" +
        realityShows[15] + "\n" +
		realityShows[16] + "\n" +
		realityShows[17] + "\n" +
		realityShows[18] + "\n" + 
		realityShows[19] + "\n" +
        realityShows[20] + "\n" +
		realityShows[21] + "\n" + 
		realityShows[22] + "\n" +
		realityShows[23] + "\n" +
		realityShows[24] + "\n" +
        realityShows[25] + "\n" + 
		realityShows[26] + "\n" +
		realityShows[27] + "\n" +
		realityShows[28] + "\n" +
		realityShows[29]);*/
		/*System.out.println("List of News Clips are:");

String IndiaTodayHeadlines = newsClips[0];
System.out.println(IndiaTodayHeadlines);

String NDTVNews = newsClips[1];
System.out.println(NDTVNews);

String TimesNowLive = newsClips[2];
System.out.println(TimesNowLive);

String RepublicTVUpdate = newsClips[3];
System.out.println(RepublicTVUpdate);

String ZeeNewsBulletin = newsClips[4];
System.out.println(ZeeNewsBulletin);

String CNNNews247 = newsClips[5];
System.out.println(CNNNews247);

String ABPNewsTopStories = newsClips[6];
System.out.println(ABPNewsTopStories);

String MirrorNow = newsClips[7];
System.out.println(MirrorNow);

String News18India = newsClips[8];
System.out.println(News18India);

String ETNowBusinessUpdate = newsClips[9];
System.out.println(ETNowBusinessUpdate);

String WIONGlobalNews = newsClips[10];
System.out.println(WIONGlobalNews);

String BBCWorldNews = newsClips[11];
System.out.println(BBCWorldNews);

String AlJazeeraUpdates = newsClips[12];
System.out.println(AlJazeeraUpdates);

String FoxNewsLive = newsClips[13];
System.out.println(FoxNewsLive);

String SkyNewsHeadlines = newsClips[14];
System.out.println(SkyNewsHeadlines);

String NDTVPrime = newsClips[15];
System.out.println(NDTVPrime);

String CNNNews18 = newsClips[16];
System.out.println(CNNNews18);

String IndiaTV = newsClips[17];
System.out.println(IndiaTV);

String TimesNowSpecial = newsClips[18];
System.out.println(TimesNowSpecial);

String ZeeNewsSpecialReport = newsClips[19];
System.out.println(ZeeNewsSpecialReport);

String AajTakFastNews = newsClips[20];
System.out.println(AajTakFastNews);

String IndiaTodaySpecial = newsClips[21];
System.out.println(IndiaTodaySpecial);

String RepublicBharat = newsClips[22];
System.out.println(RepublicBharat);

String ABPMajha = newsClips[23];
System.out.println(ABPMajha);

String NewsXUpdate = newsClips[24];
System.out.println(NewsXUpdate);

String DDNewsLive = newsClips[25];
System.out.println(DDNewsLive);

String CNBCtv18 = newsClips[26];
System.out.println(CNBCtv18);

String BloombergQuickTake = newsClips[27];
System.out.println(BloombergQuickTake);

String LokmatNews = newsClips[28];
System.out.println(LokmatNews);

String TV9Bharatvarsh = newsClips[29];
System.out.println(TV9Bharatvarsh);
System.out.println("List of Regional Films are:");

String KGFChapter2 = regionalFilms[0];
System.out.println(KGFChapter2);

String RRR = regionalFilms[1];
System.out.println(RRR);

String PonniyinSelvan = regionalFilms[2];
System.out.println(PonniyinSelvan);

String Jersey = regionalFilms[3];
System.out.println(Jersey);

String Drishyam2 = regionalFilms[4];
System.out.println(Drishyam2);

String Pushpa = regionalFilms[5];
System.out.println(Pushpa);

String Master = regionalFilms[6];
System.out.println(Master);

String Vikram = regionalFilms[7];
System.out.println(Vikram);

String Valimai = regionalFilms[8];
System.out.println(Valimai);

String Beast = regionalFilms[9];
System.out.println(Beast);

String Leo = regionalFilms[10];
System.out.println(Leo);

String EtharkkumThunindhavan = regionalFilms[11];
System.out.println(EtharkkumThunindhavan);

String SitaRamam = regionalFilms[12];
System.out.println(SitaRamam);

String Salaar = regionalFilms[13];
System.out.println(Salaar);

String Spyder = regionalFilms[14];
System.out.println(Spyder);

String VakeelSaab = regionalFilms[15];
System.out.println(VakeelSaab);

String SarkaruVaariPaata = regionalFilms[16];
System.out.println(SarkaruVaariPaata);

String Annaatthe = regionalFilms[17];
System.out.println(Annaatthe);

String Kaala = regionalFilms[18];
System.out.println(Kaala);

String Theri = regionalFilms[19];
System.out.println(Theri);

String Mersal = regionalFilms[20];
System.out.println(Mersal);

String Bigil = regionalFilms[21];
System.out.println(Bigil);

String Viswasam = regionalFilms[22];
System.out.println(Viswasam);

String Thuppakki = regionalFilms[23];
System.out.println(Thuppakki);

String VinnaithaandiVaruvaayaa = regionalFilms[24];
System.out.println(VinnaithaandiVaruvaayaa);

String Baahubali = regionalFilms[25];
System.out.println(Baahubali);

String Magadheera = regionalFilms[26];
System.out.println(Magadheera);

String Drishyam = regionalFilms[27];
System.out.println(Drishyam);

String Uppena = regionalFilms[28];
System.out.println(Uppena);

String ArjunReddy = regionalFilms[29];
System.out.println(ArjunReddy);
System.out.println("List of Serials are:");

String KumkumBhagya = serials[0];
System.out.println(KumkumBhagya);

String YehRishtaKyaKehlataHai = serials[1];
System.out.println(YehRishtaKyaKehlataHai);

String Anupamaa = serials[2];
System.out.println(Anupamaa);

String TaarakMehtaKaOoltahChashmah = serials[3];
System.out.println(TaarakMehtaKaOoltahChashmah);

String KundaliBhagya = serials[4];
System.out.println(KundaliBhagya);

String ChotiSarrdaarni = serials[5];
System.out.println(ChotiSarrdaarni);

String GhumHaiKisikeyPyaarMeiin = serials[6];
System.out.println(GhumHaiKisikeyPyaarMeiin);

String BadeAchheLagteHain = serials[7];
System.out.println(BadeAchheLagteHain);

String Naagin6 = serials[8];
System.out.println(Naagin6);

String KathaAnkahee = serials[9];
System.out.println(KathaAnkahee);

String PandyaStore = serials[10];
System.out.println(PandyaStore);

String SaathNibhaanaSaathiya = serials[11];
System.out.println(SaathNibhaanaSaathiya);

String KasautiiZindagiiKay = serials[12];
System.out.println(KasautiiZindagiiKay);

String Bhagyalaxmi = serials[13];
System.out.println(Bhagyalaxmi);

String Shubharambh = serials[14];
System.out.println(Shubharambh);

String Molkki = serials[15];
System.out.println(Molkki);

String EkNayiPehchaan = serials[16];
System.out.println(EkNayiPehchaan);

String Imlie = serials[17];
System.out.println(Imlie);

String MariamKhan = serials[18];
System.out.println(MariamKhan);

String SasuralSimarKa = serials[19];
System.out.println(SasuralSimarKa);

String RabbSeHaiDua = serials[20];
System.out.println(RabbSeHaiDua);

String DilDiyaanGallaan = serials[21];
System.out.println(DilDiyaanGallaan);

String ZiddiDilMaaneNa = serials[22];
System.out.println(ZiddiDilMaaneNa);

String TeriMeriIkkJindri = serials[23];
System.out.println(TeriMeriIkkJindri);

String PandyaStoreSpecial = serials[24];
System.out.println(PandyaStoreSpecial);

String PatialaBabes = serials[25];
System.out.println(PatialaBabes);

String EkDujeKeVaaste = serials[26];
System.out.println(EkDujeKeVaaste);

String Udaariyaan = serials[27];
System.out.println(Udaariyaan);

String ChhotiSarrdaarniSpecial = serials[28];
System.out.println(ChhotiSarrdaarniSpecial);

String GhumHaiKisikeySpecial = serials[29];
System.out.println(GhumHaiKisikeySpecial);

System.out.println("List of Talent Shows are:");

String IndianIdol = talentShows[0];
System.out.println(IndianIdol);

String DanceIndiaDance = talentShows[1];
System.out.println(DanceIndiaDance);

String SaReGaMaPa = talentShows[2];
System.out.println(SaReGaMaPa);

String TheVoiceIndia = talentShows[3];
System.out.println(TheVoiceIndia);

String IndiasGotTalent = talentShows[4];
System.out.println(IndiasGotTalent);

String SuperDancer = talentShows[5];
System.out.println(SuperDancer);

String RisingStarIndia = talentShows[6];
System.out.println(RisingStarIndia);

String KhatronKeKhiladi = talentShows[7];
System.out.println(KhatronKeKhiladi);

String IndiasBestDancer = talentShows[8];
System.out.println(IndiasBestDancer);

String TheGreatIndianLaughterChallenge = talentShows[9];
System.out.println(TheGreatIndianLaughterChallenge);

String MasterChefIndia = talentShows[10];
System.out.println(MasterChefIndia);

String IndianProMusicLeague = talentShows[11];
System.out.println(IndianProMusicLeague);

String ChotaPacketBadaDhamaka = talentShows[12];
System.out.println(ChotaPacketBadaDhamaka);

String MTVRoadies = talentShows[13];
System.out.println(MTVRoadies);

String MTVSplitsvilla = talentShows[14];
System.out.println(MTVSplitsvilla);

String IndiasRawStar = talentShows[15];
System.out.println(IndiasRawStar);

String ComedyCircus = talentShows[16];
System.out.println(ComedyCircus);

String IndiasNextTopModel = talentShows[17];
System.out.println(IndiasNextTopModel);

String IndiasLaughterChampion = talentShows[18];
System.out.println(IndiasLaughterChampion);

String DancePlus = talentShows[19];
System.out.println(DancePlus);

String SuperSinger = talentShows[20];
System.out.println(SuperSinger);

String TheStage = talentShows[21];
System.out.println(TheStage);

String RisingStarTamil = talentShows[22];
System.out.println(RisingStarTamil);

String IndianIdolJunior = talentShows[23];
System.out.println(IndianIdolJunior);

String SaReGaMaPaLilChamps = talentShows[24];
System.out.println(SaReGaMaPaLilChamps);

String IndiasGotTalentJunior = talentShows[25];
System.out.println(IndiasGotTalentJunior);

String IndiasBestDancerSeason2 = talentShows[26];
System.out.println(IndiasBestDancerSeason2);

String IndiasNextDanceSuperstar = talentShows[27];
System.out.println(IndiasNextDanceSuperstar);

String DanceIndiaDanceLilMasters = talentShows[28];
System.out.println(DanceIndiaDanceLilMasters);

String VoiceOfIndia = talentShows[29];
System.out.println(VoiceOfIndia);
System.out.println("List of Live TV Channels are:");

String AajTakLive = liveTV[0];
System.out.println(AajTakLive);

String NDTVLive = liveTV[1];
System.out.println(NDTVLive);

String TimesNowLiveTV = liveTV[2];
System.out.println(TimesNowLiveTV);

String ZeeNewsLive = liveTV[3];
System.out.println(ZeeNewsLive);

String CNNNews18Live = liveTV[4];
System.out.println(CNNNews18Live);

String RepublicTVLive = liveTV[5];
System.out.println(RepublicTVLive);

String ABPNewsLive = liveTV[6];
System.out.println(ABPNewsLive);

String MirrorNowLive = liveTV[7];
System.out.println(MirrorNowLive);

String IndiaTodayLive = liveTV[8];
System.out.println(IndiaTodayLive);

String BBCNewsLive = liveTV[9];
System.out.println(BBCNewsLive);

String AlJazeeraLive = liveTV[10];
System.out.println(AlJazeeraLive);

String FoxNewsLiveTV = liveTV[11];
System.out.println(FoxNewsLiveTV);

String SkyNewsLive = liveTV[12];
System.out.println(SkyNewsLive);

String DDNationalLive = liveTV[13];
System.out.println(DDNationalLive);

String CNBCtv18Live = liveTV[14];
System.out.println(CNBCtv18Live);

String BloombergLive = liveTV[15];
System.out.println(BloombergLive);

String ETNowLive = liveTV[16];
System.out.println(ETNowLive);

String TV9Live = liveTV[17];
System.out.println(TV9Live);

String NewsXLive = liveTV[18];
System.out.println(NewsXLive);

String LokmatLive = liveTV[19];
System.out.println(LokmatLive);

String IndiaTVLive = liveTV[20];
System.out.println(IndiaTVLive);

String WIONLive = liveTV[21];
System.out.println(WIONLive);

String RepublicBharatLive = liveTV[22];
System.out.println(RepublicBharatLive);

String ABPMajhaLive = liveTV[23];
System.out.println(ABPMajhaLive);

String News18IndiaLive = liveTV[24];
System.out.println(News18IndiaLive);

String ZeeBusinessLive = liveTV[25];
System.out.println(ZeeBusinessLive);

String NDTVPrimeLive = liveTV[26];
System.out.println(NDTVPrimeLive);

String IndiaTodaySpecialLive = liveTV[27];
System.out.println(IndiaTodaySpecialLive);

String TimesNowSpecialLive = liveTV[28];
System.out.println(TimesNowSpecialLive);

String AajTakSpecialLive = liveTV[29];
System.out.println(AajTakSpecialLive);
System.out.println("List of Reality Shows are:");

String BiggBossHindi = realityShows[0];
System.out.println(BiggBossHindi);

String BiggBossTelugu = realityShows[1];
System.out.println(BiggBossTelugu);

String BiggBossTamil = realityShows[2];
System.out.println(BiggBossTamil);

String KaunBanegaCrorepati = realityShows[3];
System.out.println(KaunBanegaCrorepati);

String FearFactorKhatronKeKhiladi = realityShows[4];
System.out.println(FearFactorKhatronKeKhiladi);

String DanceIndiaDanceReality = realityShows[5];
System.out.println(DanceIndiaDanceReality);

String MTVRoadiesReality = realityShows[6];
System.out.println(MTVRoadiesReality);

String MTVSplitsvillaReality = realityShows[7];
System.out.println(MTVSplitsvillaReality);

String IndianIdolReality = realityShows[8];
System.out.println(IndianIdolReality);

String SaReGaMaPaReality = realityShows[9];
System.out.println(SaReGaMaPaReality);

String IndiasGotTalentReality = realityShows[10];
System.out.println(IndiasGotTalentReality);

String MasterChefIndiaReality = realityShows[11];
System.out.println(MasterChefIndiaReality);

String TheGreatIndianLaughterChallengeReality = realityShows[12];
System.out.println(TheGreatIndianLaughterChallengeReality);

String SuperDancerReality = realityShows[13];
System.out.println(SuperDancerReality);

String TheVoiceIndiaReality = realityShows[14];
System.out.println(TheVoiceIndiaReality);

String RisingStarIndiaReality = realityShows[15];
System.out.println(RisingStarIndiaReality);

String IndiasBestDancerReality = realityShows[16];
System.out.println(IndiasBestDancerReality);

String ComedyNightsBachao = realityShows[17];
System.out.println(ComedyNightsBachao);

String IndiasRawStarReality = realityShows[18];
System.out.println(IndiasRawStarReality);

String IndiasNextTopModelReality = realityShows[19];
System.out.println(IndiasNextTopModelReality);

String IndiasLaughterChampionReality = realityShows[20];
System.out.println(IndiasLaughterChampionReality);

String DancePlusReality = realityShows[21];
System.out.println(DancePlusReality);

String SuperSingerReality = realityShows[22];
System.out.println(SuperSingerReality);

String TheStageReality = realityShows[23];
System.out.println(TheStageReality);

String IndiasGotTalentJuniorReality = realityShows[24];
System.out.println(IndiasGotTalentJuniorReality);

String IndianIdolJuniorReality = realityShows[25];
System.out.println(IndianIdolJuniorReality);

String IndiasNextDanceSuperstarReality = realityShows[26];
System.out.println(IndiasNextDanceSuperstarReality);

String DanceIndiaDanceLilMastersReality = realityShows[27];
System.out.println(DanceIndiaDanceLilMastersReality);

String VoiceOfIndiaReality = realityShows[28];
System.out.println(VoiceOfIndiaReality);

String IndiasBestDancerSeason2Reality = realityShows[29];
System.out.println(IndiasBestDancerSeason2Reality);*/


       




    }  
     	static void getnewsClips(){
	    System.out.println("News Clips:");
        for (String news : newsClips) {
            System.out.println(news);
	    }}
		 static void getRegionalFlims(){
		System.out.println("\nRegional Films:");
        for (String film : regionalFilms) {
            System.out.println(film);
        }}
		static void getSerials(){
		System.out.println("\nSerials:");
        for (String serial : serials) {
            System.out.println(serial);
        }}		
		static void getTalentShows(){
		System.out.println("\nTalent Shows:");
        for (String show : talentShows) {
            System.out.println(show);
        }}	
        static void getLiveTv(){		
		System.out.println("\nLive TV:");
        for (String live : liveTV) {
            System.out.println(live);
        }} 
		static void getRealityShows(){
		System.out.println("\nReality Shows:");
        for (String show : realityShows) {
            System.out.println(show);
        }
		}
		
}