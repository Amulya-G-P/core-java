class JioCinema {

     
	 static String kidsShows[] = {"Chhota Bheem","Motu Patlu","Shin Chan","Doraemon","Pokemon","Little Singham","Krishna Balram","Oggy and the Cockroaches","Tom and Jerry","Peppa Pig","SpongeBob SquarePants","Power Rangers","Ben 10","Teen Titans","My Little Pony","Adventure Time","The Loud House","Caillou","Barbie Dreamhouse","Captain Tsubasa","Roll No 21","Noddy","Bobby & Bill","Shinchan Specials","Super Bheem","Motu Patlu - Flying Rangers","Doraemon: Nobita","Pokemon: Indigo","Little Krishna","Chhota Bheem Mighty Raju"};
     static String musicVideos[] = {"T-Series Top Hits","Bollywood Remix","Jio Music Charts","Indian Pop Hits","Punjabi Beats","Romantic Songs","Dance Hits","Classic Bollywood","Folk Songs","Indie Music India", "Hip Hop India","Rock & Metal India","Love Ballads","Party Anthems","Trending Songs","Top 10 Hits","New Releases","International Hits","Desi Rap","Electronic Beats","Acoustic India","Jio DJ Mix","Soulful Tunes","Top Singles India","Music Vlogs","Cover Songs India","Live Concerts","Jio Playlist","Top Artists India","Pop Hits India"};
	 static String sportsHighlights[] = {"IPL Highlights","Football India","Hockey Highlights","Badminton India","Tennis Matches","Cricket All Stars","Kabaddi Highlights","Wrestling India","Athletics India","Sports Quiz","Basketball India","Olympics India","Para Sports","Marathon Highlights","National Games India","Rugby India","Golf India","Swimming India","Cycling India","Table Tennis India","Boxing India","Judo Highlights","Shooting India","Gymnastics India","Volleyball India","Cricket Analysis","Football League Highlights","Sports Talk India","Top Players India","All Sports India"};
	 static String newsTalks[] = {"India News Today","Headlines India","Evening Bulletin","Prime News","Live Debate India","Talk India","Current Affairs India","Morning News","Political Debate","Business News India","Global News India","News Roundup","Special Report","Editorial Talk","Sports News","Technology News","Health Talk","Entertainment News","Crime Report India","Weather News","India Hour","News Analysis","City News India","Politics Today","Talk Show India","Daily News India","Economy Update","Education News","Interview India","Evening Talk"};
     static String travelShows[] = {"Backpacking India","Explore India","Road Trips","Himalayan Adventures","Rivers & Lakes","Indian Heritage Tour","Cultural Journey","Desert Safari","Mountain Trails","Island Hopping","Hidden Gems India","Eco Tours","Wildlife Safari","City Walks India","Railway Journeys","Adventure India","Food Travel India","Village Life India","North-East India","Monsoon Travel","Beach Stories","Travel Diaries India","National Parks Tour","Indian Temples Tour","Spiritual Journey","Festivals Tour","Historical India","Urban India Tours","Rural India Travel","Trekking India"};
     static String cookingShows[] = {"MasterChef India","Cook With Love","Indian Cuisine Secrets","Street Food India","Quick Recipes","Dessert Special","Healthy Cooking","Baking India","Traditional Recipes","Spice Route India","Regional Flavors","Chef's Special","Home Cooking India","Vegan Recipes India","Festive Cooking","Street Snacks","Cooking Challenge","Foodie India","Kitchen Secrets","Chef Stories","Grill & Roast India","Indian Desserts","Soup & Salad India","Cooking Basics India","World Cuisine India","Cooking for Kids","Recipe Hunt India","Cooking Hacks","Jio Chef Show"};                   
        
	 public static void main(String[] args) {
         getkidsShows();
		 getmusicVideos();
		 getsportsHighlights();
		 getnewsTalks();
		  gettravelShows();
		  getcookingShows();
	 
	 
        /*String chhotabheem = "chhota bheem";
        String motupatlu = "motu patlu";
        String shinchan = "shin chan";
        String doraemon = "doraemon";
        String pokemon = "pokemon";
        String littlesingham = "little singham";
        String krishnabalram = "krishna balram";
        String oggy = "oggy and the cockroaches";
        String tomandjerry = "tom and jerry";
        String peppapig = "peppa pig";
        String spongebob = "spongebob squarepants";
        String powerrangers = "power rangers";
        String ben10 = "ben 10";
        String teentitans = "teen titans";
        String mylittlepony = "my little pony";
        String adventuretime = "adventure time";
        String loudhouse = "the loud house";
        String caillou = "caillou";
        String barbie = "barbie dreamhouse";
        String captain = "captain tsubasa";
        String rollno21 = "roll no 21";
        String noddy = "noddy";
        String bobbybill = "bobby and bill";
        String shinchanspecial = "shinchan specials";
        String superbeem = "super bheem";
        String flyingrangers = "motu patlu flying rangers";
        String nobita = "doraemon nobita";
        String indigo = "pokemon indigo";
        String littlekrishna = "little krishna";
        String mightyraju = "mighty raju";

        String kidsShows[] = {"Chhota Bheem","Motu Patlu","Shin Chan","Doraemon","Pokemon","Little Singham","Krishna Balram","Oggy and the Cockroaches","Tom and Jerry","Peppa Pig","SpongeBob SquarePants","Power Rangers","Ben 10","Teen Titans","My Little Pony","Adventure Time","The Loud House","Caillou","Barbie Dreamhouse","Captain Tsubasa","Roll No 21","Noddy","Bobby & Bill","Shinchan Specials","Super Bheem","Motu Patlu - Flying Rangers","Doraemon: Nobita","Pokemon: Indigo","Little Krishna","Chhota Bheem Mighty Raju"};
        System.out.println("Kids Shows:");
        for (String kidShow : kidsShows) {
            System.out.println(kidShow);
        }

        String tseries = "t-series top hits";
        String bollywoodremix = "bollywood remix";
        String jiomusiccharts = "jio music charts";
        String indianpophits = "indian pop hits";
        String punjabibeats = "punjabi beats";
        String romanticsongs = "romantic songs";
        String dancehits = "dance hits";
        String classicbollywood = "classic bollywood";
        String folksongs = "folk songs";
        String indiemusic = "indie music india";
        String hiphop = "hip hop india";
        String rockmetal = "rock and metal india";
        String loveballads = "love ballads";
        String partyanthems = "party anthems";
        String trendingsongs = "trending songs";
        String top10 = "top 10 hits";
        String newreleases = "new releases";
        String internationalhits = "international hits";
        String desirap = "desi rap";
        String electronicbeats = "electronic beats";
        String acousticindia = "acoustic india";
        String djmix = "jio dj mix";
        String soulfultunes = "soulful tunes";
        String topsingles = "top singles india";
        String musicvlogs = "music vlogs";
        String coversongs = "cover songs india";
        String liveconcerts = "live concerts";
        String jioplaylist = "jio playlist";
        String topartists = "top artists india";
        String pophits = "pop hits india";

		String musicVideos[] = {"T-Series Top Hits","Bollywood Remix","Jio Music Charts","Indian Pop Hits","Punjabi Beats","Romantic Songs","Dance Hits","Classic Bollywood","Folk Songs","Indie Music India", "Hip Hop India","Rock & Metal India","Love Ballads","Party Anthems","Trending Songs","Top 10 Hits","New Releases","International Hits","Desi Rap","Electronic Beats","Acoustic India","Jio DJ Mix","Soulful Tunes","Top Singles India","Music Vlogs","Cover Songs India","Live Concerts","Jio Playlist","Top Artists India","Pop Hits India"};
        System.out.println("Music Videos:");
        for (String musicVideo : musicVideos) {
            System.out.println(musicVideo);
        }

        String ipl = "ipl highlights";
        String footballindia = "football india";
        String hockey = "hockey highlights";
        String badminton = "badminton india";
        String tennis = "tennis matches";
        String cricketallstars = "cricket all stars";
        String kabaddi = "kabaddi highlights";
        String wrestling = "wrestling india";
        String athletics = "athletics india";
        String sportsquiz = "sports quiz";
        String basketball = "basketball india";
        String olympics = "olympics india";
        String parasports = "para sports";
        String marathon = "marathon highlights";
        String nationalgames = "national games india";
        String rugby = "rugby india";
        String golf = "golf india";
        String swimming = "swimming india";
        String cycling = "cycling india";
        String tabletennis = "table tennis india";
        String boxing = "boxing india";
        String judo = "judo highlights";
        String shooting = "shooting india";
        String gymnastics = "gymnastics india";
        String volleyball = "volleyball india";
        String cricketanalysis = "cricket analysis";
        String footballleague = "football league highlights";
        String sportstalk = "sports talk india";
        String topplayers = "top players india";
        String allsports = "all sports india";

      
		String sportsHighlights[] = {"IPL Highlights","Football India","Hockey Highlights","Badminton India","Tennis Matches","Cricket All Stars","Kabaddi Highlights","Wrestling India","Athletics India","Sports Quiz","Basketball India","Olympics India","Para Sports","Marathon Highlights","National Games India","Rugby India","Golf India","Swimming India","Cycling India","Table Tennis India","Boxing India","Judo Highlights","Shooting India","Gymnastics India","Volleyball India","Cricket Analysis","Football League Highlights","Sports Talk India","Top Players India","All Sports India"};
        System.out.println("Sports Highlights:");
        for (String sportHighlight : sportsHighlights) {
            System.out.println(sportHighlight);
        }

        String indianewstoday = "india news today";
        String headlinesindia = "headlines india";
        String eveningbulletin = "evening bulletin";
        String primenews = "prime news";
        String livedebate = "live debate india";
        String talkindia = "talk india";
        String currentaffairs = "current affairs india";
        String morningnews = "morning news";
        String politicaldebate = "political debate";
        String businessnews = "business news india";
        String globalnews = "global news india";
        String newsroundup = "news roundup";
        String specialreport = "special report";
        String editorialtalk = "editorial talk";
        String sportsnews = "sports news";
        String technologynews = "technology news";
        String healthtalk = "health talk";
        String entertainmentnews = "entertainment news";
        String crimereport = "crime report india";
        String weathernews = "weather news";
        String indiahour = "india hour";
        String newsanalysis = "news analysis";
        String citynews = "city news india";
        String politicstoday = "politics today";
        String talkshow = "talk show india";
        String dailynews = "daily news india";
        String economyupdate = "economy update";
        String educationnews = "education news";
        String interviewindia = "interview india";

		String newsTalks[] = {"India News Today","Headlines India","Evening Bulletin","Prime News","Live Debate India","Talk India","Current Affairs India","Morning News","Political Debate","Business News India","Global News India","News Roundup","Special Report","Editorial Talk","Sports News","Technology News","Health Talk","Entertainment News","Crime Report India","Weather News","India Hour","News Analysis","City News India","Politics Today","Talk Show India","Daily News India","Economy Update","Education News","Interview India","Evening Talk"};
        System.out.println("News Talk:");
        for (String newsTalk : newsTalks) {
            System.out.println(newsTalk);
        }
		
        String backpackingindia = "backpacking india";
        String exploreindia = "explore india";
        String roadtrips = "road trips";
        String himalayanadventures = "himalayan adventures";
        String riverslakes = "rivers & lakes";
        String indianheritagetour = "indian heritage tour";
        String culturaljourney = "cultural journey";
        String desertsafari = "desert safari";
        String mountaintrails = "mountain trails";
        String islandhopping = "island hopping";
        String hiddengems = "hidden gems india";
        String ecotours = "eco tours";
        String wildlifesafari = "wildlife safari";
        String citywalks = "city walks india";
        String railwayjourneys = "railway journeys";
        String adventureindia = "adventure india";
        String foodtravel = "food travel india";
        String villagelife = "village life india";
        String northeastindia = "north-east india";
        String monsoontravel = "monsoon travel";
        String beachstories = "beach stories";
        String traveldiaries = "travel diaries india";
        String nationalparks = "national parks tour";
        String temples = "indian temples tour";
        String spiritualjourney = "spiritual journey";
        String festivalstour = "festivals tour";
        String historicalindia = "historical india";
        String urbanindiatours = "urban india tours";
        String ruralindia = "rural india travel";
        String trekkingindia = "trekking india";
		
		String travelShows[] = {"Backpacking India","Explore India","Road Trips","Himalayan Adventures","Rivers & Lakes","Indian Heritage Tour","Cultural Journey","Desert Safari","Mountain Trails","Island Hopping","Hidden Gems India","Eco Tours","Wildlife Safari","City Walks India","Railway Journeys","Adventure India","Food Travel India","Village Life India","North-East India","Monsoon Travel","Beach Stories","Travel Diaries India","National Parks Tour","Indian Temples Tour","Spiritual Journey","Festivals Tour","Historical India","Urban India Tours","Rural India Travel","Trekking India"};
         System.out.println("Travel Shows:");
        for (String travelShow : travelShows) {
            System.out.println(travelShow);
        } 
		
        String masterchef = "masterchef india";
        String cookwithlove = "cook with love";
        String indiancuisine = "indian cuisine secrets";
        String streetfood = "street food india";
        String quickrecipes = "quick recipes";
        String dessertspecial = "dessert special";
        String healthycooking = "healthy cooking";
        String bakingindia = "baking india";
        String traditionalrecipes = "traditional recipes";
        String spiceroute = "spice route india";
        String regionalflavors = "regional flavors";
        String chefsspecial = "chef's special";
        String homecooking = "home cooking india";
        String veganrecipes = "vegan recipes india";
        String festivecooking = "festive cooking";
        String streetsnacks = "street snacks";
        String cookingchallenge = "cooking challenge";
        String foodieindia = "foodie india";
        String kitchensecrets = "kitchen secrets";
        String chefstories = "chef stories";
        String grillroast = "grill & roast india";
        String indiandesserts = "indian desserts";
        String soupnsalad = "soup & salad india";
        String cookingbasics = "cooking basics india";
        String worldcuisine = "world cuisine india";
        String cookingforkids = "cooking for kids";
        String recipehunt = "recipe hunt india";
        String cookinghacks = "cooking hacks";

        

		String cookingShows[] = {"MasterChef India","Cook With Love","Indian Cuisine Secrets","Street Food India","Quick Recipes","Dessert Special","Healthy Cooking","Baking India","Traditional Recipes","Spice Route India","Regional Flavors","Chef's Special","Home Cooking India","Vegan Recipes India","Festive Cooking","Street Snacks","Cooking Challenge","Foodie India","Kitchen Secrets","Chef Stories","Grill & Roast India","Indian Desserts","Soup & Salad India","Cooking Basics India","World Cuisine India","Cooking for Kids","Recipe Hunt India","Cooking Hacks","Jio Chef Show"};                   
        System.out.println("Cooking Shows:");
        for (String cookingShow : cookingShows) {
            System.out.println(cookingShow);
        }
	}
	
}
		
		
		
		
		
		
		
       /*System.out.println("List of Kids Shows:" );
            System.out.println(kidsShows[0] + "\n" + 
			 kidsShows[1] + "\n" +
			 kidsShows[2] + "\n" + 
			 kidsShows[3] + "\n" +
			 kidsShows[4] + "\n" +
            kidsShows[5] + "\n" +
			kidsShows[6] + "\n" +
			kidsShows[7] + "\n" +
			kidsShows[8] + "\n" + 
			kidsShows[9] + "\n" +
            kidsShows[10] + "\n" +
			kidsShows[11] + "\n" +
			kidsShows[12] + "\n" + 
			kidsShows[13] + "\n" +
			kidsShows[14] + "\n" +
            kidsShows[15] + "\n" + 
			kidsShows[16] + "\n" + 
			kidsShows[17] + "\n" + 
			kidsShows[18] + "\n" + 
			kidsShows[19] + "\n" +
            kidsShows[20] + "\n" + 
			kidsShows[21] + "\n" + 
			kidsShows[22] + "\n" + 
			kidsShows[23] + "\n" + 
			kidsShows[24] + "\n" +
            kidsShows[25] + "\n" + 
			kidsShows[26] + "\n" + 
			kidsShows[27] + "\n" + 
			kidsShows[28] + "\n" + 
			kidsShows[29]);

        
        System.out.println("List of Music Videos:" );
          System.out.println(musicVideos[0] + "\n" +
			musicVideos[1] + "\n" + 
			musicVideos[2] + "\n" + 
			musicVideos[3] + "\n" + 
			musicVideos[4] + "\n" +
            musicVideos[5] + "\n" + 
			musicVideos[6] + "\n" +
			musicVideos[7] + "\n" + 
			musicVideos[8] + "\n" + 
			musicVideos[9] + "\n" +
            musicVideos[10] + "\n" +
			musicVideos[11] + "\n" + 
			musicVideos[12] + "\n" + 
			musicVideos[13] + "\n" +
			musicVideos[14] + "\n" +
            musicVideos[15] + "\n" + 
			musicVideos[16] + "\n" +
			musicVideos[17] + "\n" + 
			musicVideos[18] + "\n" + 
			musicVideos[19] + "\n" +
            musicVideos[20] + "\n" + 
			musicVideos[21] + "\n" + 
			musicVideos[22] + "\n" + 
			musicVideos[23] + "\n" + 
			musicVideos[24] + "\n" +
            musicVideos[25] + "\n" + 
			musicVideos[26] + "\n" + 
			musicVideos[27] + "\n" + 
			musicVideos[28] + "\n" + 
			musicVideos[29]);

        
        System.out.println("List of Sports Highlights:"); 
          System.out.println(sportsHighlights[0] + "\n" + 
			sportsHighlights[1] + "\n" + 
			sportsHighlights[2] + "\n" + 
			sportsHighlights[3] + "\n" + 
			sportsHighlights[4] + "\n" +
            sportsHighlights[5] + "\n" + 
			sportsHighlights[6] + "\n" + 
			sportsHighlights[7] + "\n" + 
			sportsHighlights[8] + "\n" + 
			sportsHighlights[9] + "\n" +
            sportsHighlights[10] + "\n" + 
			sportsHighlights[11] + "\n" + 
			sportsHighlights[12] + "\n" + 
			sportsHighlights[13] + "\n" + 
			sportsHighlights[14] + "\n" +
            sportsHighlights[15] + "\n" + 
			sportsHighlights[16] + "\n" + 
			sportsHighlights[17] + "\n" + 
			sportsHighlights[18] + "\n" + 
			sportsHighlights[19] + "\n" +
            sportsHighlights[20] + "\n" + 
			sportsHighlights[21] + "\n" + 
			sportsHighlights[22] + "\n" + 
			sportsHighlights[23] + "\n" + 
			sportsHighlights[24] + "\n" +
            sportsHighlights[25] + "\n" + 
			sportsHighlights[26] + "\n" + 
			sportsHighlights[27] + "\n" + 
			sportsHighlights[28] + "\n" + 
			sportsHighlights[29]);

       
        System.out.println("List of News  Shows:");
          System.out.println(newsTalk[0] + "\n" + 
			newsTalk[1] + "\n" + 
			newsTalk[2] + "\n" + 
			newsTalk[3] + "\n" + 
			newsTalk[4] + "\n" +
            newsTalk[5] + "\n" + 
			newsTalk[6] + "\n" + 
			newsTalk[7] + "\n" + 
			newsTalk[8] + "\n" + 
			newsTalk[9] + "\n" +
            newsTalk[10] + "\n" +
			newsTalk[11] + "\n" + 
			newsTalk[12] + "\n" + 
			newsTalk[13] + "\n" + 
			newsTalk[14] + "\n" +
            newsTalk[15] + "\n" + 
			newsTalk[16] + "\n" + 
			newsTalk[17] + "\n" + 
			newsTalk[18] + "\n" + 
			newsTalk[19] + "\n" +
            newsTalk[20] + "\n" + 
			newsTalk[21] + "\n" + 
			newsTalk[22] + "\n" + 
			newsTalk[23] + "\n" + 
			newsTalk[24] + "\n" +
            newsTalk[25] + "\n" + 
			newsTalk[26] + "\n" + 
			newsTalk[27] + "\n" + 
			newsTalk[28] + "\n" + 
			newsTalk[29]);

        
        System.out.println("List of Travel Shows:");
           System.out.println(travelShows[0] + "\n" +
			travelShows[1] + "\n" +
			travelShows[2] + "\n" + 
			travelShows[3] + "\n" + 
			travelShows[4] + "\n" +
            travelShows[5] + "\n" + 
			travelShows[6] + "\n" +
			travelShows[7] + "\n" +
			travelShows[8] + "\n" + 
			travelShows[9] + "\n" +
            travelShows[10] + "\n" +
			travelShows[11] + "\n" +
			travelShows[12] + "\n" + 
			travelShows[13] + "\n" + 
			travelShows[14] + "\n" +
            travelShows[15] + "\n" + 
			travelShows[16] + "\n" + 
			travelShows[17] + "\n" +
			travelShows[18] + "\n" +
			travelShows[19] + "\n" +
            travelShows[20] + "\n" + 
			travelShows[21] + "\n" +
			travelShows[22] + "\n" + 
			travelShows[23] + "\n" +
			travelShows[24] + "\n" +
            travelShows[25] + "\n" + 
			travelShows[26] + "\n" + 
			travelShows[27] + "\n" +
			travelShows[28] + "\n" +
			travelShows[29]);

        
        System.out.println("List of Cooking Shows:");
         System.out.println(cookingShows[0] + "\n" + 
			cookingShows[1] + "\n" + 
			cookingShows[2] + "\n" +
			cookingShows[3] + "\n" +
			cookingShows[4] + "\n" +
            cookingShows[5] + "\n" +
			cookingShows[6] + "\n" + 
			cookingShows[7] + "\n" +
			cookingShows[8] + "\n" +
			cookingShows[9] + "\n" +
            cookingShows[10] + "\n" + 
			cookingShows[11] + "\n" + 
			cookingShows[12] + "\n" + 
			cookingShows[13] + "\n" + 
			cookingShows[14] + "\n" +
            cookingShows[15] + "\n" + 
			cookingShows[16] + "\n" +
			cookingShows[17] + "\n" + 
			cookingShows[18] + "\n" + 
			cookingShows[19] + "\n" +
            cookingShows[20] + "\n" +
			cookingShows[21] + "\n" +
			cookingShows[22] + "\n" +
			cookingShows[23] + "\n" + 
			cookingShows[24] + "\n" +
            cookingShows[25] + "\n" +
			cookingShows[26] + "\n" + 
			cookingShows[27] + "\n" + 
			cookingShows[28] + "\n" + 
			cookingShows[29]);*/
			
			//System.out.println("List of Kids Shows:");

/*String ChhotaBheem = kidsShows[0];
System.out.println(ChhotaBheem);

String MotuPatlu = kidsShows[1];
System.out.println(MotuPatlu);

String ShinChan = kidsShows[2];
System.out.println(ShinChan);

String Doraemon = kidsShows[3];
System.out.println(Doraemon);

String Pokemon = kidsShows[4];
System.out.println(Pokemon);

String LittleSingham = kidsShows[5];
System.out.println(LittleSingham);

String KrishnaBalram = kidsShows[6];
System.out.println(KrishnaBalram);

String OggyAndCockroaches = kidsShows[7];
System.out.println(OggyAndCockroaches);

String TomAndJerry = kidsShows[8];
System.out.println(TomAndJerry);

String PeppaPig = kidsShows[9];
System.out.println(PeppaPig);

String SpongeBob = kidsShows[10];
System.out.println(SpongeBob);

String PowerRangers = kidsShows[11];
System.out.println(PowerRangers);

String Ben10 = kidsShows[12];
System.out.println(Ben10);

String TeenTitans = kidsShows[13];
System.out.println(TeenTitans);

String MyLittlePony = kidsShows[14];
System.out.println(MyLittlePony);

String AdventureTime = kidsShows[15];
System.out.println(AdventureTime);

String TheLoudHouse = kidsShows[16];
System.out.println(TheLoudHouse);

String Caillou = kidsShows[17];
System.out.println(Caillou);

String BarbieDreamhouse = kidsShows[18];
System.out.println(BarbieDreamhouse);

String CaptainTsubasa = kidsShows[19];
System.out.println(CaptainTsubasa);

String RollNo21 = kidsShows[20];
System.out.println(RollNo21);

String Noddy = kidsShows[21];
System.out.println(Noddy);

String BobbyAndBill = kidsShows[22];
System.out.println(BobbyAndBill);

String ShinchanSpecials = kidsShows[23];
System.out.println(ShinchanSpecials);

String SuperBheem = kidsShows[24];
System.out.println(SuperBheem);

String MotuPatluFlyingRangers = kidsShows[25];
System.out.println(MotuPatluFlyingRangers);

String DoraemonNobita = kidsShows[26];
System.out.println(DoraemonNobita);

String PokemonIndigo = kidsShows[27];
System.out.println(PokemonIndigo);

String LittleKrishna = kidsShows[28];
System.out.println(LittleKrishna);

String MightyRaju = kidsShows[29];
System.out.println(MightyRaju);


System.out.println("List of Music Videos:");

String ShapeOfYou = musicVideos[0];
System.out.println(ShapeOfYou);

String BlindingLights = musicVideos[1];
System.out.println(BlindingLights);

String TumHiHo = musicVideos[2];
System.out.println(TumHiHo);

String Kesariya = musicVideos[3];
System.out.println(Kesariya);

String ButtaBomma = musicVideos[4];
System.out.println(ButtaBomma);

String ArabicKuthu = musicVideos[5];
System.out.println(ArabicKuthu);

String KalaChashma = musicVideos[6];
System.out.println(KalaChashma);

String VaathiComing = musicVideos[7];
System.out.println(VaathiComing);

String Believer = musicVideos[8];
System.out.println(Believer);

String Faded = musicVideos[9];
System.out.println(Faded);

String Senorita = musicVideos[10];
System.out.println(Senorita);

String Dynamite = musicVideos[11];
System.out.println(Dynamite);

String Levitating = musicVideos[12];
System.out.println(Levitating);

String NaatuNaatu = musicVideos[13];
System.out.println(NaatuNaatu);

String ApnaBanaLe = musicVideos[14];
System.out.println(ApnaBanaLe);

String Pasoori = musicVideos[15];
System.out.println(Pasoori);

String OoAntava = musicVideos[16];
System.out.println(OoAntava);

String Samajavaragamana = musicVideos[17];
System.out.println(Samajavaragamana);

String WhyThisKolaveri = musicVideos[18];
System.out.println(WhyThisKolaveri);

String TakiTaki = musicVideos[19];
System.out.println(TakiTaki);

String Hukum = musicVideos[20];
System.out.println(Hukum);

String Ghungroo = musicVideos[21];
System.out.println(Ghungroo);

String MalangTitleTrack = musicVideos[22];
System.out.println(MalangTitleTrack);

String RowdyBaby = musicVideos[23];
System.out.println(RowdyBaby);

String JaiJaiShivshankar = musicVideos[24];
System.out.println(JaiJaiShivshankar);

String Srivalli = musicVideos[25];
System.out.println(Srivalli);

String ChammakChallo = musicVideos[26];
System.out.println(ChammakChallo);

String BrownMunde = musicVideos[27];
System.out.println(BrownMunde);

String KurchiMadathapetti = musicVideos[28];
System.out.println(KurchiMadathapetti);

String Ranjha = musicVideos[29];
System.out.println(Ranjha);

System.out.println("List of Sports Highlights:");

String IPLFinal2023 = sportsHighlights[0];
System.out.println(IPLFinal2023);

String WorldCupFinal2011 = sportsHighlights[1];
System.out.println(WorldCupFinal2011);

String T20WorldCup2022 = sportsHighlights[2];
System.out.println(T20WorldCup2022);

String AsiaCupFinal = sportsHighlights[3];
System.out.println(AsiaCupFinal);

String ChampionsLeagueFinal = sportsHighlights[4];
System.out.println(ChampionsLeagueFinal);

String ElClasicoHighlights = sportsHighlights[5];
System.out.println(ElClasicoHighlights);

String WimbledonFinal = sportsHighlights[6];
System.out.println(WimbledonFinal);

String AustralianOpenFinal = sportsHighlights[7];
System.out.println(AustralianOpenFinal);

String USOpenFinal = sportsHighlights[8];
System.out.println(USOpenFinal);

String FrenchOpenFinal = sportsHighlights[9];
System.out.println(FrenchOpenFinal);

String KabaddiFinal = sportsHighlights[10];
System.out.println(KabaddiFinal);

String ISLFinal = sportsHighlights[11];
System.out.println(ISLFinal);

String FIFAWorldCupFinal = sportsHighlights[12];
System.out.println(FIFAWorldCupFinal);

String ProKabaddiFinal = sportsHighlights[13];
System.out.println(ProKabaddiFinal);

String NBAFinals = sportsHighlights[14];
System.out.println(NBAFinals);

String SuperBowl = sportsHighlights[15];
System.out.println(SuperBowl);

String CopaAmericaFinal = sportsHighlights[16];
System.out.println(CopaAmericaFinal);

String BBLFinal = sportsHighlights[17];
System.out.println(BBLFinal);

String IPLHatTrick = sportsHighlights[18];
System.out.println(IPLHatTrick);

String FastestCentury = sportsHighlights[19];
System.out.println(FastestCentury);

String HistoricTestMatch = sportsHighlights[20];
System.out.println(HistoricTestMatch);

String VolleyballChampionship = sportsHighlights[21];
System.out.println(VolleyballChampionship);

String BadmintonFinal = sportsHighlights[22];
System.out.println(BadmintonFinal);

String HockeyWorldCupFinal = sportsHighlights[23];
System.out.println(HockeyWorldCupFinal);

String BoxingTitleFight = sportsHighlights[24];
System.out.println(BoxingTitleFight);

String Formula1GrandPrix = sportsHighlights[25];
System.out.println(Formula1GrandPrix);

String MotoGPFinalRace = sportsHighlights[26];
System.out.println(MotoGPFinalRace);

String MarathonChampionship = sportsHighlights[27];
System.out.println(MarathonChampionship);

String CommonwealthGamesFinal = sportsHighlights[28];
System.out.println(CommonwealthGamesFinal);

String OlympicGoldMoment = sportsHighlights[29];
System.out.println(OlympicGoldMoment);



String PrimeTimeNews = newsTalk[0];
System.out.println(PrimeTimeNews);

String BreakingNewsLive = newsTalk[1];
System.out.println(BreakingNewsLive);

String MorningHeadlines = newsTalk[2];
System.out.println(MorningHeadlines);

String EveningDebate = newsTalk[3];
System.out.println(EveningDebate);

String NationWantsToKnow = newsTalk[4];
System.out.println(NationWantsToKnow);

String NewsHour = newsTalk[5];
System.out.println(NewsHour);

String TopStoriesToday = newsTalk[6];
System.out.println(TopStoriesToday);

String WorldNewsUpdate = newsTalk[7];
System.out.println(WorldNewsUpdate);

String BusinessBulletin = newsTalk[8];
System.out.println(BusinessBulletin);

String PoliticalDebate = newsTalk[9];
System.out.println(PoliticalDebate);

String MarketLive = newsTalk[10];
System.out.println(MarketLive);

String TechNewsToday = newsTalk[11];
System.out.println(TechNewsToday);

String HealthUpdate = newsTalk[12];
System.out.println(HealthUpdate);

String SportsNews = newsTalk[13];
System.out.println(SportsNews);

String SpecialReport = newsTalk[14];
System.out.println(SpecialReport);

String GroundReport = newsTalk[15];
System.out.println(GroundReport);

String ElectionSpecial = newsTalk[16];
System.out.println(ElectionSpecial);

String InternationalNews = newsTalk[17];
System.out.println(InternationalNews);

String WeatherForecast = newsTalk[18];
System.out.println(WeatherForecast);

String WeekendDebate = newsTalk[19];
System.out.println(WeekendDebate);

String BudgetSpecial = newsTalk[20];
System.out.println(BudgetSpecial);

String ExclusiveInterview = newsTalk[21];
System.out.println(ExclusiveInterview);

String ParliamentSessionLive = newsTalk[22];
System.out.println(ParliamentSessionLive);

String CrimeReport = newsTalk[23];
System.out.println(CrimeReport);

String RealityCheck = newsTalk[24];
System.out.println(RealityCheck);

String FactCheck = newsTalk[25];
System.out.println(FactCheck);

String CityBulletin = newsTalk[26];
System.out.println(CityBulletin);

String GlobalSummitCoverage = newsTalk[27];
System.out.println(GlobalSummitCoverage);

String PressConferenceLive = newsTalk[28];
System.out.println(PressConferenceLive);

String MidnightNews = newsTalk[29];
System.out.println(MidnightNews);

System.out.println("List of Travel Shows:");

String IncredibleIndia = travelShows[0];
System.out.println(IncredibleIndia);

String WorldTourDiaries = travelShows[1];
System.out.println(WorldTourDiaries);

String BackpackingAdventures = travelShows[2];
System.out.println(BackpackingAdventures);

String HiddenParadise = travelShows[3];
System.out.println(HiddenParadise);

String MountainEscape = travelShows[4];
System.out.println(MountainEscape);

String BeachLife = travelShows[5];
System.out.println(BeachLife);

String CityExplorer = travelShows[6];
System.out.println(CityExplorer);

String FoodAndTravel = travelShows[7];
System.out.println(FoodAndTravel);

String DesertSafari = travelShows[8];
System.out.println(DesertSafari);

String IslandJourney = travelShows[9];
System.out.println(IslandJourney);

String HeritageWalks = travelShows[10];
System.out.println(HeritageWalks);

String RoadTripIndia = travelShows[11];
System.out.println(RoadTripIndia);

String EuropeOnWheels = travelShows[12];
System.out.println(EuropeOnWheels);

String HimalayanTrek = travelShows[13];
System.out.println(HimalayanTrek);

String WildlifeSafari = travelShows[14];
System.out.println(WildlifeSafari);

String AncientTemplesTour = travelShows[15];
System.out.println(AncientTemplesTour);

String CruiseVacation = travelShows[16];
System.out.println(CruiseVacation);

String AdventureTrails = travelShows[17];
System.out.println(AdventureTrails);

String CulturalJourney = travelShows[18];
System.out.println(CulturalJourney);

String ExploreAsia = travelShows[19];
System.out.println(ExploreAsia);

String DiscoverEurope = travelShows[20];
System.out.println(DiscoverEurope);

String TravelWithFriends = travelShows[21];
System.out.println(TravelWithFriends);

String VillageLifeStories = travelShows[22];
System.out.println(VillageLifeStories);

String SnowyAdventures = travelShows[23];
System.out.println(SnowyAdventures);

String RainforestExpedition = travelShows[24];
System.out.println(RainforestExpedition);

String HistoricCastles = travelShows[25];
System.out.println(HistoricCastles);

String NatureLoversTrip = travelShows[26];
System.out.println(NatureLoversTrip);

String WeekendGetaway = travelShows[27];
System.out.println(WeekendGetaway);

String WorldHeritageSites = travelShows[28];
System.out.println(WorldHeritageSites);

String AroundTheGlobe = travelShows[29];
System.out.println(AroundTheGlobe);



System.out.println("List of Cooking Shows:");

String MasterChefIndia = cookingShows[0];
System.out.println(MasterChefIndia);

String KitchenSuperstar = cookingShows[1];
System.out.println(KitchenSuperstar);

String TastyBites = cookingShows[2];
System.out.println(TastyBites);

String StreetFoodMagic = cookingShows[3];
System.out.println(StreetFoodMagic);

String BakingMasterclass = cookingShows[4];
System.out.println(BakingMasterclass);

String HomeChefSpecial = cookingShows[5];
System.out.println(HomeChefSpecial);

String FlavoursOfIndia = cookingShows[6];
System.out.println(FlavoursOfIndia);

String QuickRecipes = cookingShows[7];
System.out.println(QuickRecipes);

String HealthyCooking = cookingShows[8];
System.out.println(HealthyCooking);

String DessertDelight = cookingShows[9];
System.out.println(DessertDelight);

String VeggieSpecial = cookingShows[10];
System.out.println(VeggieSpecial);

String NonVegTreats = cookingShows[11];
System.out.println(NonVegTreats);

String FiveMinuteRecipes = cookingShows[12];
System.out.println(FiveMinuteRecipes);

String GrandmaKitchen = cookingShows[13];
System.out.println(GrandmaKitchen);

String FestivalSpecialDishes = cookingShows[14];
System.out.println(FestivalSpecialDishes);

String InternationalCuisine = cookingShows[15];
System.out.println(InternationalCuisine);

String BBQNation = cookingShows[16];
System.out.println(BBQNation);

String SweetAndSpicy = cookingShows[17];
System.out.println(SweetAndSpicy);

String TraditionalTastes = cookingShows[18];
System.out.println(TraditionalTastes);

String ModernKitchen = cookingShows[19];
System.out.println(ModernKitchen);

String RegionalRecipes = cookingShows[20];
System.out.println(RegionalRecipes);

String CookingWithKids = cookingShows[21];
System.out.println(CookingWithKids);

String ChefSpecialMenu = cookingShows[22];
System.out.println(ChefSpecialMenu);

String AuthenticFlavours = cookingShows[23];
System.out.println(AuthenticFlavours);

String TandooriSecrets = cookingShows[24];
System.out.println(TandooriSecrets);
String SouthIndianKitchen = cookingShows[25];
System.out.println(SouthIndianKitchen);
String NorthIndianDelights = cookingShows[26];
System.out.println(NorthIndianDelights);
String ChineseCorner = cookingShows[27];
System.out.println(ChineseCorner);
String ItalianTreats = cookingShows[28];
System.out.println(ItalianTreats);
String ContinentalCuisine = cookingShows[29];
System.out.println(ContinentalCuisine);*/
} 

        static void getkidsShows(){
        System.out.println("Kids Shows:");
        for (String kidShow : kidsShows) {
            System.out.println(kidShow);
        }
		}
		static  void getmusicVideos(){
		System.out.println("Music Videos:");
        for (String musicVideo : musicVideos) {
            System.out.println(musicVideo);
        }}
		static void getsportsHighlights(){
        System.out.println("Sports Highlights:");
        for (String sportHighlight : sportsHighlights) {
            System.out.println(sportHighlight);
        }}
		static void getnewsTalks(){
		System.out.println("News Talk:");
        for (String newsTalk : newsTalks) {
            System.out.println(newsTalk);
        }}
		static void gettravelShows(){
        System.out.println("Travel Shows:");
        for (String travelShow : travelShows) {
            System.out.println(travelShow);
        }}
        static void getcookingShows(){
        System.out.println("Cooking Shows:");
        for (String cookingShow : cookingShows) {
            System.out.println(cookingShow);
        }}
	}




        
        
    

