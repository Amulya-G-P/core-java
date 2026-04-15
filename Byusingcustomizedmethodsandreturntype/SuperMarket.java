class SuperMarket
{
	public static String[] searchBrandByProduct(String product)
	{
		//1
		if(product == "biscuit"){
			String biscuitBrands[]={"Parle-G","Good Day","Happy Happy","Marie","BourBon","Oreo","Hide & Seek","Treat","Krackjack","Coconut Crunch","Wafer","Dark Fantasy","Nutri choice","Jim Jam","Butter Delight","Top","Mom's Magic","Salty","Lemon mazaa","50-50","Yummy","Fab","Cream bites","Fruit bix","Jeera","Lotus","Gobbles","Digestive","Tiger","Monaco"};
			return biscuitBrands;
		}
		//2
		if(product=="Shampoo"){
			String[] shampooBrands={"ClinicPlus","Sunsilk","Dove","Pantene","Tresemme",
					"Loreal","HeadShoulders","Meera","Chik","Nyle",
					"Himalaya","WOW","Mamaearth","Khadi","Biotique",
					"Vatika","Garnier","Matrix","Kerastase","Schwarzkopf",
					"Palmolive","Fiama","Ayush","Rejoice","Sebamed",
					"Arata","Indulekha","HerbalEssence","Enliven","ParkAvenue"};
			return shampooBrands;
		}
		//3
		if(product=="Soap"){
			String[] soapBrands={"Lux","Dove","Lifeboy","Pears","Dettol",
					"Santoor","Medimix","Hamam","Cinthol","MysoreSandal",
					"Fiama","GodrejNo1","Liril","Nivea","Ayush",
					"Neem","Chandrika","Palmolive","Khadi","Biotique",
					"Himalaya","ParkAvenue","Sebamed","Cetaphil","Olay",
					"IrishSpring","Dial","AloeVeda","Vivel","FreshGlow"};
			return soapBrands;
		}
		//4
		if(product=="Toothpaste"){
		String[] toothpasteBrands={
			"Colgate","Pepsodent","CloseUp","Sensodyne","DaburRed",
			"Meswak","Vicco","Promise","Babool","OralB",
			"Himalaya","Ayush","DantKanti","Aquafresh","ArmAndHammer",
			"Crest","Signal","Zendium","TheraBreath","Parodontax",
			"Splat","Biomed","Apagard","Marvis","Elmex",
			"TomsofMaine","Lion","GumCare","WhiteNow","MintFresh"
		};
			return toothpasteBrands;
		}
		//5
		if(product=="Oil"){
		String[] oilBrands={
			"Fortune","Saffola","Dhara","Freedom","Gemini",
			"Sunpure","GoldWinner","NatureFresh","Oleev","Nutrela",
			"Engine","VVD","Aadhar","HealthyHeart","Emami",
			"Patanjali","24Mantra","Figaro","Borges","DelMonte",
			"Oleum","PureDrop","Arogya","Annapurna","Crystal",
			"King","Sundrop","Tez","RuchiGold","Vimal"
		};
			return oilBrands;
		}
		//6
		if(product=="Chocolate"){
		String[] chocolateBrands={
			"DairyMilk","KitKat","FiveStar","Perk","Munch",
			"Snickers","Mars","Bounty","FerreroRocher","Toblerone",
			"Galaxy","Milkybar","KinderJoy","Hersheys","Lindt",
			"AmulChocolate","NestleClassic","Fuse","Temptations","Silk",
			"Crunch","Twix","Reeses","Gems","Eclairs",
			"Bournville","Alpenliebe","Pulse","ChocoPie","Timba"
		};
			return chocolateBrands;
		}
		//7
		if(product=="SoftDrink"){
		String[] drinkBrands={
			"CocaCola","Pepsi","Sprite","Fanta","ThumbsUp",
			"7Up","MountainDew","Limca","Mirinda","Slice",
			"Maaza","AppyFizz","RedBull","Monster","Sting",
			"Gatorade","Prime","Schweppes","CanadaDry","DrPepper",
			"RootBeer","Tropicana","RealJuice","PaperBoat","MinuteMaid",
			"OceanSpray","VitaCoco","Bovonto","Kalimaark","Sosyo"
		};
			return drinkBrands;
		}
		//8
		if(product=="Detergent"){
		String[] detergentBrands={
			"SurfExcel","Ariel","Tide","Rin","Wheel",
			"Ghadi","Nirma","Henko","Fena","Vanish",
			"Ezee","Ujala","MrWhite","Sunlight","Persil",
			"Omo","Comfort","Downy","BioClean","EcoWash",
			"PowerWash","CleanMax","FreshWash","UltraRin","Sparkle",
			"WashPro","ActiveClean","SuperWash","BrightCare","SafeWash"
		};
			return detergentBrands;
		}
		//9
		if(product=="FaceWash"){
		String[] faceWashBrands={
			"CleanAndClear","Himalaya","Garnier","Ponds","Nivea",
			"Mamaearth","WOW","Biotique","Lotus","Lakme",
			"Olay","Neutrogena","Cetaphil","Simple","Plum",
			"Minimalist","AromaMagic","Khadi","Ayush","Vicco",
			"GoodVibes","MCaffeine","TheDermaCo","DotAndKey","ForestEssentials"
		};
			return faceWashBrands;
		}
		//10
		if(product=="Lipstick"){
		String[] lipstickBrands={
			"Lakme","Maybelline","MAC","Nykaa","Sugar",
			"Colorbar","FacesCanada","Revlon","Elle18","Insight",
			"SwissBeauty","BlueHeaven","Chambor","Loreal","HudaBeauty",
			"KayBeauty","WetnWild","NYX","BobbiBrown","Clinique",
			"Dior","EsteeLauder","Smashbox","FentyBeauty","KikoMilano"
		};
			return lipstickBrands;
		}
		//11
		if(product=="Moisturizer"){
		String[] moisturizerBrands={
			"Nivea","Ponds","Vaseline","Cetaphil","Neutrogena",
			"Himalaya","Mamaearth","Biotique","WOW","Olay",
			"Lotus","Lakme","Minimalist","Plum","DotAndKey",
			"MCaffeine","Khadi","AromaMagic","ForestEssentials","Aveeno",
			"Simple","TheDermaCo","Sebamed","Emolene","Boroline"
		};
			return moisturizerBrands;
		}
		//12
		if(product=="Kajal"){
		String[] kajalBrands={
			"LakmeEyeconic","MaybellineColossal","FacesCanada","Sugar",
			"Nykaa","Colorbar","Elle18","BlueHeaven","SwissBeauty",
			"Revlon","MAC","Loreal","Chambor","Plum",
			"KayBeauty","Insight","WetnWild","NYX","HudaBeauty","Dior"
		};
			return kajalBrands;
		}
		//13
		if(product=="NailPolish"){
		String[] nailPolishBrands={
			"Lakme","Colorbar","Nykaa","FacesCanada","Elle18",
			"BlueHeaven","SwissBeauty","Sugar","Maybelline","Revlon",
			"Chambor","MAC","Opi","KayBeauty","Insight",
			"WetnWild","NYX","KikoMilano","Loreal","Dior"
		};
			return nailPolishBrands;
		}
		//14
		if(product=="Perfume"){
		String[] perfumeBrands={
			"Fogg","Engage","WildStone","Axe","Nivea",
			"Denver","ParkAvenue","LayerR","Yardley","Skinn",
			"BellaVita","Rasasi","Jaguar","Davidoff","CalvinKlein",
			"Gucci","Dior","Chanel","Versace","Armaf",
			"Ajmal","TitanSkinn","Beardo","Ustraa","TheManCompany"
		};
			return perfumeBrands;
		}
		//15
		if(product=="BodyLotion"){
		String[] bodyLotionBrands={
			"Nivea","Vaseline","Ponds","Parachute","Himalaya",
			"Mamaearth","WOW","Biotique","Lotus","Olay",
			"Neutrogena","Aveeno","Cetaphil","Sebamed","MCaffeine",
			"Plum","Khadi","AromaMagic","ForestEssentials","Joy",
			"Boroplus","Emami","BoroSoft","Dove","Fiama"
		};
			return bodyLotionBrands;
		}
		//16
		if(product=="HairOil"){
		String[] hairOilBrands={
			"Parachute","Indulekha","DaburAmla","BajajAlmond",
			"Navratna","KeshKing","Vatika","Himalaya","Khadi",
			"WOW","Mamaearth","Biotique","Meera","Nihar",
			"Emami","Ayush","StBotanica","AromaMagic","ForestEssentials","Soulflower"
		};
			return hairOilBrands;
		}
		//17
		if(product=="FaceCream"){
		String[] faceCreamBrands={
			"Ponds","Nivea","Olay","Lakme","Garnier",
			"Himalaya","Mamaearth","WOW","Biotique","Lotus",
			"Cetaphil","Neutrogena","Minimalist","Plum","DotAndKey",
			"MCaffeine","ForestEssentials","Khadi","Vicco","FairAndLovely"
		};
			return faceCreamBrands;
		}
		//18
		if(product=="Sunscreen"){
		String[] sunscreenBrands={
			"Lakme","Neutrogena","Lotus","Nivea","Biotique",
			"Mamaearth","WOW","Minimalist","DotAndKey","AromaMagic",
			"Himalaya","Plum","MCaffeine","TheDermaCo","Cetaphil",
			"Sebamed","Fixderma","Reequil","ForestEssentials","VLCC"
		};
			return sunscreenBrands;
		}
		//19
		if(product=="FaceScrub"){
		String[] faceScrubBrands={
			"CleanAndClear","Himalaya","Biotique","Lotus","Garnier",
			"Mamaearth","WOW","MCaffeine","Plum","StIves",
			"Neutrogena","Olay","Everyuth","Khadi","AromaMagic",
			"VLCC","DotAndKey","TheDermaCo","ForestEssentials","Minimalist"
		};
			return faceScrubBrands;
		}
		//20
		if(product=="Serum"){
		String[] serumBrands={
			"Minimalist","Plum","Mamaearth","WOW","DotAndKey",
			"TheDermaCo","Lakme","LOréal","Olay","Neutrogena",
			"MCaffeine","Biotique","Khadi","AromaMagic","ForestEssentials",
			"Cetaphil","Sebamed","Reequil","Pilgrim","Deconstruct"
		};
			return serumBrands;
		}
		//21
		if(product=="Foundation"){
		String[] foundationBrands={
			"Lakme","Maybelline","MAC","Nykaa","Colorbar",
			"Sugar","FacesCanada","Revlon","Insight","SwissBeauty",
			"BlueHeaven","Chambor","LOréal","HudaBeauty","KayBeauty",
			"WetnWild","NYX","BobbiBrown","Dior","EsteeLauder"
		};
			return foundationBrands;
		}
		//22
		if(product=="Toner"){
		String[] tonerBrands={
			"Plum","Minimalist","Biotique","Lotus","Mamaearth",
			"WOW","DotAndKey","TheDermaCo","Khadi","AromaMagic",
			"ForestEssentials","Neutrogena","Cetaphil","Pixi",
			"MCaffeine","VLCC","Pilgrim","Deconstruct","Simple","Garnier"
		};
			return tonerBrands;
		}
		//23
		if(product=="Compact"){
		String[] compactBrands={
			"Lakme","Maybelline","Colorbar","FacesCanada","Nykaa",
			"Sugar","Revlon","MAC","Insight","SwissBeauty",
			"BlueHeaven","Chambor","LOréal","KayBeauty","WetnWild",
			"NYX","Dior","EsteeLauder","BobbiBrown","Clinique"
		};
			return compactBrands;
		}
		//24
		if(product=="Mascara"){
		String[] mascaraBrands={
			"Maybelline","Lakme","LOréal","FacesCanada","Sugar",
			"Nykaa","Colorbar","MAC","Revlon","Insight",
			"SwissBeauty","BlueHeaven","KayBeauty","WetnWild",
			"NYX","HudaBeauty","Dior","EsteeLauder","Clinique","Chambor"
		};
			return mascaraBrands;
		}
		//25
		if(product=="Conditioner"){
		String[] conditionerBrands={
			"Dove","Pantene","Tresemme","Sunsilk","Loreal",
			"Garnier","WOW","Mamaearth","Biotique","Khadi",
			"Himalaya","Matrix","Wella","Schwarzkopf","OGX",
			"HerbalEssences","Vatika","Indulekha","Meera","Nyle"
		};
			return conditionerBrands;
		}
		//26
		if(product=="HairSerum"){
		String[] hairSerumBrands={
			"Livon","Streax","Loreal","Matrix","Wella",
			"Schwarzkopf","WOW","Mamaearth","Biotique","Khadi",
			"StBotanica","Pilgrim","Minimalist","Tresemme",
			"Garnier","OGX","HerbalEssences","Indulekha","Meera","Nyle"
		};
			return hairSerumBrands;
		}
		//27
		if(product=="MakeupRemover"){
		String[] removerBrands={
			"Garnier","Neutrogena","Lakme","Biotique","Mamaearth",
			"WOW","Plum","DotAndKey","TheDermaCo","MCaffeine",
			"Cetaphil","Simple","ForestEssentials","Khadi",
			"AromaMagic","VLCC","Colorbar","FacesCanada","Nykaa","LOréal"
		};
			return removerBrands;
		}
		//28
		if(product=="FloorCleaner"){
		String[] floorCleanerBrands={
			"Lizol","HarpicFloor","Domex","Colin","DettolFloor",
			"Savlon","MrMuscle","VimFloor","Taski","Clorox",
			"Odonil","Presto","CleanMate","Sparkle","ShinyFloor",
			"FreshHome","PowerClean","UltraShine","HomeGuard","SafeFloor"
		};
			return floorCleanerBrands;
		}
		//29
		if(product=="ToiletCleaner"){
		String[] toiletCleanerBrands={
			"Harpic","Domex","Lizol","Sanifresh","Breeze",
			"VimToilet","Taski","Clorox","MrMuscle","Dettol",
			"Presto","PowerClean","CleanMax","FreshToilet","SparkleClean",
			"UltraClean","SafeHome","BrightFlush","QuickClean","ShinyToilet"
		};
			return toiletCleanerBrands;
		}
		//30
		if(product=="DishWashBar"){
		String[] dishBarBrands={
			"VimBar","PrilBar","Exo","Genteel","VimLemon",
			"DishClean","PowerBar","CleanDish","SparkBar","FreshWash",
			"UltraDish","SafeBar","BrightDish","QuickWash","ShinyBar",
			"GreenClean","HomeDish","MaxBar","SuperDish","ActiveBar"
		};
			return dishBarBrands;
		}
		//31
		if(product=="DishWashLiquid"){
		String[] dishLiquidBrands={
			"VimLiquid","Pril","ExoLiquid","GenteelLiquid","Axion",
			"Fairy","Finish","SparkleDish","CleanMate","PowerLiquid",
			"FreshDrop","UltraWash","SafeLiquid","BrightWash","QuickDish",
			"GreenLiquid","HomeClean","ActiveDrop","SuperLiquid","MaxWash"
		};
			return dishLiquidBrands;
		}
		//32
		if(product=="TissuePaper"){
		String[] tissueBrands={
			"Origami","Premier","SoftTouch","Bella","Presto",
			"Selpak","Kleenex","SparkleTissue","FreshSoft","UltraSoft",
			"SafeTissue","CleanWipe","SoftCare","GentleTouch","PureSoft",
			"HomeTissue","EcoSoft","MaxSoft","SuperSoft","QuickWipe"
		};
			return tissueBrands;
		}
		//33
		if(product=="GarbageBag"){
		String[] garbageBrands={
			"Gala","Presto","CleanMate","EcoBag","FreshBag",
			"PowerBag","SafeDispose","GreenBin","HomeCare",
			"SparkBag","UltraBin","QuickDispose","MaxBag","SuperBin",
			"StrongHold","BioClean","EasyThrow","SmartBag","WasteCare","CityClean"
		};
			return garbageBrands;
		}
		//34
		if(product=="Sponge"){
		String[] spongeBrands={
			"ScotchBrite","Gala","VimSponge","CleanMate","SparkleScrub",
			"PowerScrub","FreshScrub","UltraSponge","SafeScrub","QuickClean",
			"BrightScrub","HomeScrub","MaxSponge","SuperScrub","EcoScrub",
			"SoftScrub","ActiveSponge","SmartClean","EasyScrub","ProScrub"
		};
			return spongeBrands;
		}
		//35
		if(product=="GlassCleaner"){
		String[] glassCleanerBrands={
			"Colin","MrMuscle","LizolGlass","DomexGlass","CloroxGlass",
			"SparkleGlass","ShinyView","ClearGlass","UltraShine",
			"FreshView","PowerGlass","SafeGlass","QuickShine",
			"BrightView","CleanView","MaxShine","SuperGlass","EcoView",
			"HomeGlass","CrystalClean"
		};
			return glassCleanerBrands;
		}
		//36
		if(product=="Broom"){
		String[] broomBrands={
			"Gala","Spotzero","CleanHome","EasySweep","PowerBroom",
			"FreshSweep","UltraSweep","SafeSweep","QuickBroom",
			"BrightSweep","EcoBroom","HomeCare","SmartSweep",
			"MaxSweep","SuperBroom","StrongSweep","ProClean",
			"DailySweep","CityBroom","PerfectSweep"
		};
			return broomBrands;
		}
		//37
		if(product=="Bucket"){
		String[] bucketBrands={
			"Cello","Milton","Supreme","Nilkamal","Princeware",
			"Signoraware","HomePlus","FreshBucket","PowerTub",
			"UltraBucket","SafeTub","QuickBucket","BrightTub",
			"EcoBucket","MaxBucket","SuperTub","StrongBucket",
			"SmartTub","DailyUse","PerfectBucket"
		};
			return bucketBrands;
		}
		//38
		if(product=="PressureCooker"){
		String[] cookerBrands={
			"Prestige","Hawkins","Pigeon","Butterfly","Milton",
			"Wonderchef","Vinod","Bajaj","Usha","Signoraware",
			"Cello","Bergner","Agaro","Solimo","KitchenAid",
			"Glen","Lifelong","Sunflame","Jaipan","Premier"
		};
			return cookerBrands;
		}
		//39
		if(product=="GasStove"){
		String[] gasStoveBrands={
			"Prestige","Sunflame","Butterfly","Pigeon","Glen",
			"Elica","Faber","Lifelong","Bajaj","Usha",
			"Surya","Eveready","BrightFlame","Cookwell","FlamePro",
			"KitchenX","HomeChef","SafeCook","UltraFlame","SmartCook"
		};
			return gasStoveBrands;
		}
		//40
		if(product=="Knife"){
		String[] knifeBrands={
			"Prestige","Pigeon","Cello","Wonderchef","Bergner",
			"Vinod","Tramontina","Victorinox","Agaro","Solimo",
			"KitchenAid","Glen","HomeChef","SharpEdge","UltraCut",
			"ProKnife","SmartCut","ChefMaster","QuickSlice","PerfectEdge"
		};
			return knifeBrands;
		}
		//41
		if(product=="SpoonSet"){
		String[] spoonBrands={
			"Cello","Milton","Prestige","Pigeon","Signoraware",
			"Princeware","Jaypee","Bergner","Vinod","Wonderchef",
			"KitchenAid","HomePlus","UltraServe","SafeServe",
			"BrightServe","SmartServe","DailyServe","MaxServe",
			"RoyalServe","PerfectServe"
		};
			return spoonBrands;
		}
		//42
		if(product=="Cookware"){
		String[] cookwareBrands={
			"Prestige","Pigeon","Butterfly","Wonderchef","Bergner",
			"Vinod","Cello","Milton","Solimo","Agaro",
			"Hawkins","KitchenAid","Glen","Lifelong","Sunflame",
			"Premier","Jaipan","HomeChef","UltraCook","SmartCook"
		};
			return cookwareBrands;
		}
		//43
		if(product=="Container"){
		String[] containerBrands={
			"Tupperware","Cello","Milton","Signoraware","Princeware",
			"Jaypee","LockAndLock","Borosil","Solimo","HomePlus",
			"FreshBox","SafeStore","SmartBox","UltraStore",
			"KitchenMate","DailyStore","MaxContainer",
			"EcoStore","PerfectBox","EasyStore"
		};
			return containerBrands;
		}
		//44
		if(product=="WaterBottle"){
		String[] bottleBrands1={
			"Milton","Cello","Tupperware","Signoraware","Borosil",
			"Prestige","Pigeon","Nike","Adidas","Puma",
			"Solimo","HomePlus","FreshBottle","SafeSip",
			"HydroMate","UltraBottle","SmartSip","EcoBottle",
			"MaxSip","PerfectBottle"
		};
			return bottleBrands1;
		}
		//45
		if(product=="MixerGrinder"){
		String[] mixerBrands={
			"Preethi","Prestige","Bajaj","Philips","Butterfly",
			"Sujata","Usha","Havells","MaharajaWhiteline","Panasonic",
			"Bosch","MorphyRichards","Lifelong","Inalsa",
			"Wonderchef","Agaro","Glen","Jaipan","Premier","Sunflame"
		};
			return mixerBrands;
		}
		//46
		if(product=="Induction"){
		String[] inductionBrands={
			"Prestige","Pigeon","Philips","Bajaj","Usha",
			"Havells","Butterfly","Glen","Lifelong","Agaro",
			"Sunflame","Inalsa","Wonderchef","Jaipan",
			"Premier","Bosch","Panasonic","MorphyRichards",
			"UltraCook","SmartHeat"
		};
			return inductionBrands;
		}
		//47
		if(product=="Toaster"){
		String[] toasterBrands={
			"Philips","Bajaj","Prestige","MorphyRichards","Havells",
			"Usha","Pigeon","Wonderchef","Inalsa","Agaro",
			"Sunflame","Glen","Bosch","Panasonic","Lifelong",
			"Jaipan","Premier","SmartToast","QuickToast","PerfectToast"
		};
			return toasterBrands;
		}
		//48
		if(product=="RiceCooker"){
		String[] riceCookerBrands={
			"Prestige","Panasonic","Pigeon","Bajaj","Philips",
			"Butterfly","Havells","Usha","Agaro","Wonderchef",
			"Glen","Lifelong","Inalsa","Jaipan","Premier",
			"Bosch","MorphyRichards","Sunflame","SmartCook","EasyRice"
		};
			return riceCookerBrands;
		}
		//49
		if(product=="Mobile"){
		String[] mobileBrands={
			"Samsung","Apple","Xiaomi","Redmi","Realme",
			"OnePlus","Vivo","Oppo","Motorola","Nokia",
			"GooglePixel","Iqoo","Poco","Lava","Micromax",
			"Asus","Sony","Honor","Huawei","Infinix"
		};
		return mobileBrands;
		}
		//50
		if(product=="Laptop"){
		String[] laptopBrands={
			"HP","Dell","Lenovo","Asus","Acer",
			"Apple","MSI","Samsung","Microsoft","Razer",
			"LG","Huawei","Avita","Honor","Fujitsu",
			"Toshiba","SonyVaio","Gigabyte","Alienware","Infinix"
		};
			return laptopBrands;
		}
		//51
		if(product=="Earbuds"){
		String[] earbudsBrands={
			"Boat","Noise","Realme","OnePlus","Samsung",
			"AppleAirPods","JBL","Sony","Boult","Mivi",
			"Ptron","Skullcandy","Oppo","Vivo","Crossbeats",
			"FireBoltt","Hammer","Blaupunkt","Portronics","Zebronics"
		};
			return earbudsBrands;
		}
		//52
		if(product=="Headphones"){
		String[] headphoneBrands={
			"Sony","JBL","Boat","Skullcandy","Sennheiser",
			"Bose","Noise","Zebronics","Portronics","Realme",
			"OnePlus","Philips","Logitech","HP","CosmicByte",
			"Redgear","HyperX","Razer","Asus","Corsair"
		};
			return headphoneBrands;
		}
		//53
		if(product=="SmartWatch"){
		String[] watchBrands={
			"Apple","Samsung","Noise","Boat","FireBoltt",
			"Fastrack","Realme","OnePlus","Amazfit","Fitbit",
			"Garmin","Huawei","Honor","Pebble","Crossbeats",
			"Boult","Hammer","Zebronics","Portronics","Titan"
		};
			return watchBrands;
		}
		//54
		if(product=="Television"){
		String[] tvBrands={
			"Samsung","LG","Sony","Mi","OnePlus",
			"Realme","TCL","Panasonic","Philips","Vu",
			"Kodak","Nokia","Motorola","Hisense","Toshiba",
			"BPL","Onida","Sansui","Haier","Thomson"
		};
			return tvBrands;
		}
		//55
		if(product=="Refrigerator"){
		String[] fridgeBrands={
			"LG","Samsung","Whirlpool","Godrej","Haier",
			"Panasonic","Bosch","Siemens","VoltasBeko","Hitachi",
			"Electrolux","Sharp","Toshiba","Kelvinator",
			"Midea","Hisense","BPL","Onida","Videocon","Mitashi"
		};
			return fridgeBrands;
		}
		//56
		if(product=="AirConditioner"){
		String[] acBrands={
			"LG","Samsung","Daikin","Voltas","BlueStar",
			"Hitachi","Panasonic","Carrier","Whirlpool","Godrej",
			"Haier","Mitsubishi","Lloyd","Onida","Toshiba",
			"OGeneral","Sharp","Videocon","Kelvinator","Hisense"
		};
			return acBrands;
		}
		//57
		if(product=="Speaker"){
		String[] speakerBrands={
			"JBL","Boat","Sony","Bose","Marshall",
			"Portronics","Zebronics","Mivi","Infinity",
			"Realme","OnePlus","Philips","Blaupunkt",
			"Skullcandy","UltimateEars","HarmanKardon",
			"Tribit","Anker","Noise","FireBoltt"
		};
			return speakerBrands;
		}
		//58
		if(product=="GamingConsole"){
		String[] consoleBrands={
			"SonyPlayStation","MicrosoftXbox","NintendoSwitch",
			"AsusROG","Alienware","MSI","Razer",
			"LogitechG","HyperX","Corsair",
			"LenovoLegion","HPOMEN","AcerPredator",
			"NvidiaShield","SteamDeck","RetroBit",
			"Anbernic","Powkiddy","GameSir","8BitDo"
		};
			return consoleBrands;
		}
		//59
		if(product=="Camera"){
		String[] cameraBrands={
			"Canon","Nikon","Sony","Fujifilm","Panasonic",
			"Olympus","Leica","GoPro","Kodak","Ricoh",
			"Pentax","DJI","Insta360","Sigma","Hasselblad",
			"Casio","Polaroid","YI","Blackmagic","Red"
		};
			return cameraBrands;
		}
		//60
		if(product=="Diapers"){
		String[] diaperBrands={
			"Pampers","Huggies","MamyPoko","BellaBaby","LittleAngel",
			"Snuggy","Supples","HimalayaBaby","LuvLap","MeeMee",
			"Babyhug","Teddyy","BamboNature","MamaBear","Pigeon",
			"Chicco","SebamedBaby","SoftBums","ComfyBaby","Tinycare"
		};
			return diaperBrands;
		}
		//61
		if(product=="BabyLotion"){
		String[] lotionBrands={
			"JohnsonBaby","HimalayaBaby","MamaearthBaby","Chicco",
			"MeeMee","SebamedBaby","Pigeon","Babyhug","CetaphilBaby",
			"AveenoBaby","Mustela","BurtBeesBaby","Mothercare",
			"Softsens","Tedibar","LittleAngel","LuvLap","Tinycare",
			"MeeMeeSoft","SafeBaby"
		};
			return lotionBrands;
		}
		//62
		if(product=="BabySoap"){
    String[] soapBrands={
        "JohnsonBaby","HimalayaBaby","Chicco","MeeMee",
        "SebamedBaby","MamaearthBaby","Pigeon","Tedibar",
        "DoveBaby","Babyhug","CetaphilBaby","Mustela",
        "BurtBeesBaby","Softsens","LittleAngel","Mothercare",
        "LuvLap","Tinycare","SafeBaby","PureBaby"
    };
    return soapBrands;
}
//63
if(product=="BabyShampoo"){
    String[] shampooBrands={
        "JohnsonBaby","HimalayaBaby","Chicco","MeeMee",
        "MamaearthBaby","SebamedBaby","Pigeon","DoveBaby",
        "Babyhug","CetaphilBaby","Mustela","Softsens",
        "Tedibar","LittleAngel","Mothercare","LuvLap",
        "Tinycare","PureBaby","SafeBaby","GentleBaby"
    };
    return shampooBrands;
}
//64
if(product=="FeedingBottle"){
    String[] bottleBrands={
        "PhilipsAvent","Pigeon","Chicco","MeeMee","LuvLap",
        "DrBrown","TommeeTippee","Medela","Babyhug","Farlin",
        "NUK","Comotomo","Spectra","Mothercare","LittleAngel",
        "Tinycare","SafeSip","SoftFeed","EasyFeed","PureBottle"
    };
    return bottleBrands;
}
//65
if(product=="BabyFood"){
    String[] foodBrands={
        "Cerelac","Nestle","Farex","Dexolac","Similac",
        "Lactogen","Enfamil","Nutricia","Gerber","HappyBaby",
        "SlurrpFarm","Timios","EarlyFoods","Pristine",
        "BabyOrgano","LittleMoppet","FirstBites","YumYum",
        "HealthyBaby","PureFoods"
    };
    return foodBrands;
}
//66
if(product=="BabyWipes"){
    String[] wipesBrands={
        "Pampers","Huggies","MeeMee","Chicco","MamaearthBaby",
        "HimalayaBaby","JohnsonBaby","Babyhug","LittleAngel",
        "SebamedBaby","Softsens","Mothercare","LuvLap",
        "Tinycare","SafeWipes","FreshBaby","GentleWipes",
        "PureWipes","CleanBaby","ComfyWipes"
    };
    return wipesBrands;
}
//67
if(product=="BabyClothes"){
    String[] clothesBrands={
        "Babyhug","Mothercare","Carter","MeeMee","LuvLap",
        "MiniKlub","Hopscotch","NinoBambino","LittleKangaroos",
        "PalmTree","FirstCry","TinyToddler","SoftBaby",
        "CuteWear","ComfortKids","SmartBaby","PureCotton",
        "HappyKids","EasyWear","DailyBaby"
    };
    return clothesBrands;
}
//68
if(product=="BabyCradle"){
    String[] cradleBrands={
        "LuvLap","MeeMee","Chicco","RforRabbit","Babyhug",
        "Baybee","Sunbaby","Graco","FisherPrice","Mothercare",
        "Tinycare","LittleAngel","SafeSleep","DreamBaby",
        "ComfyNest","SweetDreams","SoftSleep","HappyNest",
        "PureSleep","SmartCradle"
    };
    return cradleBrands;
}
//69
if(product=="BabyToys"){
    String[] toyBrands={
        "FisherPrice","Chicco","MeeMee","Funskool","LuvLap",
        "Baybee","RforRabbit","LittleAngel","Toyshine",
        "Playgro","VTech","LeapFrog","Hamleys",
        "BarbieBaby","HotWheelsJunior","SmartPlay",
        "HappyToys","TinyPlay","SafeToys","KidsJoy"
    };
    return toyBrands;
}
//70
if(product=="Shoes"){
    String[] shoeBrands={
        "Nike","Adidas","Puma","Reebok","Skechers",
        "Bata","Woodland","RedTape","Campus","Sparx",
        "Asian","Liberty","Relaxo","Action","Fila",
        "UnderArmour","Converse","Vans","NewBalance","LeeCooper"
    };
    return shoeBrands;
}
//71
if(product=="Sandals"){
    String[] sandalBrands={
        "Bata","Paragon","Relaxo","Liberty","Sparx",
        "Woodland","RedTape","Puma","Adidas","Nike",
        "Metro","Mochi","Inc5","LeeCooper","Action",
        "Asian","Campus","Lancer","Khadim","Walkaroo"
    };
    return sandalBrands;
}
//72
if(product=="Slippers"){
    String[] slipperBrands={
        "Paragon","Relaxo","Sparx","Bata","Walkaroo",
        "Puma","Adidas","Nike","Campus","Asian",
        "Liberty","Action","Lancer","Khadim","RedTape",
        "Metro","Mochi","LeeCooper","Flite","Solea"
    };
    return slipperBrands;
}
//73
if(product=="Boots"){
    String[] bootBrands={
        "Woodland","RedTape","Bata","LeeCooper","Clarks",
        "Timberland","Caterpillar","HushPuppies","Skechers",
        "Nike","Adidas","Puma","UnderArmour","Columbia",
        "Quechua","Decathlon","Action","Liberty","Campus","Asian"
    };
    return bootBrands;
}
//74
if(product=="Heels"){
    String[] heelBrands={
        "Metro","Mochi","Inc5","Catwalk","Bata",
        "Liberty","CarltonLondon","DressBerry","Lavie",
        "AllenSolly","Zara","HnM","Forever21","Clarks",
        "LeeCooper","RedTape","Walkway","Solea","TruffleCollection","VanHeusen"
    };
    return heelBrands;
}
//75
if(product=="Flats"){
    String[] flatBrands={
        "Bata","Metro","Mochi","Inc5","Catwalk",
        "Liberty","Lavie","DressBerry","AllenSolly",
        "Clarks","LeeCooper","RedTape","Walkway","Solea",
        "Zara","HnM","Forever21","GlobalDesi","Aurelia","W"
    };
    return flatBrands;
}
//76
if(product=="SportsShoes"){
    String[] sportsBrands={
        "Nike","Adidas","Puma","Reebok","Skechers",
        "Asics","NewBalance","UnderArmour","Fila",
        "Campus","Sparx","Asian","Action","Lancer",
        "Decathlon","Kalenji","Quechua","HRX","RedTape","Liberty"
    };
    return sportsBrands;
}
//77
if(product=="RunningShoes"){
    String[] runningBrands={
        "Nike","Adidas","Puma","Asics","NewBalance",
        "Skechers","Reebok","UnderArmour","Fila","Campus",
        "Asian","Sparx","Action","Decathlon","Kalenji",
        "HRX","RedTape","Liberty","Woodland","Lancer"
    };
    return runningBrands;
}
//78
if(product=="KidsFootwear"){
    String[] kidsBrands={
        "Bata","Relaxo","Paragon","Sparx","Campus",
        "Puma","Adidas","Nike","Crocs","Lilliput",
        "Mothercare","Babyhug","Disney","Barbie",
        "Action","Liberty","Walkaroo","Khadim","Flite","Asian"
    };
    return kidsBrands;
}
//79
if(product=="FlipFlops"){
    String[] flipBrands={
        "Havaianas","Crocs","Paragon","Relaxo","Sparx",
        "Puma","Adidas","Nike","Bata","Walkaroo",
        "Flite","Asian","Campus","Liberty","Khadim",
        "Metro","Mochi","LeeCooper","RedTape","Action"
    };
    return flipBrands;
}
//80
if(product=="Rice"){
    String[] riceBrands={
        "IndiaGate","Daawat","Fortune","Kohinoor","LalQilla",
        "24Mantra","BBRoyal","Aashirvaad","Natureland","OrganicTattva",
        "SriLalitha","Amira","RoyalChef","ShaktiBhog","EcoLife",
        "FarmHarvest","GoodLife","DailyFresh","HealthyGrain","GoldenHarvest",
        "PureRice","Annapurna","GreenField","AgroSelect","PrimeRice",
        "SuperBasmati","ClassicGrain","FreshFarm","NaturalRice","ValueRice"
    };
    return riceBrands;
}
//81
if(product=="WheatFlour"){
    String[] wheatFlourBrands={
        "Aashirvaad","Pillsbury","Fortune","Annapurna","NatureFresh",
        "24Mantra","OrganicTattva","BBRoyal","ShaktiBhog","Rajdhani",
        "GoldenHarvest","HealthyChoice","FarmFresh","DailyNeeds","PureAtta",
        "FreshGrain","NaturalAtta","EcoHarvest","ClassicAtta","HomeChoice",
        "AgroFresh","PremiumAtta","SmartChoice","ValueAtta","SuperFine",
        "GreenFarm","WholeGrain","BestHarvest","NutriAtta","RoyalAtta"
    };
    return wheatFlourBrands;
}
//82
if(product=="CookingOil"){
    String[] cookingOilBrands={
        "Fortune","Saffola","Dhara","Gemini","Sunpure",
        "Freedom","GoldWinner","NatureFresh","Oleev","Figaro",
        "DelMonte","Patanjali","24Mantra","HealthyHeart","PureDrop",
        "DailyFresh","NutriOil","FreshGold","EcoOil","AgroPure",
        "SuperLite","GoldenDrop","SmartOil","GreenChoice","PrimeOil",
        "ValueOil","ClassicOil","FarmOil","HealthyLife","RoyalOil"
    };
    return cookingOilBrands;
}
//83
if(product=="Sugar"){
    String[] sugarBrands={
        "Madhur","Dhampure","Trust","BBRoyal","OrganicTattva",
        "24Mantra","Natureland","PureSugar","DailySweet","SweetCare",
        "FreshCrystal","GoldenSugar","HealthySweet","EcoSugar","AgroSweet",
        "ClassicSugar","ValueSugar","FarmSweet","PrimeSugar","SmartSugar",
        "SuperSweet","NaturalCrystal","FineSugar","RoyalSweet","GreenSugar",
        "HomeChoice","BestSugar","PureCrystal","NutriSweet","FreshSweet"
    };
    return sugarBrands;
}
//84
if(product=="Salt"){
    String[] saltBrands={
        "TataSalt","AashirvaadSalt","Catch","AnnapurnaSalt","NatureFresh",
        "24Mantra","OrganicTattva","BBRoyal","FreshSalt","PureSalt",
        "HealthySalt","EcoSalt","AgroSalt","DailySalt","SmartSalt",
        "ValueSalt","ClassicSalt","GreenSalt","FarmSalt","PrimeSalt",
        "CrystalSalt","FineSalt","SuperSalt","RoyalSalt","HomeSalt",
        "NutriSalt","BestSalt","NaturalSalt","CleanSalt","FreshCrystalSalt"
    };
    return saltBrands;
}
//85
if(product=="Spices"){
    String[] spicesBrands={
        "Everest","MDH","Catch","Aashirvaad","Badshah",
        "Eastern","Suhana","Ramdev","Patanjali","24Mantra",
        "OrganicTattva","BBRoyal","NatureFresh","GoldSpice","FreshMasala",
        "DailySpice","PureMasala","HealthySpice","EcoSpice","AgroMasala",
        "ClassicSpice","ValueSpice","GreenMasala","FarmSpice","PrimeMasala",
        "SuperSpice","RoyalMasala","SmartMasala","NutriSpice","BestMasala"
    };
    return spicesBrands;
}
//86
if(product=="Pulses"){
    String[] pulsesBrands={
        "TataSampann","BBRoyal","24Mantra","OrganicTattva","Natureland",
        "Aashirvaad","Fortune","Rajdhani","ShaktiBhog","HealthyHarvest",
        "FreshDal","PurePulses","DailyDal","EcoDal","AgroDal",
        "ClassicDal","ValueDal","GreenDal","FarmDal","PrimeDal",
        "SuperDal","RoyalDal","SmartDal","NutriDal","BestDal",
        "NaturalDal","GoldenDal","FineDal","CleanDal","FreshHarvest"
    };
    return pulsesBrands;
}
//87
if(product=="MensWear"){
    String[] mensWearBrands={
        "PeterEngland","LouisPhilippe","VanHeusen","AllenSolly","Raymond",
        "Arrow","ParkAvenue","Blackberrys","Mufti","Levis",
        "Wrangler","PepeJeans","UCB","Zara","H&M",
        "JackAndJones","FlyingMachine","IndianTerrain","Spykar","NumeroUno",
        "BasicsLife","USPA","Wrogn","Highlander","Roadster",
        "Max","Pantaloons","RelianceTrends","FabIndia","Manyavar"
    };
    return mensWearBrands;
}
//88
if(product=="MensWears"){
    String[] mensWearBrands1={
        "PeterEngland","LouisPhilippe","VanHeusen","AllenSolly","Raymond",
        "Arrow","ParkAvenue","Blackberrys","Mufti","Levis",
        "Wrangler","PepeJeans","UCB","Zara","H&M",
        "JackAndJones","FlyingMachine","IndianTerrain","Spykar","NumeroUno",
        "BasicsLife","USPA","Wrogn","Highlander","Roadster",
        "Max","Pantaloons","RelianceTrends","FabIndia","Manyavar"
    };
    return mensWearBrands1;
}
//89
if(product=="WomensWear"){
    String[] womensWearBrands={
        "Biba","W","GlobalDesi","Libas","Aurelia",
        "Soch","FabIndia","AND","Only","VeroModa",
        "Zara","H&M","Forever21","Pantaloons","Max",
        "RelianceTrends","Sassafras","DressBerry","TokyoTalkies","Chemistry",
        "Rangriti","Indya","Varanga","Juniper","Ahalyaa",
        "Anouk","Kalini","Aks","RainAndRainbow","Shree"
    };
    return womensWearBrands;
}
//90
if(product=="KidsWear"){
    String[] kidsWearBrands={
        "GiniAndJony","Lilliput","Hopscotch","Babyhug","Mothercare",
        "Carter’s","MiniKlub","UCBKids","USPAKids","Peppermint",
        "Toonyport","612League","PineKids","CherryCrush","TinyGirl",
        "AllenSollyJunior","MaxKids","PantaloonsKids","ZudioKids","RelianceKids",
        "KiddoPanti","LittleKangaroos","OshKosh","FoxKids","SmartBaby",
        "CoolKids","JuniorClub","HappyKid","TinyTrends","KidsStyle"
    };
    return kidsWearBrands;
}
//91
if(product=="EthnicWear"){
    String[] ethnicWearBrands={
        "Manyavar","FabIndia","Biba","Soch","W",
        "GlobalDesi","Libas","Aurelia","Indya","Rangriti",
        "Shree","Varanga","Aks","Juniper","Anouk",
        "Kalini","RainAndRainbow","Pothys","Nalli","Kalanjali",
        "RMKV","ChennaiSilks","Koskii","MeenaBazaar","UtsavFashion",
        "EthnicBasket","RoyalEthnic","ClassicEthnic","TraditionWear","HeritageStyle"
    };
    return ethnicWearBrands;
}
//92
if(product=="SportsWear"){
    String[] sportsWearBrands={
        "Nike","Adidas","Puma","Reebok","UnderArmour",
        "Asics","Fila","NewBalance","Skechers","Decathlon",
        "HRX","Proline","Kappa","Umbro","Yonex",
        "Nivia","VectorX","Cosco","Speedo","Campus",
        "Wildcraft","Columbia","Quechua","Domyos","Artengo",
        "ActiveFit","PowerSport","MoveFlex","SportX","FitGear"
    };
    return sportsWearBrands;
}
//93
if(product=="Watches"){
    String[] watchBrands1={
        "Titan","Fastrack","Casio","Sonata","Timex",
        "Fossil","DanielWellington","Guess","MichaelKors","Rolex",
        "Seiko","Citizen","Tissot","Omega","Swatch",
        "Police","ArmaniExchange","Diesel","TommyHilfiger","Skagen",
        "BoatWatch","Noise","FireBoltt","Amazfit","AppleWatch",
        "SamsungWatch","Fitbit","Garmin","RealmeWatch","HonorWatch"
    };
    return watchBrands1;
}
//94
if(product=="Bags"){
    String[] bagBrands={
        "Skybags","AmericanTourister","VIP","Wildcraft","Safari",
        "Puma","Nike","Adidas","Reebok","Lavie",
        "Caprese","Baggit","AllenSolly","VanHeusen","TommyHilfiger",
        "Hidesign","Fossil","Guess","MichaelKors","Zouk",
        "UrbanJungle","Gear","Aristocrat","Delsey","Samsonite",
        "Decathlon","Quechua","TravelBlue","Uppercase","DailyObjects"
    };
    return bagBrands;
}
//95
if(product=="Sunglasses"){
    String[] sunglassesBrands={
        "RayBan","Fastrack","Vogue","Polaroid","Oakley",
        "IDEE","Carrera","TommyHilfiger","Police","Guess",
        "ArmaniExchange","VincentChase","JohnJacobs","Puma","NikeVision",
        "ReebokVision","Diesel","Prada","Gucci","Versace",
        "Burberry","CalvinKlein","TitanEyePlus","Scott","EyeMyEye",
        "CoolWinks","Specsmakers","Lenskart","UrbanStyle","SunPro"
    };
    return sunglassesBrands;
}
//96
if(product=="Wallets"){
    String[] walletBrands={
        "WildHorn","UrbanForest","Fastrack","TommyHilfiger","Levis",
        "Woodland","Hidesign","AllenSolly","VanHeusen","Puma",
        "Nike","Baggit","Lavie","Caprese","Fossil",
        "MichaelKors","Guess","Police","Titan","UrbanMonkey",
        "DailyObjects","Zouk","UrbanForestPro","LeatherWorld","RoyalLeather",
        "ClassicWallet","SmartCarry","PrimeLeather","EliteWallet","StyleCarry"
    };
    return walletBrands;
}
//97
if(product=="Belts"){
    String[] beltBrands={
        "Levis","Woodland","TommyHilfiger","AllenSolly","VanHeusen",
        "LouisPhilippe","PeterEngland","Puma","Nike","Adidas",
        "Hidesign","Fossil","CalvinKlein","Gucci","Armani",
        "WildHorn","UrbanForest","LeatherPlus","RoyalLeather","ClassicBelt",
        "PrimeBelt","StyleWear","SmartBelt","DailyWear","EliteBelt",
        "UrbanStyle","FlexiBelt","ComfortBelt","PremiumLeather","FashionBelt"
    };
    return beltBrands;
}
//98
if(product=="Caps"){
    String[] capBrands={
        "Nike","Adidas","Puma","Reebok","UnderArmour",
        "NewEra","Fila","HRX","Wildcraft","Decathlon",
        "USPA","Levis","TommyHilfiger","Woodland","Wrangler",
        "Campus","Roadster","Highlander","StyleCap","UrbanCap",
        "SportCap","DailyCap","CoolCap","PrimeCap","EliteCap",
        "SmartCap","FlexCap","ActiveCap","TrendCap","FashionCap"
    };
    return capBrands;
}
//99
if(product=="Sofas"){
    String[] sofaBrands={
        "Ikea","UrbanLadder","Pepperfry","Nilkamal","GodrejInterio",
        "Durian","HomeTown","WoodenStreet","Evok","RoyalOak",
        "Wakefit","Furlenco","FabIndiaFurniture","HomeCentre","CasaCraft",
        "Craftatoz","DeckUp","AdornIndia","Spacewood","Zuari",
        "LivingBasics","ComfortZone","PrimeFurniture","EliteSofa","UrbanComfort",
        "RelaxHome","StyleLiving","ModernSeat","LuxuryLiving","SmartSofa"
    };
    return sofaBrands;
}
//100
if(product=="Beds"){
    String[] bedBrands={
        "Wakefit","Sleepyhead","Pepperfry","UrbanLadder","Nilkamal",
        "GodrejInterio","Durian","Ikea","WoodenStreet","HomeTown",
        "RoyalOak","Spacewood","Zuari","HomeCentre","CasaCraft",
        "Craftatoz","DeckUp","AdornIndia","PerfectHomes","ComfortSleep",
        "DreamRest","EliteBeds","PrimeSleep","UrbanRest","RelaxBeds",
        "ModernSleep","LuxuryBeds","SmartRest","CozyHome","StyleBeds"
    };
    return bedBrands;
}
//101
if(product=="DiningTables"){
    String[] diningTableBrands={
        "Ikea","UrbanLadder","Pepperfry","Nilkamal","GodrejInterio",
        "Durian","RoyalOak","HomeCentre","WoodenStreet","Evok",
        "Zuari","Spacewood","CasaCraft","Craftatoz","DeckUp",
        "AdornIndia","HomeTown","PrimeDining","EliteDining","UrbanDining",
        "ModernTable","LuxuryDining","SmartDining","ComfortDining","StyleDining",
        "FamilyDining","ClassicDining","PerfectDining","RoyalDining","FineDining"
    };
    return diningTableBrands;
}
//102
if(product=="Chairs"){
    String[] chairBrands={
        "Nilkamal","Cello","Ikea","UrbanLadder","Pepperfry",
        "GodrejInterio","Durian","RoyalOak","HomeCentre","Featherlite",
        "GreenSoul","DaUrban","CasaCraft","DeckUp","AdornIndia",
        "PrimeChair","EliteChair","ComfortSeat","UrbanChair","SmartChair",
        "RelaxChair","ModernChair","LuxuryChair","OfficePro","StyleChair",
        "PerfectSeat","ClassicChair","EasySit","HomeComfort","FineChair"
    };
    return chairBrands;
}
//103
if(product=="Wardrobes"){
    String[] wardrobeBrands={
        "GodrejInterio","Nilkamal","Ikea","UrbanLadder","Pepperfry",
        "Durian","RoyalOak","HomeCentre","Spacewood","Zuari",
        "CasaCraft","Craftatoz","DeckUp","AdornIndia","HomeTown",
        "PrimeWardrobe","EliteWardrobe","UrbanStorage","SmartWardrobe","ModernCloset",
        "LuxuryWardrobe","PerfectStorage","StyleWardrobe","ClassicCloset","HomeStorage",
        "FineWardrobe","RoyalStorage","ComfortCloset","EasyWardrobe","DailyStorage"
    };
    return wardrobeBrands;
}
//104
if(product=="StudyTables"){
    String[] studyTableBrands={
        "Ikea","UrbanLadder","Pepperfry","Nilkamal","GodrejInterio",
        "Durian","RoyalOak","HomeCentre","WoodenStreet","CasaCraft",
        "Craftatoz","DeckUp","AdornIndia","Spacewood","Zuari",
        "PrimeStudy","EliteStudy","SmartDesk","UrbanDesk","ModernStudy",
        "ComfortStudy","StyleDesk","PerfectStudy","ClassicDesk","HomeStudy",
        "FineDesk","RoyalDesk","StudentDesk","EasyStudy","DailyDesk"
    };
    return studyTableBrands;
}
//105
if(product=="Pens"){
    String[] penBrands={
        "Reynolds","Cello","Parker","Pilot","Linc",
        "Flair","Classmate","Lexi","Hauser","Montex",
        "PierreCardin","FaberCastell","AddGel","Rorito","Pentel",
        "Uniball","Luxor","Trimax","Speed","Butterflow",
        "MaxWriter","InkFlow","SmartPen","WritePro","EasyWrite",
        "PrimePen","ElitePen","DailyPen","SmoothWrite","FinePoint"
    };
    return penBrands;
}
//106
if(product=="Pencils"){
    String[] pencilBrands={
        "Nataraj","Apsara","FaberCastell","Camlin","Doms",
        "Classmate","Staedtler","Maped","Kokuyo","Luxor",
        "Pentel","Mitsubishi","Ticonderoga","Lyra","Derwent",
        "SketchPro","WriteEasy","SmartPencil","FineDraw","HBClassic",
        "PrimePencil","ElitePencil","DailyDraw","EasySketch","PerfectHB",
        "SmoothDraw","ArtLine","CreativeHB","StudentChoice","ProSketch"
    };
    return pencilBrands;
}
//107
if(product=="Notebooks"){
    String[] notebookBrands={
        "Classmate","Navneet","Camlin","Doms","Luxor",
        "Paperkraft","Solo","Oddy","JKPaper","Sundaram",
        "Mead","FiveStar","Kokuyo","Mintra","Scholar",
        "NotePro","SmartNotes","EasyNotes","PrimeNotebook","EliteNotes",
        "DailyNotebook","StudyMate","WriteBook","PerfectNotes","FineNotebook",
        "StudentBook","ProNotes","OfficeNotes","EcoNotebook","FreshPages"
    };
    return notebookBrands;
}
//108
if(product=="Erasers"){
    String[] eraserBrands={
        "Nataraj","Apsara","FaberCastell","Doms","Camlin",
        "Maped","Staedtler","Kokuyo","Luxor","Pentel",
        "SoftErase","CleanErase","EasyErase","PrimeErase","EliteErase",
        "SmartErase","FineErase","WhiteErase","DustFree","SmoothErase",
        "PerfectErase","DailyErase","ProErase","ClearRub","StudentErase",
        "ArtErase","EcoErase","FreshErase","UltraErase","QuickErase"
    };
    return eraserBrands;
}
//109
if(product=="Sharpeners"){
    String[] sharpenerBrands={
        "Nataraj","Apsara","FaberCastell","Doms","Camlin",
        "Maped","Staedtler","Kokuyo","Luxor","Classmate",
        "SharpPro","EasySharp","PrimeSharp","EliteSharp","SmartSharp",
        "FineSharp","PerfectSharp","DailySharp","StudentSharp","ProSharp",
        "QuickSharp","UltraSharp","SmoothSharp","CleanSharp","ArtSharp",
        "EcoSharp","FreshSharp","MetalSharp","MiniSharp","MaxSharp"
    };
    return sharpenerBrands;
}
//110
if(product=="Markers"){
    String[] markerBrands={
        "Camlin","Doms","FaberCastell","Luxor","Artline",
        "Staedtler","Sharpie","Pentel","Kores","Classmate",
        "MarkerPro","SmartMarker","PrimeMarker","EliteMarker","EasyMarker",
        "FineMarker","WhiteBoardPro","OfficeMarker","DailyMarker","BoldInk",
        "ColorMark","SmoothMarker","UltraMarker","QuickMark","ProMarker",
        "EcoMarker","FreshMarker","BrightMark","InkMaster","MaxMarker"
    };
    return markerBrands;
}
//111
if(product=="Glue"){
    String[] glueBrands={
        "Fevicol","Fevistick","Pidilite","Camlin","Doms",
        "FaberCastell","Kores","UHU","Bostik","Elmers",
        "GluePro","SmartGlue","PrimeGlue","EliteGlue","EasyStick",
        "QuickFix","StrongBond","OfficeGlue","DailyGlue","PerfectBond",
        "ClearGlue","UltraBond","CraftGlue","EcoGlue","FreshStick",
        "MaxBond","ProStick","SuperGlue","FineBond","SchoolGlue"
    };
    return glueBrands;
}
//112
if(product=="Refrigerators"){
    String[] refrigeratorBrands={
        "LG","Samsung","Whirlpool","Godrej","Haier",
        "Panasonic","Bosch","Siemens","VoltasBeko","Hitachi",
        "Sharp","Electrolux","Kelvinator","Midea","Hisense",
        "Toshiba","BPL","Onida","Mitashi","Lloyd",
        "CoolHome","FreshCool","PrimeFreeze","EliteCool","SmartFridge",
        "UltraFreeze","EcoCool","HomeChill","PerfectCool","RoyalFreeze"
    };
    return refrigeratorBrands;
}
//113
if(product=="WashingMachines"){
    String[] washingMachineBrands={
        "LG","Samsung","Whirlpool","Bosch","IFB",
        "Godrej","Haier","Panasonic","Siemens","VoltasBeko",
        "Onida","Lloyd","Mitashi","BPL","Electrolux",
        "Midea","Hisense","Toshiba","Sharp","Kelvinator",
        "CleanWash","PrimeWash","EliteWash","SmartWash","UltraClean",
        "EcoWashPro","PerfectWash","FreshWash","RoyalWash","HomeWash"
    };
    return washingMachineBrands;
}
//114
if(product=="Televisions"){
    String[] televisionBrands={
        "Sony","Samsung","LG","Panasonic","TCL",
        "OnePlus","Mi","Realme","Vu","Kodak",
        "Thomson","Philips","Haier","Hisense","Sharp",
        "Toshiba","Onida","BPL","Lloyd","Sansui",
        "VisionPro","SmartView","UltraVision","PrimeTV","EliteView",
        "CinemaView","CrystalView","HomeScreen","PerfectView","RoyalVision"
    };
    return televisionBrands;
}
//115
if(product=="MicrowaveOvens"){
    String[] microwaveBrands={
        "LG","Samsung","IFB","Panasonic","Whirlpool",
        "Godrej","Haier","Bosch","Siemens","Electrolux",
        "MorphyRichards","Bajaj","Prestige","Usha","Kenstar",
        "Sharp","Onida","Lloyd","Midea","Toshiba",
        "HeatPro","QuickHeat","SmartOven","PrimeCook","EliteOven",
        "UltraHeat","EcoCook","PerfectBake","RoyalOven","HomeChef"
    };
    return microwaveBrands;
}
//116
if(product=="AirConditioners"){
    String[] acBrands={
        "LG","Samsung","Daikin","Voltas","BlueStar",
        "Hitachi","Panasonic","Whirlpool","Haier","Lloyd",
        "Carrier","OGeneral","Mitsubishi","Godrej","Toshiba",
        "Sharp","Onida","BPL","Hisense","Electrolux",
        "CoolAir","SmartAC","PrimeCool","EliteAir","UltraCool",
        "EcoAir","PerfectClimate","RoyalCool","HomeBreeze","FreshAir"
    };
    return acBrands;
}
//117
if(product=="Mixers"){
    String[] mixerBrands={
        "Prestige","Bajaj","Preethi","Philips","Butterfly",
        "Sujata","Usha","Panasonic","MorphyRichards","Havells",
        "Orient","Kenstar","Bosch","Wonderchef","Pigeon",
        "MaharajaWhiteline","Lifelong","Inalsa","Crompton","Singer",
        "MixPro","SmartMix","PrimeMixer","EliteMix","UltraBlend",
        "EcoMix","PerfectBlend","RoyalMix","HomeBlend","QuickMix"
    };
    return mixerBrands;
}
//118
if(product=="Fans"){
    String[] fanBrands={
        "Usha","Orient","Crompton","Havells","Bajaj",
        "Atomberg","Khaitan","Polycab","VGuard","Luminous",
        "Panasonic","GM","Anchor","RRKabel","Superfan",
        "WindPro","CoolBreeze","SmartFan","PrimeFan","EliteFan",
        "UltraAir","EcoFan","PerfectBreeze","RoyalFan","HomeAir",
        "FreshWind","AirFlow","PowerFan","SpeedFan","ComfortFan"
    };
    return fanBrands;
}
//119
if(product=="MobileCases"){
    String[] mobileCaseBrands={
        "Spigen","Ringke","OtterBox","Caseology","ESR",
        "DailyObjects","Noise","Boat","Realme","Samsung",
        "Apple","OnePlus","Xiaomi","Vivo","Oppo",
        "Kapaver","GiftKart","Fashionury","Tarkan","Zapcase",
        "CoverPro","SmartCase","PrimeCover","EliteCase","UltraShield",
        "EcoCase","StyleCover","RoyalCase","ArmorCase","FlexiCover"
    };
    return mobileCaseBrands;
}
//120
if(product=="Chargers"){
    String[] chargerBrands={
        "Apple","Samsung","OnePlus","Mi","Realme",
        "Boat","Portronics","Ambrane","Anker","Belkin",
        "Syska","Zebronics","Ubon","Stuffcool","PTron",
        "Oraimo","Baseus","Spigen","Philips","Motorola",
        "FastCharge","PrimeCharge","EliteCharge","UltraCharge","SmartCharge",
        "EcoCharge","QuickPower","PowerPro","ChargeMax","TurboCharge"
    };
    return chargerBrands;
}
//121
if(product=="PowerBanks"){
    String[] powerBankBrands={
        "Mi","Realme","Ambrane","Boat","Syska",
        "Portronics","Anker","Belkin","URBN","Redmi",
        "Samsung","Philips","Ubon","PTron","Stuffcool",
        "Oraimo","Zebronics","Baseus","Spigen","Duracell",
        "PowerPro","SmartPower","PrimeBank","ElitePower","UltraBank",
        "EcoPower","ChargePlus","EnergyMax","PowerHub","QuickBank"
    };
    return powerBankBrands;
}
//122
if(product=="Earphones"){
    String[] earphoneBrands={
        "Boat","JBL","Sony","Realme","OnePlus",
        "Samsung","Apple","Noise","Boult","Skullcandy",
        "Sennheiser","Philips","Zebronics","Ptron","Ubon",
        "Ambrane","Portronics","Anker","Infinity","Motorola",
        "SoundPro","PrimeAudio","EliteSound","UltraBass","SmartAudio",
        "EcoSound","MusicPro","BassBoost","ClearTune","PowerSound"
    };
    return earphoneBrands;
}
//123
if(product=="BluetoothSpeakers"){
    String[] speakerBrands={
        "Boat","JBL","Sony","Marshall","UltimateEars",
        "Bose","Realme","Mi","Portronics","Zebronics",
        "Philips","Infinity","Anker","Ambrane","Ptron",
        "Ubon","Skullcandy","HarmanKardon","Tribit","Soundcore",
        "SoundBox","PrimeSpeaker","EliteSound","UltraBeat","SmartSpeaker",
        "EcoSpeaker","MusicBox","BassSpeaker","PowerBeat","HomeSound"
    };
    return speakerBrands;
}
//124
if(product=="ScreenGuards"){
    String[] screenGuardBrands={
        "Spigen","ESR","RhinoShield","Tempered","CaseU",
        "GiftKart","Kapaver","DailyObjects","Noise","Samsung",
        "Apple","OnePlus","Realme","Mi","Vivo",
        "Oppo","ProtectPro","SmartShield","PrimeGlass","EliteGuard",
        "UltraShield","EcoGuard","ClearShield","StrongGlass","SafeTouch",
        "ArmorGlass","CrystalGuard","PerfectShield","ScreenPro","MaxGuard"
    };
    return screenGuardBrands;
}
//125
if(product=="USBcables"){
    String[] usbCableBrands={
        "Boat","Ambrane","Portronics","Anker","Belkin",
        "Mi","Realme","Samsung","OnePlus","Apple",
        "Syska","Zebronics","Ptron","Ubon","Stuffcool",
        "Baseus","Philips","Motorola","Oraimo","Spigen",
        "CablePro","PrimeCable","EliteCable","UltraCable","SmartCable",
        "EcoCable","FastLink","PowerCable","ChargeLink","QuickCable"
    };
    return usbCableBrands;
}
//126
if(product=="Keyboards"){
    String[] keyboardBrands={
        "Logitech","HP","Dell","Lenovo","Microsoft",
        "Redragon","Corsair","Razer","Zebronics","AntEsports",
        "CosmicByte","Asus","Acer","HyperX","SteelSeries",
        "TVSE","iBall","Amkette","Portronics","Rapoo",
        "KeyPro","PrimeKeys","EliteKeyboard","UltraKeys","SmartType",
        "EcoKeys","GamingKeys","OfficeKeys","SpeedType","PerfectKeys"
    };
    return keyboardBrands;
}
//127
if(product=="Mouse"){
    String[] mouseBrands={
        "Logitech","HP","Dell","Lenovo","Microsoft",
        "Razer","Corsair","Redragon","Zebronics","AntEsports",
        "CosmicByte","Asus","Acer","HyperX","SteelSeries",
        "iBall","Amkette","Portronics","Rapoo","Offbeat",
        "ClickPro","PrimeMouse","EliteMouse","UltraClick","SmartMouse",
        "EcoMouse","SpeedClick","GamingMouse","PerfectClick","QuickMouse"
    };
    return mouseBrands;
}
//128
if(product=="Monitors"){
    String[] monitorBrands={
        "Samsung","LG","Dell","HP","Acer",
        "Asus","BenQ","MSI","ViewSonic","Lenovo",
        "Philips","Gigabyte","Zebronics","AOC","Redmi",
        "OnePlus","Sony","Panasonic","TCL","Sharp",
        "VisionPro","PrimeDisplay","EliteScreen","UltraView","SmartMonitor",
        "EcoDisplay","CrystalView","PerfectScreen","OfficeView","GameView"
    };
    return monitorBrands;
}
//129
if(product=="Webcams"){
    String[] webcamBrands={
        "Logitech","HP","Dell","Lenovo","Microsoft",
        "Razer","Redragon","Zebronics","CosmicByte","AntEsports",
        "Portronics","Rapoo","Amkette","Asus","Acer",
        "ViewSonic","Creative","Anker","Trust","AUKEY",
        "CamPro","PrimeCam","EliteCam","UltraCam","SmartCam",
        "EcoCam","StreamCam","VideoPro","ClearCam","PerfectCam"
    };
    return webcamBrands;
}
//130
if(product=="Headsets"){
    String[] headsetBrands={
        "Logitech","HP","Dell","Lenovo","Razer",
        "Corsair","HyperX","SteelSeries","Redragon","Zebronics",
        "CosmicByte","Boat","JBL","Sony","Sennheiser",
        "Philips","AntEsports","Asus","Acer","MSI",
        "SoundPro","PrimeHeadset","EliteSound","UltraAudio","SmartHeadset",
        "EcoSound","GamingAudio","ClearVoice","BassHead","PerfectSound"
    };
    return headsetBrands;
}
//131
if(product=="Pendrives"){
    String[] pendriveBrands={
        "SanDisk","HP","Kingston","Sony","Samsung",
        "Transcend","PNY","Toshiba","Lexar","Strontium",
        "Adata","Corsair","Verbatim","Integral","Netac",
        "StoragePro","PrimeDrive","EliteUSB","UltraDrive","SmartStorage",
        "EcoDrive","SpeedDrive","DataPro","QuickUSB","SecureDrive",
        "FlashPro","MemoryPlus","DataMax","EasyDrive","PowerUSB"
    };
    return pendriveBrands;
}
//132
if(product=="ExternalHardDisks"){
    String[] hardDiskBrands={
        "Seagate","WesternDigital","Toshiba","Samsung","SanDisk",
        "Transcend","Adata","LaCie","GTechnology","Buffalo",
        "Lenovo","Dell","HP","Sony","Verbatim",
        "StorageMax","PrimeStorage","EliteDisk","UltraStorage","SmartDisk",
        "EcoStorage","DataVault","SecureDisk","BackupPro","PowerStorage",
        "DrivePlus","MemoryVault","SafeDisk","QuickStorage","DataHub"
    };
    return hardDiskBrands;
}
//133
if(product=="CricketEquipment"){
    String[] cricketBrands={
        "MRF","SG","SS","Kookaburra","GrayNicolls",
        "Spartan","NewBalance","Adidas","Puma","Nike",
        "GM","DSC","BDM","BAS","Ceat",
        "Ton","Slazenger","Reebok","Cosco","Nivia",
        "PowerCricket","PrimeBat","EliteCricket","UltraPlay","SmartCricket",
        "EcoBat","ProCricket","GameMaster","PerfectShot","RoyalCricket"
    };
    return cricketBrands;
}
//134
if(product=="FootballEquipment"){
    String[] footballBrands={
        "Nike","Adidas","Puma","Nivia","Cosco",
        "VectorX","Kipsta","Mitre","Umbro","Wilson",
        "Reebok","UnderArmour","Decathlon","Molten","Spalding",
        "PowerKick","PrimeFootball","EliteKick","UltraGoal","SmartPlay",
        "EcoBall","ProKick","GameStar","PerfectGoal","RoyalKick",
        "ActivePlay","SpeedKick","MatchPro","ChampionBall","GoalMaster"
    };
    return footballBrands;
}
//135
if(product=="BadmintonEquipment"){
    String[] badmintonBrands={
        "Yonex","LiNing","Victor","Carlton","Wilson",
        "Cosco","Nivia","Head","Babolat","Ashaway",
        "Apacs","Fleet","Kawasaki","Tecnifibre","SilverSports",
        "PowerSmash","PrimeRacket","EliteShuttle","UltraSmash","SmartPlay",
        "EcoRacket","ProSmash","GamePro","PerfectShot","RoyalSmash",
        "SpeedRacket","ChampionHit","MatchPlay","ActiveSmash","AceSports"
    };
    return badmintonBrands;
}
//136
if(product=="GymEquipment"){
    String[] gymBrands={
        "CultFit","Decathlon","Kore","Aurion","Protoner",
        "Strauss","Cosco","Nivia","Adidas","Nike",
        "Reebok","Puma","Boldfit","Lifelong","Cockatoo",
        "Fitkit","PowerMax","Healthgenie","Flexnest","AmazonBasics",
        "PowerFit","PrimeFitness","EliteGym","UltraFit","SmartWorkout",
        "EcoFitness","ProGym","ActiveFit","PerfectFitness","RoyalFit"
    };
    return gymBrands;
}
//137
if(product=="TennisEquipment"){
    String[] tennisBrands={
        "Wilson","Babolat","Head","Yonex","Prince",
        "Tecnifibre","Dunlop","Slazenger","Adidas","Nike",
        "Puma","Reebok","Cosco","Nivia","Artengo",
        "PowerServe","PrimeTennis","EliteRacket","UltraServe","SmartTennis",
        "EcoRacket","ProServe","GameSet","PerfectServe","RoyalTennis",
        "MatchPoint","AceServe","ChampionHit","CourtMaster","ActiveServe"
    };
    return tennisBrands;
}
//138
if(product=="TableTennisEquipment"){
    String[] tableTennisBrands={
        "Stiga","Butterfly","Donic","Yasaka","Joola",
        "Cornilleau","Killerspin","GKI","Cosco","Nivia",
        "Adidas","Tibhar","Gewo","DoubleFish","DHS",
        "PowerSpin","PrimePaddle","EliteSpin","UltraPing","SmartPlay",
        "EcoPaddle","ProSpin","GameMaster","PerfectSpin","RoyalPing",
        "SpeedSpin","ChampionPaddle","MatchPlay","ActiveSpin","AcePing"
    };
    return tableTennisBrands;
}
//139
if(product=="BasketballEquipment"){
    String[] basketballBrands={
        "Spalding","Wilson","Nike","Adidas","Puma",
        "Nivia","Cosco","Molten","UnderArmour","Reebok",
        "Decathlon","Tarmak","Baden","Rawlings","Champion",
        "PowerDribble","PrimeBasket","EliteHoop","UltraBounce","SmartPlay",
        "EcoBall","ProHoop","GameStar","PerfectShot","RoyalBasket",
        "CourtKing","ChampionPlay","MatchHoop","ActiveBounce","AceBasket"
    };
    return basketballBrands;
}
//140
if(product=="CarAccessories"){
    String[] carAccessoryBrands={
        "Bosch","3M","Michelin","Castrol","Shell",
        "Mobil","TurtleWax","Meguiars","Wurth","Autofurnish",
        "GoMechanic","Hella","PhilipsAuto","Osram","JKTyre",
        "MRF","Bridgestone","Apollo","CEAT","Continental",
        "AutoPro","PrimeAuto","EliteDrive","UltraAuto","SmartRide",
        "EcoDrive","PerfectAuto","RoyalDrive","SpeedAuto","PowerRide"
    };
    return carAccessoryBrands;
}
//141
if(product=="BikeAccessories"){
    String[] bikeAccessoryBrands={
        "Steelbird","Vega","Studds","LS2","Axor",
        "RoyalEnfield","Yamaha","Honda","TVS","Hero",
        "CastrolBike","Motul","ShellAdvance","Mobil1","Rynox",
        "Raida","GuardianGears","Viaterra","Probiker","BikingBrotherhood",
        "RidePro","PrimeRide","EliteBike","UltraRide","SmartBiker",
        "EcoRide","SpeedRide","PowerBike","RoyalBiker","PerfectRide"
    };
    return bikeAccessoryBrands;
}
//142
if(product=="HealthSupplements"){
    String[] supplementBrands={
        "Himalaya","Dabur","Patanjali","Herbalife","Amway",
        "Oziva","HealthKart","MuscleBlaze","BigMuscles","GNC",
        "Ensure","Protinex","Horlicks","Bournvita","Pediasure",
        "Zandu","Kapiva","OrganicIndia","WellbeingNutrition","TrueBasics",
        "HealthPro","PrimeHealth","EliteNutrition","UltraHealth","SmartNutrition",
        "EcoHealth","FitLife","PowerHealth","RoyalNutrition","PerfectHealth"
    };
    return supplementBrands;
}
//143
if(product=="PersonalHealthDevices"){
    String[] healthDeviceBrands={
        "Omron","DrTrust","AccuChek","OneTouch","Beurer",
        "Rossmax","BPLMedical","Equinox","HealthSense","DrMorepen",
        "iHealth","PhilipsHealth","Braun","Vicks","Tynor",
        "Flamingo","EasyCare","HealthPro","PrimeCare","EliteCare",
        "UltraCare","SmartHealth","EcoCare","PerfectCare","HomeHealth",
        "MediCheck","SafeHealth","CarePlus","HealthGuard","WellCare"
    };
    return healthDeviceBrands;
}
//144
if(product=="GamingConsoles"){
    String[] consoleBrands={
        "SonyPlayStation","MicrosoftXbox","Nintendo","AsusROG","Alienware",
        "MSI","LenovoLegion","HPOMEN","AcerPredator","Razer",
        "LogitechG","Corsair","HyperX","SteelSeries","Redragon",
        "GamePro","PrimeGaming","EliteConsole","UltraPlay","SmartGaming",
        "EcoGaming","PowerConsole","RoyalGaming","PerfectPlay","GameMaster",
        "ProGamer","NextGenPlay","InfinityGame","SpeedGaming","ChampionPlay"
    };
    return consoleBrands;
}
//145
if(product=="GamingAccessories"){
    String[] gamingAccessoryBrands={
        "LogitechG","Razer","Corsair","HyperX","SteelSeries",
        "Redragon","AntEsports","CosmicByte","Zebronics","Asus",
        "MSI","HPOMEN","LenovoLegion","Sony","Microsoft",
        "GamePro","PrimeGear","EliteGaming","UltraGear","SmartPlay",
        "EcoGear","PowerGaming","RoyalGear","PerfectControl","ProLevel",
        "SpeedGear","ChampionGear","NextPlay","InfinityGear","VictoryPlay"
    };
    return gamingAccessoryBrands;
}
//146
if(product=="DogProducts"){
    String[] dogBrands={
        "Pedigree","Drools","RoyalCanin","Purepet","HimalayaPetCare",
        "Farmina","Acana","Orijen","JerHigh","Goodies",
        "Choostix","MeO","SmartHeart","Petvit","Beaphar",
        "Dogsee","Basil","CaptainZack","HeadsUpForTails","Wiggles",
        "PetPro","PrimePet","EliteDog","UltraPet","SmartPet",
        "EcoPet","HappyPaws","PerfectPet","RoyalPaws","HealthyDog"
    };
    return dogBrands;
}
//147
if(product=="CatProducts"){
    String[] catBrands={
        "Whiskas","MeO","RoyalCanin","Purepet","Sheba",
        "Bellotta","KitCat","DroolsCat","SmartHeart","MeowMix",
        "Temptations","Friskies","Purina","Iams","Acana",
        "Orijen","Petvit","Beaphar","CaptainZack","Wiggles",
        "PetCare","PrimeCat","EliteCat","UltraCat","SmartKitty",
        "EcoCat","HappyCat","PerfectCat","RoyalKitty","HealthyCat"
    };
    return catBrands;
}
// 148
if(product == "Electronics"){
    String[] electronicsBrands = {
        "Apple", "Samsung", "Sony", "LG", "Dell", "HP", "Asus", "Lenovo", "Panasonic", "Xiaomi",
        "Microsoft", "Google", "Huawei", "Acer", "MSI", "Toshiba", "Sharp", "Philips", "Sennheiser", "Bose",
        "Logitech", "Razer", "Intel", "AMD", "Nvidia", "Canon", "Nikon", "Fujifilm", "GoPro", "SanDisk"
    };
    return electronicsBrands;
}

//149
if(product == "DogProducts"){
    String[] dogBrands = {
        "Pedigree", "RoyalCanin", "Drools", "HillsScience", "Purina", "BlueBuffalo", "Cesar", "BarkBox", "Kong", "Orijen",
        "Acana", "Nutro", "Iams", "Eukanuba", "WellnessCore", "TasteOfTheWild", "Merrick", "Canidae", "Victors", "SolidGold",
        "NaturalBalance", "DiamondPet", "Zignature", "Stella&Chewys", "Freshpet", "Wiggles", "CaptainZack", "Beaphar", "PetCare", "SmartHeart"
    };
    return dogBrands;
}

//150
if(product == "Footwear"){
    String[] shoeBrands1 = {
        "Nike", "Adidas", "Puma", "Reebok", "NewBalance", "Skechers", "Asics", "Vans", "Converse", "UnderArmour",
        "Timberland", "DrMartens", "Crocs", "Birkenstock", "Fila", "Brooks", "Saucony", "Merrell", "Salomon", "Clarks",
        "Aldo", "SteveMadden", "Ecco", "Rockport", "ColeHaan", "HushPuppies", "Bata", "Woodland", "Sparx", "Lotto"
    };
    return shoeBrands1;
}

//151
if(product == "Skincare"){
    String[] skinBrands = {
        "Loreal", "Neutrogena", "CeraVe", "TheOrdinary", "Nivea", "Clinique", "EsteeLauder", "Cetaphil", "LaRochePosay", "Kiehls",
        "Olay", "Aveeno", "Biore", "Eucerin", "Vichy", "Bioderma", "Shiseido", "Laneige", "Innisfree", "Cosrx",
        "Murad", "Dermalogica", "Glossier", "DrunkElephant", "SundayRiley", "Tatcha", "Origins", "PaulaChoice", "Clarins", "Lush"
    };
    return skinBrands;
}

//152
if(product == "Beverages"){
    String[] beverageBrands = {
        "CocaCola", "Pepsi", "RedBull", "Nescafe", "Starbucks", "Monster", "Gatorade", "Lipton", "Tropicana", "Sprite",
        "MountainDew", "DrPepper", "Fanta", "7Up", "ThumsUp", "Maaza", "Frooti", "MinuteMaid", "Aquafina", "Kinley",
        "Evian", "Perrier", "Schweppes", "Horlicks", "Complan", "Bournvita", "Milo", "Tang", "PaperBoat", "RealJuice"
    };
    return beverageBrands;
}

//153
if(product == "HomeAppliances"){
    String[] applianceBrands = {
        "Whirlpool", "Bosch", "Samsung", "Dyson", "KitchenAid", "Haier", "Miele", "Kenmore", "Electrolux", "Shark",
        "LG", "Panasonic", "Maytag", "Frigidaire", "Black+Decker", "HamiltonBeach", "Cuisinart", "Breville", "T-fal", "Presto",
        "MorphyRichards", "Bajaj", "Havells", "Usha", "Prestige", "Butterfly", "Philips", "Godrej", "Voltas", "BlueStar"
    };
    return applianceBrands;
}

// 154
if(product == "LuxuryWatches"){
    String[] watchBrands1 = {
        "Rolex", "Omega", "TagHeuer", "Cartier", "PatekPhilippe", "Tissot", "Seiko", "Casio", "Hublot", "Breitling",
        "AudemarsPiguet", "IWC", "Panerai", "Longines", "Hamilton", "Oris", "Tudor", "Rado", "Fossil", "Titan",
        "Timex", "Citizen", "Movado", "Bulova", "Zenith", "Blancpain", "Chopard", "VacheronConstantin", "Montblanc", "Piaget"
    };
    return watchBrands1;
}

//155
if(product == "Automobiles"){
    String[] autoBrands = {
        "Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Mercedes", "Audi", "Volkswagen", "Hyundai", "Tesla",
        "Nissan", "Kia", "Mazda", "Subaru", "Lexus", "Porsche", "Ferrari", "Lamborghini", "Jaguar", "LandRover",
        "Volvo", "Mitsubishi", "Suzuki", "Fiat", "Jeep", "Dodge", "Chrysler", "Bentley", "AstonMartin", "RollsRoyce"
    };
    return autoBrands;
}

//156
if(product == "BabyProducts"){
    String[] babyBrands = {
        "Pampers", "Huggies", "JohnsonBaby", "Gerber", "MamyPoko", "FisherPrice", "Chicco", "AveenoBaby", "Graco", "Luvlap",
        "HimalayaBaby", "SebamedBaby", "Mothercare", "Pigeon", "MeeMee", "BabyDove", "Enfamil", "Similac", "NanPro", "Nestum",
        "EarthsBest", "BurtBeesBaby", "Mustela", "CetaphilBaby", "Libero", "Teddy", "Snuggy", "FirstCry", "Hopop", "TinyStep"
    };
    return babyBrands;
}

//157
if(product == "Apparel"){
    String[] clothingBrands = {
        "Zara", "H&M", "Gucci", "Prada", "LouisVuitton", "Levis", "Gap", "Uniqlo", "TommyHilfiger", "CalvinKlein",
        "RalphLauren", "Burberry", "Chanel", "Versace", "DolceGabbana", "Fendi", "Armani", "Balenciaga", "Givenchy", "Valentino",
        "Dior", "SaintLaurent", "Wrangler", "Lee", "Diesel", "Guess", "Forever21", "Mango", "AmericanEagle", "Abercrombie"
    };
    return clothingBrands;
}
//158
if(product == "WomenWesternWear"){
    String[] womenWesternBrands = {
        "Zara", "H&M", "Mango", "Forever21", "Uniqlo", 
        "ASOS", "Gap", "Levis", "Madewell", "Everlane",
        "Aritzia", "FreePeople", "Anthropologie", "UrbanOutfitters", "Topshop",
        "Reformation", "Bershka", "Pull&Bear", "Stradivarius", "MassimoDutti",
        "BananaRepublic", "AnnTaylor", "J.Crew", "OldNavy", "Lululemon",
        "AloYoga", "VictoriaSecret", "Abercrombie", "Next", "Marks&Spencer"
    };
    return womenWesternBrands;
}
//159
if(product == "WomenLuxuryFashion"){
    String[] luxuryBrands = {
        "Chanel", "Gucci", "Dior", "Prada", "LouisVuitton",
        "Hermes", "Versace", "Valentino", "Balenciaga", "SaintLaurent",
        "Fendi", "Burberry", "Givenchy", "Celine", "BottegaVeneta",
        "MiuMiu", "Loewe", "Chloé", "AlexanderMcQueen", "Dolce&Gabbana",
        "StellaMcCartney", "TomFord", "Balmain", "OscarDeLaRenta", "MarcJacobs",
        "MichaelKors", "ToryBurch", "Jacquemus", "TheRow", "MaisonMargiela"
    };
    return luxuryBrands;
}
//160
if(product == "WomenEthnicWear"){
    String[] ethnicBrands = {
        "Biba", "FabIndia", "WForWoman", "Aurelia", "GlobalDesi",
        "Sabyasachi", "ManishMalhotra", "RituKumar", "AnitaDongre", "Masaba",
        "Soch", "Libas", "MeenaBazaar", "Anarkali", "Pantaloons",
        "Westside", "VeroModa", "Only", "AllenSollyWoman", "VanHeusenWoman",
        "LabelShauryaSanadhya", "Faballey", "Indya", "Rangriti", "Janasya",
        "Sangria", "Aks", "JaipurKurti", "Kalamkari", "HouseOfPataudi"
    };
    return ethnicBrands;
}
//161
if(product == "MenCasualWear"){
    String[] menCasualBrands = {
        "Levis", "Wrangler", "Lee", "Diesel", "Jack&Jones",
        "H&M", "Zara", "Uniqlo", "Gap", "OldNavy",
        "Abercrombie", "Hollister", "AmericanEagle", "Superdry", "Vans",
        "Converse", "Carhartt", "Patagonia", "NorthFace", "Timberland",
        "NikeSportswear", "AdidasOriginals", "Puma", "Reebok", "NewBalance",
        "Champion", "Fila", "Kappa", "Stussy", "Supreme"
    };
    return menCasualBrands;
}
//162
if(product == "MenFormalWear"){
    String[] menFormalBrands = {
        "HugoBoss", "BrooksBrothers", "RalphLauren", "TommyHilfiger", "CalvinKlein",
        "VanHeusen", "LouisPhilippe", "AllenSolly", "PeterEngland", "Arrow",
        "Raymond", "Blackberrys", "ParkAvenue", "Zodiac", "Canali",
        "ErmenegildoZegna", "Brioni", "CharlesTyrwhitt", "TMLewin", "Hackett",
        "TedBaker", "PaulSmith", "Dunhill", "Gieves&Hawkes", "SavileRow",
        "MassimoDutti", "J.Crew", "BananaRepublic", "Theory", "Bonobos"
    };
    return menFormalBrands;
}
//163
if(product == "MenLuxuryFashion"){
    String[] luxuryBrands1 = {
        "Gucci", "LouisVuitton", "Prada", "DiorMen", "SaintLaurent",
        "Balenciaga", "Givenchy", "Valentino", "Fendi", "Burberry",
        "TomFord", "Versace", "AlexanderMcQueen", "Off-White", "FearOfGod",
        "Amiri", "StoneIsland", "Moncler", "BrunelloCucinelli", "LoroPiana",
        "BottegaVeneta", "Hermes", "GiorgioArmani", "Balmain", "MaisonMargiela",
        "RickOwens", "Vetements", "Kenzo", "Loewe", "Berluti"
    };
    return luxuryBrands1;
}
//164
if(product == "Activewear"){
    String[] activeBrands = {
        "Nike", "Adidas", "Puma", "UnderArmour", "Lululemon",
        "Reebok", "Gymshark", "Asics", "NewBalance", "AloYoga",
        "Fabletics", "Columbia", "TheNorthFace", "Patagonia", "Champion",
        "Mizuno", "Brooks", "Saucony", "Decathlon", "Skechers",
        "Alphalete", "Vanquish", "YoungLA", "MyProtein", "Castore",
        "2XU", "Canterbury", "Salomon", "Umbro", "Hoka"
    };
    return activeBrands;
}
//165
if(product == "Automobiles"){
    String[] autoBrands1 = {
        "Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Mercedes", "Audi", "Volkswagen", "Hyundai", "Tesla",
        "Nissan", "Kia", "Mazda", "Subaru", "Lexus", "Porsche", "Ferrari", "Lamborghini", "Jaguar", "LandRover",
        "Volvo", "Mitsubishi", "Suzuki", "Fiat", "Jeep", "Dodge", "Chrysler", "Bentley", "AstonMartin", "RollsRoyce"
    };
    return autoBrands1;
}
//166
if(product == "BabyProducts"){
    String[] babyBrands1 = {
        "Pampers", "Huggies", "JohnsonBaby", "Gerber", "MamyPoko", "FisherPrice", "Chicco", "AveenoBaby", "Graco", "Luvlap",
        "HimalayaBaby", "SebamedBaby", "Mothercare", "Pigeon", "MeeMee", "BabyDove", "Enfamil", "Similac", "NanPro", "Nestum",
        "EarthsBest", "BurtBeesBaby", "Mustela", "CetaphilBaby", "Libero", "Teddy", "Snuggy", "FirstCry", "Hopop", "TinyStep"
    };
    return babyBrands1;
}
//167
if(product == "Apparel"){
    String[] apparelBrands = {
        "Zara", "H&M", "Gucci", "Prada", "LouisVuitton", "Levis", "Gap", "Uniqlo", "TommyHilfiger", "CalvinKlein",
        "RalphLauren", "Burberry", "Chanel", "Versace", "DolceGabbana", "Fendi", "Armani", "Balenciaga", "Givenchy", "Valentino",
        "Dior", "SaintLaurent", "Wrangler", "Lee", "Diesel", "Guess", "Forever21", "Mango", "AmericanEagle", "Abercrombie"
    };
    return apparelBrands;
}
//168
if(product == "Heaters"){
    String[] heaterBrands = {
        "Dyson", "Honeywell", "Lasko", "Vornado", "DeLonghi",
        "Bajaj", "Havells", "AOSmith", "Havells", "V-Guard",
        "Racold", "Venus", "Kenstar", "Usha", "MorphyRichards",
        "OrientElectric", "Crompton", "Glen", "Sunbeam", "DrInfrared",
        "StiebelEltron", "Rheem", "Eemax", "Ecosmart", "StadlerForm",
        "Mill", "BlueStar", "Hindware", "Spherehot", "Remington"
    };
    return heaterBrands;
}
//169
if(product=="CoolingSystems"){
    String[] coolingBrands={
        "Daikin","Mitsubishi","Carrier","Trane","Voltas",
        "BlueStar","LG","Samsung","Panasonic","Hitachi",
        "Whirlpool","Haier","Lennox","Fujitsu","Toshiba",
        "Gree","Midea","Godrej","Lloyd","OGeneral",
        "Usha","Havells","Orient","Crompton","Bajaj",
        "Luminous","VGuard","Honeywell","ArcticAir","Airmate"
    };
    return coolingBrands;
}
//170
if(product=="KitchenAppliances"){
    String[] kitchenBrands={
        "KitchenAid","Philips","Prestige","Bajaj","MorphyRichards",
        "Prestige","Butterfly","Usha","Glen","Pigeon",
        "Sunflame","Faber","Elica","Inalsa","Wonderchef",
        "Panasonic","Kenwood","Breville","Ninja","Cuisinart",
        "HamiltonBeach","Black+Decker","Zojirushi","T-fal","Oster",
        "Bosch","Siemens","Miele","Samsung","LG"
    };
    return kitchenBrands;
}
//171
if(product=="SmartHome"){
    String[] smartBrands={
        "GoogleNest","AmazonEcho","Arlo","Ring","Wyze",
        "PhilipsHue","TP-Link","Xiaomi","Eufy","August",
        "Ecobee","Sonos","Lutron","SamsungSmartThings","Yale",
        "SimpliSafe","HoneywellHome","Nanoleaf","BelkinWemo","Broadlink",
        "Netatmo","Logitech","Sengled","Lifx","IKEAHomeSmart",
        "Vivint","ADT","Reolink","Blink","Abode"
    };
    return smartBrands;
}
//172
if(product=="CleaningAppliances"){
    String[] cleaningBrands={
        "Dyson","Shark","Bissell","iRobot","Roborock",
        "Ecovacs","Dreame","Eufy","Karcher","EurekaForbes",
        "Hoover","Miele","Samsung","LG","Black+Decker",
        "Vax","Nilfisk","Tennant","RootsMulticlean","Tineco",
        "BlueAir","Nutone","Kenmore","Oreck","Panasonic",
        "Xiaomi","Honeywell","RugDoctor","Ridgid","Makita"
    };
    return cleaningBrands;
}
//173
if(product=="LaundryAppliances"){
    String[] laundryBrands={
        "LG","Samsung","Whirlpool","Maytag","GEProfile",
        "Kenmore","Bosch","Miele","SpeedQueen","Electrolux",
        "Haier","Panasonic","Siemens","IFB","Godrej",
        "VoltasBeko","Lloyd","Fisher&Paykel","Asko","Amana",
        "Insignia","Blomberg","Candy","Hoover","Indesit",
        "Zanussi","Beko","Toshiba","Sharp","Black+Decker"
    };
    return laundryBrands;
}
//174
if(product=="AirPurifiers"){
    String[] purifierBrands={
        "Dyson","Blueair","Levoit","Coway","Honeywell",
        "Winix","IQAir","Xiaomi","Philips","Molekule",
        "RabbitAir","GermGuardian","BluePure","Bissel","Alen",
        "MedifyAir","Hathaspace","Sharp","Panasonic","Samsung",
        "LG","Carrier","Trane","Airmega","Boneco",
        "Daikin","AuraAir","TruSens","EurekaForbes","Kent"
    };
    return purifierBrands;
}
//175
if(product=="OfficeSupplies"){
    String[] officeBrands={
        "3M","Staples","OfficeDepot","Bic","PaperMate",
        "Pilot","Parker","Montblanc","FaberCastell","Staedtler",
        "Dymo","Brother","Epson","Canon","HP",
        "Xerox","Logitech","Post-it","Fellowes","Quartet",
        "Mead","FiveStar","Moleskine","Pentel","Sharpie",
        "Ticonderoga","Uni-ball","Zebra","Rubbermaid","Avery"
    };
    return officeBrands;
}

//176
if(product=="FitnessEquipment"){
    String[] fitnessBrands={
        "Peloton","NordicTrack","Bowflex","Bowflex","Schwinn",
        "LifeFitness","Precor","Technogym","RogueFitness","Concept2",
        "TitanFitness","Eleiko","HammerStrength","Matrix","Horizon",
        "SunnyHealth","ProForm","Echelon","Tonal","Mirror",
        "Fitbit","Garmin","Polar","Suunto","PowerBlock",
        "Ironmaster","TRX","Theragun","Hyperice","Manduka"
    };
    return fitnessBrands;
}

//177
if(product=="GardenOutdoor"){
    String[] gardenBrands={
        "JohnDeere","STIHL","Husqvarna","Toro","Honda",
        "Black+Decker","Ryobi","Milwaukee","DeWalt","EGO",
        "Greenworks","Worx","SunJoe","Gardena","Fiskars",
        "Scotts","Miracle-Gro","Weber","Traeger","Napoleon",
        "Char-Broil","YETI","Coleman","Igloo","Keter",
        "Suncast","Rubbermaid","Orbit","RainBird","Bestway"
    };
    return gardenBrands;
}

//178
if(product=="Furniture"){
    String[] furnitureBrands={
        "IKEA","AshleyFurniture","Wayfair","HermanMiller","Steelcase",
        "WestElm","PotteryBarn","RestorationHardware","Crate&Barrel","La-Z-Boy",
        "EthanAllen","Raymour&Flanigan","RoomsToGo","Bob’sFurniture","Haverty’s",
        "Bernhardt","HookerFurniture","Bassett","Arhaus","Joybird",
        "Zinus","Article","Burrow","Floyd","Modloft",
        "BluDot","Kartell","Knoll","Natuzzi","Century"
    };
    return furnitureBrands;
}

// 179
if(product=="Kitchenware"){
    String[] kitchenBrands1={
        "LeCreuset","Staub","All-Clad","Calphalon","Cuisinart",
        "Lodge","T-fal","Farberware","Pyrex","Corelle",
        "OXO","KitchenAid","Zwilling","Wusthof","Victorinox",
        "Shun","Global","Tupperware","Rubbermaid","Snapware",
        "Anolon","Circulon","GreenPan","Scanpan","Misen",
        "OurPlace","Caraway","JosephJoseph","Norpro","Microplane"
    };
    return kitchenBrands1;
}

// 180
if(product=="GroomingAppliance"){
    String[] groomingBrands={
        "Philips","Braun","Panasonic","Remington","Wahl",
        "Andis","Babyliss","Dyson","GHD","Revlon",
        "Conair","Shark","HotTools","T3Micro","Harrys",
        "Gillette","Manscaped","Beurer","Oral-B","Sonicare",
        "Waterpik","Foreo","NuFace","PMD","Silk’n",
        "Norelco","Skullshaver","BaBylissPRO","Chi","Parlux"
    };
    return groomingBrands;
}

//181
if(product=="ToysGames"){
    String[] toyBrands1={
        "Lego","Hasbro","Mattel","Nerf","Barbie",
        "HotWheels","FisherPrice","Play-Doh","Monopoly","Disney",
        "Marvel","StarWars","Pokémon","Nintendo","PlayStation",
        "Xbox","Funko","Melissa&Doug","VTech","LeapFrog",
        "SpinMaster","LittleTikes","Step2","Crayola","Ravensburger",
        "Asmodee","Bandai","TamashiiNations","Schleich","MegaBloks"
    };
    return toyBrands1;
}

// 182
if(product=="Luggage"){
    String[] travelBrands={
        "Samsonite","AmericanTourister","Tumi","Rimowa","Delsey",
        "Away","Travelpro","Briggs&Riley","Osprey","Gregory",
        "Patagonia","NorthFace","EagleCreek","Victorinox","Herschel",
        "JanSport","SwissGear","L.L.Bean","Timbuk2","PeakDesign",
        "Hartmann","Ricardo","Heys","ItLuggage","Bric’s",
        "Monos","Beis","Aer","Nomatic","Bellroy"
    };
    return travelBrands;
}

//183
if(product=="MusicalInstruments"){
    String[] musicBrands={
        "Fender","Gibson","Ibanez","Yamaha","Roland",
        "Korg","Casio","Moog","Steinway","Kawai",
        "Pearl","Tama","Zildjian","Sabian","Ludwig",
        "Martin","Taylor","Epiphone","Squier","PRS",
        "Marshall","Vox","Orange","Boss","Shure",
        "Sennheiser","Audio-Technica","Behringer","Focusrite","PreSonus"
    };
    return musicBrands;
}

// 184
if(product=="Photography"){
    String[] cameraBrands1={
        "Canon","Nikon","Sony","Fujifilm","Panasonic",
        "Olympus","Leica","Pentax","Hasselblad","GoPro",
        "DJI","Insta360","Ricoh","Sigma","Tamron",
        "Tokina","Zeiss","Samayang","Rokinon","Manfrotto",
        "Benro","Gitzo","PeakDesign","Lowepro","ThinkTank",
        "Sandisk","Lexar","ProGrade","Godox","Profoto"
    };
    return cameraBrands1;
}
//185
if(product=="Radios"){
    String[] radioBrands={
        "RuarkAudio","Revo","Roberts","Sangean","TivoliAudio",
        "Midland","Eton","CCrane","Sony","Panasonic",
        "Kaito","RunningSnail","Baofeng","Vitonos","Pure",
        "Majority","Viking","Grundig","Tecsun","Motorola",
        "Cobra","Uniden","Bearcat","Realistic","Zenith",
        "GraceDigital","Crosley","Bush","Yamaha","Denon"
    };
    return radioBrands;
}

//186
if(product=="WaterPurifiers"){
    String[] purifierBrands1={
        "Kent","Aquaguard","Pureit","AOSmith","Livpure",
        "V-Guard","Havells","BlueStar","LG","Panasonic",
        "Culligan","Brita","ZeroWater","Pur","Aquasana",
        "Geekpure","ExpressWater","iSpring","ApecWater","SpringWell",
        "Pelican","EcoWater","Kinetico","Whirlpool","Kenmore",
        "Brio","Avalon","DoctorFresh","Atomberg","UrbanCompany"
    };
    return purifierBrands1;
}

//187
if(product=="Headphones"){
    String[] audioBrands={
        "Sony","Bose","Sennheiser","Apple","Beats",
        "JBL","AudioTechnica","Skullcandy","boAt","Philips",
        "Bowers&Wilkins","Bang&Olufsen","Jabras","Marshall","AKG",
        "Beyerdynamic","Grado","Master&Dynamic","Soundcore","Anker",
        "Jaybird","V-Moda","Shure","Klipsch","Plantronics",
        "SteelSeries","HyperX","Razer","LogitechG","Corsair"
    };
    return audioBrands;
}

//188
if(product=="PowerTools"){
    String[] toolBrands={
        "DeWalt","Milwaukee","Makita","Bosch","Ryobi",
        "Black+Decker","Ridgid","Craftsman","Kobalt","Hilti",
        "MetaboHPT","Festool","Dremel","Skil","PorterCable",
        "Worx","Greenworks","EGO","Hart","Wen",
        "Stihl","Husqvarna","Toro","Honda","Echo",
        "Snap-on","Matco","IngersollRand","ChicagoPneumatic","Sunex"
    };
    return toolBrands;
}

//189
if(product=="Lighting"){
    String[] lightingBrands={
        "PhilipsHue","Signify","GE","Havells","Wipro",
        "Syska","Bajaj","Crompton","Osram","Lutron",
        "Lifx","Nanoleaf","TP-LinkKasa","FeitElectric","Sylvania",
        "Halonix","Surya","Eveready","Oreva","Corvi",
        "Goldmedal","Tisva","Panasonic","SchneiderElectric","Eaton",
        "Hubbell","Cree","AcuityBrands","Lodes","Flos"
    };
    return lightingBrands;
}

//190
if(product=="Bicycles"){
    String[] bikeBrands={
        "Trek","Specialized","Giant","Cannondale","Bianchi",
        "Scott","SantaCruz","Cervelo","Pinarello","BMC",
        "Merida","Canyon","Orbea","Kona","Marin",
        "Raleigh","Schwinn","GTBicycles","Mongoose","Diamondback",
        "Huffy","Brompton","Tern","Dahon","Fuji",
        "Yeti","Ibis","RockyMountain","Norco","Transition"
    };
    return bikeBrands;
}

//191
if(product=="Mattresses"){
    String[] beddingBrands={
        "Sealy","Serta","Simmons","Tempur-Pedic","Casper",
        "Purple","Helix","Saatva","Winkbed","Leesa",
        "Nectar","Bear","BrooklynBedding","DreamCloud","Tuft&Needle",
        "Amerisleep","Zinus","Lucid","Linenspa","Avocado",
        "Birch","SleepNumber","Stearns&Foster","Beautyrest","Puffy",
        "Layla","Nolah","GhostBed","Vaya","Plank"
    };
    return beddingBrands;
}

//192
if(product=="KitchenGadgets"){
    String[] gadgetBrands={
        "InstantPot","Ninja","Anova","Ecozy","Dreo",
        "Cosori","ChefIQ","KitchenAid","Vitamix","Blendtec",
        "Breville","Cuisinart","HamiltonBeach","Oster","Black+Decker",
        "MagicBullet","NutriBullet","Zojirushi","Tiger","Panasonic",
        "T-fal","GeorgeForeman","Crock-Pot","Dash","Presto",
        "Nespresso","Keurig","DeLonghi","Philips","Chefman"
    };
    return gadgetBrands;
}

//193
if(product=="CampingGear"){
    String[] campingBrands={
        "Coleman","REI","NorthFace","Patagonia","Marmot",
        "Columbia","BigAgnes","NEMO","SeaToSummit","Therm-a-Rest",
        "Osprey","Gregory","Kelty","BlackDiamond","Petzl",
        "BioLite","Jetboil","MSR","YETI","Stanley",
        "HydroFlask","CamelBak","KleanKanteen","MountainHardwear","OutdoorResearch",
        "GossamerGear","Zpacks","Hoka","Flextail","Exped"
    };
    return campingBrands;
}

// 194
if(product=="Microwaves"){
    String[] microwaveBrands1={
        "Panasonic","Samsung","LG","Whirlpool","Sharp",
        "Toshiba","Breville","Cuisinart","HamiltonBeach","Black+Decker",
        "GE","Kenmore","Farberware","Oster","MagicChef",
        "Galanz","Comfee","Dacor","KitchenAid","Maytag",
        "Amana","Frigidaire","Bosch","Miele","Haier",
        "Beko","IFB","Godrej","Voltas","Lloyd"
    };
    return microwaveBrands1;
}

// 195
if(product=="Refrigerators1"){
    String[] fridgeBrands1={
        "Samsung","LG","Whirlpool","GE","Frigidaire",
        "KitchenAid","Maytag","Kenmore","Bosch","Miele",
        "Sub-Zero","Viking","Thermador","Haier","Panasonic",
        "Hitachi","Mitsubishi","Sharp","Toshiba","Beko",
        "Hisense","V-Guard","Godrej","VoltasBeko","Liebherr",
        "SMEG","Fisher&Paykel","Dacor","Blomberg","JennAir"
    };
    return fridgeBrands1;
}

// 196
if(product=="ComputerPeripherals"){
    String[] compBrands={
        "Logitech","Razer","Corsair","SteelSeries","HyperX",
        "HP","Dell","Lenovo","Microsoft","Apple",
        "Asus","Acer","MSI","Alienware","Zowie",
        "CoolerMaster","Glorious","Keychron","Ducky","Filco",
        "Wacom","Huion","Samsung","Epson","Canon",
        "Brother","WesternDigital","Seagate","SanDisk","Kingston"
    };
    return compBrands;
}

// 197
if(product=="Laptops"){
    String[] laptopBrands1={
        "Apple","Dell","HP","Lenovo","Asus",
        "Acer","Microsoft","MSI","Razer","Samsung",
        "Gigabyte","Alienware","Huawei","Xiaomi","LG",
        "Panasonic","Fujitsu","Vaio","System76","Framework",
        "Dynabook","Google","Infinix","Realme","Honor",
        "Schenker","Purism","Chuwi","Teclast","Avita"
    };
    return laptopBrands1;
}

// 198
if(product=="Televisions"){
    String[] tvBrands1={
        "Samsung","Sony","LG","TCL","Hisense",
        "Vizio","Panasonic","Philips","Toshiba","Sharp",
        "Xiaomi","OnePlus","Realme","Skyworth","Haier",
        "Sanyo","JVC","Insignia","Element","RCA",
        "Westinghouse","Grundig","Loewe","Bangs&Olufsen","Vu",
        "Mi","Lloyd","Kodak","BPL","Thomson"
    };
    return tvBrands1;
}

// 199
if(product=="Gaming"){
    String[] gamingBrands={
        "Sony","Nintendo","Microsoft","Valve","Nvidia",
        "AsusROG","MSI","Alienware","LogitechG","Razer",
        "Corsair","SteelSeries","TurtleBeach","Scuf","Astro",
        "HyperX","Elgato","Oculus","HTC","Pico",
        "Sega","Atari","PowerA","8BitDo","MadCatz",
        "Thrustmaster","Fanatec","Hori","Victrix","BenQ"
    };
    return gamingBrands;
}

//200
if(product=="SecurityCameras"){
    String[] camBrands={
        "Arlo","Ring","Nest","Wyze","Eufy",
        "Blink","Hikvision","Dahua","Reolink","TP-LinkTapo",
        "Swann","Lorex","Amcrest","D-Link","Logitech",
        "Ezviz","Yi","Canary","SimpliSafe","ADT",
        "Vivint","Netatmo","Foscam","Axis","Ubiquiti",
        "Bosch","SamsungHanwha","Honeywell","Zmodo","Annke"
    };
    return camBrands;
}
return null;


}
}