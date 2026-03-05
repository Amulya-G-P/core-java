class Supermarket {

    public static String[] searchBrandByProduct(String productName) {

        if (productName.equals("shoes")) {
     String brands[]={
        "Nike","Adidas","Puma","Reebok","Skechers","Bata","Woodland","Campus","Sparx","Relaxo",
        "Red Tape","Asian","Liberty","Fila","New Balance","ASICS","Under Armour","Lee Cooper","Lancer","Power",
        "Crocs","Hush Puppies","Clarks","Metro","Paragon","Action","Vans","Converse","Jordan","Fila India",
        "Nike Air","Adidas Originals","Puma RS","Reebok Classic","Solethreads","HRX","Roadster"
    };
	 return brands;
}

        if (productName.equals("milk")){ 
     String brands[]={
        "Amul","Nandini","Mother Dairy","Heritage","Aavin","Vijaya","Dodla","Milma","Paras","Gokul",
        "Verka","Saras","Sudha","Sanchi","Tirumala","Arokya","Hatson","Jersey","Ananda","Govardhan",
        "Nestle a+","Britannia","Namaste India","Dynamix","Country Delight","Akshayakalpa","Pride of Cows",
        "Milky Mist","Vita","KMF","Sanjeevani","Nutralite Milk","Farm Fresh","Urban Milk","Happy Cow","Creamline"
    };
	 return brands;
}

        if (productName.equals("mobilecover")) {
     String brands[]={
        "Spigen","Ringke","Caseology","DailyObjects","CoverItUp","Zapcase","Stuffcool","Kapa","Noise","ESR",
        "RhinoShield","OtterBox","UAG","Supcase","Poetic","Nillkin","Case-Mate","Tech21","Nomad","Peak Design",
        "dbrand","Urban Armor","Incipio","Mous","PITAKA","Torras","Benks","Baseus","Portronics","Ambrane",
        "boAt","Skullcandy","Zebronics","Realme","OnePlus","Samsung","Apple"
    };
	 return brands;
}

        if (productName.equals("biscuit")){ 
        String brands[]={
        "Good Day","Hide & Seek","Little Hearts","Marie Gold","Treat","Bourbon","Milk Bikis","Nice Time","Tiger","Oreo",
        "Parle-G","Krackjack","Monaco","Digestive","Dark Fantasy","Milano","Jim Jam","NutriChoice","50-50","Happy Happy",
        "Little Hearts Cream","Good Day Creamy","Treat Croissant","Hide & Seek Fab","Oreo Cream","Bourbon Cream","Nice Time Digestive","Parle Rusk",
        "Britannia Bourbon","Britannia Little Hearts","Britannia Treat","Britannia Good Day","Britannia Tiger","Sunfeast Marie Light","Sunfeast Dark Fantasy","Sunfeast Nice Time","Unibic"
    };
	return brands;
        }
        if (productName.equals("fan")) {
    String brands[]={
        "Crompton","Havells","Orient","Usha","Bajaj","V-Guard","Atomberg","Khaitan","Polycab","Luminous",
        "Hindware","Syska","Anchor","RR Kabel","Goldmedal","Eveready","Panasonic","Mitsubishi","Westinghouse","Honeywell",
        "Superfan","Remi","Sharp","Toshiba","Midea","Blue Star","Tefal","Tornado","Air King","Dayton",
        "Hunter","Monte Carlo","Big Ass Fans","Vornado","Fanimation","Crompton Greaves","Surya"
    };
	return brands;
        }
        if (productName.equals("toothpaste")) {
   String brands[]={
        "Sensodyne","Meswak","Dabur Red","Colgate","Pepsodent","Closeup","Vicco","Himalaya","Patanjali","Dr. Morepen",
        "Oral-B","Parodontax","Hello","Tom’s of Maine","Streax","Biotene","Listerine Toothpaste","Formula","Aim","GUM",
        "Theramed","Weleda","Perlodent","Marvis","CloSYS","Euthymol","R.O.C.S.","Signal","Splat","Forever Bright",
        "Pepsodent Germicheck","Colgate MaxFresh","Closeup Ever Fresh","Dabur Meswak Herbal","Patanjali Dant Kanti","Himalaya Sparkling White","Vicco Vajradanti"
    };
	return brands;
        }
        if (productName.equals("rice")){
     String brands[]={
        "Kohinoor","Royal","Shree Lal Mahal","India Gate","Daawat","Fortune","Unity","Charminar","Sri Lalitha","Sona Masoori",
        "Ponni","BB Royal","More Select","Organic Tattva","24 Mantra","Patanjali","Natureland","True Elements","Vedaka","Everest Rice",
        "Tata Sampann","Amar Singh Chawal","KRBL","Double Horse","Udhaiyam","Sri Bhagyalakshmi","Sakthi","Golden Harvest","HMT Rice","Lal Qilla",
        "Swaad","Good Life","Aashirvaad","Tirupati Rice","Annapurna","Mahakosh"
    };
	return brands;
        }
        if (productName.equals("soap")){
     String brands[]={
        "Cinthol","Medimix","Vivel","Lux","Pears","Dettol","Santoor","Nivea","Liril","Fiama",
        "Dove","Godrej No.1","Himalaya","Park Avenue","Camay","Imperial Leather","Palmolive","Everyuth","Margo","Chik",
        "Khadi Natural","Himalaya Gentle Care","Pond's","Fiama Di Wills","Tresemme Soap Bar","Ayush","Ayushakti","Bajaj Almond","Johnson’s Baby Soap","Pears Pure",
        "Nivea Creme Soap","Dettol Original","Dettol Lemon","Dove Beauty Bar","Fiama Fresh","Coco Soul","Khadi Essentials","Medimix Classic"
    };
	return brands;
        }
        if (productName.equals("shampoo")) {
     String brands[]={
        "WOW","Mamaearth","Khadi Natural","Dove","Pantene","Clinic Plus","L'Oreal Paris","Sunsilk","Himalaya","Tresemme",
        "Head & Shoulders","Garnier Fructis","Vatika","Bajaj Almond","Indulekha","Herbal Essences","Godrej Expert","Biotique","Nyle","Kesh King",
        "Sesa","Olive Oil Shampoo","Parachute Advansed","Streax","Livon","Mediker","Clinic All Clear","Dabur Amla","Pond's","Ayush",
        "Forest Essentials","Natura","Santoor Herbal Shampoo","WOW Apple Cider Vinegar","Mamaearth Onion","Khadi Herbal","Himalaya Anti Hair Fall"
    };
	return brands;
        }
        if (productName.equals("bread")) {
    String brands[]={
        "Wibs","Britannia Little Hearts Bread","Harvest Gold","Britannia","Modern","English Oven","Deli Fresh","Rogers","Sunfeast","Britannia Classic",
        "Britannia NutriChoice","Britannia Whole Wheat","Britannia Multigrain","Britannia Milk Bread","Britannia Honey Oats","Britannia Brown Bread","Britannia Farm Fresh","Britannia Treat","Britannia Treat Choco","Britannia Treat Choco Fills",
        "Britannia Treat Choco Cream","Britannia Treat Vanilla","Britannia Treat Choco Lovers","Britannia Treat Choco Bite","Britannia Treat Dark Fantasy","Britannia Treat Tiger","Harvest Gold Classic","Harvest Gold Brown Bread","Harvest Gold Multigrain","Harvest Gold Whole Wheat",
        "Sunfeast Bread","Sunfeast Bread Multigrain","Modern Bread","Modern Brown Bread","Modern Multigrain","English Oven Brown","English Oven Multigrain"
    };
	return brands;
        }
        if (productName.equals("chips")){
     String brands[]={
        "Too Yumm","Uncle Chipps","Pringles","Lays","Bingo","Haldirams","Balaji Wafers","Kurkure","Ruffles","Smith's",
        "Doritos","Frito Lay","Peppy","Real Chips","Tasty Treats","Lay's Stax","Blue Diamond","Ranchers","Tango","Munch",
        "Jack 'n Jill","Calbee","Golden Chips","Snack Day","Mr. Chips","Toppits","Potato Chips Co.","Yummy Crisps","Wow Chips","Crisp Delight",
        "Cheetos","Aloo Tikki Chips","Hippeas","Nature Valley Chips","Snacks Hub","Crunchies","Happy Chips"
    };
	return brands;
        }
        if (productName.equals("coffee")){
     String brands[]={
        "Sleepy Owl","Blue Tokai","Rage Coffee","Bru","Nescafe","Continental","Davidoff","Jacobs","Café Coffee Day","Starbucks",
        "Lavazza","Illy","Tim Hortons","Tchibo","Gevalia","Peet's","Koffee Culture","Seven Seeds","Death Wish Coffee","Bulletproof",
        "Kraft","Moccona","Maxwell House","Anchor","Old Town","Coffeeza","Cothas","Chocko","Himalayan","Cafe Coffee Day Brew",
        "Coffee Day Dark Roast","Vahdam","Teabox Coffee","Godrej Coffee","Golden Cup","Cafe Rio","Aroma Coffee"
    };
	return brands;
        }
        if (productName.equals("tea")){
     String brands[]={
        "Vahdam","Teabox","Wagh Bakri","Tata Tea","Red Label","Brooke Bond","Tetley","Lipton","Twinings","Society Tea",
        "Girnar","Tetley Green","Himalayan Tea","Tea Trunk","Goodricke","Jay Shree Tea","Typhoo","The Tea Shelf","Te-A-Me","Cupper",
        "Tea Box Co.","Siyaram","Sula Tea","Coffee Day Tea","Nashik Tea","Organic India","Golden Tips","Assam Tea","Darjeeling Tea","Nilgiri Tea",
        "Tetley Herbal","Tata Tea Gold","Red Label Strong","Wagh Bakri Premium","Society Green Tea","Twinings Earl Grey","Typhoo English Breakfast"
    };
	return brands;
        }
        if (productName.equals("detergent")){
     String brands[]={
        "Ghadi","Rin","Wheel","Surf Excel","Ariel","Tide","Henko","Nirma","OMO","Vim",
        "Surf","Fena","Active Wheel","Godrej Ezee","Sunlight","Tresemme Detergent","KamaSutra Detergent","Ultra Clean","Exo Detergent","Dettol Laundry",
        "Bosco","Persil","Tide Plus","Sun White","Bright Clean","Super Wash","Power Wash","Crystal Clean","Fresh Wash","Quick Wash",
        "Ultra Wash","Magic Wash","Eco Clean","Smart Wash","Clean Mate","Himalaya Detergent","Fairy Laundry"
    };return brands;
        }
        if (productName.equals("handwash")){
    String brands[]={
        "Palmolive","Fiama","Dettol","Lifebuoy","Savlon","Himalaya","Vivel","Godrej Protekt","Germolene","Dabur Herbal",
        "The Body Shop","Mamaearth","Khadi Natural","Aroma Magic","Everyuth","Pond's","Biotique","Medimix","Dove","St. Ives",
        "Forest Essentials","Ayush","Nature's Essence","Nivea","Tropicana","Clean & Clear","Aura Essentials","Lotus Herbals","Himalaya Gentle Care","Bio-Oil",
        "Mamaearth Tea Tree","Khadi Essentials","Goodknight Handwash","Germ-X","Cinthol","Palmolive Naturals","Mediker"
    };
	return brands;
        }
       if (productName.equals("facewash")){
    String brands[]={
        "Simple","Cetaphil","Minimalist","Garnier","Himalaya","Clean & Clear","Neutrogena","Pond's","Nivea","L'Oreal Paris",
        "Biotique","Mamaearth","Khadi Natural","The Body Shop","Lotus Herbals","Forest Essentials","Ayush","Dove","St. Ives","Himalaya Gentle Care",
        "Plum","Innisfree","Kiehl's","The Ordinary","CeraVe","La Roche-Posay","The Face Shop","Mamaearth Tea Tree","Nykaa Naturals","VLCC",
        "Vaadi Herbals","Medimix","Clean & Glow","Olay","Re'equil","Forest Essentials Sandalwood","Pond's Pure White"
    };
	return brands;
        }
        if (productName.equals("perfume")){
      String brands[]={
        "Skinn","Bella Vita","The Man Company","Engage","Denver","Yardley","Fogg","Axe","Bodycraft","Park Avenue",
        "Armaf","Calvin Klein","Davidoff","Hugo Boss","Paco Rabanne","Jo Malone","Versace","Gucci","Chanel","Tom Ford",
        "Burberry","Hermes","Yves Saint Laurent","Ralph Lauren","Bvlgari","Dolce & Gabbana","Jimmy Choo","Lancome","Acqua di Gio","Issey Miyake",
        "Nautica","Elizabeth Arden","Ajmal","Swiss Arabian","Revlon","Titan Skinn","Forest Essentials"
    };
	return brands;
        }
        if (productName.equals("earphones")){
    String brands[]={
        "Realme","OnePlus","Boult","Boat","JBL","Sony","Sennheiser","Skullcandy","AKG","Apple",
        "Samsung","Xiaomi","Mi","PTron","Noise","Logitech","Razer","Plantronics","Bose","Edifier",
        "Philips","Lenovo","HP","Asus","Redgear","Ambrane","Infinity","Creative","Meizu","Honor",
        "Zebronics","Portronics","Cosmic Byte","EKSA","Blaupunkt","Marshall","Havit"
    };
	return brands;
        }
        if (productName.equals("charger")){
     String brands[]={
        "Anker","Belkin","Portronics","Boat","Mi","Samsung","OnePlus","Realme","Apple","Spigen",
        "Baseus","Ambrane","UGreen","TP-Link","Intex","Lenovo","Sony","HP","Asus","Aukey",
        "Celly","Zebronics","Syska","Micromax","Honor","Huawei","Vivo","OPPO","RavPower","TP-LINK",
        "JBL","iBall","Redgear","Logitech","MiPow","Satechi","Philips"
    };
	return brands;
        }
        if (productName.equals("tv")){
     String brands[]={
        "OnePlus","Mi","TCL","Samsung","LG","Sony","Panasonic","Philips","Haier","Hisense",
        "Vizio","Sharp","Toshiba","Onida","Videocon","Micromax","Vu","Sanyo","Thomson","Motorola",
        "Realme","Nokia","Intex","Sansui","BPL","Weston","iFFALCON","Skyworth","Konka","Changhong",
        "Xiaomi","Acer","Hyundai","Blaupunkt","JVC","Metz","Hitachi"
    };
	return brands;
        }
        if (productName.equals("fridge")){
     String brands[]={
        "Godrej","Panasonic","Haier","LG","Samsung","Whirlpool","Bosch","Siemens","Hitachi","Electrolux",
        "Voltas Beko","IFB","Onida","Videocon","Kelvinator","Sharp","Toshiba","Daewoo","Midea","Hisense",
        "Liebherr","Fisher & Paykel","Smeg","GE Appliances","Frigidaire","Maytag","Amana","Blomberg","Ariston","Candy",
        "Indesit","Beko","Grundig","Zanussi","AEG","Mitsubishi Electric","Sub-Zero"
    };
	return brands;
        }
        if (productName.equals("washingmachine")){
    String brands[]={
        "Bosch","Haier","Panasonic","LG","Samsung","IFB","Whirlpool","Godrej","Onida","Videocon",
        "Siemens","Electrolux","Hitachi","Sharp","Toshiba","Daewoo","Midea","Hisense","Beko","Candy",
        "Indesit","Ariston","AEG","Zanussi","Blomberg","Grundig","Amana","Maytag","Frigidaire","GE Appliances",
        "Fisher & Paykel","Smeg","Mitsubishi Electric","Kelvinator","Lloyd","Voltas Beko","Croma"
    };
	return brands;
        }
        if (productName.equals("ac")){
     String brands[]={
        "Blue Star","Hitachi","Panasonic","LG","Samsung","Voltas","Daikin","Carrier","Whirlpool","Haier",
        "Mitsubishi Electric","O General","Toshiba","Sharp","Hisense","Midea","Gree","Electrolux","Bosch","Siemens",
        "Godrej","Lloyd","Onida","Videocon","Kelvinator","Beko","Hitachi Cooling","Trane","York","Fujitsu",
        "TCL","Hyundai","iFFALCON","Acer","Sansui","Realme TechLife","Xiaomi"
    };
	return brands;
        }
       if (productName.equals("bike")){
     String brands[]={
        "Royal Enfield","Bajaj","TVS","Hero","Honda","Yamaha","Suzuki","KTM","BMW Motorrad","Harley-Davidson",
        "Ducati","Triumph","Kawasaki","Aprilia","Benelli","Jawa","Yezdi","Husqvarna","CFMoto","Royal Alloy",
        "Indian Motorcycle","Moto Guzzi","MV Agusta","Royal Enfield Himalayan","Bajaj Pulsar","TVS Apache","Hero Splendor","Honda Shine","Yamaha R15","Suzuki Gixxer",
        "KTM Duke","BMW GS","Harley Street","Triumph Bonneville","Ducati Monster","Kawasaki Ninja","Aprilia RS"
    };
	return brands;
        }
      if (productName.equals("car")){
      String brands[]={
        "Kia","Skoda","MG","Maruti Suzuki","Hyundai","Tata","Mahindra","Toyota","Honda","Renault",
        "Nissan","Volkswagen","Ford","Jeep","BMW","Mercedes-Benz","Audi","Volvo Cars","Jaguar","Land Rover",
        "Porsche","Ferrari","Lamborghini","Maserati","Bentley","Rolls-Royce","Mini","Citroen","Peugeot","Fiat",
        "Chevrolet","Datsun","Isuzu","BYD","Chery","Geely","Great Wall"
    };  
	return brands;
        }
	if (productName.equals("truck")){
    String brands[]={
        "Volvo","Scania","Isuzu","Tata","Ashok Leyland","BharatBenz","Eicher","Mahindra","Force Motors","SML Isuzu",
        "MAN","Mercedes-Benz Trucks","DAF","Iveco","Renault Trucks","Hino","UD Trucks","FAW","Dongfeng","Sinotruk",
        "Foton","JAC","Kamaz","Ural","GAZ","MAZ","Kenworth","Peterbilt","Mack","Western Star",
        "Freightliner","International","PACCAR","Navistar","Sterling","Tatra","ZIL"
    };
	return brands;
        }
	if (productName.equals("toys")){
    String brands[]={
        "Hot Wheels","Nerf","Hasbro","Lego","Funskool","Mattel","Barbie","Fisher-Price","Disney","Marvel",
        "DC","Playmobil","Tomy","VTech","LeapFrog","Bandai","Takara Tomy","Schleich","Spin Master","Melissa & Doug",
        "Little Tikes","Hamleys","Chicco","Smoby","Hape","Janod","Bruder","Sylvanian Families","Ravensburger","Play-Doh",
        "Mega Bloks","Ninja Turtles","Pokemon","Transformers","Monopoly","Scrabble","UNO"
    };
	return brands;
        }
      if (productName.equals("diapers")){
     String brands[]={
        "Superbottoms","Little's","Mee Mee","Pampers","Huggies","MamyPoko","Babyhug","Sebamed","Chicco","Johnson's",
        "LuvLap","Bambo Nature","Himalaya Baby","Mamaearth","Rascal + Friends","EarthBaby","Pigeon","Libero","Drypers","Molfix",
        "Cuddles","Teddyy","Supples","Snuggy","Tiny Peeps","Care Baby","Goodnites","Bumtum","Caring Baby","Soft Touch",
        "Kindermum","Nest Baby","Baby Joy","Happy Baby","Merries","Goo.N","Moony"
    };
	return brands;
        }
	if (productName.equals("petfood")){
     String brands[]={
        "Purepet","Kennel Kitchen","Drools Focus","Pedigree","Royal Canin","Whiskas","Me-O","Farmina","Orijen","Acana",
        "Taste of the Wild","Hill's Science Diet","Eukanuba","Arden Grange","Nutro","IAMS","Canine Creek","Chappi","SmartHeart","JerHigh",
        "Sheba","Felix","Meat Up","Bark Out Loud","Puppy Chow","Dog Chow","Whiskas Dry","Whiskas Wet","Drools Adult","Drools Puppy",
        "JerHigh Grilled","Henlo","Heads Up For Tails","Pawsome","Petstar","BioPetActive","Brit Care"
    };
	return brands;
        }
	  if (productName.equals("mosquitorepellent")){
     String brands[]={
        "Maxo","Mortein Coil","Good Knight Gold","All Out","Good Knight Coil","Maxo Coil","Mortein Liquid","All Out Liquid","Good Knight Liquid","Hit",
        "Godrej Aer Repellent","Odomos","Odomos Naturals","Odomos Cream","Herbal Strategi","Care Mosquito Repellent","Bye Bye Mosquito","Moskill","Eco-Neem","Neem Guard",
        "Lal Tail Mosquito","Mamaearth Mosquito Repellent","Himalaya Mosquito Repellent","Patanjali Repellent","Mosquito Bye","Buzz Off","Herbal Armor","Citronella Guard","RepelX","Mosfree"
    };
	return brands;
        }
	if (productName.equals("water")){
     String brands[]={
        "Vedica","Himalayan","Rail Neer","Bisleri","Kinley","Aquafina","Bailley","Evian","Smartwater","Catch",
        "Kingfisher","Tata Copper+","Qua","Himalayan Sparkling","Aava","Oxyrich","Voss","Perrier","San Pellegrino","Al Ain",
        "Blue Tokai Water","Zerica","Veedol Water","Nestle Pure Life","Manikchand Oxyrich","Vedika Premium","Clear Premium","Aqua Sure","Mount Valley","H2O Pure"
    };
	return brands;
        }
	if (productName.equals("juice")){
     String brands[]={
        "Paper Boat","B Natural","Raw Pressery","Real","Tropicana","Minute Maid","Frooti","Maaza","Slice","Del Monte",
        "Appy Fizz","Appy","Storia","24 Mantra","Dabur Real Activ","Bailley Juice","Safal","Just Pressed","True Fruits","Kapiva",
        "Paper Boat Swing","Hector Beverages","Mapro","Malee","Ocean Spray","Arizona","Simply Orange","Innocent","Rasiklal M Dhariwal","Ruchi Gold"
    };
	return brands;
        }
	if (productName.equals("notebook")){
    String brands[]={
        "Paperkraft","Luxor","Unigo","Classmate","Camlin","Navneet","Vidya","Apsara","DOMS","ITC Classmate",
        "Solo","Neelgagan","Luxor Student","Papergrid","Sundaram","JK Copier","Bindal","Scholar","Pioneer","Vidyasagar",
        "Pothi","Paper Mint","Target","Navneet Youva","Sudarshan","Vedic Notes","Eco Note","Green Notebook","Little Scholar","NotePro"
    };
	return brands;
        }
	if (productName.equals("pen")){
     String brands[]={
        "Hauser","Pierre Cardin","Linc","Reynolds","Cello","Parker","Pilot","Uni-ball","Pentonic","Flair",
        "Classmate","Add Gel","Montex","Rorito","Luxor","Camlin","Hauser XO","Pentel","Schneider","Faber-Castell",
        "DOMS","Apsara","Elkos","Techno Tip","Natraj","Zebra","Stabilo","Bic","Paper Mate","Cross"
    };
	return brands;
        }
	if (productName.equals("mouse")){
     String brands[]={
        "Zebronics","Redragon","Cosmic Byte","Logitech","HP","Dell","Lenovo","Ant Esports","Razer","Corsair",
        "HyperX","SteelSeries","Asus","MSI","Portronics","iBall","Targus","Rapoo","Ugreen","Amkette",
        "Arctic Fox","Intex","Fingers","Lapcare","Quantum","EvoFox","Havit","Redgear","Acer","Microware"
    };
	return brands;
        }
	if (productName.equals("keyboard")){
     String brands[]={
        "Cosmic Byte","Redgear","Ant Esports","Logitech","HP","Dell","Lenovo","Razer","Corsair","HyperX",
        "SteelSeries","Asus","MSI","Portronics","iBall","Amkette","Zebronics","Fingers","Intex","Lapcare",
        "Rapoo","Ugreen","EvoFox","Havit","Keychron","Royal Kludge","Glorious","Akko","Ducky","Cooler Master"
    };
	return brands;
        }
       if (productName.equals("speaker")){
    String brands[]={
        "Tribit","Marshall","Anker Soundcore","JBL","Sony","Boat","Bose","Harman Kardon","Portronics","Zebronics",
        "Mi","Philips","Logitech","Creative","Skullcandy","Bang & Olufsen","Ultimate Ears","Fingers","Amkette","Intex",
        "iBall","Mivi","Blaupunkt","Klipsch","Edifier","Saregama Carvaan","Echo","Google Nest","Altec Lansing","Marshall Emberton"
    };
	return brands;
        }
	  if (productName.equals("helmet")){
     String brands[]={
        "Axor","SMK","MT Helmets","Vega","Studds","Steelbird","LS2","AGV","Shark","Arai",
        "Bell","KYT","NHK","HJC","Royal Enfield Helmets","TVS Racing","Bieffe","THH","Nitro","Icon",
        "Caberg","Scorpion","Torc","Fly Racing","Gixxer Helmets","Raida","RE Classic","Axxis","LS2 Challenger","SMK Twister"
    };
	return brands;
        }
	if (productName.equals("umbrella")){
     String brands[]={
        "Reid & Taylor","Fendo","Kohyaku","Totes","Destinio","Sun Brand","John’s Umbrella","Knirps","Citizen Umbrella","H&M",
        "FabSeasons","Reebok","Nike","Decathlon","Puma","Adidas","Fabindia","Amazon Basics","Chellarams","Reisenthel",
        "Blunt","Kikkerland","Fulton","Umbro","House of Quirk","Cappadocia","True Colors","Rainfun","Sky Umbrella","StormGuard"
    };
	return brands;
        }
	if (productName.equals("wallet")){
    String brands[]={
        "Urban Forest","Fastrack","Tommy Hilfiger","WildHorn","Woodland","Puma","Nike","Adidas","Van Heusen","Allen Solly",
        "Louis Philippe","Hidesign","Da Milano","Baggit","Lavie","Fossil","U.S. Polo Assn","HRX","Peter England","Wrangler",
        "Levi’s","Skybags","American Tourister","Caprese","Hamster London","Tommy Jeans","Guess","Calvin Klein","Timberland","Spykar"
    };
	return brands;
        }
	 if (productName.equals("belt")){
     String brands[]={
        "Louis Philippe","Allen Solly","Mufti","Peter England","Van Heusen","Fastrack","Woodland","Levi’s","U.S. Polo Assn",
        "Tommy Hilfiger","WildHorn","Urban Forest","Calvin Klein","Hidesign","Da Milano","Provogue","Flying Machine","Wrangler",
        "Spykar","Blackberrys","Park Avenue","Raymond","Tommy Jeans","Reebok","Nike","Adidas","HRX","Puma","Roadster","Basics"
    };
	return brands;
        }
	if (productName.equals("tractor")){
    String brands[]={
        "John Deere","New Holland","Kubota","Mahindra","Sonalika","TAFE","Eicher","Powertrac","Swaraj","Farmtrac",
        "Preet","VST Shakti","Captain","Indo Farm","ACE","Force Motors","Escorts","Deutz-Fahr","Case IH","Massey Ferguson",
        "CLAAS","Fendt","Valtra","Zetor","Yanmar","Solís","Hattat","Same Deutz-Fahr","Trakstar","BigBud"
    };
	return brands;
        }
	if (productName.equals("trimmer")){
    String brands[]={
        "Philips","Mi","Syska","Nova","Havells","Panasonic","Braun","Wahl","Remington","Beardo",
        "Bombay Shaving Company","UrbanMooch","Vega","Kemei","Surker","Gemei","Enchen","Lifelong","Realme","OnePlus",
        "AGARO","Ustraa","Flyco","Rozia","SweetLF","Ikonic","Maxel","Caresmith","Zlade","Groomi",
        "Gizga","Hatteker","Mi Beard Trimmer","Philips BT1230","Panasonic ER207","Nova NHT"
    };
	return brands;
        }
	if (productName.equals("cornflakes")){
     String brands[]={
        "Kelloggs","Bagrrys","Yoga Bar","True Elements","Saffola","Chocos","Nestle","MuesliFit","Kwality",
        "Nature Valley","Slurrp Farm","24 Mantra","Whole Truth","Soulfull","Disano","Urban Platter","MuscleBlaze",
        "Oziva","Pintola","Happilo","Nutty Gritties","Farmley","RiteBite","Max Protein","Alpino","Neuherbs",
        "Just Herbs","TrueFarm","Tata Soulfull","Open Secret","Yoga Bar Pro","RiteBite Max","Nourish Organics",
        "Organic India","Natureland","Praakritik"
    };
	return brands;
        }
     if (productName.equals("oliveoil")){
   String brands[]={
        "Figaro","Leonardo","Borges","Disano","Del Monte","Oleev","Bertolli","Carbonell","Colavita","Pompeian",
        "Saffola","Urban Platter","Praakritik","Organic India","Natureland","True Elements","24 Mantra","Nutriorg",
        "Farm2Kitchen","Conscious Food","Sattvic Foods","Just Organik","Nature Vit","Down To Earth","Pro Nature",
        "Sorich Organics","Neuherbs","Kapiva","HealthKart","TrueFarm","Nutty Yogi","Soulflower","Bare Anatomy",
        "Wow Life Science","Pure & Sure","NutriGlow"
    };
	return brands;
        }
	if (productName.equals("hairdryer")){
     String brands[]={
        "Philips","Dyson","Panasonic","Havells","Syska","Nova","Ikonic","Wahl","Remington","Braun",
        "Vega","Caresmith","AGARO","Realme","Mi","Ustraa","Bombay Shaving Company","UrbanMooch","Enchen","Flyco",
        "Hatteker","Kemei","Surker","Rozia","Gemei","SweetLF","Maxel","Zlade","Beardo","Groomi",
        "Lifelong","Bajaj","Morphy Richards","Conair","Babyliss","GHD","Tefal"
    };
	return brands;
        }
	if (productName.equals("proteinpowder")){
     String brands[]={
        "MuscleBlaze","BigMuscles","MyProtein","ON","GNC","HealthKart","Fast&Up","TrueBasics","Kapiva","Oziva",
        "Wellcore","Boldfit","Nutrabay","Avvatar","Asitis","Labrada","Dymatize","Isopure","BPI Sports","MuscleTech",
        "Endura","IN2","Pintola","Alpino","RiteBite","Whole Truth","Neuherbs","Carbamide Forte","Protinex","Ensure",
        "Horlicks Protein Plus","Pediasure","Fast&Up Plant Protein","Cosmix","Plix","Naturaltein","HealthViva"
    };
	return brands;
        }
	if (productName.equals("facepack")){
    String brands[]={
        "Mamaearth","Wow","Plum","Biotique","Himalaya","Lotus","Khadi Natural","Good Vibes","The Derma Co","Minimalist",
        "MCaffeine","Pilgrim","Dot & Key","Earth Rhythm","Just Herbs","Forest Essentials","Soultree","Plum Goodness",
        "Organic Harvest","Juicy Chemistry","TNW","Love Beauty and Planet","Kapiva","Nat Habit","Reequil","StBotanica",
        "Aroma Magic","O3+","VLCC","Ayuga","Innisfree","Laneige","The Face Shop","Simple","Cetaphil","Neutrogena","Lakme"
    };
	return brands;
        }
	if (productName.equals("cornflakes")){
     String brands[]={
        "Kelloggs","Bagrrys","Yoga Bar","True Elements","Saffola","Nestle","Slurrp Farm","24 Mantra","Soulfull",
        "Nature Valley","Disano","Urban Platter","Whole Truth","Farmley","Happilo","Nutty Gritties","RiteBite","Alpino",
        "Neuherbs","Pintola","MuscleBlaze","Max Protein","Open Secret","TrueFarm","Organic India","Natureland","Praakritik",
        "Nourish Organics","Just Organik","Pro Nature","Conscious Food","Tata Soulfull","Yoga Bar Pro","RiteBite Max",
        "Farm2Kitchen","Down To Earth","Sattvic Foods"
    };
	return brands;
        }
	if (productName.equals("rice")){
     String brands[]={
        "India Gate","Daawat","Kohinoor","Royal","Shree Lal Mahal","Fortune","Pansari","Lal Qilla","Aeroplane",
        "24 Mantra","Organic Tattva","Natureland","Praakritik","Pro Nature","Just Organik","True Elements",
        "Conscious Food","Farm2Kitchen","Sattvic Foods","Down To Earth","Sorich Organics","Urban Platter","Disano",
        "BB Home","BB Royal","More Select","Reliance Select","Tata Sampann","Patanjali","Dharti Gold","Amira",
        "Shubhlaxmi","Daawat Rozana","Super Sarvottam","Vedaka","Smaragd","Heera"
    };
	return brands;
        }
	if (productName.equals("smartphone")){
    String brands[]={
        "Samsung","Apple","OnePlus","Xiaomi","Redmi","Realme","Oppo","Vivo","Iqoo",
        "Motorola","Nokia","Asus","Sony","Google Pixel","Infinix","Tecno","Lava","Micromax",
        "Nothing","Honor","Huawei","Poco","Meizu","Sharp","ZTE","Alcatel","Lenovo",
        "BlackBerry","HTC","Fairphone","Doogee","Ulefone","Cubot","Umidigi","Meizu Blue",
        "iTel","Karbonn"
    };
	return brands;
	}
	if (productName.equals("lipstick")){
    String brands[]={
        "Lakme","Maybelline","LOréal","MAC","Nykaa","Swiss Beauty","Mars","Sugar",
        "Faces Canada","Colorbar","Revlon","Elle 18","Plum","Mamaearth","Wow",
        "The Derma Co","Minimalist","Huda Beauty","Fenty Beauty","Kay Beauty",
        "Kiko Milano","Charlotte Tilbury","Bobbi Brown","Clinique","Estee Lauder",
        "Wet n Wild","Makeup Revolution","Milani","Pat McGrath Labs","Anastasia Beverly Hills",
        "Too Faced","Benefit","Dior","YSL Beauty","Givenchy","Chanel","Tarte"
    };
	return brands;
        }
	if (productName.equals("dumbbells")){
    String brands[]={
        "Aurion","Kore","Strauss","Protoner","Bullrock","HRX","Cockatoo","Decathlon",
        "Cosco","Nivia","Adrenex","Boldfit","AmazonBasics","Kobo","Star X",
        "Vector X","Puma","Nike","Reebok","Adidas","Yonex","SG","SS",
        "Spartan","MRF","Gray Nicolls","GM","Kookaburra","Wilson","Head",
        "Babolat","Slazenger","Tecnifibre","Butterfly","Stag","GKI","Donic"
    };
	return brands;
        }
	if (productName.equals("toothpicks")){
    String brands[]={
        "Sticks India","Presto","Prime Pick","Green Leaf","Beco","Earthwise","EcoRight","NatureCraft","PurePicks","Bamboo India",
        "EcoSoul","Green Sense","NatureWrap","Leafware","EcoBasics","Praakritik","Brown Living","Earthy Picks","Bamboo House",
        "Eco365","GreenRoot","EcoSprout","PlanetWise","GreenChoice","EcoLiving","NatureFirst","BioWare","EcoEssentials",
        "GreenKart","NatureCraft Pro","EcoPure","GreenMinds","Earth Friendly","BioPick","NatureNest","Green Harvest","EcoLine"
    };
	return brands;
        }
	if (productName.equals("papertowel")){
     String brands[]={
        "Origami","Scott","Bounty","Presto","Soft Touch","Premier","Bella","Sorich Organics","Whisper","CleanMate",
        "Kleenex","Viva","Tork","Regina","Plenty","Fine","Zewa","Tempo","Paseo","Elite",
        "Vinda","Cushelle","Sparkle","WypAll","Softex","Tenderly","Satin","Lucart","EcoSoft",
        "GreenLeaf","BioClean","NatureRoll","EarthCare","PureSoft","EcoWipe","GreenTissue","NatureTouch"
    };
	return brands;
        }
	if (productName.equals("tissuebox")){
    String brands[]={
        "Origami","Premier","Soft Touch","Bella","Tempo","Presto","Scott","Kleenex","Sorich Organics","GreenLeaf",
        "Vinda","Paseo","Elite","Zewa","Cushelle","Fine","Regina","Plenty","Viva","Tork",
        "Lucart","Softex","Sparkle","Tenderly","Satin","EcoSoft","NatureSoft","PureSoft","BioClean",
        "EarthCare","GreenTissue","EcoWipe","NatureTouch","SoftPlus","PureCare","NatureLeaf","EcoPure"
    };
	return brands;
        }
	if (productName.equals("aluminiumfoil")){
     String brands[]={
        "Pigeon","Presto","Freshwrapp","Glad","Reynolds","Origami","Presto Choice","CleanWrap","Sorich","FreshOn",
        "Bacofoil","Diamond","GoodCook","HandiFoil","If You Care","AluFresh","EcoWrap","NatureWrap","SafeWrap",
        "KitchenPro","WrapSmart","FoodGuard","ChefMate","CookEasy","WrapMaster","HomeCare","GreenFoil","PureWrap",
        "SilverSeal","ChefWrap","FoilPro","EcoFresh","DailyWrap","KitchenBuddy","FoodSafe","WrapLine","FoilKing"
	 };
	 return brands;
        }
	if (productName.equals("toiletcleaner")){
       String brands[]={
        "Harpic","Domex","Lysol","Taski","Vim","Dettol","Ezee","Presto","EcoCare","GreenShield",
        "Mr Muscle","Cif","Harpic Power","Beco","Better Life","BioKleen","Method","Ecover","Seventh Generation",
        "Astonish","The Pink Stuff","Simple Green","Zoflora","Flash","OxyClean","Clorox","Toilet Duck",
        "PowerClean","HomeShield","CleanMax","PureCare","NatureFresh","EcoClean","GreenLife","CleanPro","SafeHome","FreshCare"
    };
	return brands;
        }
	if (productName.equals("yogamat")){
     String brands[]={
        "Boldfit","Strauss","Adrenex","HRX","Cosco","Decathlon","Reebok","Nike","Puma","Aurion",
        "Adidas","Domyos","Protoner","Cockatoo","Vector X","Nivia","Tego","Lifelong","AmazonBasics",
        "Viva Fitness","Burnlab","Kobo","Star X","PowerMax","HealthSense","Fitkit","Flexnest",
        "Beast Gear","Kore","Kobo Fitness","Tunturi","Liveup","Gaiam","Manduka","Liforme","Alo Yoga","Jade Yoga"
    };
	return brands;
        }
	if (productName.equals("shoe_cleaner")){
    String brands[]={
        "Sneakare","Helios","Sneaker Lab","UrbanMooch","Solemate","Crep Protect","Jason Markk","Shoegr","FreshOn","Tarrago",
        "Kiwi","Collonil","Dasco","Salamander","Columbus","Bata","Helios Pro","Helios Care","Saphir","TRG",
        "Angelus","Reshoevn8r","Pink Miracle","Sole Fresh","Dr Shoe","Shoe Mate","FootFitter","Footmate","CleanKicks",
        "EcoShoe","GreenStep","NatureClean","PureSole","FreshFeet","StepCare","ShoeGuard","FootCare"
    };
	return brands;
        }
	if (productName.equals("car_shampoo")){
    String brands[]={
        "3M","Wavex","Formula 1","Bosch","Liqui Moly","Meguiars","Waxpol","Motomax","Sonax","GoMechanic",
        "Turtle Wax","Armor All","Chemical Guys","Mothers","Rain-X","CarPro","Gyeon","Adam's Polishes","Autoglym",
        "Proklear","Wurth","Koch Chemie","Griot's Garage","Feynlab","Nigrin","Arexons","Abro","Amsoil",
        "Liqui Tech","Valvoline","Total","Castrol","Shell","Petronas","HP Auto","Servo","Motul"
    };
	return brands;
        }
	if (productName.equals("engine_oil")){
     String brands[]={
        "Castrol","Motul","Shell","Servo","Gulf","Valvoline","Total","Liqui Moly","HP","Bosch",
        "Petronas","Mobil 1","Amsoil","Chevron","Idemitsu","Fuchs","ENEOS","Ravenol","Wolf",
        "Repsol","Q8 Oils","Motorex","Motorex Pro","Pennzoil","Havoline","Kixx","ZIC","Yacco",
        "Liqui Tech","Wurth","Koch Chemie","Nulon","STP","Lucas Oil","Royal Purple","Red Line","Millers Oils"
    };
	return brands;
        }
	if (productName.equals("wiperblade")){
     String brands[]={
        "Bosch","Hella","Valeo","Michelin","Rain-X","3M","GoMechanic","Auto Pearl","Roots","Speedwav",
        "Trico","Anco","Denso","Havells","Uno Minda","Hippotech","All Extreme","Autoform","Carall",
        "Maruti Genuine","Honda Genuine","Hyundai Genuine","Toyota Genuine","Volkswagen Genuine","Skoda Genuine",
        "Nissan Genuine","Ford Genuine","Chevrolet Genuine","Suzuki Genuine","Wurth","Febi Bilstein","Mann Filter",
        "Mahle","Meyle","Napa","ACDelco","Bosch Aerotwin"
    };
	return brands;
        }
	if (productName.equals("car_perfume")){
     String brands[]={
        "Involve","Godrej Aer","Areon","Little Trees","Ambi Pur","Odonil","Aromahpure","Air Wick","Glade","Presto",
        "Miniso","Bath & Body Works","Yankee Candle","Febreze","California Scents","My Shaldan","Aroma Treasures",
        "FreshOn","Sorich","EcoCare","GreenLeaf","Carall","Koto","Eikosha","Carmate",
        "Autoform","All Extreme","GoMechanic Fresh","Motomax","Speedwav","Proklear","Areon Gel","Areon Wish",
        "Areon Black","Areon Sport Lux","Involve One Musk","Involve Your Scent","Godrej Aer Twist"
    };
	return brands;
        }
	if (productName.equals("tyre_inflator")){
     String brands[]={
        "Michelin","GoMechanic","Bergmann","3M","Woscher","AmazonBasics","Tirewell","Black+Decker","Philips","Bosch",
        "Xiaomi","70mai","Mi","Dewalt","Makita","Stanley","Ryobi","Einhell","VonHaus",
        "Porter-Cable","Craftsman","Total Tools","Ingco","Ingco Pro","Ronix","Tolsen","Karcher",
        "Hyundai Power","Greenworks","Workpro","Fixman","AutoKit","CarBrite","Proklear","Motomax","All Extreme","Speedwav"
    };
	return brands;
        }
	if (productName.equals("firstaidkit")){
     String brands[]={
        "Dettol","Savlon","Dr Morepen","Hansaplast","Band Aid","Vicks","3M","Johnson & Johnson","Cipla","Dabur",
        "Himalaya","Patanjali","Steroplast","Relicare","Romsons","AccuSure","Beurer","Omron","Medicare",
        "Mee Mee","Chicco","Mothercare","Little Remedies","Goodcare","CareNow","SafeHeal","Healthkart","Tynor",
        "Flamingo","Dynamic","Equinox","Medifeet","Medico","CareTouch","Medline","Vissco","Wellcare"
    };
	return brands;
        }
	if (productName.equals("thermometer")){
     String brands[]={
        "Dr Morepen","Omron","Beurer","AccuSure","Equinox","BPL","Hicks","Rossmax","Omron Pro","Braun",
        "Philips","Citizen","MicroLife","Kare","HealthSense","Tynor","Medtech","DetelPro","Choicemmed",
        "Relisafe","Pankajakasthuri","Pigeon","Mee Mee","Chicco","Mothercare","Little Care",
        "Vicks","Romsons","Medisafe","EasyCare","Certeza","iHealth","Cofoe","Andon","Yuwell","Omron Neo","Dr Trust"
    };
	return brands;
        }
	if (productName.equals("bpmonitor")){
     String brands[]={
        "Omron","Dr Morepen","Beurer","BPL","Rossmax","MicroLife","AccuSure","HealthSense","Equinox","Dr Trust",
        "Medtech","iHealth","Relisafe","Citizen","Omron Pro","Braun","Omron Neo","Omron HEM","Omron Elite",
        "Yuwell","Cofoe","Choicemmed","Andon","Certeza","Diamond","Boso","Sanitas","Medel","Gima",
        "Hicks","Romsons","Welch Allyn","Philips","Nidek","Geratherm","Sejoy","Morepen Pro"
    };
	return brands;
        }
	if (productName.equals("oximeter")){
     String brands[]={
        "Dr Morepen","BPL","Omron","Beurer","AccuSure","HealthSense","Equinox","Dr Trust","Rossmax","MicroLife",
        "Choicemmed","Yuwell","Cofoe","Andon","Certeza","Medtech","Relisafe","Hicks","Romsons","Gima",
        "Sanitas","Medel","Boso","Geratherm","Sejoy","Philips","Welch Allyn","Nonin","Masimo","Contec",
        "Creative Medical","iHealth","CareTouch","HealOxy","Oxywatch","Oxymed","Wellue"
    };
	return brands;
        }
	if (productName.equals("hotwaterbag")){
     String brands[]={
        "Relisafe","Equinox","Dr Morepen","Flamingo","Tynor","Vissco","Romsons","CareNow","Medico","AccuSure",
        "Beurer","BPL","Hansaplast","3M","Medtech","Dynamic","Goodcare","Wellcare","Medifeet",
        "Friends","SafeHeal","HealthKart","CareTouch","Classic Care","WarmEase","ThermoCare","HeatOn",
        "HotComfort","HeatPro","WarmBuddy","HealHeat","ReliefBag","HotPack","HeatEase","WarmAid","ThermoAid","ReliefPro"
    };

	return brands;
        }
	if (productName.equals("weighingscale")){
     String brands[]={
        "Omron","Dr Morepen","HealthSense","Equinox","Beurer","Mi","Xiaomi","Philips","BPL","Rossmax",
        "AccuSure","Dr Trust","iHealth","Hicks","Relisafe","Medtech","Tynor","Etekcity","Fitbit",
        "Garmin","Withings","Renpho","Arboleaf","Qardio","Lifelong","Prestige","Orpat","Morphy Richards",
        "Koryo","Kent","Havells","Borosil","Nova","Syska","Pigeon","Panasonic","Atomberg"
    };
	return brands;
        }
	if (productName.equals("cricketbat")){
     String brands[]={
        "MRF","SS","SG","Kookaburra","Gray Nicolls","Adidas","Reebok","Spartan","New Balance","GM",
        "BAS","DSC","Cosco","Nivia","Slazenger","Puma","TON","CEAT","Kippax",
        "CA Sports","GMX","Hammer","Gunn & Moore","Readers","Woodworm","Salix","Sareen Sports","Aldila",
        "Chase","BDM","Morrant","Airstream","Fortune","PowerPlay","Strike","Vicky","Classic Sports"
    };
	return brands;
        }
	if (productName.equals("cricketbat")){
     String brands[]={
        "MRF","SS","SG","Kookaburra","Gray Nicolls","Adidas","Reebok","Spartan","New Balance","GM",
        "BAS","DSC","Cosco","Nivia","Slazenger","Puma","TON","CEAT","Kippax",
        "CA Sports","GMX","Hammer","Gunn & Moore","Readers","Woodworm","Salix","Sareen Sports","Aldila",
        "Chase","BDM","Morrant","Airstream","Fortune","PowerPlay","Strike","Vicky","Classic Sports"
    };
	return brands;
        }
	if (productName.equals("badmintonracket")){
     String brands[]={
        "Yonex","Li-Ning","Victor","Carlton","Apacs","Cosco","Nivia","Yonex Pro","Hundred",
        "Head","Babolat","Wilson","Prokennex","Ashaway","Gosen","Kawasaki","Maxbolt","Felet",
        "Forza","Karakal","Talbot Torro","Prince","Kumpoo","RSL","FZ Forza","Winex","Mizuno",
        "Spartan","SG","SS","PowerPlay","Vector X","Decathlon","Artengo","DSC","Silver’s","Xiom"
    };
	return brands;
        }
	if (productName.equals("volleyball")){
     String brands[]={
        "Cosco","Nivia","Mikasa","Molten","Spalding","Wilson","Adidas","Nike","Puma","Vector X",
        "SS","SG","Jaspo","Tachikara","Baden","Champion","Franklin","Rawlings","PowerPlay",
        "Decathlon","Kipsta","Sportstar","Playwell","Dribbling","Sondico","Penalty","Select",
        "Umbro","Uhlsport","Lotto","Diadora","Kelme","Mitre","Vector","Storm","Pro Touch","Victory"
    };
	return brands;
        }
	if (productName.equals("chessboard")){
     String brands[]={
        "StonKraft","Chessbazaar","House of Staunton","Royal Chess Mall","The Chess Empire",
        "Kaushal Creations","Toyshine","Smartivity","Funskool","Hasbro","Mattel","Scorpius",
        "Kadam Toys","Desi Toys","Little Genius","Skillofun","Apex","Butterfly","Genius",
        "Royal Arts","Wooden World","Artshala","CraftVatika","Ethnik Living","IndusPeople",
        "Woodbee","Rajrang","Indian Art Villa","Chumbak","Home Centre","Pepperfry","Urban Ladder",
        "Flipkart SmartBuy","AmazonBasics","Decathlon","Hamleys","ToysRUs"
    };
	return brands;
        }
	if (productName.equals("carromboard")){
     String brands[]={
        "Synco","Surco","Precise","Siscaa","Rasiklal M Dhariwal","Siscaa Pro","Stag","Cockatoo",
        "Butterfly","GSI","Prem","Precise Champion","Precise Royale","Siscaa Turbo","Synco Supreme",
        "Surco Club","Siscaa Premium","Precise Star","Rasiklal Gold","Genius","Playwell","PowerPlay",
        "Decathlon","Vector X","Jaspo","SS","SG","Cosco","Nivia","Tornado","Champion","Royal Sports",
        "Victory","Pro Sports","Sportstar","Game On","Classic Sports"
    };
	return brands;
        }
	if (productName.equals("noodles")){
    String brands[]={
        "Maggi","Yippee","Top Ramen","Wai Wai","Ching's Secret","Knorr","Patanjali",
        "Nissin","Samyang","Koka","Indomie","Mama","Veeba","ITC","Saffola Oodles",
        "Sunfeast Yippee Magic","Top Ramen Curry","Maggi Masala","Maggi Special Masala",
        "Wai Wai Classic","Ching's Hakka Noodles","Knorr Soupy Noodles","Patanjali Atta Noodles",
        "Nissin Cup Noodles","Samyang Hot Chicken","Koka Veg Noodles","Indomie Mi Goreng",
        "Mama Hot Garlic","Veeba Cup Noodles","ITC YiPPee Mood Masala","Saffola Oodles Veg",
        "Top Ramen Fiery Chilli","Maggi Chicken Noodles","Maggi Veg Atta Noodles",
        "Wai Wai Quick","Ching's Schezwan Noodles","Nissin Korean Ramen"
    };
	return brands;
        }
	if (productName.equals("chocolate")){
     String brands[]={
        "Cadbury","Nestle","Amul","Ferrero Rocher","Lindt","Toblerone","Hershey's",
        "Mars","Galaxy","Milka","Ghirardelli","Kinder","Bournville","5 Star","Perk",
        "KitKat","Munch","Bar One","Snickers","Twix","M&M's","Temptations","Silk",
        "Fuse","Alpenliebe","Milkybar","Eclairs","Melody","Coffee Bite","Raffaello",
        "Kinder Joy","KitKat Chunky","Amul Dark Chocolate","Cadbury Dairy Milk",
        "Bournvita Bites","Nestle Crunch","Mars Bounty"
    };
	return brands;
        }
	if (productName.equals("ketchup")){
     String brands[]={
        "Kissan","Maggi","Heinz","Del Monte","Veeba","Ching's","Patanjali","Organic Tattva",
        "24 Mantra","Keya","Tops","FunFoods","Mother's Recipe","Smith & Jones","Wingreens",
        "Hellmann's","American Garden","True Elements","BB Royal","Urban Platter",
        "Disano","Leonardo","Hershey's","Veeba Tomato Ketchup","Kissan Fresh Tomato",
        "Maggi Hot & Sweet","Del Monte Classic","Heinz Tomato Ketchup","Patanjali Tomato Ketchup",
        "Ching's Tomato Ketchup","FunFoods Tomato Ketchup","Tops Tomato Ketchup",
        "Keya Tomato Ketchup","Smith & Jones Tomato Ketchup","Mother's Recipe Tomato Ketchup",
        "Organic Tattva Ketchup","24 Mantra Organic Ketchup","Wingreens Ketchup"
    };
	return brands;
        }
	if (productName.equals("icecream")){
    String brands[]={
        "Amul","Kwality Walls","Vadilal","Mother Dairy","Havmor","Cream Bell","Arun Icecreams",
        "Baskin Robbins","Naturals","Dinshaw's","Scoops","Ibaco","NIC Ice Creams",
        "London Dairy","Gelato Italiano","Movenpick","Haagen-Dazs","Brooklyn Creamery",
        "Apsara Ice Creams","Milano","Grameen Kulfi","Top 'N Town","Polar Bear",
        "Giani's","Ideal Ice Cream","Merwans","Vadilal Gourmet","Amul Gold",
        "Kwality Walls Cornetto","Kwality Walls Feast","Mother Dairy Cassatta",
        "Havmor Choco Bar","Arun Ice Creams Crunchy","Cream Bell Black Forest",
        "Naturals Tender Coconut","Baskin Robbins Gold Medal","NIC Alphonso Mango"
    };
	return brands;
        }
	if (productName.equals("namkeen")){
     String brands[]={
        "Haldiram's","Bikaji","Balaji","Prataap Snacks","Lays","Kurkure","Too Yumm",
        "Uncle Chipps","Bingo","Garden","Gopal","Yellow Diamond","Raja Namkeen",
        "Om Namkeen","Gits","MTR","Anand Namkeen","Chheda's","Jabsons","Nut Cracker",
        "Real Namkeen","Girish Chanachur","Bombaywala","Shree Namkeen","Shyam Sundar",
        "Bikaneri Bhujiawala","Laxmi Namkeen","Ganesh Gruh Udyog","Ratan Sev Bhandar",
        "Jagat Namkeen","Prakash Namkeen","Jagdish Foods","Manikchand Namkeen",
        "Mahakali Namkeen","Royal Namkeen","Kanha Namkeen","Laxmi Snacks"
    };
	return brands;
        }
	
	if (productName.equals("spices")){
     String brands[]={
        "MDH","Everest","Catch","Badshah","Eastern","Aachi","MTR","Keya","24 Mantra",
        "Organic Tattva","Tata Sampann","Patanjali","Smith & Jones","Snapin","Urban Platter",
        "Sorich Organics","Disano","BB Royal","Lion","Pushp","Rasoi Magic","Ruchi",
        "Vasant Masala","Kitchen King","Zoff","Goldiee","Shan","National","Weikfield",
        "Parampara","Vandevi","Aashirvaad Masala","Suhana","Gits Masala","Sakthi","Annapurna Masala","Catch Sprinklers"
    };
	return brands;
        }
	if (productName.equals("masala")){
     String brands[]={
        "MDH","Everest","Catch","Badshah","Eastern","Aachi","MTR","Keya","24 Mantra",
        "Organic Tattva","Tata Sampann","Patanjali","Smith & Jones","Snapin","Urban Platter",
        "Sorich Organics","Disano","BB Royal","Lion","Pushp","Rasoi Magic","Ruchi",
        "Vasant Masala","Kitchen King","Zoff","Goldiee","Shan","National","Weikfield",
        "Parampara","Vandevi","Aashirvaad Masala","Suhana","Gits Masala","Sakthi","Annapurna Masala","Catch Sprinklers"
    };
	return brands;
        }
	if (productName.equals("cereals")){
     String brands[]={
        "Kelloggs","Bagrrys","Yoga Bar","True Elements","Saffola","Nestle","Tata Soulfull",
        "Slurrp Farm","24 Mantra","Organic Tattva","Disano","BB Royal","Urban Platter","Pintola",
        "Happilo","Farmley","Nutty Gritties","RiteBite","Max Protein","Alpino","Neuherbs",
        "Nourish Organics","Natureland","Praakritik","Whole Truth","Open Secret","MuscleBlaze",
        "Oziva","TrueFarm","Just Herbs","Nature Valley","Kwality","Keya","Smith & Jones",
        "Veeba","Wingreens","Leonardo"
    };
	return brands;
        }
	if (productName.equals("bakeryitems")){
     String brands[]={
        "Britannia","Harvest Gold","Modern","Wibs","Elite","English Oven","Bonn","Bakery Bites",
        "La Americana","Karachi Bakery","Britannia Little Hearts Bread","Nature's Fresh",
        "Daily Bread","La Baguette","The Baker's Dozen","Paris Bakery","Just Baked",
        "Bonn Atta Bread","Modern Whole Wheat","Harvest Gold 100% Atta","Elite Brown Bread",
        "Wibs Brown Bread","Karachi Bakery Fruit Cake","Bonn Milk Bread","Modern Milk Bread",
        "Britannia Brown Bread","Harvest Gold Multigrain","English Oven Whole Wheat",
        "Elite Multigrain","Bonn Multigrain","Wibs Multigrain","La Americana Bread",
        "Daily Bread Multigrain","The Baker's Dozen Sourdough","Paris Bakery Buns",
        "Nature's Fresh Sandwich Bread","Just Baked Cookies"
    };
	return brands;
        }
	if (productName.equals("babyfood")){
    String brands[]={
        "Nestle Cerelac","Nestle Lactogen","Nestle NAN","Similac","Aptamil","Dexolac",
        "Farex","Hipp Organic","Slurrp Farm","Timios","Early Foods","Babynat","Patanjali",
        "Manna","HealthyHey","24 Mantra Baby","Organic Tattva Baby","Disano Baby",
        "Abbott PediaSure","Ensure Kids","Little Joys","Little Munchkins","Sprout Organics",
        "Gerber","Baby Gourmet","Happy Baby","Earth's Best","Plum Organics","Holle",
        "Little Rituals","Natureland Baby","Praakritik Baby","First Solid Foods",
        "Tiny Organics","Nurture Pro Baby","My Little One","Bebe Burp","Mamaearth Baby Food"
    };
	return brands;
        }
	if (productName.equals("frozenfoods")){
     String brands[]={
        "McCain","Godrej Yummiez","ITC Master Chef","Prasuma","Al Kabeer","Sumeru",
        "Zorabian Chicken","Licious Frozen","FreshToHome Frozen","Tata Sampann Frozen",
        "HyFun","McPatty","Meatigo Frozen","Venky's","CP Foods","Suguna","Buffalo Frozen",
        "Cambay Tiger","Ocean Delight","Meatzza","Yummiez","ITC Bingo Frozen",
        "Prasuma Momos","Sumeru Momos","Al Kabeer Kebabs","Godrej Nuggets","McCain Smiles",
        "McCain Fries","HyFun Fries","Venky's Chicken Pops","Zorabian Seekh Kebabs",
        "CP Momos","Suguna Chicken Fingers","Prasuma Bao Buns","ITC Master Chef Paneer Tikka",
        "Sumeru Spring Rolls","Licious Frozen Momos","FreshToHome Frozen Fish"
    };
	return brands;
        }
	if (productName.equals("frozenfoods")){
     String brands[]={
        "McCain","Godrej Yummiez","ITC Master Chef","Prasuma","Al Kabeer","Sumeru",
        "Zorabian Chicken","Licious Frozen","FreshToHome Frozen","Tata Sampann Frozen",
        "HyFun","McPatty","Meatigo Frozen","Venky's","CP Foods","Suguna","Buffalo Frozen",
        "Cambay Tiger","Ocean Delight","Meatzza","Yummiez","ITC Bingo Frozen",
        "Prasuma Momos","Sumeru Momos","Al Kabeer Kebabs","Godrej Nuggets","McCain Smiles",
        "McCain Fries","HyFun Fries","Venky's Chicken Pops","Zorabian Seekh Kebabs",
        "CP Momos","Suguna Chicken Fingers","Prasuma Bao Buns","ITC Master Chef Paneer Tikka",
        "Sumeru Spring Rolls","Licious Frozen Momos","FreshToHome Frozen Fish"
    };
	return brands;
        }
	if (productName.equals("instantmix")){
    String brands[]={
        "MTR","Gits","iD Fresh","Aachi","Eastern","Bambino","Weikfield","Patanjali",
        "24 Mantra","Organic Tattva","Tata Sampann","Keya","Snapin","Smith & Jones","Urban Platter",
        "Sorich Organics","Disano","BB Royal","Lion","Pushp","Vasant Masala","Ruchi","Zoff",
        "Goldiee","Shan","National","Parampara","Vandevi","Aashirvaad Instant Mix","Suhana",
        "Gits Ready Mix","MTR Ready Mix","iD Batter Mix","Bambino Pasta Mix","Weikfield Custard",
        "Keya Pasta Mix","Tata Sampann Poha Mix"
    };
	return brands;
        }
	if (productName.equals("pickles")){
     String brands[]={
        "Mother's Recipe","Patanjali","Priya","MTR","Gits","Aachi","Eastern","Bedekar",
        "Nilon's","24 Mantra","Organic Tattva","Disano","BB Royal","Lion","Vasant Masala",
        "Ruchi","Weikfield","Urban Platter","Sorich Organics","Parampara","Vandevi","Rasoi Magic",
        "Catch","Keya","Smith & Jones","Tata Sampann","Goldiee","Zoff","National","Shan",
        "Annapurna","Praakritik","Natureland","Sakthi","Pushp","Gowardhan Pickles","Bedekar Mango Pickle","Priya Gongura Pickle"
    };
	return brands;
        }
	if (productName.equals("sauces")){
     String brands[]={
        "Kissan","Maggi","Heinz","Del Monte","Veeba","Ching's","Patanjali","FunFoods",
        "Tops","Smith & Jones","Wingreens","Hellmann's","American Garden","Keya","Weikfield",
        "Urban Platter","Sorich Organics","Disano","BB Royal","24 Mantra","Organic Tattva",
        "Leonardo","Borges","Barilla","La Costeña","Tabasco","Lee Kum Kee","GoongJang",
        "Thai Taste","Mae Ploy","Schezwan Ching's","Veeba Chipotle","Maggi Hot & Sweet",
        "Heinz BBQ Sauce","Del Monte Pasta Sauce","Wingreens Sriracha","FunFoods Mayonnaise","Kissan Fresh Tomato Sauce"
    };
	return brands;
        }
	if (productName.equals("breakfastitems")){
     String brands[]={
        "Kelloggs","Bagrrys","Yoga Bar","True Elements","Saffola","Nestle","Tata Soulfull",
        "Slurrp Farm","iD Fresh","MTR","Gits","Aachi","Eastern","Bambino","Weikfield",
        "Britannia","Harvest Gold","Modern","Wibs","English Oven","Bonn","Elite","Amul",
        "Mother Dairy","Epigamia","Yakult","Danone","Milky Mist","Gowardhan","Patanjali",
        "Keya","Smith & Jones","Urban Platter","Disano","BB Royal","Organic Tattva","24 Mantra","Wingreens","Veeba"
    };
	return brands;
        }
	if (productName.equals("readytoeat")){
     String brands[]={
        "MTR","Gits","ITC Kitchens of India","Haldiram's","Bikaji","Bikanervala","Tata Sampann",
        "Patanjali","24 Mantra","Organic Tattva","Aashirvaad Ready Meals","Eastern","Aachi",
        "MTR Tasty Bites","Gits Ready Meals","Ashoka Foods","Sumeru","Prasuma","Godrej Yummiez",
        "McCain","ITC Master Chef","iD Fresh","Tasty Bite","The Whole Truth Foods",
        "Wingreens","Veeba","Urban Platter","Sorich Organics","Disano","BB Royal","Parampara",
        "National","Shan","Goeld","Kitchen Xpress","MTR Upma Ready","Haldiram's Rajma Chawal","ITC Dal Tadka"
    };
	return brands;
        }
	if (productName.equals("frozendesserts")){
     String brands[]={
        "Amul","Kwality Walls","Vadilal","Mother Dairy","Havmor","Cream Bell","Arun Icecreams",
        "Baskin Robbins","Naturals","Dinshaw's","Ibaco","NIC Ice Creams","London Dairy",
        "Haagen-Dazs","Movenpick","Gelato Italiano","Milano","Apsara Ice Creams","Grameen Kulfi",
        "Polar Bear","Top 'N Town","Giani's","Ideal Ice Cream","Merwans","Vadilal Gourmet",
        "Kwality Walls Cornetto","Kwality Walls Feast","Mother Dairy Cassatta","Havmor Choco Bar",
        "Arun Ice Creams Crunchy","Cream Bell Black Forest","Naturals Tender Coconut",
        "Baskin Robbins Gold Medal","NIC Alphonso Mango","Amul Gold","Vadilal Black Currant",
        "Giani's Kulfi","Polar Bear Belgian Chocolate"
    };
	return brands;
        }
	if (productName.equals("cleaningsupplies")){
     String brands[]={
        "Harpic","Domex","Lizol","Dettol","Savlon","Vim","Pril","Exo","Giffy","Colin",
        "Mr Muscle","Ezee","Presto","Origami","Bella","Scotch-Brite","Gala","Spotzero",
        "Spontex","Taski","3M","GreenShield","EcoCare","Beco","Earthwise","EcoRight",
        "FreshOn","Sorich Organics","BB Home","Godrej Protekt","Good Home","ShineX",
        "Kleanz","Ujala","Rin","Surf Excel","Tide"
    };
	return brands;
        }
	if (productName.equals("petaccessories")){
     String brands[]={
        "Drools","Pedigree","Purepet","Royal Canin","Whiskas","Me-O","Kennel Kitchen",
        "Dogsee Chew","Heads Up For Tails","Wiggles","Farmina","Orijen","Acana","Bark Out Loud",
        "JerHigh","Gnawlers","Beaphar","Pets Empire","Pet Vogue","Dogaholic","Chip Chops",
        "Choostix","Pet Mankind","Captain Zack","Rena Love","Petvit","Himalaya Pet Care",
        "Just Dogs","SmartyKat","Kong","Trixie","Petmate","Outward Hound","Nandog","Ferplast",
        "Kurgo","Earthbath","Fofos"
    };
	return brands;
        }
	if (productName.equals("stationeryitems")){
     String brands[]={
        "Classmate","Navneet","Camlin","Apsara","Nataraj","Cello","Reynolds","Linc","Hauser",
        "Pierre Cardin","Luxor","Faber Castell","Staedtler","Kokuyo","Maped","Pilot",
        "Pentel","Uni-Ball","Parker","Waterman","Bic","M&G","Paperkraft","Unigo","Schneider",
        "Montex","DOMS","Flair","Add Gel","Sundaram","Oddy","JK Paper","TNPL","ITC Classmate",
        "Bindal","Solo","Papergrid","Kores"
    };
	return brands;
        }
	if (productName.equals("kitchenware")){
     String brands[]={
        "Prestige","Hawkins","Pigeon","Butterfly","Milton","Cello","Signoraware","Tupperware",
        "Borosil","La Opala","Corelle","Wonderchef","Vinod","Bergner","Chef's Basket",
        "iBELL","INALSA","Morphy Richards","Bajaj","Philips","Kent","HUL Pureit","Havells",
        "Usha","Crompton","Preethi","Sumeet","Vidiem","Stahl","Aristo","Home Centre",
        "Solimo","AmazonBasics","IKEA","Cello Prima","Milton Thermosteel","Borosil Glasslock","Lock & Lock"
    };
	return brands;
        }
	if (productName.equals("bathroomitems")){
    String brands[]={
        "Hindware","Jaquar","Parryware","Cera","Kohler","Roca","Toto","VitrA","Grohe","Hansgrohe",
        "Somany","Johnson","Kajaria","Asian Paints","Berger","Nerolac","Harpic","Domex",
        "Lizol","Dettol","Savlon","Godrej Protekt","Presto","Origami","Bella","Scotch-Brite",
        "Gala","Spotzero","Taski","3M","GreenShield","EcoCare","Beco","Earthwise","EcoRight",
        "FreshOn","Sorich Organics","BB Home"
    };
	return brands;
        }
	if (productName.equals("partysupplies")){
    String brands[]={
        "Party Propz","Funcart","Chumbak","Archies","I Party","Fun Factory","Happy Birthday Store",
        "Balloon City","Party Hunterz","Party Genie","CraftVatika","Home Centre","IKEA",
        "Solimo","AmazonBasics","Shopo","Printrove","Propshop24","Artbox","Sparklers",
        "Confetti India","Knotty Rugs","Party Anthem","Party League","Creative Hands",
        "Paper Boat Party","Miniso","Mr DIY","Daiso","Flying Tiger","Funskool","Frank",
        "Hasbro","Mattel","Smiggle","It’s My Party","Little Surprise","Party Junction"
    };
	return brands;
        }
	if (productName.equals("bathroomcleaners")){
     String brands[]={
        "Harpic","Domex","Lizol","Dettol","Savlon","Taski","Mr Muscle","Colin","Ezee","Presto",
        "Origami","Bella","Scotch-Brite","Gala","Spotzero","Spontex","3M","GreenShield",
        "EcoCare","Beco","Earthwise","EcoRight","FreshOn","Sorich Organics","BB Home",
        "Godrej Protekt","Good Home","ShineX","Kleanz","Ujala","Rin","Surf Excel","Tide",
        "Vim","Pril","Exo","Giffy"
    };
	return brands;
        }
	if (productName.equals("kitchenappliances")){
     String brands []={
        "Prestige","Hawkins","Pigeon","Butterfly","Milton","Cello","Signoraware","Tupperware",
        "Borosil","Wonderchef","Vinod","Bergner","INALSA","Morphy Richards","Bajaj","Philips",
        "Kent","HUL Pureit","Havells","Usha","Crompton","Preethi","Sumeet","Vidiem","Stahl",
        "iBELL","Aristo","Home Centre","Solimo","AmazonBasics","IKEA","La Opala","Corelle",
        "Lock & Lock","Glasslock","Chef's Basket","Faberware"
    };
	return brands;
        }
	if (productName.equals("officesupplies")){
     String brands[]={
        "Classmate","Navneet","Camlin","Apsara","Nataraj","Cello","Reynolds","Linc","Hauser",
        "Pierre Cardin","Luxor","Faber Castell","Staedtler","Kokuyo","Maped","Pilot","Pentel",
        "Uni-Ball","Parker","Waterman","Bic","M&G","Paperkraft","Unigo","Schneider","Montex",
        "DOMS","Flair","Add Gel","Sundaram","Oddy","JK Paper","TNPL","ITC Classmate","Bindal",
        "Solo","Papergrid"
    };
	return brands;
			}
	if (productName.equals("schoolsupplies")){
    String brands[]={
        "Classmate","Navneet","Camlin","Apsara","Nataraj","Cello","Reynolds","Linc","Hauser",
        "Luxor","Faber Castell","Staedtler","Kokuyo","Maped","Pilot","Pentel","Uni-Ball",
        "Paperkraft","Unigo","DOMS","Flair","Add Gel","Sundaram","Oddy","JK Paper","TNPL",
        "ITC Classmate","Bindal","Solo","Papergrid","Smiggle","Miniso","Daiso","Flying Tiger",
        "Chumbak","Archies","Funskool"
    };
	return brands;
        }
	if (productName.equals("gardeningtools")){
    String brands[]={
        "Ugaoo","TrustBasket","Kraft Seeds","Gala","Falcon","Bosch","Black+Decker","Kisankraft",
        "Neptune","Sharpex","Hillgrove","Stanley","Taparia","Eveready","Philips","3M",
        "GreenGrower","GreenSense","EcoGrow","Beco","Earthwise","EcoRight","FreshOn",
        "Sorich Organics","BB Home","Agrovet","AgroStar","FarmersStop","IFFCO","Coromandel",
        "Tata Rallis","Bayer","Syngenta","UPL","Indofil","Anand Tools","Wolf Garten"
    };
	return brands;
        }
		
	if (productName.equals("festivedecorations")){
    String brands[]={
        "Archies","Chumbak","IKEA","Home Centre","Solimo","AmazonBasics","Funcart","Party Propz",
        "CraftVatika","Printrove","Shopo","Propshop24","Artbox","Miniso","Mr DIY","Daiso",
        "Flying Tiger","Smiggle","Paper Boat Party","Party Hunterz","Party Genie","Confetti India",
        "Sparklers","Creative Hands","Knotty Rugs","Party League","Party Junction","Little Surprise",
        "Happy Birthday Store","Balloon City","Party Anthem","Funcart India","I Party","Fun Factory",
        "Party City","Giftcart","Archies Gallery"
    };
	return brands;
        }
	 if (productName.equals("Sugar")) {
     String brands[] = {
                "Madhur","Dhampur","Parry","Uttam",
                "Shakti","Trust","OrganicSugar",
                "PureSweet","GoldenSugar","DailySugar",
                "HealthySugar","SmartSugar","LiteSugar",
                "PremiumSugar","FineSugar","CrystalWhite",
                "SweetDrop","SugarKing","WhiteCrystal",
                "MegaSweet","SuperSweet","FarmSugar",
                "NatureSugar","EliteSweet","CareSugar",
                "FamilySweet","RoyalSweet","AgroSugar",
                "GreenSweet","HomeSweet","UltraSweet",
                "StrongSweet","VillageSweet","BestSweet",
                "SugarPlus","NaturalSweet","PureCrystal"
            };
            return brands;
	 }
	       if (productName.equals("Salt")) {
            String brands[] = {
                "TataSalt","AashirvaadSalt","CatchSalt",
                "CaptainCook","Annapurna","NatureSalt",
                "CrystalSalt","PureSalt","RockSalt",
                "BlackSalt","SeaSalt","HimalayanSalt",
                "LiteSalt","PremiumSalt","FineSalt",
                "SmartSalt","HealthySalt","DailySalt",
                "VillageSalt","MegaSalt","SuperSalt",
                "GreenSalt","RoyalSalt","AgroSalt",
                "FamilySalt","HomeSalt","UltraSalt",
                "StrongSalt","CareSalt","EliteSalt",
                "NaturalSalt","BestSalt","WhiteSalt",
                "SaltPlus","SaltKing","FreshSalt",
                "CleanSalt"
            };
            return brands;
		   }
			    if (productName.equals("Butter")) {
            String brands[] = {
                "AmulButter","BritanniaButter","MotherDairyButter",
                "NandiniButter","MilkyMistButter","Gowardhan",
                "HeritageButter","VijayaButter","FreshButter",
                "GoldenButter","DailyButter","LiteButter",
                "PremiumButter","NatureButter","RoyalButter",
                "VillageButter","SmartButter","HealthyButter",
                "FineButter","CareButter","EliteButter",
                "MegaButter","SuperButter","FamilyButter",
                "HomeButter","UltraButter","BestButter",
                "AgroButter","ButterKing","ButterPlus",
                "PureButter","NaturalButter","FarmButter",
                "StrongButter","GreenButter","ClassicButter",
                "RichButter"
            };
            return brands;
        }
		  if (productName.equals("Cheese")) {
            String brands[] = {
                "AmulCheese","BritanniaCheese","GoCheese",
                "MilkyMistCheese","MotherDairyCheese",
                "VijayaCheese","FreshCheese","GoldenCheese",
                "DailyCheese","LiteCheese","PremiumCheese",
                "NatureCheese","RoyalCheese","VillageCheese",
                "SmartCheese","HealthyCheese","FineCheese",
                "CareCheese","EliteCheese","MegaCheese",
                "SuperCheese","FamilyCheese","HomeCheese",
                "UltraCheese","BestCheese","AgroCheese",
                "CheeseKing","CheesePlus","PureCheese",
                "NaturalCheese","FarmCheese","StrongCheese",
                "GreenCheese","ClassicCheese","RichCheese",
                "SoftCheese","CreamCheese"
            };
            return brands;
        }
 if (productName.equals("Curd")) {
            String brands[] = {
                "AmulCurd","NandiniCurd","MotherDairyCurd",
                "HeritageCurd","ArokyaCurd","DodlaCurd",
                "VijayaCurd","MilkyMistCurd","FreshCurd",
                "GoldenCurd","DailyCurd","LiteCurd",
                "PremiumCurd","NatureCurd","RoyalCurd",
                "VillageCurd","SmartCurd","HealthyCurd",
                "FineCurd","CareCurd","EliteCurd",
                "MegaCurd","SuperCurd","FamilyCurd",
                "HomeCurd","UltraCurd","BestCurd",
                "AgroCurd","CurdKing","CurdPlus",
                "PureCurd","NaturalCurd","FarmCurd",
                "StrongCurd","GreenCurd","ClassicCurd",
                "RichCurd"
            };
            return brands;
        }
 if (productName.equals("Paneer")) {
            String brands[] = {
                "AmulPaneer","MilkyMistPaneer","MotherDairyPaneer",
                "NandiniPaneer","HeritagePaneer","VijayaPaneer",
                "FreshPaneer","GoldenPaneer","DailyPaneer",
                "LitePaneer","PremiumPaneer","NaturePaneer",
                "RoyalPaneer","VillagePaneer","SmartPaneer",
                "HealthyPaneer","FinePaneer","CarePaneer",
                "ElitePaneer","MegaPaneer","SuperPaneer",
                "FamilyPaneer","HomePaneer","UltraPaneer",
                "BestPaneer","AgroPaneer","PaneerKing",
                "PaneerPlus","PurePaneer","NaturalPaneer",
                "FarmPaneer","StrongPaneer","GreenPaneer",
                "ClassicPaneer","RichPaneer","SoftPaneer",
                "CreamPaneer"
            };
            return brands;
        }	
    if (productName.equals("Ghee")) {
            String brands[] = {
                "AmulGhee","NandiniGhee","PatanjaliGhee",
                "MotherDairyGhee","GowardhanGhee",
                "AashirvaadGhee","VijayaGhee","FreshGhee",
                "GoldenGhee","DailyGhee","LiteGhee",
                "PremiumGhee","NatureGhee","RoyalGhee",
                "VillageGhee","SmartGhee","HealthyGhee",
                "FineGhee","CareGhee","EliteGhee",
                "MegaGhee","SuperGhee","FamilyGhee",
                "HomeGhee","UltraGhee","BestGhee",
                "AgroGhee","GheeKing","GheePlus",
                "PureGhee","NaturalGhee","FarmGhee",
                "StrongGhee","GreenGhee","ClassicGhee",
                "RichGhee","CowGhee"
            };
            return brands;
        }	
     if (productName.equals("Jam")) {
            String brands[] = {
                "Kissan","Mapro","Bhuira","Mala",
                "FreshJam","GoldenJam","DailyJam",
                "LiteJam","PremiumJam","NatureJam",
                "RoyalJam","VillageJam","SmartJam",
                "HealthyJam","FineJam","CareJam",
                "EliteJam","MegaJam","SuperJam",
                "FamilyJam","HomeJam","UltraJam",
                "BestJam","AgroJam","JamKing",
                "JamPlus","PureJam","NaturalJam",
                "FarmJam","StrongJam","GreenJam",
                "ClassicJam","RichJam","FruitJam",
                "MixedJam","BerryJam","StrawberryJam"
            };
            return brands;
        }	
if(productName.equals("WashingMachine")){
    String brands[] = {
        "LG", "Samsung", "Whirlpool", "Bosch", "IFB",
        "Haier", "Godrej", "Panasonic", "Voltas", "Onida",
        "Top Load", "Front Load", "Semi Automatic", "Fully Automatic", "Inverter Motor",
        "Premium Wash", "Classic Wash", "Quick Wash", "Eco Wash", "Smart Wash",
        "6 Kg", "7 Kg", "8 Kg", "10 Kg", "Large Capacity",
        "Energy Saving", "Strong Drum", "Digital Display", "Child Lock", "Silent Wash",
        "Gold Series", "Wash Master", "Clean Magic", "Fresh Care", "Family Pack",
        "Wash Plus", "Laundry King"
    };
    return brands;
}	
if(productName.equals("WallClock")){
    String brands[] = {
        "Ajanta", "Titan", "Casio", "Seiko", "Sonata",
        "Orpat", "Random", "Maxima", "Citizen", "Timex",
        "Analog Clock", "Digital Clock", "Wooden Clock", "Metal Clock", "Plastic Clock",
        "Round Clock", "Square Clock", "Designer Clock", "Classic Clock", "Modern Clock",
        "Silent Sweep", "Large Display", "LED Clock", "Alarm Clock", "Premium Clock",
        "Home Decor", "Office Clock", "Battery Operated", "Wall Mount", "Table Clock",
        "Gold Series", "Time Master", "Smart Clock", "Elegant Design", "Vintage Style",
        "Clock Plus", "Time Magic"
    };
    return brands;
}	
if(productName.equals("WristWatch")){
    String brands[] = {
        "Titan", "Fastrack", "Sonata", "Casio", "Timex",
        "Fossil", "Rolex", "Omega", "Seiko", "Citizen",
        "Analog Watch", "Digital Watch", "Smart Watch", "Leather Strap", "Metal Strap",
        "Water Resistant", "Chronograph", "Premium Watch", "Classic Watch", "Modern Style",
        "Gold Finish", "Silver Finish", "Black Dial", "Blue Dial", "Round Dial",
        "Square Dial", "Luxury Series", "Sports Watch", "Formal Watch", "Casual Wear",
        "Time Master", "Elegant Design", "Slim Fit", "Long Battery", "Smart Connect",
        "Watch Plus", "Time Magic"
    };
    return brands;
}
if(productName.equals("WashingMachine")){
    String brands[] = {
        "LG", "Samsung", "Whirlpool", "Bosch", "IFB",
        "Haier", "Godrej", "Panasonic", "Voltas", "Onida",
        "Top Load", "Front Load", "Semi Automatic", "Fully Automatic", "Inverter Motor",
        "Premium Wash", "Classic Wash", "Quick Wash", "Eco Wash", "Smart Wash",
        "6 Kg", "7 Kg", "8 Kg", "10 Kg", "Large Capacity",
        "Energy Saving", "Strong Drum", "Digital Display", "Child Lock", "Silent Wash",
        "Gold Series", "Wash Master", "Clean Magic", "Fresh Care", "Family Pack",
        "Wash Plus", "Laundry King"
    };
    return brands;
}

if(productName.equals("AirConditioner")){
    String brands[] = {
        "Daikin", "Voltas", "LG", "Samsung", "Blue Star",
        "Hitachi", "Panasonic", "Carrier", "Lloyd", "Whirlpool",
        "1 Ton", "1.5 Ton", "2 Ton", "Split AC", "Window AC",
        "Inverter AC", "5 Star Rated", "Energy Saving", "Smart AC", "WiFi AC",
        "Premium AC", "Classic AC", "Turbo Cool", "Silent Mode", "Eco Mode",
        "Copper Coil", "Digital Display", "Remote Control", "Fast Cooling", "Air Purify",
        "Gold Series", "Cool Master", "Fresh Air", "Climate King", "Home Comfort",
        "AC Plus", "Cool Magic"
    };
    return brands;
}

if(productName.equals("Smartphone")){
    String brands[] = {
        "Apple", "Samsung", "OnePlus", "Xiaomi", "Realme",
        "Vivo", "Oppo", "Motorola", "Nokia", "Google Pixel",
        "4GB RAM", "6GB RAM", "8GB RAM", "128GB Storage", "256GB Storage",
        "5G Phone", "4G LTE", "AMOLED Display", "120Hz Display", "Fast Charging",
        "Premium Phone", "Classic Phone", "Dual Camera", "Triple Camera", "Quad Camera",
        "Face Unlock", "Fingerprint Sensor", "Water Resistant", "Gaming Phone", "Slim Design",
        "Gold Edition", "Smart Plus", "Phone Master", "Mobile King", "Power Boost",
        "Phone Plus", "Tech Magic"
    };
    return brands;
}

if(productName.equals("Laptop")){
    String brands[] = {
        "HP", "Dell", "Lenovo", "Asus", "Acer",
        "Apple MacBook", "MSI", "Samsung", "LG", "Microsoft Surface",
        "i3 Processor", "i5 Processor", "i7 Processor", "Ryzen 5", "Ryzen 7",
        "8GB RAM", "16GB RAM", "512GB SSD", "1TB HDD", "Touch Screen",
        "Gaming Laptop", "Business Laptop", "Student Laptop", "Premium Laptop", "Slim Design",
        "Backlit Keyboard", "Fingerprint Login", "Full HD Display", "4K Display", "Light Weight",
        "Gold Series", "Laptop Pro", "Work Master", "Tech King", "Ultra Book",
        "Laptop Plus", "Digital Magic"
    };
    return brands;
}

if(productName.equals("BluetoothSpeaker")){
    String brands[] = {
        "JBL", "Boat", "Sony", "Marshall", "Mi",
        "Realme", "Infinity", "Zebronics", "Portronics", "Philips",
        "Portable Speaker", "Waterproof", "Bass Boost", "10W Output", "20W Output",
        "Premium Speaker", "Classic Sound", "Party Mode", "LED Light", "Smart Connect",
        "Long Battery", "Fast Charging", "Compact Size", "Home Audio", "Outdoor Use",
        "Gold Series", "Sound Master", "Music King", "Deep Bass", "Stereo Sound",
        "Speaker Plus", "Audio Magic", "Power Sound", "Strong Bass", "Wireless Play",
        "Speaker Pro", "Sound Magic"
    };
    return brands;
}

if(productName.equals("Headphones")){
    String brands[] = {
        "Sony", "Boat", "JBL", "Sennheiser", "Skullcandy",
        "Bose", "Realme", "Mi", "Philips", "Zebronics",
        "Wired", "Wireless", "Bluetooth", "Noise Cancelling", "Gaming Headset",
        "Premium Sound", "Classic Audio", "Deep Bass", "Light Weight", "Comfort Fit",
        "Long Battery", "Fast Charge", "Over Ear", "On Ear", "In Ear",
        "Gold Series", "Sound Pro", "Music Master", "Stereo Sound", "HD Audio",
        "Smart Connect", "Foldable Design", "Strong Build", "Clear Mic", "Party Mode",
        "Headphone Plus", "Audio Magic"
    };
    return brands;
}

if(productName.equals("PowerBank")){
    String brands[] = {
        "Mi", "Realme", "Ambrane", "Boat", "Samsung",
        "Syska", "Portronics", "URBN", "Anker", "Redmi",
        "10000mAh", "20000mAh", "30000mAh", "Fast Charging", "Type C",
        "Premium Power", "Classic Power", "Slim Design", "Light Weight", "Strong Build",
        "Dual USB", "Triple USB", "LED Indicator", "Compact Size", "Travel Friendly",
        "Gold Series", "Power Master", "Charge King", "Quick Boost", "Smart Charge",
        "Long Backup", "Safe Charge", "Energy Pack", "Portable Power", "Daily Use",
        "Power Plus", "Charge Magic"
    };
    return brands;
}
if(productName.equals("WallClock")){
    String brands[] = {
        "Ajanta", "Titan", "Casio", "Seiko", "Sonata",
        "Orpat", "Random", "Maxima", "Citizen", "Timex",
        "Analog Clock", "Digital Clock", "Wooden Clock", "Metal Clock", "Plastic Clock",
        "Round Clock", "Square Clock", "Designer Clock", "Classic Clock", "Modern Clock",
        "Silent Sweep", "Large Display", "LED Clock", "Alarm Clock", "Premium Clock",
        "Home Decor", "Office Clock", "Battery Operated", "Wall Mount", "Table Clock",
        "Gold Series", "Time Master", "Smart Clock", "Elegant Design", "Vintage Style",
        "Clock Plus", "Time Magic"
    };
    return brands;
}

if(productName.equals("WristWatch")){
    String brands[] = {
        "Titan", "Fastrack", "Sonata", "Casio", "Timex",
        "Fossil", "Rolex", "Omega", "Seiko", "Citizen",
        "Analog Watch", "Digital Watch", "Smart Watch", "Leather Strap", "Metal Strap",
        "Water Resistant", "Chronograph", "Premium Watch", "Classic Watch", "Modern Style",
        "Gold Finish", "Silver Finish", "Black Dial", "Blue Dial", "Round Dial",
        "Square Dial", "Luxury Series", "Sports Watch", "Formal Watch", "Casual Wear",
        "Time Master", "Elegant Design", "Slim Fit", "Long Battery", "Smart Connect",
        "Watch Plus", "Time Magic"
    };
    return brands;
}

if(productName.equals("Sofa")){
    String brands[] = {
        "Nilkamal", "Godrej Interio", "Durian", "Urban Ladder", "Ikea",
        "HomeTown", "Pepperfry", "Furlenco", "Wakefit", "Royal Oak",
        "3 Seater", "2 Seater", "L Shape", "Recliner Sofa", "Sofa Cum Bed",
        "Leather Sofa", "Fabric Sofa", "Wooden Frame", "Premium Sofa", "Classic Sofa",
        "Modern Design", "Compact Size", "Large Seating", "Comfort Fit", "Soft Cushion",
        "Family Pack", "Home Comfort", "Luxury Series", "Strong Frame", "Easy Clean",
        "Sofa King", "Living Room", "Elegant Style", "Designer Sofa", "Gold Series",
        "Sofa Plus", "Comfort Magic"
    };
    return brands;
}

if(productName.equals("DiningTable")){
    String brands[] = {
        "Nilkamal", "Godrej Interio", "Durian", "Urban Ladder", "Ikea",
        "Pepperfry", "HomeTown", "Royal Oak", "Furlenco", "Wakefit",
        "4 Seater", "6 Seater", "8 Seater", "Wooden Table", "Glass Top",
        "Marble Finish", "Premium Table", "Classic Table", "Modern Design", "Compact Size",
        "Large Dining", "Family Pack", "Strong Frame", "Easy Clean", "Luxury Series",
        "Home Comfort", "Dining King", "Elegant Style", "Designer Table", "Gold Finish",
        "Dining Room", "Comfort Seating", "Smart Table", "Space Saving", "Sturdy Build",
        "Table Plus", "Dining Magic"
    };
    return brands;
}

if(productName.equals("Bed")){
    String brands[] = {
        "Nilkamal", "Godrej Interio", "Durian", "Urban Ladder", "Ikea",
        "Pepperfry", "Wakefit", "Royal Oak", "HomeTown", "Sleepwell",
        "Single Bed", "Double Bed", "Queen Size", "King Size", "Wooden Bed",
        "Metal Bed", "Storage Bed", "Premium Bed", "Classic Bed", "Modern Style",
        "Strong Frame", "Comfort Fit", "Large Size", "Compact Design", "Luxury Series",
        "Home Comfort", "Bedroom King", "Elegant Finish", "Designer Bed", "Gold Series",
        "Soft Support", "Easy Assemble", "Sturdy Build", "Space Saving", "Family Pack",
        "Bed Plus", "Sleep Magic"
    };
    return brands;
}

if(productName.equals("Mattress")){
    String brands[] = {
        "Sleepwell", "Kurlon", "Wakefit", "Duroflex", "Peps",
        "Springtek", "Coirfit", "Nilkamal", "Ikea", "Sunday",
        "Single Size", "Double Size", "Queen Size", "King Size", "Memory Foam",
        "Spring Mattress", "Coir Mattress", "Latex Mattress", "Premium Mattress", "Classic Comfort",
        "Orthopedic", "Soft Feel", "Medium Firm", "Hard Support", "Luxury Series",
        "Home Comfort", "Back Support", "Cooling Gel", "Breathable Fabric", "Long Life",
        "Strong Support", "Healthy Sleep", "Family Pack", "Gold Series", "Sleep Master",
        "Mattress Plus", "Dream Magic"
    };
    return brands;
}

if(productName.equals("Curtains")){
    String brands[] = {
        "DDecor", "Bombay Dyeing", "Spaces", "Story@Home", "Ikea",
        "HomeTown", "Urban Ladder", "Royal Oak", "Nilkamal", "Flipkart SmartBuy",
        "Window Curtain", "Door Curtain", "Blackout Curtain", "Sheer Curtain", "Premium Fabric",
        "Classic Design", "Modern Print", "Floral Pattern", "Solid Color", "Long Size",
        "Short Size", "Luxury Series", "Home Decor", "Easy Wash", "Fade Resistant",
        "Strong Stitch", "Designer Style", "Gold Finish", "Living Room", "Bedroom Style",
        "Elegant Look", "Soft Fabric", "Family Pack", "Curtain King", "Smart Decor",
        "Curtain Plus", "Decor Magic"
    };
    return brands;
}

if(productName.equals("Carpet")){
    String brands[] = {
        "DDecor", "Story@Home", "Ikea", "Nilkamal", "HomeTown",
        "Urban Ladder", "Royal Oak", "Flipkart SmartBuy", "Spaces", "Status",
        "Wool Carpet", "Cotton Carpet", "Silk Carpet", "Premium Carpet", "Classic Style",
        "Modern Design", "Floral Print", "Geometric Print", "Large Size", "Small Size",
        "Luxury Series", "Soft Touch", "Anti Slip", "Easy Clean", "Living Room",
        "Bedroom Carpet", "Home Decor", "Gold Finish", "Strong Fiber", "Long Life",
        "Designer Carpet", "Elegant Look", "Family Pack", "Carpet King", "Smart Decor",
        "Carpet Plus", "Floor Magic"
    };
    return brands;
}

if(productName.equals("Helmet")){
    String brands[] = {
        "Studds", "Vega", "Steelbird", "LS2", "Axor",
        "MT Helmets", "Royal Enfield", "SMK", "THH", "HJC",
        "Full Face", "Half Face", "Open Face", "Flip Up", "Modular",
        "Premium Helmet", "Classic Design", "Matte Finish", "Gloss Finish", "IS Certified",
        "Light Weight", "Strong Build", "Anti Scratch", "Sun Visor", "Ventilation System",
        "Riding Gear", "Gold Series", "Safety First", "Comfort Fit", "Adjustable Strap",
        "Helmet King", "Safe Ride", "Stylish Look", "Long Life", "Rider Choice",
        "Helmet Plus", "Ride Magic"
    };
    return brands;
}

if(productName.equals("CarTyre")){
    String brands[] = {
        "MRF", "Apollo", "CEAT", "Bridgestone", "Michelin",
        "Goodyear", "JK Tyre", "Yokohama", "Continental", "Pirelli",
        "Tubeless Tyre", "Radial Tyre", "All Season", "Winter Tyre", "Summer Tyre",
        "Premium Tyre", "Classic Tyre", "Strong Grip", "Long Life", "High Mileage",
        "SUV Tyre", "Car Tyre", "Truck Tyre", "Bike Tyre", "Heavy Duty",
        "Road Master", "Gold Series", "Safe Drive", "Smooth Ride", "Strong Build",
        "Tyre King", "Durable Rubber", "High Performance", "Eco Tyre", "Smart Grip",
        "Tyre Plus", "Drive Magic"
    };
    return brands;
}
if(productName.equals("Notebook")){
    String brands[] = {
        "Classmate","Navneet","Camlin","Paperkraft","Sundaram",
        "Solo","Luxor","Apsara","JK Paper","Unicorn",
        "Lotus","Mead","AmazonBasics","Pioneer","Kokuyo",
        "Bilt","Nightingale","SketchPro","Artline","Factor Notes",
        "Campus","Vardhman","Scholar","Trimax Notes","Everlast",
        "Young Artist","Royal","Happy Notes","Bluebird","Sapphire",
        "Prime Notes","EduPro","SmartNotes","StarBook","FinePages",
        "Oxford","NeoNotes"
    };
    return brands;
}

if(productName.equals("Pen")){
    String brands[] = {
        "Reynolds","Cello","Parker","Camlin","Flair",
        "Hauser","Lexi","Montex","Add Gel","Pilot",
        "Luxor","Pierre Cardin","Classmate","Linc","Pentonic",
        "Trimax","Butterflow","Uniball","Rorito","Octane",
        "Fortune","Elkos","Zebra","Sharpie","Bic",
        "Faber Castell","Kokuyo","Glide","SmoothWrite","SuperGrip",
        "InkPro","StarPen","BlueFlow","MegaWrite","JetInk",
        "UltraWrite","ProLine"
    };
    return brands;
}

if(productName.equals("Pencil")){
    String brands[] = {
        "Apsara","Nataraj","Faber Castell","Camlin","Doms",
        "Staedtler","Luxor","Pentel","Classmate","Hindustan",
        "PaperMate","Bic","Tombow","Kohinoor","Maped",
        "Linc","Reynolds","Zebra","Mitsubishi","Artline",
        "SketchPro","EasyWrite","SharpLead","SmoothDraw","PrimePencil",
        "NeoGraph","GraphiteX","EduPencil","StarLead","RoyalDraw",
        "FineTip","UltraGraph","MegaLead","ProSketch","NoteLine",
        "BlueLead","SmartDraw"
    };
    return brands;
}

if(productName.equals("Eraser")){
    String brands[] = {
        "Apsara","Nataraj","Camlin","Faber Castell","Doms",
        "Staedtler","Luxor","Classmate","Maped","Pentel",
        "PaperMate","Bic","Kohinoor","Artline","EasyErase",
        "SoftRub","CleanWipe","SharpErase","NeoErase","PrimeRub",
        "EduErase","StarRub","RoyalErase","FineRub","UltraClean",
        "MegaErase","ProWipe","BlueRub","SmartErase","SmoothWipe",
        "GraphErase","NoteRub","PencilMate","InkErase","ClearWipe",
        "SoftTouch","SuperClean"
    };
    return brands;
}

if(productName.equals("Sharpener")){
    String brands[] = {
        "Apsara","Nataraj","Camlin","Faber Castell","Doms",
        "Classmate","Maped","Staedtler","Luxor","Pentel",
        "PaperMate","Bic","Kohinoor","Artline","SharpEdge",
        "EasySharp","SmoothCut","PrimeSharp","NeoCut","EduSharp",
        "StarSharp","RoyalCut","FineSharp","UltraCut","MegaSharp",
        "ProSharp","BlueCut","SmartSharp","GraphSharp","NoteSharp",
        "PencilSharp","InkSharp","ClearCut","SoftSharp","SuperCut",
        "QuickSharp","TopSharp"
    };
    return brands;
}

if(productName.equals("Rice")){
    String brands[] = {
        "India Gate","Daawat","Kohinoor","Fortune","Tilda",
        "Royal","24 Mantra","Lal Qilla","Shakti Bhog","Aeroplane",
        "Organic Tattva","Patanjali","Sri Sri","Annapurna","Aashirvaad",
        "Double Horse","Crown","SonaMasuri","Basmati King","Healthy Harvest",
        "NeoRice","PrimeGrain","StarRice","RoyalGrain","FineRice",
        "UltraGrain","MegaRice","ProHarvest","BlueGrain","SmartRice",
        "PureRice","FarmFresh","GoldenGrain","SuperRice","NatureRice",
        "GreenHarvest","TopRice"
    };
    return brands;
}
if(productName.equals("WheatFlour")){
    String brands[] = {
        "Aashirvaad","Pillsbury","Fortune","Annapurna","Nature Fresh",
        "24 Mantra","Organic Tattva","Patanjali","Sri Sri","Shakti Bhog",
        "Rajdhani","Double Horse","NeoFlour","PrimeAtta","StarFlour",
        "RoyalAtta","FineFlour","UltraAtta","MegaFlour","ProAtta",
        "BlueAtta","SmartFlour","PureAtta","FarmFresh","GoldenAtta",
        "HealthyHarvest","SuperAtta","GreenFlour","TopAtta","FreshGrain",
        "NaturalFlour","ClassicAtta","PremiumFlour","DailyAtta","FamilyFlour",
        "HomeAtta","BestFlour"
    };
    return brands;
}

        return null;
    }
}