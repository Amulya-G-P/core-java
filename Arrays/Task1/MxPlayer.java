class MxPlayer {
	       
		   
		  static String corianDrama[] = { "Anupama", "Kundali Bhagya", "Imlie", "Ghum Hai Kisikey Pyaar Meiin", "Pandya Store","Katha Ankahee", "Saath Nibhaana Saathiya", "Kasautii Zindagii Kay", "Shubharambh", "Molkki","Ek Nayi Pehchaan", "Choti Sarrdaarni", "Mariam Khan", "Rabb Se Hai Dua", "Dil Diyaan Gallaan", "Ziddi Dil Maane Na", "Teri Meri Ikk Jindri", "Patiala Babes", "Udaariyaan", "Sasural Simar Ka", "Anurag", "Bhagyalaxmi", "Ek Duje Ke Vaaste", "Tujhse Hai Raabta", "Ghum Hai Kisikey Special","Pandya Store Special", "Imlie 2", "Kumkum Bhagya", "Yeh Rishta Kya Kehlata Hai", "Bade Achhe Lagte Hain"};
          static String albumsSongs[] = {"Shape of You", "Blinding Lights", "Levitating", "Peaches", "Save Your Tears", "Bad Habits", "Stay", "Heat Waves", "As It Was", "Shivers", "Industry Baby", "Montero", "Good 4 U", "Drivers License", "Mood","Kahani Suno", "Pasoori", "Kesariya", "Naatu Naatu", "Raatan Lambiyan","Titliaan", "Excuses", "Bijlee Bijlee", "Doobey", "Chandigarh Kare Aashiqui","Jhoome Jo Pathaan", "Tum Tum", "Raataan Lambiyan", "Bhool Bhulaiyaa 2", "Param Sundari" };
          static String thriller[] = {"Sacred Games", "Mirzapur", "Special Ops", "The Family Man", "Paatal Lok","Delhi Crime", "Bard of Blood", "Asur", "Aarya", "Hostages", "Inside Edge", "Criminal Justice", "Breathe", "Undekhi", "Mismatched","Farzi", "Jamtara", "Tabbar", "Grahan", "Made in Heaven","Pushpa Thriller Edition", "Kahaani 2", "Drishyam 2", "KGF Chapter 2", "RRR","Salaar", "Vikram", "Leo", "Beast", "Valimai" };
		  static String liveSports[] = {"IPL 2026 Live", "World Cup Cricket", "Pro Kabaddi", "ISL Football", "Indian Super League","Premier League Football", "NBA Live", "WWE RAW", "WWE SmackDown", "UFC Live","Tennis Grand Slam", "Wimbledon Live", "US Open Tennis", "French Open Tennis", "Australian Open Tennis","Hockey India League", "Badminton Premier League", "Formula 1 Live", "MotoGP Live", "FIFA World Cup Qualifiers","Boxing Championship", "MMA Events", "Athletics Meet Live", "Kabaddi Live", "Cricket Ranji Trophy","T20 Blast", "Big Bash League", "Euro Cup Football", "Copa America Football", "ICC T20 League"};
          static String livePerformances[] = {"Arijit Singh Live", "Shreya Ghoshal Live", "Neha Kakkar Concert", "Sonu Nigam Live", "Sunidhi Chauhan Performance", "A R Rahman Live", "Tony Kakkar Concert", "Badshah Live", "B Praak Live", "Darshan Raval Concert","Atif Aslam Live", "Armaan Malik Live", "Himesh Reshammiya Concert", "KK Live Performance", "Ankit Tiwari Live","Salim Sulaiman Performance", "Neeti Mohan Live", "Jubin Nautiyal Concert", "Pritam Live", "Vishal Shekhar Live","Shankar Ehsaan Loy Performance", "Mohit Chauhan Live", "Sunil Kamath Performance", "Prateek Kuhad Live", "Ritviz Live", "Divine Live Performance", "Nucleya Live", "Emiway Bantai Live", "Raftaar Live", "Bhuvan Bam Concert"};
          static String trendingClips[] = {"Viral TikTok", "Funny Memes", "Dance Challenges", "Short Comedy", "Cooking Clips","DIY Videos", "Magic Tricks", "Motivational Shorts", "Travel Vlogs", "Fitness Clips", "Pet Videos", "Gamer Highlights", "Tech Reviews", "Movie Scenes", "Music Shorts","Cricket Highlights", "Football Goals", "Bollywood Scenes", "Fashion Tips", "Makeup Tutorials","Science Experiments", "News Shorts", "Current Events Clips", "Celebrity Moments", "Street Interviews","Challenge Videos", "Reaction Clips", "Parody Videos", "Sports Recap", "Live Performances"};
       
	   
   public static void main(String[] args) {
	   getcorianDrama();
	   getalbumsSongs();
	   getthriller();
	   getliveSports ();
	   getlivePerformances();
	   gettrendingClips ();
		
		
        /*String anupama = "Anupama";
        String kundalibhagya = "Kundali Bhagya";
        String imlie = "Imlie";
        String ghumhai = "Ghum Hai Kisikey Pyaar Meiin";
        String pandyastore = "Pandya Store";
        String kathaankahee = "Katha Ankahee";
        String saathnibhaana = "Saath Nibhaana Saathiya";
        String kasautii = "Kasautii Zindagii Kay";
        String shubharambh = "Shubharambh";
        String molkki = "Molkki";
        String eknayipehchaan = "Ek Nayi Pehchaan";
        String chotisarrdaarni = "Choti Sarrdaarni";
        String mariamkhan = "Mariam Khan";
        String rabbsehaidua = "Rabb Se Hai Dua";
        String dildiyaangallaan = "Dil Diyaan Gallaan";
        String ziddidilmaenena = "Ziddi Dil Maane Na";
        String terimeriikkjindri = "Teri Meri Ikk Jindri";
        String patialababes = "Patiala Babes";
        String udaariyaan = "Udaariyaan";
        String sasuralsimarka = "Sasural Simar Ka";
        String anurag = "Anurag";
        String bhagyalaxmi = "Bhagyalaxmi";
        String ekdujekevaaste = "Ek Duje Ke Vaaste";
        String tujhsehairaabta = "Tujhse Hai Raabta";
        String ghumspecial = "Ghum Hai Kisikey Special";
        String pandyastoreSpecial = "Pandya Store Special";
        String imlie2 = "Imlie 2";
        String kumkumbhagya = "Kumkum Bhagya";
        String yehrishta = "Yeh Rishta Kya Kehlata Hai";
        String badeachhelagtehain = "Bade Achhe Lagte Hain";

        String corianDrama[] = { "Anupama", "Kundali Bhagya", "Imlie", "Ghum Hai Kisikey Pyaar Meiin", "Pandya Store","Katha Ankahee", "Saath Nibhaana Saathiya", "Kasautii Zindagii Kay", "Shubharambh", "Molkki","Ek Nayi Pehchaan", "Choti Sarrdaarni", "Mariam Khan", "Rabb Se Hai Dua", "Dil Diyaan Gallaan", "Ziddi Dil Maane Na", "Teri Meri Ikk Jindri", "Patiala Babes", "Udaariyaan", "Sasural Simar Ka", "Anurag", "Bhagyalaxmi", "Ek Duje Ke Vaaste", "Tujhse Hai Raabta", "Ghum Hai Kisikey Special","Pandya Store Special", "Imlie 2", "Kumkum Bhagya", "Yeh Rishta Kya Kehlata Hai", "Bade Achhe Lagte Hain"};
         
		 System.out.println("Corian Dramas:");
        for (String drama:corianDrama) {
            System.out.println(drama);
        }
		 
		 
		 

		String shapeofyou = "Shape of You";
        String blindinglights = "Blinding Lights";
        String levitating = "Levitating";
        String peaches = "Peaches";
        String saveyourtears = "Save Your Tears";
        String badhabits = "Bad Habits";
        String stay = "Stay";
        String heatwaves = "Heat Waves";
        String asitwas = "As It Was";
        String shivers = "Shivers";
        String industrybaby = "Industry Baby";
        String montero = "Montero";
        String good4u = "Good 4 U";
        String driverslicense = "Drivers License";
        String mood = "Mood";
        String kahanisuno = "Kahani Suno";
        String pasoori = "Pasoori";
        String kesariya = "Kesariya";
        String naatunaatu = "Naatu Naatu";
        String raatanlambiyan = "Raatan Lambiyan";
        String titliaan = "Titliaan";
        String excuses = "Excuses";
        String bijlee = "Bijlee Bijlee";
        String doobey = "Doobey";
        String chandigarhkare = "Chandigarh Kare Aashiqui";
        String jhoome = "Jhoome Jo Pathaan";
        String tumtum = "Tum Tum";
        String raataan2 = "Raataan Lambiyan";
        String bhoolbhulaiyaa2 = "Bhool Bhulaiyaa 2";
        String paramsundari = "Param Sundari";

		String albumsSongs[] = {"Shape of You", "Blinding Lights", "Levitating", "Peaches", "Save Your Tears", "Bad Habits", "Stay", "Heat Waves", "As It Was", "Shivers", "Industry Baby", "Montero", "Good 4 U", "Drivers License", "Mood","Kahani Suno", "Pasoori", "Kesariya", "Naatu Naatu", "Raatan Lambiyan","Titliaan", "Excuses", "Bijlee Bijlee", "Doobey", "Chandigarh Kare Aashiqui","Jhoome Jo Pathaan", "Tum Tum", "Raataan Lambiyan", "Bhool Bhulaiyaa 2", "Param Sundari" };
        
        System.out.println("\nAlbums / Songs:");
        for (String albumsSong : albumsSongs) {
            System.out.println(albumsSong);
        }

        
        String sacredgames = "Sacred Games";
        String mirzapur = "Mirzapur";
        String specialops = "Special Ops";
        String familyman = "The Family Man";
        String paatallok = "Paatal Lok";
        String delhicrime = "Delhi Crime";
        String bardofblood = "Bard of Blood";
        String asur = "Asur";
        String aarya = "Aarya";
        String hostages = "Hostages";
        String insideedge = "Inside Edge";
        String criminaljustice = "Criminal Justice";
        String breathe = "Breathe";
        String undekhi = "Undekhi";
        String mismatched = "Mismatched";
        String farzi = "Farzi";
        String jamtara = "Jamtara";
        String tabbar = "Tabbar";
        String grahan = "Grahan";
        String madeinheaven = "Made in Heaven";
        String pushpathriller = "Pushpa Thriller Edition";
        String kahaani2 = "Kahaani 2";
        String drishyam2 = "Drishyam 2";
        String kgf2 = "KGF Chapter 2";
        String rrr = "RRR";
        String salaar = "Salaar";
        String vikram = "Vikram";
        String leo = "Leo";
        String beast = "Beast";
        String valimai = "Valimai";

       
		String thriller[] = {"Sacred Games", "Mirzapur", "Special Ops", "The Family Man", "Paatal Lok","Delhi Crime", "Bard of Blood", "Asur", "Aarya", "Hostages", "Inside Edge", "Criminal Justice", "Breathe", "Undekhi", "Mismatched","Farzi", "Jamtara", "Tabbar", "Grahan", "Made in Heaven","Pushpa Thriller Edition", "Kahaani 2", "Drishyam 2", "KGF Chapter 2", "RRR","Salaar", "Vikram", "Leo", "Beast", "Valimai" };
        
		System.out.println("\nThriller Shows:");
        for (String show: thriller) {
            System.out.println(show);
			
	    }
		
		
		String ipl2026 = "IPL 2026 Live";
        String worldcupcricket = "World Cup Cricket";
        String prokabaddi = "Pro Kabaddi";
        String islfootball = "ISL Football";
        String indsupersleague = "Indian Super League";
        String premierleague = "Premier League Football";
        String nba = "NBA Live";
        String wweraw = "WWE RAW";
        String wwesd = "WWE SmackDown";
        String ufclive = "UFC Live";
        String tennisgrand = "Tennis Grand Slam";
        String wimbledon = "Wimbledon Live";
        String usopen = "US Open Tennis";
        String frenchopen = "French Open Tennis";
        String ausopen = "Australian Open Tennis";
        String hockeyleague = "Hockey India League";
        String badmintonpremier = "Badminton Premier League";
        String formula1 = "Formula 1 Live";
        String motogp = "MotoGP Live";
        String fifaworld = "FIFA World Cup Qualifiers";
        String boxing = "Boxing Championship";
        String mmaevents = "MMA Events";
        String athleticsmeet = "Athletics Meet Live";
        String kabaddilive = "Kabaddi Live";
        String ranjeetrophy = "Cricket Ranji Trophy";
        String t20blast = "T20 Blast";
        String bigbash = "Big Bash League";
        String eurocup = "Euro Cup Football";
        String copaamerica = "Copa America Football";
        String iccT20 = "ICC T20 League";
		
		String liveSports[] = {"IPL 2026 Live", "World Cup Cricket", "Pro Kabaddi", "ISL Football", "Indian Super League","Premier League Football", "NBA Live", "WWE RAW", "WWE SmackDown", "UFC Live","Tennis Grand Slam", "Wimbledon Live", "US Open Tennis", "French Open Tennis", "Australian Open Tennis","Hockey India League", "Badminton Premier League", "Formula 1 Live", "MotoGP Live", "FIFA World Cup Qualifiers","Boxing Championship", "MMA Events", "Athletics Meet Live", "Kabaddi Live", "Cricket Ranji Trophy","T20 Blast", "Big Bash League", "Euro Cup Football", "Copa America Football", "ICC T20 League"};
        System.out.println("\nLive Sports:");
        for (String liveSport : liveSports) {
            System.out.println(liveSport);
        }
		
		
		 String arijit = "Arijit Singh Live";
        String shreya = "Shreya Ghoshal Live";
        String neha = "Neha Kakkar Concert";
        String sonu = "Sonu Nigam Live";
        String sunidhi = "Sunidhi Chauhan Performance";
        String rahman = "A R Rahman Live";
        String tony = "Tony Kakkar Concert";
        String badshah = "Badshah Live";
        String bpraak = "B Praak Live";
        String darshan = "Darshan Raval Concert";
        String atif = "Atif Aslam Live";
        String armaan = "Armaan Malik Live";
        String himesh = "Himesh Reshammiya Concert";
        String kk = "KK Live Performance";
        String ankit = "Ankit Tiwari Live";
        String salimsulaiman = "Salim Sulaiman Performance";
        String neeti = "Neeti Mohan Live";
        String jubin = "Jubin Nautiyal Concert";
        String pritam = "Pritam Live";
        String vishal = "Vishal Shekhar Live";
        String shankarehsaan = "Shankar Ehsaan Loy Performance";
        String mohit = "Mohit Chauhan Live";
        String sunil = "Sunil Kamath Performance";
        String prateek = "Prateek Kuhad Live";
        String ritviz = "Ritviz Live";
        String divine = "Divine Live Performance";
        String nucleya = "Nucleya Live";
        String emiway = "Emiway Bantai Live";
        String raftaar = "Raftaar Live";
        String bhuvanbam = "Bhuvan Bam Concert";
		
		
		String livePerformances[] = {"Arijit Singh Live", "Shreya Ghoshal Live", "Neha Kakkar Concert", "Sonu Nigam Live", "Sunidhi Chauhan Performance", "A R Rahman Live", "Tony Kakkar Concert", "Badshah Live", "B Praak Live", "Darshan Raval Concert","Atif Aslam Live", "Armaan Malik Live", "Himesh Reshammiya Concert", "KK Live Performance", "Ankit Tiwari Live","Salim Sulaiman Performance", "Neeti Mohan Live", "Jubin Nautiyal Concert", "Pritam Live", "Vishal Shekhar Live","Shankar Ehsaan Loy Performance", "Mohit Chauhan Live", "Sunil Kamath Performance", "Prateek Kuhad Live", "Ritviz Live", "Divine Live Performance", "Nucleya Live", "Emiway Bantai Live", "Raftaar Live", "Bhuvan Bam Concert"};
        System.out.println("\nLive Performances:");
        for (String perf : livePerformances) {
            System.out.println(perf);
        }
		
		String viraltiktok = "Viral TikTok";
        String funnymemes = "Funny Memes";
        String dancechallenges = "Dance Challenges";
        String shortcomedy = "Short Comedy";
        String cookingclips = "Cooking Clips";
        String diyvideos = "DIY Videos";
        String magictricks = "Magic Tricks";
        String motivational = "Motivational Shorts";
        String travelvlogs = "Travel Vlogs";
        String fitnessclips = "Fitness Clips";
        String petvideos = "Pet Videos";
        String gamerhighlights = "Gamer Highlights";
        String techreviews = "Tech Reviews";
        String moviescenes = "Movie Scenes";
        String musicshorts = "Music Shorts";
        String crickethighlights = "Cricket Highlights";
        String footballgoals = "Football Goals";
        String bollywoodscenes = "Bollywood Scenes";
        String fashion = "Fashion Tips";
        String makeuptutorials = "Makeup Tutorials";
        String scienceexperiments = "Science Experiments";
        String newsshorts = "News Shorts";
        String currentevents = "Current Events Clips";
        String celebritymoments = "Celebrity Moments";
        String streetinterviews = "Street Interviews";
        String challengevideos = "Challenge Videos";
        String reactionclips = "Reaction Clips";
        String parodyvideos = "Parody Videos";
        String sportsrecap = "Sports Recap";
        String liveperformances2 = "Live Performances";

       
		
		String trendingClips[] = {"Viral TikTok", "Funny Memes", "Dance Challenges", "Short Comedy", "Cooking Clips","DIY Videos", "Magic Tricks", "Motivational Shorts", "Travel Vlogs", "Fitness Clips", "Pet Videos", "Gamer Highlights", "Tech Reviews", "Movie Scenes", "Music Shorts","Cricket Highlights", "Football Goals", "Bollywood Scenes", "Fashion Tips", "Makeup Tutorials","Science Experiments", "News Shorts", "Current Events Clips", "Celebrity Moments", "Street Interviews","Challenge Videos", "Reaction Clips", "Parody Videos", "Sports Recap", "Live Performances"};
        System.out.println("\nTrending Clips:");
        for (String clip : trendingClips) {
            System.out.println(clip);
        }
        
        /*System.out.println("Corian Drama:\n" +
         corianDrama[0] + "\n" +
         corianDrama[1] + "\n" + 
         corianDrama[2] + "\n" + 
		 corianDrama[3] + "\n" +
		 corianDrama[4] + "\n" +
         corianDrama[5] + "\n" +
         corianDrama[6] + "\n" + 
		 corianDrama[7] + "\n" + 
		 corianDrama[8] + "\n" + 
		 corianDrama[9] + "\n" +
         corianDrama[10] + "\n" + 
		 corianDrama[11] + "\n" + 
		 corianDrama[12] + "\n" + 
		 corianDrama[13] + "\n" + 
		 corianDrama[14] + "\n" +
         corianDrama[15] + "\n" +
		 corianDrama[16] + "\n" + 
		 corianDrama[17] + "\n" + 
		 corianDrama[18] + "\n" + 
		 corianDrama[19] + "\n" +
         corianDrama[20] + "\n" + 
		 corianDrama[21] + "\n" + 
		 corianDrama[22] + "\n" + 
		 corianDrama[23] + "\n" + 
		 corianDrama[24] + "\n" +
         corianDrama[25] + "\n" + 
		 corianDrama[26] + "\n" + 
         corianDrama[27] + "\n" + 
		 corianDrama[28] + "\n" + 
		 corianDrama[29]);

         System.out.println("\nAlbums & Songs:\n" +
         albumsSongs[0] + "\n" +
		 albumsSongs[1] + "\n" +
		 albumsSongs[2] + "\n" + 
		 albumsSongs[3] + "\n" + 
		 albumsSongs[4] + "\n" +
         albumsSongs[5] + "\n" + 
		 albumsSongs[6] + "\n" + 
		 albumsSongs[7] + "\n" +
		 albumsSongs[8] + "\n" + 
		 albumsSongs[9] + "\n" +
         albumsSongs[10] + "\n" +
		 albumsSongs[11] + "\n" + 
		 albumsSongs[12] + "\n" + 
		 albumsSongs[13] + "\n" + 
		 albumsSongs[14] + "\n" +
         albumsSongs[15] + "\n" + 
		 albumsSongs[16] + "\n" + 
		 albumsSongs[17] + "\n" + 
		 albumsSongs[18] + "\n" + 
		 albumsSongs[19] + "\n" +
         albumsSongs[20] + "\n" + 
		 albumsSongs[21] + "\n" +
		 albumsSongs[22] + "\n" + 
		 albumsSongs[23] + "\n" + 
		 albumsSongs[24] + "\n" +
         albumsSongs[25] + "\n" +
		 albumsSongs[26] + "\n" + 
		 albumsSongs[27] + "\n" + 
		 albumsSongs[28] + "\n" + 
		 albumsSongs[29]);

         System.out.println("\nThriller:\n" +
          thriller[0] + "\n" +
		  thriller[1] + "\n" + 
		  thriller[2] + "\n" + 
		  thriller[3] + "\n" + 
		  thriller[4] + "\n" +
          thriller[5] + "\n" + 
		  thriller[6] + "\n" + 
		  thriller[7] + "\n" + 
		  thriller[8] + "\n" + 
		  thriller[9] + "\n" +
          thriller[10] + "\n" + 
		  thriller[11] + "\n" + 
		  thriller[12] + "\n" + 
		  thriller[13] + "\n" + 
		  thriller[14] + "\n" +
          thriller[15] + "\n" + 
		  thriller[16] + "\n" + 
		  thriller[17] + "\n" + 
		  thriller[18] + "\n" + 
		  thriller[19] + "\n" +
          thriller[20] + "\n" + 
		  thriller[21] + "\n" + 
		  thriller[22] + "\n" + 
		  thriller[23] + "\n" + 
		  thriller[24] + "\n" +
          thriller[25] + "\n" + 
		  thriller[26] + "\n" +
		  thriller[27] + "\n" + 
		  thriller[28] + "\n" + 
		  thriller[29]);

       System.out.println("\nLive Sports:\n" +
             liveSports[0] + "\n" + 
			 liveSports[1] + "\n" + 
			 liveSports[2] + "\n" + 
			 liveSports[3] + "\n" + 
			 liveSports[4] + "\n" +
             liveSports[5] + "\n" + 
			 liveSports[6] + "\n" + 
			 liveSports[7] + "\n" +
			 liveSports[8] + "\n" +
			 liveSports[9] + "\n" +
              liveSports[10] + "\n" +
			  liveSports[11] + "\n" + 
			  liveSports[12] + "\n" +
			  liveSports[13] + "\n" +
			  liveSports[14] + "\n" +
              liveSports[15] + "\n" + 
			  liveSports[16] + "\n" + 
			 liveSports[17] + "\n" +
			 liveSports[18] + "\n" + 
			 liveSports[19] + "\n" +
              liveSports[20] + "\n" + 
			  liveSports[21] + "\n" + 
			  liveSports[22] + "\n" +
			  liveSports[23] + "\n" + 
			  liveSports[24] + "\n" +
              liveSports[25] + "\n" + 
			  liveSports[26] + "\n" + 
			  liveSports[27] + "\n" + 
			  liveSports[28] + "\n" + 
			  liveSports[29]);

        System.out.println("\nLive Performances:\n" +
             livePerformances[0] + "\n" +
			 livePerformances[1] + "\n" +
			 livePerformances[2] + "\n" + 
			 livePerformances[3] + "\n" + 
			 livePerformances[4] + "\n" +
              livePerformances[5] + "\n" +
			  livePerformances[6] + "\n" + 
			  livePerformances[7] + "\n" + 
			  livePerformances[8] + "\n" + 
			  livePerformances[9] + "\n" +
              livePerformances[10] + "\n" + 
			  livePerformances[11] + "\n" + 
			  livePerformances[12] + "\n" +
			  livePerformances[13] + "\n" +
			  livePerformances[14] + "\n" +
              livePerformances[15] + "\n" +
			  livePerformances[16] + "\n" + 
			  livePerformances[17] + "\n" +
			  livePerformances[18] + "\n" +
			  livePerformances[19] + "\n" +
              livePerformances[20] + "\n" +
			  livePerformances[21] + "\n" +
			  livePerformances[22] + "\n" +
			  livePerformances[23] + "\n" +
			  livePerformances[24] + "\n" +
              livePerformances[25] + "\n" + 
			  livePerformances[26] + "\n" + 
			  livePerformances[27] + "\n" +
			  livePerformances[28] + "\n" + 
			  livePerformances[29]);

        System.out.println("\nTrending Clips:\n" +
                  trendingClips[0] + "\n" +
				  trendingClips[1] + "\n" + 
				  trendingClips[2] + "\n" + 
				  trendingClips[3] + "\n" +
				  trendingClips[4] + "\n" +
                  trendingClips[5] + "\n" + 
				  trendingClips[6] + "\n" + 
				  trendingClips[7] + "\n" +
				  trendingClips[8] + "\n" + 
				  trendingClips[9] + "\n" +
                  trendingClips[10] + "\n" + 
				  trendingClips[11] + "\n" + 
				  trendingClips[12] + "\n" + 
				  trendingClips[13] + "\n" + 
				  trendingClips[14] + "\n" +
                  trendingClips[15] + "\n" + 
				  trendingClips[16] + "\n" + 
				  trendingClips[17] + "\n" + 
				  trendingClips[18] + "\n" + 
				  trendingClips[19] + "\n" +
                  trendingClips[20] + "\n" + 
				  trendingClips[21] + "\n" +
				  trendingClips[22] + "\n" + 
				  trendingClips[23] + "\n" +
				  trendingClips[24] + "\n" +
                   trendingClips[25] + "\n" + 
				   trendingClips[26] + "\n" + 
				   trendingClips[27] + "\n" + 
				   trendingClips[28] + "\n" + 
				   trendingClips[29]);*/
				   
				   /*System.out.println("Corian Drama:");

String Anupama = corianDrama[0];
System.out.println(Anupama);

String KundaliBhagya = corianDrama[1];
System.out.println(KundaliBhagya);

String Imlie = corianDrama[2];
System.out.println(Imlie);

String GhumHaiKisikeyPyaarMeiin = corianDrama[3];
System.out.println(GhumHaiKisikeyPyaarMeiin);

String PandyaStore = corianDrama[4];
System.out.println(PandyaStore);

String KathaAnkahee = corianDrama[5];
System.out.println(KathaAnkahee);

String SaathNibhaanaSaathiya = corianDrama[6];
System.out.println(SaathNibhaanaSaathiya);

String KasautiiZindagiiKay = corianDrama[7];
System.out.println(KasautiiZindagiiKay);

String Shubharambh = corianDrama[8];
System.out.println(Shubharambh);

String Molkki = corianDrama[9];
System.out.println(Molkki);

String EkNayiPehchaan = corianDrama[10];
System.out.println(EkNayiPehchaan);

String ChotiSarrdaarni = corianDrama[11];
System.out.println(ChotiSarrdaarni);

String MariamKhan = corianDrama[12];
System.out.println(MariamKhan);

String RabbSeHaiDua = corianDrama[13];
System.out.println(RabbSeHaiDua);

String DilDiyaanGallaan = corianDrama[14];
System.out.println(DilDiyaanGallaan);

String ZiddiDilMaaneNa = corianDrama[15];
System.out.println(ZiddiDilMaaneNa);

String TeriMeriIkkJindri = corianDrama[16];
System.out.println(TeriMeriIkkJindri);

String PatialaBabes = corianDrama[17];
System.out.println(PatialaBabes);

String Udaariyaan = corianDrama[18];
System.out.println(Udaariyaan);

String SasuralSimarKa = corianDrama[19];
System.out.println(SasuralSimarKa);

String Anurag = corianDrama[20];
System.out.println(Anurag);

String Bhagyalaxmi = corianDrama[21];
System.out.println(Bhagyalaxmi);

String EkDujeKeVaaste = corianDrama[22];
System.out.println(EkDujeKeVaaste);

String TujhseHaiRaabta = corianDrama[23];
System.out.println(TujhseHaiRaabta);

String GhumHaiKisikeySpecial = corianDrama[24];
System.out.println(GhumHaiKisikeySpecial);

String PandyaStoreSpecial = corianDrama[25];
System.out.println(PandyaStoreSpecial);

String Imlie2 = corianDrama[26];
System.out.println(Imlie2);

String KumkumBhagya = corianDrama[27];
System.out.println(KumkumBhagya);

String YehRishtaKyaKehlataHai = corianDrama[28];
System.out.println(YehRishtaKyaKehlataHai);

String BadeAchheLagteHain = corianDrama[29];
System.out.println(BadeAchheLagteHain);

System.out.println("Albums & Songs:");

String ShapeOfYou = albumsSongs[0];
System.out.println(ShapeOfYou);

String BlindingLights = albumsSongs[1];
System.out.println(BlindingLights);

String Levitating = albumsSongs[2];
System.out.println(Levitating);

String Peaches = albumsSongs[3];
System.out.println(Peaches);

String SaveYourTears = albumsSongs[4];
System.out.println(SaveYourTears);

String BadHabits = albumsSongs[5];
System.out.println(BadHabits);

String Stay = albumsSongs[6];
System.out.println(Stay);

String HeatWaves = albumsSongs[7];
System.out.println(HeatWaves);

String AsItWas = albumsSongs[8];
System.out.println(AsItWas);

String Shivers = albumsSongs[9];
System.out.println(Shivers);

String IndustryBaby = albumsSongs[10];
System.out.println(IndustryBaby);

String Montero = albumsSongs[11];
System.out.println(Montero);

String Good4U = albumsSongs[12];
System.out.println(Good4U);

String DriversLicense = albumsSongs[13];
System.out.println(DriversLicense);

String Mood = albumsSongs[14];
System.out.println(Mood);

String KahaniSuno = albumsSongs[15];
System.out.println(KahaniSuno);

String Pasoori = albumsSongs[16];
System.out.println(Pasoori);

String Kesariya = albumsSongs[17];
System.out.println(Kesariya);

String NaatuNaatu = albumsSongs[18];
System.out.println(NaatuNaatu);

String RaatanLambiyan = albumsSongs[19];
System.out.println(RaatanLambiyan);

String Titliaan = albumsSongs[20];
System.out.println(Titliaan);

String Excuses = albumsSongs[21];
System.out.println(Excuses);

String BijleeBijlee = albumsSongs[22];
System.out.println(BijleeBijlee);

String Doobey = albumsSongs[23];
System.out.println(Doobey);

String ChandigarhKareAashiqui = albumsSongs[24];
System.out.println(ChandigarhKareAashiqui);

String JhoomeJoPathaan = albumsSongs[25];
System.out.println(JhoomeJoPathaan);

String TumTum = albumsSongs[26];
System.out.println(TumTum);

String RaataanLambiyan = albumsSongs[27];
System.out.println(RaataanLambiyan);

String BhoolBhulaiyaa2 = albumsSongs[28];
System.out.println(BhoolBhulaiyaa2);

String ParamSundari = albumsSongs[29];
System.out.println(ParamSundari);

System.out.println("Thriller:");
String SacredGames = thriller[0];
System.out.println(SacredGames);

String Mirzapur = thriller[1];
System.out.println(Mirzapur);

String SpecialOps = thriller[2];
System.out.println(SpecialOps);

String TheFamilyMan = thriller[3];
System.out.println(TheFamilyMan);

String PaatalLok = thriller[4];
System.out.println(PaatalLok);

String DelhiCrime = thriller[5];
System.out.println(DelhiCrime);

String BardOfBlood = thriller[6];
System.out.println(BardOfBlood);

String Asur = thriller[7];
System.out.println(Asur);

String Aarya = thriller[8];
System.out.println(Aarya);

String Hostages = thriller[9];
System.out.println(Hostages);

String InsideEdge = thriller[10];
System.out.println(InsideEdge);

String CriminalJustice = thriller[11];
System.out.println(CriminalJustice);

String Breathe = thriller[12];
System.out.println(Breathe);

String Undekhi = thriller[13];
System.out.println(Undekhi);

String Mismatched = thriller[14];
System.out.println(Mismatched);

String Farzi = thriller[15];
System.out.println(Farzi);

String Jamtara = thriller[16];
System.out.println(Jamtara);

String Tabbar = thriller[17];
System.out.println(Tabbar);

String Grahan = thriller[18];
System.out.println(Grahan);

String MadeInHeaven = thriller[19];
System.out.println(MadeInHeaven);

String PushpaThrillerEdition = thriller[20];
System.out.println(PushpaThrillerEdition);

String Kahaani2 = thriller[21];
System.out.println(Kahaani2);

String Drishyam2 = thriller[22];
System.out.println(Drishyam2);

String KGFChapter2 = thriller[23];
System.out.println(KGFChapter2);

String RRR = thriller[24];
System.out.println(RRR);

String Salaar = thriller[25];
System.out.println(Salaar);

String Vikram = thriller[26];
System.out.println(Vikram);

String Leo = thriller[27];
System.out.println(Leo);

String Beast = thriller[28];
System.out.println(Beast);

String Valimai = thriller[29];
System.out.println(Valimai);


        System.out.println("Amazon Prime – Live Sports:\n");

        String live1 = liveSports[0];
        System.out.println(live1);

        String live2 = liveSports[1];
        System.out.println(live2);

        String live3 = liveSports[2];
        System.out.println(live3);

        String live4 = liveSports[3];
        System.out.println(live4);

        String live5 = liveSports[4];
        System.out.println(live5);

        String live6 = liveSports[5];
        System.out.println(live6);

        String live7 = liveSports[6];
        System.out.println(live7);

        String live8 = liveSports[7];
        System.out.println(live8);

        String live9 = liveSports[8];
        System.out.println(live9);

        String live10 = liveSports[9];
        System.out.println(live10);

        String live11 = liveSports[10];
        System.out.println(live11);

        String live12 = liveSports[11];
        System.out.println(live12);

        String live13 = liveSports[12];
        System.out.println(live13);

        String live14 = liveSports[13];
        System.out.println(live14);

        String live15 = liveSports[14];
        System.out.println(live15);

        String live16 = liveSports[15];
        System.out.println(live16);

        String live17 = liveSports[16];
        System.out.println(live17);

        String live18 = liveSports[17];
        System.out.println(live18);

        String live19 = liveSports[18];
        System.out.println(live19);

        String live20 = liveSports[19];
        System.out.println(live20);

        String live21 = liveSports[20];
        System.out.println(live21);

        String live22 = liveSports[21];
        System.out.println(live22);

        String live23 = liveSports[22];
        System.out.println(live23);

        String live24 = liveSports[23];
        System.out.println(live24);

        String live25 = liveSports[24];
        System.out.println(live25);

        String live26 = liveSports[25];
        System.out.println(live26);

        String live27 = liveSports[26];
        System.out.println(live27);

        String live28 = liveSports[27];
        System.out.println(live28);

        String live29 = liveSports[28];
        System.out.println(live29);

        String live30 = liveSports[29];
        System.out.println(live30);
    
        String performance1 = livePerformances[0];
        System.out.println(performance1);

        String performance2 = livePerformances[1];
        System.out.println(performance2);

        String performance3 = livePerformances[2];
        System.out.println(performance3);

        String performance4 = livePerformances[3];
        System.out.println(performance4);

        String performance5 = livePerformances[4];
        System.out.println(performance5);

        String performance6 = livePerformances[5];
        System.out.println(performance6);

        String performance7 = livePerformances[6];
        System.out.println(performance7);

        String performance8 = livePerformances[7];
        System.out.println(performance8);

        String performance9 = livePerformances[8];
        System.out.println(performance9);

        String performance10 = livePerformances[9];
        System.out.println(performance10);

        String performance11 = livePerformances[10];
        System.out.println(performance11);

        String performance12 = livePerformances[11];
        System.out.println(performance12);

        String performance13 = livePerformances[12];
        System.out.println(performance13);

        String performance14 = livePerformances[13];
        System.out.println(performance14);

        String performance15 = livePerformances[14];
        System.out.println(performance15);

        String performance16 = livePerformances[15];
        System.out.println(performance16);

        String performance17 = livePerformances[16];
        System.out.println(performance17);

        String performance18 = livePerformances[17];
        System.out.println(performance18);

        String performance19 = livePerformances[18];
        System.out.println(performance19);

        String performance20 = livePerformances[19];
        System.out.println(performance20);

        String performance21 = livePerformances[20];
        System.out.println(performance21);

        String performance22 = livePerformances[21];
        System.out.println(performance22);

        String performance23 = livePerformances[22];
        System.out.println(performance23);

        String performance24 = livePerformances[23];
        System.out.println(performance24);

        String performance25 = livePerformances[24];
        System.out.println(performance25);

        String performance26 = livePerformances[25];
        System.out.println(performance26);

        String performance27 = livePerformances[26];
        System.out.println(performance27);

        String performance28 = livePerformances[27];
        System.out.println(performance28);

        String performance29 = livePerformances[28];
        System.out.println(performance29);
		

        String clip1 = trendingClips[0];
        System.out.println(clip1);

        String clip2 = trendingClips[1];
        System.out.println(clip2);

        String clip3 = trendingClips[2];
        System.out.println(clip3);

        String clip4 = trendingClips[3];
        System.out.println(clip4);

        String clip5 = trendingClips[4];
        System.out.println(clip5);

        String clip6 = trendingClips[5];
        System.out.println(clip6);

        String clip7 = trendingClips[6];
        System.out.println(clip7);

        String clip8 = trendingClips[7];
        System.out.println(clip8);

        String clip9 = trendingClips[8];
        System.out.println(clip9);

        String clip10 = trendingClips[9];
        System.out.println(clip10);

        String clip11 = trendingClips[10];
        System.out.println(clip11);

        String clip12 = trendingClips[11];
        System.out.println(clip12);

        String clip13 = trendingClips[12];
        System.out.println(clip13);

        String clip14 = trendingClips[13];
        System.out.println(clip14);

        String clip15 = trendingClips[14];
        System.out.println(clip15);

        String clip16 = trendingClips[15];
        System.out.println(clip16);

        String clip17 = trendingClips[16];
        System.out.println(clip17);

        String clip18 = trendingClips[17];
        System.out.println(clip18);

        String clip19 = trendingClips[18];
        System.out.println(clip19);

        String clip20 = trendingClips[19];
        System.out.println(clip20);

        String clip21 = trendingClips[20];
        System.out.println(clip21);

        String clip22 = trendingClips[21];
        System.out.println(clip22);

        String clip23 = trendingClips[22];
        System.out.println(clip23);

        String clip24 = trendingClips[23];
        System.out.println(clip24);

        String clip25 = trendingClips[24];
        System.out.println(clip25);

        String clip26 = trendingClips[25];
        System.out.println(clip26);

        String clip27 = trendingClips[26];
        System.out.println(clip27);

        String clip28 = trendingClips[27];
        System.out.println(clip28);

        String clip29 = trendingClips[28];
        System.out.println(clip29);*/

        
    }
	  static void getcorianDrama(){
	System.out.println("Corian Dramas:");
        for (String drama:corianDrama) {
            System.out.println(drama);
	  } }
	  static void getalbumsSongs(){
		 System.out.println("\nAlbums / Songs:");
        for (String albumsSong : albumsSongs) {
            System.out.println(albumsSong);
	  }}
		static void getthriller(){
		System.out.println("\nThriller Shows:");
        for (String show: thriller) {
            System.out.println(show);
			
	    }}
		static void getliveSports (){
		System.out.println("\nLive Sports:");
        for (String liveSport : liveSports) {
            System.out.println(liveSport);
        }}
		static void getlivePerformances(){
		System.out.println("\nLive Performances:");
        for (String perf : livePerformances) {
            System.out.println(perf);
        }}
		static void gettrendingClips (){
		System.out.println("\nTrending Clips:");
        for (String clip : trendingClips) {
            System.out.println(clip);
        }
		}
		
}

        
   