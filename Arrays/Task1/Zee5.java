class Zee5 {
	 static String webSeries[] = {"Abhay Season 3","Special Ops","Kaafir","Rangbaaz Phirse","Tanaav","Jamai 2.0","State of Siege 26/11","Rana Naidu","She Season 2","Rudra","Mumbai Diaries 26/11","Breathe 2","Raktanchal 2","Bicchoo Ka Khel","The Gone Game 2","Shoorveer","Paatal Lok","Faltu","Farzi","Code M","Jeet Ki Zid","Rangbaaz","Kaun Banegi Shikharwati","Special Ops 1.5","Breathe","Rudra 2","Tanaav 2","Raktanchal","Abhay 4","Avrodh"};
  
	static String tvShows[] = {"Bigg Boss OTT","Dance Deewane","Kaun Banega Crorepati","Chhoti Sarrdaarni","Shaadi Mubarak","Kumkum Bhagya","Bade Achhe Lagte Hain","The Kapil Sharma Show","Yeh Rishta Kya Kehlata Hai","Indian Idol","Rising Star","Naagin","The Voice India","Dance Plus","Crime Patrol","Fear Factor: Khatron Ke Khiladi","Entertainment Ki Raat","India's Got Talent","MasterChef India","Taarak Mehta Ka Ooltah Chashmah","Indian Idol Junior","Sa Re Ga Ma Pa","Comedy Nights Bachao","Super Dancer","Dance India Dance","Bigg Boss 16","Kaun Banega Crorepati 13","Rising Star 2","Savdhaan India","The Kapil Sharma Show 2"};
    static String realityShows[] = {"India's Next Superstars","Zee Cine Awards","Dance Deewane","Sa Re Ga Ma Pa","India's Got Talent","Fear Factor: Khatron Ke Khiladi","The Voice India","Dance Plus","Super Dancer","India's Best Dramebaaz","Zee Rishtey Awards","Comedy Nights Bachao","The Kapil Sharma Show","Savdhaan India","Bigg Boss OTT","Rising Star","Dance India Dance","MasterChef India","Khatron Ke Khiladi Special","Indian Idol","Indian Idol Junior","Entertainment Ki Raat","Bigg Boss 16","Zee Comedy Awards","Rising Star 2","Super Dancer 2","Dance Deewane 2","Sa Re Ga Ma Pa 2023","The Kapil Sharma Show 2","Rising Star 2"};
	static String documentaries[] = {"India's Frontier Rail","Inside India's Covid Fight","Watermark","The Great Indian Global Kitchen","My Name is Gaja","Behind Closed Doors","India's Untold Stories","Tigers of Sundarbans","Wild India","The Story of InDastaan-E-Mahatma","Beyond the River","The Last Color","Sacred Games Documentary","Indus Valley Mysteries","Life in the Himalayas","Eco Warriors","India's Marine Giants","Bhimayana","India's Forgotten Heroes","Kashmir Files Documentary","Delhi Crimes Explained","Ganga", "The Eternal River","The Silk Route","India's Forest Stories","The Hidden India","The Great Indian Elections","India's Wildlife Diaries","Rivers of India","Bharat"};
	static String shortFilms[] = {"Feels Like Ishq","Adulting","Little Things","Tara From Satara","Never Kiss Your Best Friend","What’s Up Yaar?","Kuch Smiles Ho Jayein","Sunflower Short Episodes","Baarish Season 2 Shorts","Dil Bekaraar Short Films", "The Married Woman Shorts","Four More Shots Please Shorts","Shaadi Mubarak Shorts","Hush Hush Shorts","Jamai 2.0 Short Clips","Rana Naidu Shorts","Rangbaaz Phirse Short Scenes","She Season 2 Short Clips","Faltu Shorts","Code M Short Scenes","Jeet Ki Zid Short Clips","Tanaav Shorts","Mumbai Diaries 26/11 Short Episodes","Rudra Shorts","Abhay Shorts","Farzi Shorts","Breathe 2 Short Clips","Raktanchal Shorts","Little Things","Avrodh Shorts"};
	static String musicShows[] = {"Zee Music Awards","Sa Re Ga Ma Pa","Sitaron Ko Choona Hai","Music Ka Maha Muqqabla","India's Raw Star","Antakshari","The Stage","MTV Unplugged","Dil Hai Hindustani","India's Best Dramebaaz Music","Superstar Singer","The Voice India","Sa Re Ga Ma Pa L'il Champs","Zee Cine Awards Music","Zee Rishtey Awards Music","Indian Idol","Indian Idol Junior","Dance India Dance Music","MTV Beats Live","MTV Unplugged Season 2","Music Ki Pathshala","Singing Star","Super Singer","The Stage Season 2","Sa Re Ga Ma Pa 2023 Music","Zee Music Awards 2023","India's Got Talent Music","Entertainment Ki Raat Music","Bigg Boss Music Special","Bollywood Hungama Music"};
	
	
	public static void main(String[] args) {
		 
		 getwebSeries();
		 getTvShows();
		 getRealityShows();
		 getDocumentaries();
		 getShortFilms();
		 getMusicShows();
		
		/*String abhay3 = "Abhay Season 3";
        String specialOps = "Special Ops";
        String kaafir = "Kaafir";
        String rangbaazPhirse = "Rangbaaz Phirse";
        String tanaav = "Tanaav";
        String jamai2 = "Jamai 2.0";
        String siege = "State of Siege 26/11";
        String ranaNaidu = "Rana Naidu";
        String she2 = "She Season 2";
        String rudra = "Rudra";
        String mumbaiDiaries = "Mumbai Diaries 26/11";
        String breathe2 = "Breathe 2";
        String raktanchal2 = "Raktanchal 2";
        String bicchoo = "Bicchoo Ka Khel";
        String goneGame2 = "The Gone Game 2";
        String shoorveer = "Shoorveer";
        String paatalLok = "Paatal Lok";
        String faltu = "Faltu";
        String farzi = "Farzi";
        String codeM = "Code M";
        String jeetZid = "Jeet Ki Zid";
        String rangbaaz = "Rangbaaz";
        String kaunShikhar = "Kaun Banegi Shikharwati";
        String specialOps1_5 = "Special Ops 1.5";
        String breathe1 = "Breathe";
        String rudra2 = "Rudra 2";
        String tanaav2 = "Tanaav 2";
        String raktanchal = "Raktanchal";
        String abhay4 = "Abhay 4";
        String avrodh = "Avrodh";*/
       
        /*String webSeries[] = {"Abhay Season 3","Special Ops","Kaafir","Rangbaaz Phirse","Tanaav","Jamai 2.0","State of Siege 26/11","Rana Naidu","She Season 2","Rudra","Mumbai Diaries 26/11","Breathe 2","Raktanchal 2","Bicchoo Ka Khel","The Gone Game 2","Shoorveer","Paatal Lok","Faltu","Farzi","Code M","Jeet Ki Zid","Rangbaaz","Kaun Banegi Shikharwati","Special Ops 1.5","Breathe","Rudra 2","Tanaav 2","Raktanchal","Abhay 4","Avrodh"};
        System.out.println("Web Series:");
        for (String series : webSeries) {
            System.out.println(series);
		}
		
		
		tring biggBossOTT = "Bigg Boss OTT";
        String danceDeewane = "Dance Deewane";
        String kbc = "Kaun Banega Crorepati";
        String chotiSarrdaarni = "Chhoti Sarrdaarni";
        String shaadiMubarak = "Shaadi Mubarak";
        String kumkum = "Kumkum Bhagya";
        String badeAchhe = "Bade Achhe Lagte Hain";
        String kapilShow = "The Kapil Sharma Show";
        String yehrishta = "Yeh Rishta Kya Kehlata Hai";
        String indianIdol = "Indian Idol";
        String risingStar = "Rising Star";
        String naagin = "Naagin";
        String voiceIndia = "The Voice India";
        String dancePlus = "Dance Plus";
        String crimePatrol = "Crime Patrol";
        String fearKhiladi = "Fear Factor: Khatron Ke Khiladi";
        String entertainmentRaat = "Entertainment Ki Raat";
        String gotTalent = "India's Got Talent";
        String masterChef = "MasterChef India";
        String taarak = "Taarak Mehta Ka Ooltah Chashmah";
        String idolJunior = "Indian Idol Junior";
        String saregama = "Sa Re Ga Ma Pa";
        String comedyNights = "Comedy Nights Bachao";
        String superDancer = "Super Dancer";
        String danceIndia = "Dance India Dance";
        String biggBoss16 = "Bigg Boss 16";
        String kbc13 = "Kaun Banega Crorepati 13";
        String risingStar2 = "Rising Star 2";
        String savdhaanIndia = "Savdhaan India";
        String kapilShow2 = "The Kapil Sharma Show 2";*/
		
		/*String tvShows[] = {"Bigg Boss OTT","Dance Deewane","Kaun Banega Crorepati","Chhoti Sarrdaarni","Shaadi Mubarak","Kumkum Bhagya","Bade Achhe Lagte Hain","The Kapil Sharma Show","Yeh Rishta Kya Kehlata Hai","Indian Idol","Rising Star","Naagin","The Voice India","Dance Plus","Crime Patrol","Fear Factor: Khatron Ke Khiladi","Entertainment Ki Raat","India's Got Talent","MasterChef India","Taarak Mehta Ka Ooltah Chashmah","Indian Idol Junior","Sa Re Ga Ma Pa","Comedy Nights Bachao","Super Dancer","Dance India Dance","Bigg Boss 16","Kaun Banega Crorepati 13","Rising Star 2","Savdhaan India","The Kapil Sharma Show 2"};
         System.out.println("\nTV Shows:");
        for (String show : tvShows) {
            System.out.println(show);
        }
		
		
		
		String nextSuperstars = "India's Next Superstars";
        String zeeCineAwards = "Zee Cine Awards";
        String danceDeewaneR = "Dance Deewane";
        String saregamaR = "Sa Re Ga Ma Pa";
        String gotTalentR = "India's Got Talent";
        String fearKhiladiR = "Fear Factor: Khatron Ke Khiladi";
        String voiceIndiaR = "The Voice India";
        String dancePlusR = "Dance Plus";
        String superDancerR = "Super Dancer";
        String bestDramebaaz = "India's Best Dramebaaz";
        String zeeRishtey = "Zee Rishtey Awards";
        String comedyNightsR = "Comedy Nights Bachao";
        String kapilShowR = "The Kapil Sharma Show";
        String savdhaanIndiaR = "Savdhaan India";
        String biggBossOTTR = "Bigg Boss OTT";
        String risingStarR = "Rising Star";
        String danceIndiaR = "Dance India Dance";
        String masterChefR = "MasterChef India";
        String khiladiSpecial = "Khatron Ke Khiladi Special";
        String indianIdolR = "Indian Idol";
        String idolJuniorR = "Indian Idol Junior";
        String entertainmentRaatR = "Entertainment Ki Raat";
        String biggBoss16R = "Bigg Boss 16";
        String zeeComedyAwards = "Zee Comedy Awards";
        String risingStar2R = "Rising Star 2";
        String superDancer2R = "Super Dancer 2";
        String danceDeewane2R = "Dance Deewane 2";
        String saregama2023 = "Sa Re Ga Ma Pa 2023";
        String kapilShow2R = "The Kapil Sharma Show 2";
        String risingStar2R2 = "Rising Star 2";*/

		/*String realityShows[] = {"India's Next Superstars","Zee Cine Awards","Dance Deewane","Sa Re Ga Ma Pa","India's Got Talent","Fear Factor: Khatron Ke Khiladi","The Voice India","Dance Plus","Super Dancer","India's Best Dramebaaz","Zee Rishtey Awards","Comedy Nights Bachao","The Kapil Sharma Show","Savdhaan India","Bigg Boss OTT","Rising Star","Dance India Dance","MasterChef India","Khatron Ke Khiladi Special","Indian Idol","Indian Idol Junior","Entertainment Ki Raat","Bigg Boss 16","Zee Comedy Awards","Rising Star 2","Super Dancer 2","Dance Deewane 2","Sa Re Ga Ma Pa 2023","The Kapil Sharma Show 2","Rising Star 2"};
        System.out.println("\nReality Shows:");
        for (String show : realityShows) {
            System.out.println(show);
        }  
		
		
		String frontierRail = "India's Frontier Rail";
        String covidFight = "Inside India's Covid Fight";
        String watermark = "Watermark";
        String globalKitchen = "The Great Indian Global Kitchen";
        String myNameGaja = "My Name is Gaja";
        String behindDoors = "Behind Closed Doors";
        String untoldStories = "India's Untold Stories";
        String tigersSundarbans = "Tigers of Sundarbans";
        String wildIndia = "Wild India";
        String inDastaan = "The Story of InDastaan-E-Mahatma";
        String beyondRiver = "Beyond the River";
        String lastColor = "The Last Color";
        String sacredGamesDoc = "Sacred Games Documentary";
        String indusMysteries = "Indus Valley Mysteries";
        String himalayasLife = "Life in the Himalayas";
        String ecoWarriors = "Eco Warriors";
        String marineGiants = "India's Marine Giants";
        String bhimayana = "Bhimayana";
        String forgottenHeroes = "India's Forgotten Heroes";
        String kashmirDoc = "Kashmir Files Documentary";
        String delhiCrime = "Delhi Crimes Explained";
        String ganga = "Ganga";
        String eternalRiver = "The Eternal River";
        String silkRoute = "The Silk Route";
        String forestStories = "India's Forest Stories";
        String hiddenIndia = "The Hidden India";
        String elections = "The Great Indian Elections";
        String wildlifeDiaries = "India's Wildlife Diaries";
        String riversIndia = "Rivers of India";
        String bharat = "Bharat";*/

		/*String documentaries[] = {"India's Frontier Rail","Inside India's Covid Fight","Watermark","The Great Indian Global Kitchen","My Name is Gaja","Behind Closed Doors","India's Untold Stories","Tigers of Sundarbans","Wild India","The Story of InDastaan-E-Mahatma","Beyond the River","The Last Color","Sacred Games Documentary","Indus Valley Mysteries","Life in the Himalayas","Eco Warriors","India's Marine Giants","Bhimayana","India's Forgotten Heroes","Kashmir Files Documentary","Delhi Crimes Explained","Ganga", "The Eternal River","The Silk Route","India's Forest Stories","The Hidden India","The Great Indian Elections","India's Wildlife Diaries","Rivers of India","Bharat"};
         System.out.println("\nDocumentaries:");
        for (String doc : documentaries) {
            System.out.println(doc);
        }
		
		String feelsIshq = "Feels Like Ishq";
        String adulting = "Adulting";
        String littleThings = "Little Things";
        String taraSatara = "Tara From Satara";
        String neverKiss = "Never Kiss Your Best Friend";
        String whatsUpYaar = "What’s Up Yaar?";
        String kuchSmiles = "Kuch Smiles Ho Jayein";
        String sunflowerShort = "Sunflower Short Episodes";
        String baarish2 = "Baarish Season 2 Shorts";
        String dilBekaraar = "Dil Bekaraar Short Films";
        String marriedWoman = "The Married Woman Shorts";
        String fourShots = "Four More Shots Please Shorts";
        String shaadiShorts = "Shaadi Mubarak Shorts";
        String hushHush = "Hush Hush Shorts";
        String jamai2Shorts = "Jamai 2.0 Short Clips";
        String ranaNaiduShorts = "Rana Naidu Shorts";
        String rangbaazShorts = "Rangbaaz Phirse Short Scenes";
        String she2Shorts = "She Season 2 Short Clips";
        String faltuShorts = "Faltu Shorts";
        String codeMShorts = "Code M Short Scenes";
        String jeetZidShorts = "Jeet Ki Zid Short Clips";
        String tanaavShorts = "Tanaav Shorts";
        String mumbaiDiariesShort = "Mumbai Diaries 26/11 Short Episodes";
        String rudraShorts = "Rudra Shorts";
        String abhayShorts = "Abhay Shorts";
        String farziShorts = "Farzi Shorts";
        String breathe2Shorts = "Breathe 2 Short Clips";
        String raktanchalShorts = "Raktanchal Shorts";
        String littleThings2 = "Little Things";
        String avrodhShorts = "Avrodh Shorts";*/

		/*String shortFilms[] = {"Feels Like Ishq","Adulting","Little Things","Tara From Satara","Never Kiss Your Best Friend","What’s Up Yaar?","Kuch Smiles Ho Jayein","Sunflower Short Episodes","Baarish Season 2 Shorts","Dil Bekaraar Short Films", "The Married Woman Shorts","Four More Shots Please Shorts","Shaadi Mubarak Shorts","Hush Hush Shorts","Jamai 2.0 Short Clips","Rana Naidu Shorts","Rangbaaz Phirse Short Scenes","She Season 2 Short Clips","Faltu Shorts","Code M Short Scenes","Jeet Ki Zid Short Clips","Tanaav Shorts","Mumbai Diaries 26/11 Short Episodes","Rudra Shorts","Abhay Shorts","Farzi Shorts","Breathe 2 Short Clips","Raktanchal Shorts","Little Things","Avrodh Shorts"};
        
        System.out.println("\nShort Films:");
        for (String sf : shortFilms) {
            System.out.println(sf);
        }
		
		
		String zeeMusicAwards = "Zee Music Awards";
        String saregamaMusic = "Sa Re Ga Ma Pa";
        String sitaron = "Sitaron Ko Choona Hai";
        String musicMaha = "Music Ka Maha Muqqabla";
        String rawStar = "India's Raw Star";
        String antakshari = "Antakshari";
        String theStage = "The Stage";
        String mtvUnplugged = "MTV Unplugged";
        String dilHindustani = "Dil Hai Hindustani";
        String bestDramebaazMusic = "India's Best Dramebaaz Music";
        String superstarSinger = "Superstar Singer";
        String voiceIndiaMusic = "The Voice India";
        String lilChamps = "Sa Re Ga Ma Pa L'il Champs";
        String zeeCineMusic = "Zee Cine Awards Music";
        String zeeRishteyMusic = "Zee Rishtey Awards Music";
        String indianIdolMusic = "Indian Idol";
        String idolJuniorMusic = "Indian Idol Junior";
        String danceMusic = "Dance India Dance Music";
        String mtvBeats = "MTV Beats Live";
        String mtvUnplugged2 = "MTV Unplugged Season 2";
        String musicPathshala = "Music Ki Pathshala";
        String singingStar = "Singing Star";
        String superSingerMusic = "Super Singer";
        String stage2 = "The Stage Season 2";
        String saregama2023Music = "Sa Re Ga Ma Pa 2023 Music";
        String zeeMusic2023 = "Zee Music Awards 2023";
        String gotTalentMusic = "India's Got Talent Music";
        String entertainmentRaatMusic = "Entertainment Ki Raat Music";
        String biggBossMusic = "Bigg Boss Music Special";
        String bollywoodHungama = "Bollywood Hungama Music";*/

		/*String musicShows[] = {"Zee Music Awards","Sa Re Ga Ma Pa","Sitaron Ko Choona Hai","Music Ka Maha Muqqabla","India's Raw Star","Antakshari","The Stage","MTV Unplugged","Dil Hai Hindustani","India's Best Dramebaaz Music","Superstar Singer","The Voice India","Sa Re Ga Ma Pa L'il Champs","Zee Cine Awards Music","Zee Rishtey Awards Music","Indian Idol","Indian Idol Junior","Dance India Dance Music","MTV Beats Live","MTV Unplugged Season 2","Music Ki Pathshala","Singing Star","Super Singer","The Stage Season 2","Sa Re Ga Ma Pa 2023 Music","Zee Music Awards 2023","India's Got Talent Music","Entertainment Ki Raat Music","Bigg Boss Music Special","Bollywood Hungama Music"};
        System.out.println("\nMusic Shows:");
        for (String music : musicShows) {
            System.out.println(music);
        }
        
       /* System.out.println("List of Web Series are:") ;
         System.out.println(webSeries[0] + "\n" +
			webSeries[1] + "\n" +
			webSeries[2] + "\n" +
			webSeries[3] + "\n" +
			webSeries[4] + "\n" +
            webSeries[5] + "\n" + 
			webSeries[6] + "\n" +
			webSeries[7] + "\n" + 
			webSeries[8] + "\n" + 
			webSeries[9] + "\n" +
            webSeries[10] + "\n" + 
			webSeries[11] + "\n" + 
			webSeries[12] + "\n" + 
			webSeries[13] + "\n" +
			webSeries[14] + "\n" +
            webSeries[15] + "\n" + 
			webSeries[16] + "\n" + 
			webSeries[17] + "\n" + 
			webSeries[18] + "\n" + 
			webSeries[19] + "\n" +
            webSeries[20] + "\n" + 
			webSeries[21] + "\n" +
			webSeries[22] + "\n" + 
			webSeries[23] + "\n" + 
			webSeries[24] + "\n" +
            webSeries[25] + "\n" + 
			webSeries[26] + "\n" + 
			webSeries[27] + "\n" + 
			webSeries[28] + "\n" +
			webSeries[29]);

        System.out.println("List of TV Shows are:");
        System.out.println(tvShows[0] + "\n" + 
			tvShows[1] + "\n" + 
			tvShows[2] + "\n" + 
			tvShows[3] + "\n" + 
			tvShows[4] + "\n" +
            tvShows[5] + "\n" +
			tvShows[6] + "\n" + 
			tvShows[7] + "\n" +
			tvShows[8] + "\n" + 
			tvShows[9] + "\n" +
            tvShows[10] + "\n" + 
			tvShows[11] + "\n" +
			tvShows[12] + "\n" + 
			tvShows[13] + "\n" + 
			tvShows[14] + "\n" +
            tvShows[15] + "\n" +
			tvShows[16] + "\n" + 
			tvShows[17] + "\n" + 
			tvShows[18] + "\n" + 
			tvShows[19] + "\n" +
            tvShows[20] + "\n" + 
			tvShows[21] + "\n" + 
			tvShows[22] + "\n" +
			tvShows[23] + "\n" + 
			tvShows[24] + "\n" +
            tvShows[25] + "\n" + 
			tvShows[26] + "\n" +
			tvShows[27] + "\n" + 
			tvShows[28] + "\n" +
			tvShows[29]);

        System.out.println("List of Reality Shows are:");
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
			realityShows[29]);

        System.out.println("List of Documentaries are:");
        System.out.println(documentaries[0] + "\n" +
			documentaries[1] + "\n" + 
			documentaries[2] + "\n" + 
			documentaries[3] + "\n" + 
			documentaries[4] + "\n" +
            documentaries[5] + "\n" + 
			documentaries[6] + "\n" + 
			documentaries[7] + "\n" + 
			documentaries[8] + "\n" + 
			documentaries[9] + "\n" +
            documentaries[10] + "\n" +
			documentaries[11] + "\n" +
			documentaries[12] + "\n" +
			documentaries[13] + "\n" +
			documentaries[14] + "\n" +
            documentaries[15] + "\n" + 
			documentaries[16] + "\n" + 
			documentaries[17] + "\n" + 
			documentaries[18] + "\n" +
			documentaries[19] + "\n" +
            documentaries[20] + "\n" +
			documentaries[21] + "\n" + 
			documentaries[22] + "\n" + 
			documentaries[23] + "\n" + 
			documentaries[24] + "\n" +
            documentaries[25] + "\n" +
			documentaries[26] + "\n" + 
			documentaries[27] + "\n" +
			documentaries[28] + "\n" + 
			documentaries[29]);

        
        System.out.println("List of Short Films are:");
           System.out.println(shortFilms[0] + "\n" +
			shortFilms[1] + "\n" +
			shortFilms[2] + "\n" +
			shortFilms[3] + "\n"+ 
			shortFilms[4] + "\n" +
            shortFilms[5] + "\n" + 
			shortFilms[6] + "\n" +
			shortFilms[7] + "\n" + 
			shortFilms[8] + "\n" +
			shortFilms[9] + "\n" +
            shortFilms[10] + "\n" + 
			shortFilms[11] + "\n" +
			shortFilms[12] + "\n" +
			shortFilms[13] + "\n" + 
			shortFilms[14] + "\n" +
            shortFilms[15] + "\n" + 
			shortFilms[16] + "\n" + 
			shortFilms[17] + "\n" +
			shortFilms[18] + "\n" +
			shortFilms[19] + "\n" +
            shortFilms[20] + "\n" + 
			shortFilms[21] + "\n" +
			shortFilms[22] + "\n" +
			shortFilms[23] + "\n" + 
			shortFilms[24] + "\n" +
            shortFilms[25] + "\n" + 
			shortFilms[26] + "\n" + 
			shortFilms[27] + "\n" +
			shortFilms[28] + "\n" +
			shortFilms[29]);

        System.out.println("List of Music Shows are:" );
		  System.out.println(musicShows[0] + "\n" + 
		    musicShows[1] + "\n" +
		   musicShows[2] + "\n" +
		   musicShows[3] + "\n" +
		    musicShows[4] + "\n" +
            musicShows[5] + "\n" +
			musicShows[6] + "\n" + 
			musicShows[7] + "\n" +
			musicShows[8] + "\n" +
			musicShows[9] + "\n" +
            musicShows[10] + "\n" + 
			musicShows[11] + "\n" +
			musicShows[12] + "\n" +
			musicShows[13] + "\n" +
			musicShows[14] + "\n" +
            musicShows[15] + "\n" + 
			musicShows[16] + "\n" + 
			musicShows[17] + "\n" + 
			musicShows[18] + "\n" + 
			musicShows[19] + "\n" +
            musicShows[20] + "\n" +
			musicShows[21] + "\n" + 
			musicShows[22] + "\n" +
			musicShows[23] + "\n" +
			musicShows[24] + "\n" +
            musicShows[25] + "\n" +
			musicShows[26] + "\n" +
			musicShows[27] + "\n" +
			musicShows[28] + "\n" +
			musicShows[29]);*/
			
			
			
			/*System.out.println("List of Web Series are:");

String AbhaySeason3 = webSeries[0];
System.out.println(AbhaySeason3);

String SpecialOps = webSeries[1];
System.out.println(SpecialOps);

String Kaafir = webSeries[2];
System.out.println(Kaafir);

String RangbaazPhirse = webSeries[3];
System.out.println(RangbaazPhirse);

String Tanaav = webSeries[4];
System.out.println(Tanaav);

String Jamai20 = webSeries[5];
System.out.println(Jamai20);

String StateOfSiege2611 = webSeries[6];
System.out.println(StateOfSiege2611);

String RanaNaidu = webSeries[7];
System.out.println(RanaNaidu);

String SheSeason2 = webSeries[8];
System.out.println(SheSeason2);

String Rudra = webSeries[9];
System.out.println(Rudra);

String MumbaiDiaries2611 = webSeries[10];
System.out.println(MumbaiDiaries2611);

String Breathe2 = webSeries[11];
System.out.println(Breathe2);

String Raktanchal2 = webSeries[12];
System.out.println(Raktanchal2);

String BicchooKaKhel = webSeries[13];
System.out.println(BicchooKaKhel);

String TheGoneGame2 = webSeries[14];
System.out.println(TheGoneGame2);

String Shoorveer = webSeries[15];
System.out.println(Shoorveer);

String PaatalLok = webSeries[16];
System.out.println(PaatalLok);

String Faltu = webSeries[17];
System.out.println(Faltu);

String Farzi = webSeries[18];
System.out.println(Farzi);

String CodeM = webSeries[19];
System.out.println(CodeM);

String JeetKiZid = webSeries[20];
System.out.println(JeetKiZid);

String Rangbaaz = webSeries[21];
System.out.println(Rangbaaz);

String KaunBanegiShikharwati = webSeries[22];
System.out.println(KaunBanegiShikharwati);

String SpecialOps15 = webSeries[23];
System.out.println(SpecialOps15);

String Breathe = webSeries[24];
System.out.println(Breathe);

String Rudra2 = webSeries[25];
System.out.println(Rudra2);

String Tanaav2 = webSeries[26];
System.out.println(Tanaav2);

String Raktanchal = webSeries[27];
System.out.println(Raktanchal);

String Abhay4 = webSeries[28];
System.out.println(Abhay4);

String Avrodh = webSeries[29];
System.out.println(Avrodh);

System.out.println("List of TV Shows are:");

String Anupamaa = tvShows[0];
System.out.println(Anupamaa);

String YehRishtaKyaKehlataHai = tvShows[1];
System.out.println(YehRishtaKyaKehlataHai);

String GhumHaiKisikeyPyaarMeiin = tvShows[2];
System.out.println(GhumHaiKisikeyPyaarMeiin);

String KundaliBhagya = tvShows[3];
System.out.println(KundaliBhagya);

String TaarakMehtaKaOoltahChashmah = tvShows[4];
System.out.println(TaarakMehtaKaOoltahChashmah);

String Imlie = tvShows[5];
System.out.println(Imlie);

String BhagyaLakshmi = tvShows[6];
System.out.println(BhagyaLakshmi);

String PandyaStore = tvShows[7];
System.out.println(PandyaStore);

String KumkumBhagya = tvShows[8];
System.out.println(KumkumBhagya);

String Naagin = tvShows[9];
System.out.println(Naagin);

String YehHaiChahatein = tvShows[10];
System.out.println(YehHaiChahatein);

String Udaariyaan = tvShows[11];
System.out.println(Udaariyaan);

String Parineetii = tvShows[12];
System.out.println(Parineetii);

String SpyBahuu = tvShows[13];
System.out.println(SpyBahuu);

String BadeAchheLagteHain = tvShows[14];
System.out.println(BadeAchheLagteHain);

String RadhaKrishn = tvShows[15];
System.out.println(RadhaKrishn);

String Meet = tvShows[16];
System.out.println(Meet);

String Molkki = tvShows[17];
System.out.println(Molkki);

String SargamKiSadheSatii = tvShows[18];
System.out.println(SargamKiSadheSatii);

String MuskuraneKiWajahTumHo = tvShows[19];
System.out.println(MuskuraneKiWajahTumHo);

String Swaragini = tvShows[20];
System.out.println(Swaragini);

String KasautiZindagiKay = tvShows[21];
System.out.println(KasautiZindagiKay);

String IshqMeinMarjawan = tvShows[22];
System.out.println(IshqMeinMarjawan);

String SasuralSimarKa = tvShows[23];
System.out.println(SasuralSimarKa);

String SaathNibhaanaSaathiya = tvShows[24];
System.out.println(SaathNibhaanaSaathiya);

String ChotiSarrdaarni = tvShows[25];
System.out.println(ChotiSarrdaarni);

String BarristerBabu = tvShows[26];
System.out.println(BarristerBabu);

String ThapkiPyarKi = tvShows[27];
System.out.println(ThapkiPyarKi);

String BalikaVadhu = tvShows[28];
System.out.println(BalikaVadhu);

String DevonKeDevMahadev = tvShows[29];
System.out.println(DevonKeDevMahadev);
System.out.println("List of Reality Shows are:");

String BiggBoss = realityShows[0];
System.out.println(BiggBoss);

String IndianIdol = realityShows[1];
System.out.println(IndianIdol);

String DanceIndiaDance = realityShows[2];
System.out.println(DanceIndiaDance);

String KhatronKeKhiladi = realityShows[3];
System.out.println(KhatronKeKhiladi);

String MasterChefIndia = realityShows[4];
System.out.println(MasterChefIndia);

String Roadies = realityShows[5];
System.out.println(Roadies);

String Splitsvilla = realityShows[6];
System.out.println(Splitsvilla);

String IndiasGotTalent = realityShows[7];
System.out.println(IndiasGotTalent);

String TheKapilSharmaShow = realityShows[8];
System.out.println(TheKapilSharmaShow);

String SaReGaMaPa = realityShows[9];
System.out.println(SaReGaMaPa);

String SuperDancer = realityShows[10];
System.out.println(SuperDancer);

String NachBaliye = realityShows[11];
System.out.println(NachBaliye);

String DIDSuperMoms = realityShows[12];
System.out.println(DIDSuperMoms);

String Hunarbaaz = realityShows[13];
System.out.println(Hunarbaaz);

String MTVLoveSchool = realityShows[14];
System.out.println(MTVLoveSchool);

String LockUpp = realityShows[15];
System.out.println(LockUpp);

String SharkTankIndia = realityShows[16];
System.out.println(SharkTankIndia);

String TheVoiceIndia = realityShows[17];
System.out.println(TheVoiceIndia);

String IndiasBestDancer = realityShows[18];
System.out.println(IndiasBestDancer);

String RisingStar = realityShows[19];
System.out.println(RisingStar);

String MujhseShaadiKaroge = realityShows[20];
System.out.println(MujhseShaadiKaroge);

String SmartJodi = realityShows[21];
System.out.println(SmartJodi);

String SuperSinger = realityShows[22];
System.out.println(SuperSinger);

String MTVHustle = realityShows[23];
System.out.println(MTVHustle);

String IndiasNextSuperstars = realityShows[24];
System.out.println(IndiasNextSuperstars);

String FearFactorIndia = realityShows[25];
System.out.println(FearFactorIndia);

String IndianMatchmaking = realityShows[26];
System.out.println(IndianMatchmaking);

String TheCircleIndia = realityShows[27];
System.out.println(TheCircleIndia);

String IndianProMusicLeague = realityShows[28];
System.out.println(IndianProMusicLeague);

String DancePlus = realityShows[29];
System.out.println(DancePlus);

System.out.println("List of Documentaries are:");

String TheSocialDilemma = documentaries[0];
System.out.println(TheSocialDilemma);

String HouseOfSecrets = documentaries[1];
System.out.println(HouseOfSecrets);

String DelhiCrimeStory = documentaries[2];
System.out.println(DelhiCrimeStory);

String BadBoyBillionaires = documentaries[3];
System.out.println(BadBoyBillionaires);

String IndianPredator = documentaries[4];
System.out.println(IndianPredator);

String OurPlanet = documentaries[5];
System.out.println(OurPlanet);

String PlanetEarth = documentaries[6];
System.out.println(PlanetEarth);

String TheLastDance = documentaries[7];
System.out.println(TheLastDance);

String InsideBillGatesBrain = documentaries[8];
System.out.println(InsideBillGatesBrain);

String TigerKing = documentaries[9];
System.out.println(TigerKing);

String TheGreatIndianMurder = documentaries[10];
System.out.println(TheGreatIndianMurder);

String Formula1DriveToSurvive = documentaries[11];
System.out.println(Formula1DriveToSurvive);

String MakingAMurderer = documentaries[12];
System.out.println(MakingAMurderer);

String WildWildCountry = documentaries[13];
System.out.println(WildWildCountry);

String TheIvoryGame = documentaries[14];
System.out.println(TheIvoryGame);

String JiroDreamsOfSushi = documentaries[15];
System.out.println(JiroDreamsOfSushi);

String TheWorldsMostExtraordinaryHomes = documentaries[16];
System.out.println(TheWorldsMostExtraordinaryHomes);

String Rotten = documentaries[17];
System.out.println(Rotten);

String Explained = documentaries[18];
System.out.println(Explained);

String DirtyMoney = documentaries[19];
System.out.println(DirtyMoney);

String TheGameChangers = documentaries[20];
System.out.println(TheGameChangers);

String NightStalker = documentaries[21];
System.out.println(NightStalker);

String AmericanMurder = documentaries[22];
System.out.println(AmericanMurder);

String DontFWithCats = documentaries[23];
System.out.println(DontFWithCats);

String TheTrialsOfGabrielFernandez = documentaries[24];
System.out.println(TheTrialsOfGabrielFernandez);

String Cosmos = documentaries[25];
System.out.println(Cosmos);

String Becoming = documentaries[26];
System.out.println(Becoming);

String MissAmericana = documentaries[27];
System.out.println(MissAmericana);

String TheMinimalists = documentaries[28];
System.out.println(TheMinimalists);

String MyOctopusTeacher = documentaries[29];
System.out.println(MyOctopusTeacher);

System.out.println("List of Short Films are:");

String Juice = shortFilms[0];
System.out.println(Juice);

String Chutney = shortFilms[1];
System.out.println(Chutney);

String Devi = shortFilms[2];
System.out.println(Devi);

String TheSchoolBag = shortFilms[3];
System.out.println(TheSchoolBag);

String Ahalya = shortFilms[4];
System.out.println(Ahalya);

String Kriti = shortFilms[5];
System.out.println(Kriti);

String TheWallet = shortFilms[6];
System.out.println(TheWallet);

String NayantaraNecklace = shortFilms[7];
System.out.println(NayantaraNecklace);

String Carbon = shortFilms[8];
System.out.println(Carbon);

String InteriorCafeNight = shortFilms[9];
System.out.println(InteriorCafeNight);

String Khujli = shortFilms[10];
System.out.println(Khujli);

String BypassRoad = shortFilms[11];
System.out.println(BypassRoad);

String TheOtherWay = shortFilms[12];
System.out.println(TheOtherWay);

String TheCakeStory = shortFilms[13];
System.out.println(TheCakeStory);

String Anukul = shortFilms[14];
System.out.println(Anukul);

String ChaarCutAt = shortFilms[15];
System.out.println(ChaarCutAt);

String RoganJosh = shortFilms[16];
System.out.println(RoganJosh);

String Shunyata = shortFilms[17];
System.out.println(Shunyata);

String MumbaiVairi = shortFilms[18];
System.out.println(MumbaiVairi);

String TheRelationshipManager = shortFilms[19];
System.out.println(TheRelationshipManager);

String Ouch = shortFilms[20];
System.out.println(Ouch);

String Majnu = shortFilms[21];
System.out.println(Majnu);

String Stained = shortFilms[22];
System.out.println(Stained);

String Taandav = shortFilms[23];
System.out.println(Taandav);

String TheHomecoming = shortFilms[24];
System.out.println(TheHomecoming);

String TheAudition = shortFilms[25];
System.out.println(TheAudition);

String TheWoman = shortFilms[26];
System.out.println(TheWoman);

String TheLetter = shortFilms[27];
System.out.println(TheLetter);

String TheGift = shortFilms[28];
System.out.println(TheGift);

String TheLastWish = shortFilms[29];
System.out.println(TheLastWish);

System.out.println("List of Music Shows are:");

String CokeStudio = musicShows[0];
System.out.println(CokeStudio);

String MTVUnplugged = musicShows[1];
System.out.println(MTVUnplugged);

String TheVoice = musicShows[2];
System.out.println(TheVoice);

String SaReGaMaPaMusic = musicShows[3];
System.out.println(SaReGaMaPaMusic);

String IndianIdolMusic = musicShows[4];
System.out.println(IndianIdolMusic);

String RisingStarMusic = musicShows[5];
System.out.println(RisingStarMusic);

String SuperSingerMusic = musicShows[6];
System.out.println(SuperSingerMusic);

String DilHaiHindustani = musicShows[7];
System.out.println(DilHaiHindustani);

String Antakshari = musicShows[8];
System.out.println(Antakshari);

String FameGurukul = musicShows[9];
System.out.println(FameGurukul);

String IndianProMusicLeagueShow = musicShows[10];
System.out.println(IndianProMusicLeagueShow);

String MTVHustleMusic = musicShows[11];
System.out.println(MTVHustleMusic);

String HunarbaazMusic = musicShows[12];
System.out.println(HunarbaazMusic);

String IndiasBestSinger = musicShows[13];
System.out.println(IndiasBestSinger);

String TheStage = musicShows[14];
System.out.println(TheStage);

String HighPitch = musicShows[15];
System.out.println(HighPitch);

String SurKshetra = musicShows[16];
System.out.println(SurKshetra);

String TheGreatIndianLaughterChallengeMusic = musicShows[17];
System.out.println(TheGreatIndianLaughterChallengeMusic);

String VoiceOfIndia = musicShows[18];
System.out.println(VoiceOfIndia);

String BattleOfBands = musicShows[19];
System.out.println(BattleOfBands);

String MusicKaMahamuqabala = musicShows[20];
System.out.println(MusicKaMahamuqabala);

String DilSe = musicShows[21];
System.out.println(DilSe);

String MTVRockOn = musicShows[22];
System.out.println(MTVRockOn);

String SaReGaMaLittleChamps = musicShows[23];
System.out.println(SaReGaMaLittleChamps);

String MTVCokeStudio = musicShows[24];
System.out.println(MTVCokeStudio);

String IndieHainHum = musicShows[25];
System.out.println(IndieHainHum);

String SoundTrippin = musicShows[26];
System.out.println(SoundTrippin);

String TheConcert = musicShows[27];
System.out.println(TheConcert);

String MusicIndia = musicShows[28];
System.out.println(MusicIndia);

String MelodyMasters = musicShows[29];
System.out.println(MelodyMasters);*/




		
		 
			
	}
	
	 static void getwebSeries()
	 {
		 System.out.println("the web series are:");
	     for (String series:webSeries){
			 System.out.println(series);
		 }
		 
		 
	 }  
	   static void getTvShows(){
		System.out.println("the tv shows are:");
		for (String tv:tvShows){
			System.out.println(tv);
		}
		}
		static void getRealityShows(){
			
		System.out.println("the reality shows are:");
		for (String  Reality : realityShows){
			System.out.println(Reality );
		}
		}
		 static void getDocumentaries(){
		System.out.println("\nDocumentaries:");
        for (String doc : documentaries) {
            System.out.println(doc);
        }
		 }
		 static void getShortFilms(){
		 System.out.println("\nShort Films:");
        for (String sf : shortFilms) {
            System.out.println(sf);
        }
		 }
		
		static void getMusicShows(){
		 System.out.println("\nMusic Shows:");
        for (String music : musicShows) {
            System.out.println(music);
        }
		}
	
}	