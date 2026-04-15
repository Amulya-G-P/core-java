class AmazonPrime
{
	static String kannadamovies[]={"Love Mocktail","Dia","Kantara","Birbal","Kavaludaari","Rathnan Prapancha","Ikkat","One cut Two cut","French Biriyani","Yuvarathnaa","Kotigobba 3","Act 1978","Gantumoote","Ulidavaru Kandanthe","Jai Bhima","Sapta Sagaradaache Ello – Side A","Sapta Sagaradaache Ello – Side B","Meja Suri","Meka Suri 2","Firefly","Sees Kaddi","Blink","Shakahari","Humble Politician Nograj","Happy New Year","Raajakumara","Katha Sangama","Tagaru","Pailwaan","Man of the Match"};
	static String hindimovies[]={"Be Happy","Tiku weds Sheru","Jalsa","Sardar Udham","Mirzapur","Badla","Drishyam","Shershaah 2","Sooryavanshi","Bell Bottom","Rakta Charitra","Company","Shootout at Lokhandwala","Vaastav: The Reality","O’Romeo","Runway 34","Thank God","Jug Jug Jeeyo","Govinda Naam Mera","Rocky Aur Rani Ki Prem Kahani","Aye Watan…Mere Watan","Ram Setu","Majaa Maa","Neeyat","Phone Bhoot","Fukrey 3","Jee Le Zara","War","Gold","Udaan"};
	static String tamilmovies[]={"Saani Kaayidham","Jai Bhim","Maargan","Kombuseevi","96","Pariyerum Perumal","Asuran","Anbe Sivam","Uriyadi","Peranbu","Iruvar ","Nayakan","Adhe Kangal","Aruuvi","Kaala","Theeran Adhigaaram Ondru","Thanal","Soorarai Pottru","Peri","Rangoli","Pudhupettai","NotA","Tamil Padam 2","Adutha Veedu","Magamuni","Sathuranga Vettai ","Madras","Maya","Nenjam Marappathillai","Kaakha Kaakha"};
	static String telgumovies[]={"Aravinda Sametha Veera Raghava","Bhai","DJ","Manmadhudu 2","Bheemla Nayak","Red","Agent Sai Srinivasa Athreya","Sarileru Neekevvaru","Ala Vaikunthapuramulo","Gopala Gopala","F2: Fun and Frustration","F3: Fun and Frustration","Nenu Local","Kalki","Jaanu","Chitralahari","Thank You","Anando Brahma","Varisu","Hunt","Ekkadiki Pothavu Chinnavada","Sarangapani Jathakam","Karthikeya","Tarun Bhascker’s films","Paagal","Pushpa: The Rule","Maharshi","Saaho","Gatham","Nishabdham"};
	static String malyalammovies[]={"No Man’s Land","Sufiyum Sujatayum","Bhramam","Fourth RIver","Sara’s","C U Soon","Saajan Bakery Since 1962","Drishyam 2","Abhilasham","The Priest","Anchakkallakokkan: Porattu","Premalu","Lucifer","Joji","Kumbalangi Nights","Ayyappanum Koshiyum","Helen","Android Kunjappan Ver 5.25","Unda","Jallikattu","Home","Kuruthi","Aavesham","Pada","Malayankunju","Jo and Jo","Jibooty","Naradhan","Veyil","Pallotty"};
	static String englishmovies[]={"Terminator 2: Judgment Day","The Matrix","Ready Player One","The Wrecking Crew","La La Land","RoboCop","The Prestige","One Night in Miami","Blow the Man Down","Barbershop","The Big Lebowski","The Other Guys","The Idea of You","Sinners","Weapon","Black Bag","To Live and Die in L.A.","The First Omen","No Time to Die","Casino Royale","Spider-Man: No Way Home","Ready Player One","Blow the Man Down","Kung Fu Panda 4","Madagascar 3: Europe’s Most Wanted","Sherk 2","The Boss Baby","Fight Club","Forrest Gump","The Usual Suspects"};
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
		System.out.println("Kannada Movies are:"\n);
		for(String s:kannadamovies)
			System.out.println(s);
	}
	static void getHindiMovies()
	{
		System.out.println("Hindi Movies are:"\n);
		for(String s:hindimovies)
			System.out.println(s);
	}
	static void getTamilMovies()
	{
		System.out.println("Tamil Movies are:"\n);
		for(String s:tamilmovies)
			System.out.println(s);
	}
	static void getTelguMovies()
	{
		System.out.println("Telgu Movies are:"\n);
		for(String s:telgumovies)
			System.out.println(s);
	}
	static void getMalyalamMovies()
	{
		System.out.println("Malyalam Movies are:"\n);
		for(String s:malyalammovies)
			System.out.println(s);
	}
	static void getEnglishMovies()
	{
		System.out.println("English Movies are:"\n);
		for(String s:englishmovies)
			System.out.println(s);
	}
}	
		