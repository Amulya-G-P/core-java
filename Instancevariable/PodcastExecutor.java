class PodcastExecutor
{
    public static void main(String[] args)
    {
        Podcast p1 = new Podcast();
        p1.podcastId = 1;
		p1.podcastName = "Tech Talk";
		p1.hostName = "Arjun"; 
		p1.numberOfEpisodes = 50;

        Podcast p2 = new Podcast();
        p2.podcastId = 2; 
		p2.podcastName = "Business Minds"; 
		p2.hostName = "Ravi"; 
		p2.numberOfEpisodes = 40;

        Podcast p3 = new Podcast();
        p3.podcastId = 3;
		p3.podcastName = "Health Tips"; 
		p3.hostName = "Sneha"; 
		p3.numberOfEpisodes = 30;

        Podcast p4 = new Podcast();
        p4.podcastId = 4; 
		p4.podcastName = "Startup Stories"; 
		p4.hostName = "Rahul"; 
		p4.numberOfEpisodes = 25;

        Podcast p5 = new Podcast();
        p5.podcastId = 5;
		p5.podcastName = "Movie Review"; 
		p5.hostName = "Kiran"; 
		p5.numberOfEpisodes = 60;

        Podcast p6 = new Podcast();
        p6.podcastId = 6;
		p6.podcastName = "Science World";
		p6.hostName = "Pooja";
		p6.numberOfEpisodes = 45;

        Podcast p7 = new Podcast();
        p7.podcastId = 7; 
		p7.podcastName = "History Time"; 
		p7.hostName = "Vijay"; 
		p7.numberOfEpisodes = 35;

        Podcast p8 = new Podcast();
        p8.podcastId = 8; 
		p8.podcastName = "Motivation Daily"; 
		p8.hostName = "Neha";
		p8.numberOfEpisodes = 55;

        Podcast p9 = new Podcast();
        p9.podcastId = 9;
		p9.podcastName = "Coding Show"; 
		p9.hostName = "Manoj"; 
		p9.numberOfEpisodes = 70;

        Podcast p10 = new Podcast();
        p10.podcastId = 10; 
		p10.podcastName = "Finance Talk";
		p10.hostName = "Suresh";
		p10.numberOfEpisodes = 20;

        Podcast p11 = new Podcast();
        p11.podcastId = 11; 
		p11.podcastName = "Travel Stories"; 
		p11.hostName = "Ramesh"; 
		p11.numberOfEpisodes = 33;

        Podcast p12 = new Podcast();
        p12.podcastId = 12; 
		p12.podcastName = "Food Lovers";
		p12.hostName = "Anita"; 
		p12.numberOfEpisodes = 44;

        Podcast p13 = new Podcast();
        p13.podcastId = 13; 
		p13.podcastName = "Sports Talk";
		p13.hostName = "Varun";
		p13.numberOfEpisodes = 38;

        Podcast p14 = new Podcast();
        p14.podcastId = 14;
		p14.podcastName = "News Hour";
		p14.hostName = "Kavya";
		p14.numberOfEpisodes = 80;

        Podcast p15 = new Podcast();
        p15.podcastId = 15;
		p15.podcastName = "Art & Culture";
		p15.hostName = "Meena";
		p15.numberOfEpisodes = 27;

        Podcast p16 = new Podcast();
        p16.podcastId = 16;
		p16.podcastName = "Education Point"; 
		p16.hostName = "Rohit";
		p16.numberOfEpisodes = 48;

        Podcast p17 = new Podcast();
        p17.podcastId = 17;
		p17.podcastName = "Gaming Zone";
		p17.hostName = "Sanjay"; 
		p17.numberOfEpisodes = 90;

        Podcast p18 = new Podcast();
        p18.podcastId = 18;
		p18.podcastName = "AI World";
		p18.hostName = "Deepak";
		p18.numberOfEpisodes = 22;

        Podcast p19 = new Podcast();
        p19.podcastId = 19;
		p19.podcastName = "Fitness Guide";
		p19.hostName = "Priya"; 
		p19.numberOfEpisodes = 36;

        Podcast p20 = new Podcast();
        p20.podcastId = 20; 
		p20.podcastName = "Music Beats"; 
		p20.hostName = "Amit";
		p20.numberOfEpisodes = 65;


        Guest g1 = new Guest();
        g1.guestId = 101;
		g1.guestName = "Dr. Sharma"; 
		g1.profession = "Scientist";
		g1.age = 45;

        Guest g2 = new Guest();
        g2.guestId = 102;
		g2.guestName = "Mr. Patel";
		g2.profession = "Businessman"; 
		g2.age = 50;

        Guest g3 = new Guest();
        g3.guestId = 103;
		g3.guestName = "Ms. Riya"; 
		g3.profession = "Doctor"; 
		g3.age = 35;

        Guest g4 = new Guest();
        g4.guestId = 104;
		g4.guestName = "Mr. Verma"; 
		g4.profession = "Entrepreneur"; 
		g4.age = 40;

        Guest g5 = new Guest();
        g5.guestId = 105;
		g5.guestName = "Mr. Raj";
		g5.profession = "Actor";
		g5.age = 38;

        Guest g6 = new Guest();
        g6.guestId = 106;
		g6.guestName = "Dr. Mehta";
		g6.profession = "Scientist";
		g6.age = 48;

        Guest g7 = new Guest();
        g7.guestId = 107;
		g7.guestName = "Mr. Khan";
		g7.profession = "Historian"; 
		g7.age = 52;

        Guest g8 = new Guest();
        g8.guestId = 108; 
		g8.guestName = "Ms. Neha"; 
		g8.profession = "Motivational Speaker"; 
		g8.age = 33;

        Guest g9 = new Guest();
        g9.guestId = 109; 
		g9.guestName = "Mr. Arun"; 
		g9.profession = "Software Engineer"; 
		g9.age = 29;

        Guest g10 = new Guest();
        g10.guestId = 110; 
		g10.guestName = "Mr. Das";
		g10.profession = "Finance Expert"; 
		g10.age = 46;

        Guest g11 = new Guest();
        g11.guestId = 111;
		g11.guestName = "Mr. Roy";
		g11.profession = "Traveler";
		g11.age = 41;

        Guest g12 = new Guest();
        g12.guestId = 112;
		g12.guestName = "Chef Anil";
		g12.profession = "Chef"; 
		g12.age = 39;

        Guest g13 = new Guest();
        g13.guestId = 113; 
		g13.guestName = "Mr. Virat";
		g13.profession = "Cricketer";
		g13.age = 36;

        Guest g14 = new Guest();
        g14.guestId = 114;
		g14.guestName = "Ms. Kavya";
		g14.profession = "Journalist";
		g14.age = 34;

        Guest g15 = new Guest();
        g15.guestId = 115; 
		g15.guestName = "Mr. Ravi"; 
		g15.profession = "Artist"; 
		g15.age = 42;

        Guest g16 = new Guest();
        g16.guestId = 116;
		g16.guestName = "Ms. Pooja";
		g16.profession = "Teacher";
		g16.age = 37;

        Guest g17 = new Guest();
        g17.guestId = 117;
		g17.guestName = "Mr. Gamer";
		g17.profession = "YouTuber"; 
		g17.age = 28;

        Guest g18 = new Guest();
        g18.guestId = 118; 
		g18.guestName = "Mr. AI"; 
		g18.profession = "AI Engineer";
		g18.age = 31;

        Guest g19 = new Guest();
        g19.guestId = 119; 
		g19.guestName = "Mr. Fitness"; 
		g19.profession = "Trainer";
		g19.age = 35;

        Guest g20 = new Guest();
        g20.guestId = 120; 
		g20.guestName = "Mr. Music"; 
		g20.profession = "Musician"; 
		g20.age = 30;


        p1.guest = g1;
		p1.getPodcastDetails();
        p2.guest = g2;
		p2.getPodcastDetails();
        p3.guest = g3;
		p3.getPodcastDetails();
        p4.guest = g4;
		p4.getPodcastDetails();
        p5.guest = g5;
		p5.getPodcastDetails();
        p6.guest = g6;
		p6.getPodcastDetails();
        p7.guest = g7;
		p7.getPodcastDetails();
        p8.guest = g8;
		p8.getPodcastDetails();
        p9.guest = g9;
		p9.getPodcastDetails();
        p10.guest = g10;
		p10.getPodcastDetails();
        p11.guest = g11; 
		p11.getPodcastDetails();
        p12.guest = g12;
		p12.getPodcastDetails();
        p13.guest = g13;
		p13.getPodcastDetails();
        p14.guest = g14;
		p14.getPodcastDetails();
        p15.guest = g15;
		p15.getPodcastDetails();
        p16.guest = g16; 
		p16.getPodcastDetails();
        p17.guest = g17;
		p17.getPodcastDetails();
        p18.guest = g18; 
		p18.getPodcastDetails();
        p19.guest = g19;
		p19.getPodcastDetails();
        p20.guest = g20;
		p20.getPodcastDetails();
    }
}