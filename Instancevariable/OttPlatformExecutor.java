class OttPlatformExecutor
{
    public static void main(String[] args)
    {
        OttPlatform o1 = new OttPlatform();
        o1.platformId = 1;
		o1.platformName = "Netflix"; 
		o1.language = "English";
		o1.numberOfMovies = 5000;

        OttPlatform o2 = new OttPlatform();
        o2.platformId = 2; 
		o2.platformName = "Amazon Prime";
		o2.language = "Multi Language"; 
		o2.numberOfMovies = 4000;

        OttPlatform o3 = new OttPlatform();
        o3.platformId = 3; 
		o3.platformName = "Disney+ Hotstar";
		o3.language = "Hindi"; 
		o3.numberOfMovies = 3500;

        OttPlatform o4 = new OttPlatform();
        o4.platformId = 4; 
		o4.platformName = "Zee5"; 
		o4.language = "Hindi";
		o4.numberOfMovies = 3000;

        OttPlatform o5 = new OttPlatform();
        o5.platformId = 5; 
		o5.platformName = "Sony Liv"; 
		o5.language = "Hindi"; 
		o5.numberOfMovies = 2500;

        OttPlatform o6 = new OttPlatform();
        o6.platformId = 6;
		o6.platformName = "Sun NXT"; 
		o6.language = "Tamil";
		o6.numberOfMovies = 2000;

        OttPlatform o7 = new OttPlatform();
        o7.platformId = 7;
		o7.platformName = "Aha"; 
		o7.language = "Telugu";
		o7.numberOfMovies = 1500;

        OttPlatform o8 = new OttPlatform();
        o8.platformId = 8;
		o8.platformName = "Voot"; 
		o8.language = "Hindi"; 
		o8.numberOfMovies = 1800;

        OttPlatform o9 = new OttPlatform();
        o9.platformId = 9; 
		o9.platformName = "Jio Cinema"; 
		o9.language = "Multi Language"; 
		o9.numberOfMovies = 2200;

        OttPlatform o10 = new OttPlatform();
        o10.platformId = 10; 
		o10.platformName = "MX Player";
		o10.language = "Hindi";
		o10.numberOfMovies = 1700;

        OttPlatform o11 = new OttPlatform();
        o11.platformId = 11;
		o11.platformName = "Netflix";
		o11.language = "English";
		o11.numberOfMovies = 5200;

        OttPlatform o12 = new OttPlatform();
        o12.platformId = 12; 
		o12.platformName = "Amazon Prime"; 
		o12.language = "Multi Language"; 
		o12.numberOfMovies = 4200;

        OttPlatform o13 = new OttPlatform();
        o13.platformId = 13; 
		o13.platformName = "Disney+ Hotstar";
		o13.language = "Hindi";
		o13.numberOfMovies = 3600;

        OttPlatform o14 = new OttPlatform();
        o14.platformId = 14;
		o14.platformName = "Zee5"; 
		o14.language = "Hindi"; 
		o14.numberOfMovies = 3100;

        OttPlatform o15 = new OttPlatform();
        o15.platformId = 15; 
		o15.platformName = "Sony Liv";
		o15.language = "Hindi"; 
		o15.numberOfMovies = 2600;

        OttPlatform o16 = new OttPlatform();
        o16.platformId = 16;
		o16.platformName = "Sun NXT"; 
		o16.language = "Tamil"; 
		o16.numberOfMovies = 2100;

        OttPlatform o17 = new OttPlatform();
        o17.platformId = 17; 
		o17.platformName = "Aha"; 
		o17.language = "Telugu"; 
		o17.numberOfMovies = 1600;

        OttPlatform o18 = new OttPlatform();
        o18.platformId = 18; 
		o18.platformName = "Voot"; 
		o18.language = "Hindi"; 
		o18.numberOfMovies = 1900;

        OttPlatform o19 = new OttPlatform();
        o19.platformId = 19; 
		o19.platformName = "Jio Cinema";
		o19.language = "Multi Language"; 
		o19.numberOfMovies = 2300;

        OttPlatform o20 = new OttPlatform();
        o20.platformId = 20;
		o20.platformName = "MX Player";
		o20.language = "Hindi";
		o20.numberOfMovies = 1750;

        Subscription s1 = new Subscription();
        s1.subscriptionId = 101;
		s1.planName = "Basic"; 
		s1.duration = 1;
		s1.price = 199; 
		s1.quality = "HD";

        Subscription s2 = new Subscription();
        s2.subscriptionId = 102; 
		s2.planName = "Standard"; 
		s2.duration = 3; 
		s2.price = 499; 
		s2.quality = "Full HD";

        Subscription s3 = new Subscription();
        s3.subscriptionId = 103;
		s3.planName = "Premium";
		s3.duration = 6; 
		s3.price = 799; 
		s3.quality = "4K";

        Subscription s4 = new Subscription();
        s4.subscriptionId = 104; 
		s4.planName = "Basic"; 
		s4.duration = 1;
		s4.price = 149; 
		s4.quality = "HD";

        Subscription s5 = new Subscription();
        s5.subscriptionId = 105; 
		s5.planName = "Standard";
		s5.duration = 3; 
		s5.price = 399;
		s5.quality = "Full HD";

        Subscription s6 = new Subscription();
        s6.subscriptionId = 106; 
		s6.planName = "Premium"; 
		s6.duration = 6; 
		s6.price = 699; 
		s6.quality = "4K";

        Subscription s7 = new Subscription();
        s7.subscriptionId = 107;
		s7.planName = "Basic"; 
		s7.duration = 1; 
		s7.price = 99; 
		s7.quality = "HD";

        Subscription s8 = new Subscription();
        s8.subscriptionId = 108; 
		s8.planName = "Standard";
		s8.duration = 3; 
		s8.price = 299; 
		s8.quality = "Full HD";

        Subscription s9 = new Subscription();
        s9.subscriptionId = 109; 
		s9.planName = "Premium"; 
		s9.duration = 6;
		s9.price = 599; 
		s9.quality = "4K";

        Subscription s10 = new Subscription();
        s10.subscriptionId = 110; 
		s10.planName = "Basic"; 
		s10.duration = 1; 
		s10.price = 79;
		s10.quality = "HD";

        Subscription s11 = new Subscription();
        s11.subscriptionId = 111; 
		s11.planName = "Standard";
		s11.duration = 3; 
		s11.price = 499; 
		s11.quality = "Full HD";

        Subscription s12 = new Subscription();
        s12.subscriptionId = 112; 
		s12.planName = "Premium"; 
		s12.duration = 6; 
		s12.price = 899; 
		s12.quality = "4K";

        Subscription s13 = new Subscription();
        s13.subscriptionId = 113;
		s13.planName = "Basic"; 
		s13.duration = 1; 
		s13.price = 129; 
		s13.quality = "HD";

        Subscription s14 = new Subscription();
        s14.subscriptionId = 114;
		s14.planName = "Standard";
		s14.duration = 3; 
		s14.price = 349; 
		s14.quality = "Full HD";

        Subscription s15 = new Subscription();
        s15.subscriptionId = 115; 
		s15.planName = "Premium";
		s15.duration = 6;
		s15.price = 749; 
		s15.quality = "4K";

        Subscription s16 = new Subscription();
        s16.subscriptionId = 116;
		s16.planName = "Basic"; 
		s16.duration = 1; 
		s16.price = 109; 
		s16.quality = "HD";

        Subscription s17 = new Subscription();
        s17.subscriptionId = 117; 
		s17.planName = "Standard"; 
		s17.duration = 3;
		s17.price = 379; 
		s17.quality = "Full HD";

        Subscription s18 = new Subscription();
        s18.subscriptionId = 118;
		s18.planName = "Premium";
		s18.duration = 6; 
		s18.price = 699; 
		s18.quality = "4K";

        Subscription s19 = new Subscription();
        s19.subscriptionId = 119;
		s19.planName = "Basic";
		s19.duration = 1; 
		s19.price = 89;
		s19.quality = "HD";

        Subscription s20 = new Subscription();
        s20.subscriptionId = 120;
		s20.planName = "Standard"; 
		s20.duration = 3; 
		s20.price = 399;
		s20.quality = "Full HD";

        o1.subscription = s1; 
		o1.getOttPlatformDetails();
        o2.subscription = s2; 
		o2.getOttPlatformDetails();
        o3.subscription = s3; 
		o3.getOttPlatformDetails();
        o4.subscription = s4; 
		o4.getOttPlatformDetails();
        o5.subscription = s5; 
		o5.getOttPlatformDetails();
        o6.subscription = s6; 
		o6.getOttPlatformDetails();
        o7.subscription = s7; 
		o7.getOttPlatformDetails();
        o8.subscription = s8; 
		o8.getOttPlatformDetails();
        o9.subscription = s9; 
		o9.getOttPlatformDetails();
        o10.subscription = s10; 
		o10.getOttPlatformDetails();
        o11.subscription = s11;
		o11.getOttPlatformDetails();
        o12.subscription = s12; 
		o12.getOttPlatformDetails();
        o13.subscription = s13; 
		o13.getOttPlatformDetails();
        o14.subscription = s14; 
		o14.getOttPlatformDetails();
        o15.subscription = s15; 
		o15.getOttPlatformDetails();
        o16.subscription = s16; 
		o16.getOttPlatformDetails();
        o17.subscription = s17; 
		o17.getOttPlatformDetails();
        o18.subscription = s18; 
		o18.getOttPlatformDetails();
        o19.subscription = s19; 
		o19.getOttPlatformDetails();
        o20.subscription = s20;
		o20.getOttPlatformDetails();
    }
}