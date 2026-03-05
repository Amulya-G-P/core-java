

class Netflix {
 static String kannadaMovies[]= {"Toxic","Landlord"," Billa Ranga Baasha","KD","Max","karavalli"," Gharaya","GandhiTalks"," Chowkidhar"," Howdhu Huliya"," Mavuta"," lce mocktail"," the ice","jaganmanthe Akkkamahadevi", " Theeertharoopa Thandeyavarige","Shivlella","katle"," cult","bayakegalu Beruridaga","Valavaara"," Seat edge"," Amruthaanjana"," Raktha Kashmira","Sarala Subbarao"," janumadha jodi"," kotigobbha"," kirik party ","charlie"," Salaar","bagheera"}; 
 static String englishMovies[]={ " Mindhunter"," The haunting of hill "," Top Boy"," Ozark"," My hero Academia "," Godless" ," When i see you "," The Dark Crystal"," Stranger Things"," Narcos"," After life"," Master of None "," Arcane"," blue Eye samurai"," Pluto"," Devilman Crybaby"," Peaky Blinkers"," Midnight Mass", " Adolescence"," Derek"," Daredevil", "Locke and Key", " F is for family"," Archive 81"," Terminator Zero"," Amercian Primeval"," love,death and Robots"," Griselda"," Boy Swallows"," Twilight of the Gods" };  
 static String hindiMovies[]={ "Jawan"," jaane jaan"," Gangubai Kathiawadi"," Haseen Dillruba"," animal"," Ludo"," Laapataa Ladies"," Sector 36"," Kathal"," Monica"," Bulbbul"," Pagglait"," Mimmi"," Ak vs Ak"," Kho Gayye Hum Kahan"," Mission Majnu"," Serious Men", "Sacred Games", " Heeramandi"," Delhi Crime"," guns and Gullabs"," khakee"," The railway Men"," Jamtara"," Kota Factory "," Aranyak"," 12th fail", " Darlings" ," Amar Singh Chamkilla",};
 static String tamilMovies[]= {" leo "," Beast"," GOAt"," Thangalaan","Maharaja"," Amaran"," Good Bad Ugly"," Thunivu"," VidaaMUyarchi"," Jigarthanda doubleX"," Iraivan"," Doctor"," Indian2"," Raangi"," Kalagathalaivan"," Thugd of Hindostan"," jagame Thandhiram"," Sinam"," Thiruvin Kural"," Asvins"," Love today"," Thunivu"," Navaraasa"," Mandala"," Gatta Kusthi", " Vaathi"," Kaantha"," Revolver Rita"," Don"," Iraivan"};
 static String teluguMovies[]={"Devara"," Puspha 2"," Lucky Baskar"," Saripodhaa Sanivaaram"," Guntur Kaaram"," kalki"," Hi Nanna"," Tillu Square "," HIT"," Double is smart "," Daaku Maharaaj", " Akhanda"," Virupaksha"," Miss Shetty Mr Polisheety", "Ante Sundaraniki"," Shyam Singha Roy"," Walter Veeraya"," Bhaje Vaayu Vegam","MAD"," Pitta Kathalu"," Anaganaga OKa raju"," Dont trouble the trouble"," The Paradise"," Takshakkudu","Mayasabha", "Dhootha"," Rana Naidu"," Kumari Srimathi", "90"};
 static String malayalamMovies[]={"Minnal Murali"," kurup"," Aadujeevitham"," Iratta"," Kappela"," jana Gana Mana"," Thallumaala"," CBI 5"," Forensic"," Ullozhukku"," A Ranjith Cinenma"," Kaapa ","Rcx"," Anweshippin Kandethum", " nijan prakashan"," Sudani from Nigeria"," Kumari"," kondal", " Adios Amigo", " Vaashi"," Sesham Mike-il Fathima","Padmini", "Thundu", " Night Drive"," Irul"," The teacher "," kaapa"," Dear Friend"," Nijan Prakashan"," Rifle Club"}; 


  public static void main(String[] args) {
	  
	  getkannadaMovies();
	  getenglishMovies();
	  gethindiMovies();
	  gettamilMovies();
	  getteluguMovies();
	  getmalayalamMovies();
	  
	  
	  
	  
		
        /*String toxic = "Toxic";
        String landlord = "Landlord";
        String billaRangaBaasha = "Billa Ranga Baasha";
        String kD = "KD";
        String max = "Max";
        String karavalli = "Karavalli";
        String gharaya = "Gharaya";
        String gandhiTalks = "Gandhi Talks";
        String chowkidhar = "Chowkidhar";
        String howdhuHuliya = "Howdhu Huliya";
        String mavuta = "Mavuta";
        String iceMocktail = "Ice Mocktail";
        String theIce = "The Ice";
        String jaganmantheAkkamahadevi = "Jaganmanthe Akkamahadevi";
        String theeertharoopaThandeyavarige = "Theeertharoopa Thandeyavarige";
        String shivlella = "Shivlella";
        String katle = "Katle";
        String cult = "Cult";
        String bayakegaluBeruridaga = "Bayakegalu Beruridaga";
        String valavaara = "Valavaara";
        String seatEdge = "Seat Edge";
        String amruthaanjana = "Amruthaanjana";
        String rakthaKashmira = "Raktha Kashmira";
        String saralaSubbarao = "Sarala Subbarao";
        String janumadhaJodi = "Janumadha Jodi";
        String kotigobbha = "Kotigobbha";
        String kirikParty = "Kirik Party";
        String charlie = "Charlie";
        String salaar = "Salaar";
        String kannadaMovies[]= {"Toxic","Landlord"," Billa Ranga Baasha","KD","Max","karavalli"," Gharaya","GandhiTalks"," Chowkidhar"," Howdhu Huliya"," Mavuta"," lce mocktail"," the ice","jaganmanthe Akkkamahadevi", " Theeertharoopa Thandeyavarige","Shivlella","katle"," cult","bayakegalu Beruridaga","Valavaara"," Seat edge"," Amruthaanjana"," Raktha Kashmira","Sarala Subbarao"," janumadha jodi"," kotigobbha"," kirik party ","charlie"," Salaar","bagheera"}; 
		
		System.out.println("Kannada Movies:");
        for (String kannadaMovie : kannadaMovies) {
            System.out.println(kannadaMovie);
        }

        String mindhunter = "mindhunter";
        String hauntinghill = "the haunting of hill house";
        String topboy = "top boy";
        String ozark = "ozark";
        String myheroacademia = "my hero academia";
        String godless = "godless";
        String wheniseeyou = "when i see you";
        String darkcrystal = "the dark crystal";
        String strangerthings = "stranger things";
        String narcos = "narcos";
        String afterlife = "after life";
        String masterofnone = "master of none";
        String arcane = "arcane";
        String blueeyesamurai = "blue eye samurai";
        String pluto = "pluto";
        String devilman = "devilman crybaby";
        String peakyblinders = "peaky blinders";
        String midnightmass = "midnight mass";
        String adolescence = "adolescence";
        String derek = "derek";
        String daredevil = "daredevil";
        String lockeandkey = "locke and key";
        String fisforfamily = "f is for family";
        String archive81 = "archive 81";
        String terminatorzero = "terminator zero";
        String americanprimeval = "american primeval";
        String lovedeathrobots = "love death and robots";
        String griselda = "griselda";
        String twilightgods = "twilight of the gods";

		String englishMovies[]={ " Mindhunter"," The haunting of hill "," Top Boy"," Ozark"," My hero Academia "," Godless" ," When i see you "," The Dark Crystal"," Stranger Things"," Narcos"," After life"," Master of None "," Arcane"," blue Eye samurai"," Pluto"," Devilman Crybaby"," Peaky Blinkers"," Midnight Mass", " Adolescence"," Derek"," Daredevil", "Locke and Key", " F is for family"," Archive 81"," Terminator Zero"," Amercian Primeval"," love,death and Robots"," Griselda"," Boy Swallows"," Twilight of the Gods" };
		
		System.out.println("English Movies & Series:");
        for (String englishMovie : englishMovies) {
            System.out.println(englishMovie);
        }
		
	
        String jawan = "jawan";
        String jaanejaan = "jaane jaan";
        String gangubai = "gangubai kathiawadi";
        String haseendillruba = "haseen dillruba";
        String animal = "animal";
        String ludo = "ludo";
        String laapataaladies = "laapataa ladies";
        String sector36 = "sector 36";
        String kathal = "kathal";
        String monica = "monica o my darling";
        String bulbbul = "bulbbul";
        String pagglait = "pagglait";
        String mimi = "mimi";
        String akvsak = "ak vs ak";
        String khogayehumkahan = "kho gaye hum kahan";
        String missionmajnu = "mission majnu";
        String seriousmen = "serious men";
        String sacredgames = "sacred games";
        String heeramandi = "heeramandi";
        String delhicrime = "delhi crime";
        String gunsandgulaabs = "guns and gulaabs";
        String khakee = "khakee";
        String railwaymen = "the railway men";
        String jamtara = "jamtara";
        String kotafactory = "kota factory";
        String aranyak = "aranyak";
        String twelfthfail = "12th fail";
        String darlings = "darlings";

		String hindiMovies[]={ "Jawan"," jaane jaan"," Gangubai Kathiawadi"," Haseen Dillruba"," animal"," Ludo"," Laapataa Ladies"," Sector 36"," Kathal"," Monica"," Bulbbul"," Pagglait"," Mimmi"," Ak vs Ak"," Kho Gayye Hum Kahan"," Mission Majnu"," Serious Men", "Sacred Games", " Heeramandi"," Delhi Crime"," guns and Gullabs"," khakee"," The railway Men"," Jamtara"," Kota Factory "," Aranyak"," 12th fail", " Darlings" ," Amar Singh Chamkilla",};
		System.out.println("Hindi Movies & Series:");
        for (String hindiMovie:hindiMovies) {
            System.out.println(hindiMovie);
        }

        String leo = "leo";
        String beast = "beast";
        String goat = "goat";
        String thangalaan = "thangalaan";
        String maharaja = "maharaja";
        String amaran = "amaran";
        String goodbadugly = "good bad ugly";
        String thunivu = "thunivu";
        String vidaamuyarchi = "vidaamuyarchi";
        String jigarthandaxx = "jigarthanda doublex";
        String iraivan = "iraivan";
        String doctor = "doctor";
        String indian2 = "indian 2";
        String raangi = "raangi";
        String kalagathalaivan = "kalagathalaivan";
        String jagamethandhiram = "jagame thandhiram";
        String sinam = "sinam";
        String thiruvinkural = "thiruvin kural";
        String asvins = "asvins";
        String lovetoday = "love today";
        String navarasa = "navarasa";
        String mandela = "mandela";
        String gattakusthi = "gatta kusthi";
        String vaathi = "vaathi";
        String kaantha = "kaantha";
        String revolverrita = "revolver rita";
        String don = "don";
        String thunivu2 = "thunivu";
        String leo2 = "leo";
		
		String tamilMovies[]= {" leo "," Beast"," GOAt"," Thangalaan","Maharaja"," Amaran"," Good Bad Ugly"," Thunivu"," VidaaMUyarchi"," Jigarthanda doubleX"," Iraivan"," Doctor"," Indian2"," Raangi"," Kalagathalaivan"," Thugd of Hindostan"," jagame Thandhiram"," Sinam"," Thiruvin Kural"," Asvins"," Love today"," Thunivu"," Navaraasa"," Mandala"," Gatta Kusthi", " Vaathi"," Kaantha"," Revolver Rita"," Don"," Iraivan"};
		 System.out.println("Tamil Movies:");
        for (String tamilMovie : tamilMovies) {
            System.out.println(tamilMovie);
        }

        String devara = "devara";
        String pushpa2 = "pushpa 2";
        
        String luckybaskhar = "lucky baskhar";
        String saripodhaa = "saripodhaa sanivaaram";
        String gunturkaram = "guntur karam";
        String kalki = "kalki";
        String hinanna = "hi nanna";
        String tillusquare = "tillu square";
        String hit = "hit";
        String doubleismart = "double ismart";
        String daakumaharaaj = "daaku maharaaj";
        String akhanda = "akhanda";
        String virupaksha = "virupaksha";
        String missshetty = "miss shetty mr polishetty";
        String antesundaraniki = "ante sundaraniki";
        String shyamsingharoy = "shyam singha roy";
        String waltairveerayya = "waltair veerayya";
        String bhajevaayu = "bhaje vaayu vegam";
        String mad = "mad";
        String pittakathalu = "pitta kathalu";
        String anaganaga = "anaganaga oka raju";
        String paradise = "the paradise";
        String takshakkudu = "takshakkudu";
        String mayasabha = "mayasabha";
        String dhootha = "dhootha";
        String rananaidu = "rana naidu";
        String kumarisrimathi = "kumari srimathi";
        String ninety = "90";

		String teluguMovies[]={"Devara"," Puspha 2"," Lucky Baskar"," Saripodhaa Sanivaaram"," Guntur Kaaram"," kalki"," Hi Nanna"," Tillu Square "," HIT"," Double is smart "," Daaku Maharaaj", " Akhanda"," Virupaksha"," Miss Shetty Mr Polisheety", "Ante Sundaraniki"," Shyam Singha Roy"," Walter Veeraya"," Bhaje Vaayu Vegam","MAD"," Pitta Kathalu"," Anaganaga OKa raju"," Dont trouble the trouble"," The Paradise"," Takshakkudu","Mayasabha", "Dhootha"," Rana Naidu"," Kumari Srimathi", "90"};
		System.out.println("Telugu Movies:");
        for (String teluguMovie : teluguMovies) {
            System.out.println(teluguMovie);
        }

        String minnalmurali = "minnal murali";
        String kurup = "kurup";
        String aadujeevitham = "aadujeevitham";
        String iratta = "iratta";
        String kappela = "kappela";
        String janaganamana = "jana gana mana";
        String thallumaala = "thallumaala";
        String cbi5 = "cbi 5";
        String forensic = "forensic";
        String ullozhukku = "ullozhukku";
        String ranjithcinema = "a ranjith cinema";
        String kaapa = "kaapa";
        String anweshippin = "anweshippin kandethum";
        String njanprakashan = "njan prakashan";
        String sudani = "sudani from nigeria";
        String kumari = "kumari";
        String kondal = "kondal";
        String adiosamigo = "adios amigo";
        String vaashi = "vaashi";
        String seshammike = "sesham mike-il fathima";
        String padmini = "padmini";
        String thundu = "thundu";
        String nightdrive = "night drive";
        String irul = "irul";
        String theteacher = "the teacher";
        String dearfriend = "dear friend";
        String rifleclub = "rifle club";
        String kaapa2 = "kaapa";
        String kumari2 = "kumari";

		String malayalamMovies[]={"Minnal Murali"," kurup"," Aadujeevitham"," Iratta"," Kappela"," jana Gana Mana"," Thallumaala"," CBI 5"," Forensic"," Ullozhukku"," A Ranjith Cinenma"," Kaapa ","Rcx"," Anweshippin Kandethum", " nijan prakashan"," Sudani from Nigeria"," Kumari"," kondal", " Adios Amigo", " Vaashi"," Sesham Mike-il Fathima","Padmini", "Thundu", " Night Drive"," Irul"," The teacher "," kaapa"," Dear Friend"," Nijan Prakashan"," Rifle Club"};
		System.out.println("Malayalam Movies:");
        for (String malayalamMovie : malayalamMovies) {
            System.out.println(malayalamMovie);
        }
		
		

		/*System.out.println(" list Kannada Movies are ");
		
        System.out.println(kannadaMovies[0] + "\n" +
		                   kannadaMovies[1] + "\n" +
		                   kannadaMovies[2] + "\n" +
		                   kannadaMovies[3] + "\n" +
                           kannadaMovies[4] + "\n" +
			               kannadaMovies[5] + "\n" +
			               kannadaMovies[6] + "\n" +
			               kannadaMovies[7] + "\n" +
			               kannadaMovies[8] + "\n" +
                           kannadaMovies[9] + "\n" +
			               kannadaMovies[10]+ "\n" +
			               kannadaMovies[11]+ "\n" +
			               kannadaMovies[12] + "\n" +
			               kannadaMovies[13] + "\n" +
                           kannadaMovies[14] + "\n" +
			               kannadaMovies[15] + "\n" +
			               kannadaMovies[16] + "\n" +
			               kannadaMovies[17] + "\n" +
			               kannadaMovies[18] + "\n" +
                           kannadaMovies[19] + "\n" +
			               kannadaMovies[20] + "\n" +
			               kannadaMovies[21] + "\n" +
			               kannadaMovies[22] + "\n" +
			               kannadaMovies[23] + "\n" +
			               kannadaMovies[24] + "\n" +
			               kannadaMovies[25] + "\n" +
			               kannadaMovies[26] + "\n" +
			               kannadaMovies[27] + "\n" +
			               kannadaMovies[28] + "\n" +
                           kannadaMovies[29]);

		
						   
		
		
		System.out.println(" List English Movies are ");
		
		 System.out.println(englishMovies[0] + "\n" +
		                   englishMovies[1] + "\n" +
		                   englishMovies[2] + "\n" +
		                   englishMovies[3] + "\n" +
                           englishMovies[4] + "\n" +
			               englishMovies[5] + "\n" +
			               englishMovies[6] + "\n" +
			               englishMovies[7] + "\n" +
			               englishMovies[8] + "\n" +
                           englishMovies[9] + "\n" +
			               englishMovies[10]+ "\n" +
			               englishMovies[11]+ "\n" +
			               englishMovies[12] + "\n" +
			               englishMovies[13] + "\n" +
                           englishMovies[14] + "\n" +
			               englishMovies[15] + "\n" +
			               englishMovies[16] + "\n" +
			               englishMovies[17] + "\n" +
			               englishMovies[18] + "\n" +
                           englishMovies[19] + "\n" +
			               englishMovies[20] + "\n" +
			               englishMovies[21] + "\n" +
			               englishMovies[22] + "\n" +
			               englishMovies[23] + "\n" +
			               englishMovies[24] + "\n" +
			               englishMovies[25] + "\n" +
			               englishMovies[26] + "\n" +
			               englishMovies[27] + "\n" +
			               englishMovies[28] + "\n" +
                           englishMovies[29]);
						   
						   
		

		System.out.println(" List Hindhi Movies are ");
		
		 System.out.println(hindhiMovies[0] + "\n" +
		                   hindhiMovies[1] + "\n" +
		                   hindhiMovies[2] + "\n" +
		                   hindhiMovies[3] + "\n" +
                           hindhiMovies[4] + "\n" +
			               hindhiMovies[5] + "\n" +
			               hindhiMovies[6] + "\n" +
			               hindhiMovies[7] + "\n" +
			               hindhiMovies[8] + "\n" +
                           hindhiMovies[9] + "\n" +
			               hindhiMovies[10]+ "\n" +
			               hindhiMovies[11]+ "\n" +
			               hindhiMovies[12] + "\n" +
			               hindhiMovies[13] + "\n" +
                           hindhiMovies[14] + "\n" +
			               hindhiMovies[15] + "\n" +
			               hindhiMovies[16] + "\n" +
			               hindhiMovies[17] + "\n" +
			               hindhiMovies[18] + "\n" +
                           hindhiMovies[19] + "\n" +
			               hindhiMovies[20] + "\n" +
			               hindhiMovies[21] + "\n" +
			               hindhiMovies[22] + "\n" +
			               hindhiMovies[23] + "\n" +
			               hindhiMovies[24] + "\n" +
			               hindhiMovies[25] + "\n" +
			               hindhiMovies[26] + "\n" +
			               hindhiMovies[27] + "\n" +
			               hindhiMovies[28] + "\n" +
                           hindhiMovies[29]);
						   
						   
						   
	    System.out.println(" List Tamil Movies are ");
		
		 System.out.println(tamilMovies[0] + "\n" +
		                   tamilMovies[1] + "\n" +
		                   tamilMovies[2] + "\n" +
		                   tamilMovies[3] + "\n" +
                           tamilMovies[4] + "\n" +
			               tamilMovies[5] + "\n" +
			               tamilMovies[6] + "\n" +
			               tamilMovies[7] + "\n" +
			               tamilMovies[8] + "\n" +
                           tamilMovies[9] + "\n" +
			               tamilMovies[10]+ "\n" +
			               tamilMovies[11]+ "\n" +
			               tamilMovies[12] + "\n" +
			               tamilMovies[13] + "\n" +
                           tamilMovies[14] + "\n" +
			               tamilMovies[15] + "\n" +
			               tamilMovies[16] + "\n" +
			               tamilMovies[17] + "\n" +
			               tamilMovies[18] + "\n" +
                           tamilMovies[19] + "\n" +
			               tamilMovies[20] + "\n" +
			               tamilMovies[21] + "\n" +
			               tamilMovies[22] + "\n" +
			               tamilMovies[23] + "\n" +
			               tamilMovies[24] + "\n" +
			               tamilMovies[25] + "\n" +
			               tamilMovies[26] + "\n" +
			               tamilMovies[27] + "\n" +
			               tamilMovies[28] + "\n" +
                           tamilMovies[29]);
						   
						   
		 System.out.println(" List Telugu Movies are ");
		
		 System.out.println(teluguMovies[0] + "\n" +
		                   teluguMovies[1] + "\n" +
		                   teluguMovies[2] + "\n" +
		                   teluguMovies[3] + "\n" +
                           teluguMovies[4] + "\n" +
			               teluguMovies[5] + "\n" +
			               teluguMovies[6] + "\n" +
			               teluguMovies[7] + "\n" +
			               teluguMovies[8] + "\n" +
                           teluguMovies[9] + "\n" +
			               teluguMovies[10]+ "\n" +
			               teluguMovies[11]+ "\n" +
			               teluguMovies[12] + "\n" +
			               teluguMovies[13] + "\n" +
                           teluguMovies[14] + "\n" +
			               teluguMovies[15] + "\n" +
			               teluguMovies[16] + "\n" +
			               teluguMovies[17] + "\n" +
			               teluguMovies[18] + "\n" +
                           teluguMovies[19] + "\n" +
			               teluguMovies[20] + "\n" +
			               teluguMovies[21] + "\n" +
			               teluguMovies[22] + "\n" +
			               teluguMovies[23] + "\n" +
			               teluguMovies[24] + "\n" +
			               teluguMovies[25] + "\n" +
			               teluguMovies[26] + "\n" +
			               teluguMovies[27] + "\n" +
			               teluguMovies[28] + "\n" +
                           teluguMovies[29]);
						   
						   
						   
						   
		System.out.println(" List Malayalam Movies are ");
		
		 System.out.println(malayalamMovies[0] + "\n" +
		                   malayalamMovies[1] + "\n" +
		                   malayalamMovies[2] + "\n" +
		                   malayalamMovies[3] + "\n" +
                           malayalamMovies[4] + "\n" +
			               malayalamMovies[5] + "\n" +
			               malayalamMovies[6] + "\n" +
			               malayalamMovies[7] + "\n" +
			               malayalamMovies[8] + "\n" +
                           malayalamMovies[9] + "\n" +
			               malayalamMovies[10]+ "\n" +
			               malayalamMovies[11]+ "\n" +
			               malayalamMovies[12] + "\n" +
			               malayalamMovies[13] + "\n" +
                           malayalamMovies[14] + "\n" +
			               malayalamMovies[15] + "\n" +
			               malayalamMovies[16] + "\n" +
			               malayalamMovies[17] + "\n" +
			               malayalamMovies[18] + "\n" +
                           malayalamMovies[19] + "\n" +
			               malayalamMovies[20] + "\n" +
			               malayalamMovies[21] + "\n" +
			               malayalamMovies[22] + "\n" +
			               malayalamMovies[23] + "\n" +
			               malayalamMovies[24] + "\n" +
			               malayalamMovies[25] + "\n" +
			               malayalamMovies[26] + "\n" +
			               malayalamMovies[27] + "\n" +
			               malayalamMovies[28] + "\n" +
                           malayalamMovies[29]);*/
						   
						 /*  String Toxic =kannadaMovies[0];
						   System.out.println(Toxic);
						    String Landlord =kannadaMovies[1];
						   System.out.println(Landlord);
						    String BillaRangaBaasha =kannadaMovies[2];
						   System.out.println(BillaRangaBaasha);
						    String KD =kannadaMovies[3];
						   System.out.println(KD);
						    String Max =kannadaMovies[4];
						   System.out.println(Max);
						    String karavalli =kannadaMovies[5];
						   System.out.println(karavalli);
						    String Gharaya =kannadaMovies[6];
						   System.out.println( Gharaya);
						    String GandhiTalks =kannadaMovies[7];
						   System.out.println(GandhiTalks);
						    String Chowkidhar =kannadaMovies[8];
						   System.out.println(Chowkidhar);
						    String HowdhuHuliya =kannadaMovies[9];
						   System.out.println(HowdhuHuliya);
						    String Mavuta =kannadaMovies[10];
						   System.out.println(Mavuta);
						    String  lovemocktail =kannadaMovies[11];
						   System.out.println( lovemocktail);
						    String  theice =kannadaMovies[12];
						   System.out.println(theice);
						    String jaganmantheAkkkamahadevi=kannadaMovies[13];
						   System.out.println(jaganmantheAkkkamahadevi);
						    String TheeertharoopaThandeyavarige =kannadaMovies[14];
						   System.out.println(TheeertharoopaThandeyavarige);
						    String Shivlella =kannadaMovies[15];
						   System.out.println(Shivlella);
						    String katle =kannadaMovies[16];
						   System.out.println(katle);
						    String cult=kannadaMovies[17];
						   System.out.println(cult);
						    String bayakegaluBeruridaga =kannadaMovies[18];
						   System.out.println(bayakegaluBeruridaga);
						    String Valavaara =kannadaMovies[19];
						   System.out.println(Valavaara);
						    String Seatedge =kannadaMovies[20];
						   System.out.println(Seatedge);
						    String Amruthaanjana =kannadaMovies[21];
						   System.out.println(Amruthaanjana);
						    String RakthaKashmira =kannadaMovies[22];
						   System.out.println(RakthaKashmira);
						    String SaralaSubbarao =kannadaMovies[23];
						   System.out.println(SaralaSubbarao);
						    String  janumadhajodi =kannadaMovies[24];
						   System.out.println( janumadhajodi);
						    String kotigobbha =kannadaMovies[25];
						   System.out.println(kotigobbha);
						    String kirikparty =kannadaMovies[26];
						   System.out.println(kirikparty);
						    String charlie =kannadaMovies[27];
						   System.out.println(charlie);
						    String Salaar =kannadaMovies[28];
						   System.out.println(Salaar);
						    String bagheera =kannadaMovies[29];
						   System.out.println(bagheera);
						   
						   
						   String Mindhunter = englishMovies[0];
                           System.out.println(Mindhunter);
                           String TheHauntingOfHill = englishMovies[1];
                           System.out.println(TheHauntingOfHill);
                           String TopBoy = englishMovies[2];
                           System.out.println(TopBoy);
                           String Ozark = englishMovies[3];
                           System.out.println(Ozark);
                           String MyHeroAcademia = englishMovies[4];
                           System.out.println(MyHeroAcademia);
                           String Godless = englishMovies[5];
                           System.out.println(Godless);
                           String WhenISeeYou = englishMovies[6];
                           System.out.println(WhenISeeYou);
                           String TheDarkCrystal = englishMovies[7];
                           System.out.println(TheDarkCrystal);
                           String StrangerThings = englishMovies[8];
                           System.out.println(StrangerThings);
                            String Narcos = englishMovies[9];
                            System.out.println(Narcos);
                            String AfterLife = englishMovies[10];
                            System.out.println(AfterLife);
                            String MasterOfNone = englishMovies[11];
                             System.out.println(MasterOfNone);
                            String Arcane = englishMovies[12];
                             System.out.println(Arcane);
                            String BlueEyeSamurai = englishMovies[13];
                            System.out.println(BlueEyeSamurai);
                            String Pluto = englishMovies[14];
                            System.out.println(Pluto);
                              String DevilmanCrybaby = englishMovies[15];
                              System.out.println(DevilmanCrybaby);
                              String PeakyBlinders = englishMovies[16];
                               System.out.println(PeakyBlinders);
                              String MidnightMass = englishMovies[17];
							  
                              System.out.println(MidnightMass);

                             String Adolescence = englishMovies[18];
                             System.out.println(Adolescence);

                              String Derek = englishMovies[19];
                                  System.out.println(Derek);

                               String Daredevil = englishMovies[20];
                                System.out.println(Daredevil);

                                String LockeAndKey = englishMovies[21];
                                System.out.println(LockeAndKey);

                              String FIsForFamily = englishMovies[22];
                              System.out.println(FIsForFamily);

                               String Archive81 = englishMovies[23];
                               System.out.println(Archive81);

                                 String TerminatorZero = englishMovies[24];
                                   System.out.println(TerminatorZero);

                                String AmericanPrimeval = englishMovies[25];
                                System.out.println(AmericanPrimeval);

                                String LoveDeathAndRobots = englishMovies[26];
                                System.out.println(LoveDeathAndRobots);

                                 String Griselda = englishMovies[27];
                                  System.out.println(Griselda);

                                  String BoySwallows = englishMovies[28];
                                  System.out.println(BoySwallows);

                                  String TwilightOfTheGods = englishMovies[29];
                                   System.out.println(TwilightOfTheGods);


                                    String Jawan = hindhiMovies[0];
                                    System.out.println(Jawan);

                                   String JaaneJaan = hindhiMovies[1];
                                   System.out.println(JaaneJaan);

                                   String GangubaiKathiawadi = hindhiMovies[2];
                                   System.out.println(GangubaiKathiawadi);

                                  String HaseenDillruba = hindhiMovies[3];
                                  System.out.println(HaseenDillruba);

                                String Animal = hindhiMovies[4];
                                System.out.println(Animal);

                                String Ludo = hindhiMovies[5];
                                System.out.println(Ludo);

                                 String LaapataaLadies = hindhiMovies[6];
                                 System.out.println(LaapataaLadies);

                                 String Sector36 = hindhiMovies[7];
                                 System.out.println(Sector36);

                                 String Kathal = hindhiMovies[8];
                                   System.out.println(Kathal);

                                 String Monica = hindhiMovies[9];
                                 System.out.println(Monica);

                                 String Bulbbul = hindhiMovies[10];
                                 System.out.println(Bulbbul);

                                 String Pagglait = hindhiMovies[11];
                                 System.out.println(Pagglait);

                                 String Mimi = hindhiMovies[12];
                                 System.out.println(Mimi);

                                 String AkVsAk = hindhiMovies[13];
                                 System.out.println(AkVsAk);

                                 String KhoGayyeHumKahan = hindhiMovies[14];
                                 System.out.println(KhoGayyeHumKahan);

                                 String MissionMajnu = hindhiMovies[15];
                                 System.out.println(MissionMajnu);

                                 String SeriousMen = hindhiMovies[16];
                                 System.out.println(SeriousMen);

                                 String SacredGames = hindhiMovies[17];
                                 System.out.println(SacredGames);

                                  String Heeramandi = hindhiMovies[18];
                                  System.out.println(Heeramandi);

                                 String DelhiCrime = hindhiMovies[19];
                                  System.out.println(DelhiCrime);

                                String GunsAndGullabs = hindhiMovies[20];
                                System.out.println(GunsAndGullabs);

                                 String RanaNaidu = hindhiMovies[21];
                                 System.out.println(RanaNaidu);
          
                                 String Khakee = hindhiMovies[22];
                                 System.out.println(Khakee);

                                 String TheRailwayMen = hindhiMovies[23];
                                 System.out.println(TheRailwayMen);

                                 String Jamtara = hindhiMovies[24];
                                 System.out.println(Jamtara);

                                 String KotaFactory = hindhiMovies[25];
                                 System.out.println(KotaFactory);

                                 String Aranyak = hindhiMovies[26];
                                 System.out.println(Aranyak);

                                 String TwelfthFail = hindhiMovies[27];
                                 System.out.println(TwelfthFail);

                                  String Darlings = hindhiMovies[28];
                                System.out.println(Darlings);

                                 String AmarSinghChamkila = hindhiMovies[29];
                                  System.out.println(AmarSinghChamkila);

                                String Leo = tamilMovies[0];
                                System.out.println(Leo);

                                 String Beast = tamilMovies[1];
                                 System.out.println(Beast);

                                String GOAT = tamilMovies[2];
                                System.out.println(GOAT);

                                String Thangalaan = tamilMovies[3];
                                System.out.println(Thangalaan);

                                 String Maharaja = tamilMovies[4];
                                 System.out.println(Maharaja);

                                 String Amaran = tamilMovies[5];
                                 System.out.println(Amaran);

                                 String GoodBadUgly = tamilMovies[6];
                                 System.out.println(GoodBadUgly);

                                 String Thunivu = tamilMovies[7];
                                 System.out.println(Thunivu);

                                  String VidaaMuyarchi = tamilMovies[8];
                                  System.out.println(VidaaMuyarchi);

                                  String JigarthandaDoubleX = tamilMovies[9];
                                  System.out.println(JigarthandaDoubleX);

                                  String Iraivan = tamilMovies[10];
                                  System.out.println(Iraivan);

                                  String Doctor = tamilMovies[11];
                                  System.out.println(Doctor);

                                 String Indian2 = tamilMovies[12];
                                 System.out.println(Indian2);

                                 String Raangi = tamilMovies[13];
                                 System.out.println(Raangi);

                                 String Kalagathalaivan = tamilMovies[14];
                                 System.out.println(Kalagathalaivan);

                                 String ThugOfHindostan = tamilMovies[15];
                                 System.out.println(ThugOfHindostan);

                                 String JagameThandhiram = tamilMovies[16];
                                 System.out.println(JagameThandhiram);

                                 String Sinam = tamilMovies[17];
                                 System.out.println(Sinam);

                                 String ThiruvinKural = tamilMovies[18];
                                 System.out.println(ThiruvinKural);

                                 String Asvins = tamilMovies[19];
                                 System.out.println(Asvins);

                                 String LoveToday = tamilMovies[20];
                                 System.out.println(LoveToday);

                                   String Thunivu2 = tamilMovies[21];
                                 System.out.println(Thunivu2);

                                 String Navaraasa = tamilMovies[22];
                                 System.out.println(Navaraasa);

                                 String Mandala = tamilMovies[23];
                                 System.out.println(Mandala);

                                 String GattaKusthi = tamilMovies[24];
                                 System.out.println(GattaKusthi);

                                 String Vaathi = tamilMovies[25];
                                 System.out.println(Vaathi);

                                 String Kaantha = tamilMovies[26];
                                 System.out.println(Kaantha);

                                 String RevolverRita = tamilMovies[27];
                                 System.out.println(RevolverRita);

                                 String Don = tamilMovies[28];
                                 System.out.println(Don);

                                 String Iraivan2 = tamilMovies[29];
                                 System.out.println(Iraivan2);

                                 String Devara = teluguMovies[0];
                                 System.out.println(Devara);

                                 String Pushpa2 = teluguMovies[1];
                                  System.out.println(Pushpa2);

                                  String SalaarTelugu = teluguMovies[2];
                                  System.out.println(SalaarTelugu);

                                  String LuckyBaskar = teluguMovies[3];
                                  System.out.println(LuckyBaskar);

                                  String SaripodhaaSanivaaram = teluguMovies[4];
                                  System.out.println(SaripodhaaSanivaaram);

                                  String GunturKaaram = teluguMovies[5];
                                  System.out.println(GunturKaaram);

                                   String Kalki = teluguMovies[6];
                                   System.out.println(Kalki);

                                  String HiNanna = teluguMovies[7];
                                 System.out.println(HiNanna);

                                 String TilluSquare = teluguMovies[8];
                                 System.out.println(TilluSquare);

                                   String HIT = teluguMovies[9];
                                   System.out.println(HIT);

                                   String DoubleIsSmart = teluguMovies[10];
                                   System.out.println(DoubleIsSmart);

                                   String DaakuMaharaaj = teluguMovies[11];
                                   System.out.println(DaakuMaharaaj);

                                 String Akhanda = teluguMovies[12];
                                 System.out.println(Akhanda);

                                String Virupaksha = teluguMovies[13];
                                System.out.println(Virupaksha);

                                   String MissShettyMrPolishetty = teluguMovies[14];
                                    System.out.println(MissShettyMrPolishetty);

                                  String AnteSundaraniki = teluguMovies[15];
                                   System.out.println(AnteSundaraniki);

                                 String ShyamSinghaRoy = teluguMovies[16];
                                 System.out.println(ShyamSinghaRoy);

                                String WalterVeeraya = teluguMovies[17];
                                System.out.println(WalterVeeraya);

                                 String BhajeVaayuVegam = teluguMovies[18];
                                 System.out.println(BhajeVaayuVegam);

                                String MAD = teluguMovies[19];
                                System.out.println(MAD);

                                String PittaKathalu = teluguMovies[20];
                                System.out.println(PittaKathalu);

                                 String AnaganagaOkaRaju = teluguMovies[21];
                                 System.out.println(AnaganagaOkaRaju);

                                String DontTroubleTheTrouble = teluguMovies[22];
                                 System.out.println(DontTroubleTheTrouble);

                                String TheParadise = teluguMovies[23];
                                System.out.println(TheParadise);

                                String Takshakkudu = teluguMovies[24];
                                System.out.println(Takshakkudu);

                                String Mayasabha = teluguMovies[25];
                                System.out.println(Mayasabha);

                                 String Dhootha = teluguMovies[26];
                                  System.out.println(Dhootha);

                                String RanaNaiduTelugu = teluguMovies[27];
                                System.out.println(RanaNaiduTelugu);

                                String KumariSrimathi = teluguMovies[28];
                                 System.out.println(KumariSrimathi);

                                 String Ninety = teluguMovies[29];
                                 System.out.println(Ninety);
								 
                                 String MinnalMurali = malayalamMovies[0];
                                 System.out.println(MinnalMurali);

                                 String Kurup = malayalamMovies[1];
                                 System.out.println(Kurup);

                                 String Aadujeevitham = malayalamMovies[2];
                                  System.out.println(Aadujeevitham);

                                 String Iratta = malayalamMovies[3];
                                 System.out.println(Iratta);

                                 String Kappela = malayalamMovies[4];
                                  System.out.println(Kappela);

                                 String JanaGanaMana = malayalamMovies[5];
                                  System.out.println(JanaGanaMana);

                                String Thallumaala = malayalamMovies[6];
                                System.out.println(Thallumaala);

                                 String CBI5 = malayalamMovies[7];
                                 System.out.println(CBI5);

                                 String Forensic = malayalamMovies[8];
                                 System.out.println(Forensic);

                                 String Ullozhukku = malayalamMovies[9];
                                 System.out.println(Ullozhukku);

                                 String ARanjithCinema = malayalamMovies[10];
                                 System.out.println(ARanjithCinema);

                                 String Kaapa = malayalamMovies[11];
                                 System.out.println(Kaapa);

                                String RDX = malayalamMovies[12];
                                System.out.println(RDX);

                                String AnweshippinKandethum = malayalamMovies[13];
                                System.out.println(AnweshippinKandethum);

                                 String NijanPrakashan = malayalamMovies[14];
                                 System.out.println(NijanPrakashan);

                                String SudaniFromNigeria = malayalamMovies[15];
                                System.out.println(SudaniFromNigeria);

                                String Kumari = malayalamMovies[16];
                                 System.out.println(Kumari);

                                String Kondal = malayalamMovies[17];
                                 System.out.println(Kondal);

                                String AdiosAmigo = malayalamMovies[18];
                                 System.out.println(AdiosAmigo);

                                 String Vaashi = malayalamMovies[19];
                                  System.out.println(Vaashi);

                                    String SeshamMikeIlFathima = malayalamMovies[20];
                                   System.out.println(SeshamMikeIlFathima);

                                String Padmini = malayalamMovies[21];
                                 System.out.println(Padmini);

                                  String Thundu = malayalamMovies[22];
                                   System.out.println(Thundu);

                                String NightDrive = malayalamMovies[23];
                                  System.out.println(NightDrive);

                                  String Irul = malayalamMovies[24];
                                  System.out.println(Irul);

                                 String TheTeacher = malayalamMovies[25];
                                 System.out.println(TheTeacher);

                                 String Kaapa2 = malayalamMovies[26];
                                 System.out.println(Kaapa2);

                                 String DearFriend = malayalamMovies[27];
                                 System.out.println(DearFriend);

                                  String NijanPrakashan2 = malayalamMovies[28];
                                  System.out.println(NijanPrakashan2);

                                   String RifleClub = malayalamMovies[29];
                                   System.out.println(RifleClub);*/


						   
        
}
      
	  
	    static void getkannadaMovies(){
        System.out.println("Kannada Movies:");
        for (String kannadaMovie : kannadaMovies) {
            System.out.println(kannadaMovie);
        }
		}
		static void getenglishMovies(){
		System.out.println("English Movies & Series:");
        for (String englishMovie : englishMovies) {
            System.out.println(englishMovie);
        }
		}
		 static void gethindiMovies(){
		System.out.println("Hindi Movies & Series:");
        for (String hindiMovie:hindiMovies) {
            System.out.println(hindiMovie);
        }
		} static void gettamilMovies(){
		System.out.println("Tamil Movies:");
        for (String tamilMovie : tamilMovies) {
            System.out.println(tamilMovie);
        }
		} 
		static void getteluguMovies(){
		System.out.println("Telugu Movies:");
        for (String teluguMovie : teluguMovies) {
            System.out.println(teluguMovie);
        }}
		 static void getmalayalamMovies(){
		System.out.println("Tamil Movies:");
        for (String tamilMovie : tamilMovies) {
            System.out.println(tamilMovie);
        }
		}

}