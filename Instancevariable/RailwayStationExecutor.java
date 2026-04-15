class RailwayStationExecutor
{
    public static void main(String[] args)
    {
        RailwayStation r1 = new RailwayStation();
        r1.stationId = 1; 
		r1.stationName = "KSR Bengaluru"; 
		r1.location = "Bangalore";
		r1.numberOfPlatforms = 10;

        RailwayStation r2 = new RailwayStation();
        r2.stationId = 2;
		r2.stationName = "Mysuru Junction";
		r2.location = "Mysuru";
		r2.numberOfPlatforms = 6;

        RailwayStation r3 = new RailwayStation();
        r3.stationId = 3;
		r3.stationName = "Chennai Central"; 
		r3.location = "Chennai";
		r3.numberOfPlatforms = 12;

        RailwayStation r4 = new RailwayStation();
        r4.stationId = 4;
		r4.stationName = "Hyderabad Deccan";
		r4.location = "Hyderabad"; 
		r4.numberOfPlatforms = 8;

        RailwayStation r5 = new RailwayStation();
        r5.stationId = 5; 
		r5.stationName = "Mumbai CST";
		r5.location = "Mumbai";
		r5.numberOfPlatforms = 18;

        RailwayStation r6 = new RailwayStation();
        r6.stationId = 6; 
		r6.stationName = "Delhi Junction";
		r6.location = "Delhi";
		r6.numberOfPlatforms = 16;

        RailwayStation r7 = new RailwayStation();
        r7.stationId = 7; 
		r7.stationName = "Howrah Junction";
		r7.location = "Kolkata"; 
		r7.numberOfPlatforms = 23;

        RailwayStation r8 = new RailwayStation();
        r8.stationId = 8;
		r8.stationName = "Pune Junction";
		r8.location = "Pune"; 
		r8.numberOfPlatforms = 7;

        RailwayStation r9 = new RailwayStation();
        r9.stationId = 9;
		r9.stationName = "Jaipur Junction";
		r9.location = "Jaipur";
		r9.numberOfPlatforms = 9;

        RailwayStation r10 = new RailwayStation();
        r10.stationId = 10; 
		r10.stationName = "Ahmedabad Junction";
		r10.location = "Ahmedabad"; 
		r10.numberOfPlatforms = 12;

        RailwayStation r11 = new RailwayStation();
        r11.stationId = 11;
		r11.stationName = "Bhopal Junction";
		r11.location = "Bhopal";
		r11.numberOfPlatforms = 6;

        RailwayStation r12 = new RailwayStation();
        r12.stationId = 12;
		r12.stationName = "Nagpur Junction";
		r12.location = "Nagpur"; 
		r12.numberOfPlatforms = 8;

        RailwayStation r13 = new RailwayStation();
        r13.stationId = 13; 
		r13.stationName = "Goa Madgaon";
		r13.location = "Goa"; 
		r13.numberOfPlatforms = 5;

        RailwayStation r14 = new RailwayStation();
        r14.stationId = 14;
		r14.stationName = "Vijayawada Junction"; 
		r14.location = "Vijayawada";
		r14.numberOfPlatforms = 10;

        RailwayStation r15 = new RailwayStation();
        r15.stationId = 15;
		r15.stationName = "Coimbatore Junction";
		r15.location = "Coimbatore"; 
		r15.numberOfPlatforms = 6;

        RailwayStation r16 = new RailwayStation();
        r16.stationId = 16;
		r16.stationName = "Patna Junction";
		r16.location = "Patna"; 
		r16.numberOfPlatforms = 10;

        RailwayStation r17 = new RailwayStation();
        r17.stationId = 17; 
		r17.stationName = "Lucknow Junction"; 
		r17.location = "Lucknow";
		r17.numberOfPlatforms = 8;

        RailwayStation r18 = new RailwayStation();
        r18.stationId = 18;
		r18.stationName = "Surat Station";
		r18.location = "Surat"; 
		r18.numberOfPlatforms = 4;

        RailwayStation r19 = new RailwayStation();
        r19.stationId = 19;
		r19.stationName = "Indore Junction"; 
		r19.location = "Indore";
		r19.numberOfPlatforms = 6;

        RailwayStation r20 = new RailwayStation();
        r20.stationId = 20; 
		r20.stationName = "Trivandrum Central";
		r20.location = "Kerala"; 
		r20.numberOfPlatforms = 8;


        Platform p1 = new Platform();
        p1.platformId = 101;
		p1.platformName = "PF1";
		p1.capacity = 500;
		p1.type = "Express"; 
		p1.length = 600;

        Platform p2 = new Platform();
        p2.platformId = 102;
		p2.platformName = "PF2";
		p2.capacity = 400;
		p2.type = "Local"; 
		p2.length = 450;

        Platform p3 = new Platform();
        p3.platformId = 103;
		p3.platformName = "PF3";
		p3.capacity = 600; 
		p3.type = "Express";
		p3.length = 700;

        Platform p4 = new Platform();
        p4.platformId = 104;
		p4.platformName = "PF4";
		p4.capacity = 350;
		p4.type = "Local";
		p4.length = 400;

        Platform p5 = new Platform();
        p5.platformId = 105;
		p5.platformName = "PF5"; 
		p5.capacity = 700; 
		p5.type = "Express";
		p5.length = 750;

        Platform p6 = new Platform();
        p6.platformId = 106;
		p6.platformName = "PF6"; 
		p6.capacity = 300;
		p6.type = "Local";
		p6.length = 350;

        Platform p7 = new Platform();
        p7.platformId = 107; 
		p7.platformName = "PF7";
		p7.capacity = 450; 
		p7.type = "Express";
		p7.length = 500;

        Platform p8 = new Platform();
        p8.platformId = 108;
		p8.platformName = "PF8"; 
		p8.capacity = 380;
		p8.type = "Local"; 
		p8.length = 420;

        Platform p9 = new Platform();
        p9.platformId = 109;
		p9.platformName = "PF9";
		p9.capacity = 520;
		p9.type = "Express";
		p9.length = 580;

        Platform p10 = new Platform();
        p10.platformId = 110; 
		p10.platformName = "PF10";
		p10.capacity = 410;
		p10.type = "Local"; 
		p10.length = 460;

        Platform p11 = new Platform();
        p11.platformId = 111; 
		p11.platformName = "PF11";
		p11.capacity = 600; 
		p11.type = "Express";
		p11.length = 650;

        Platform p12 = new Platform();
        p12.platformId = 112; 
		p12.platformName = "PF12";
		p12.capacity = 320; 
		p12.type = "Local";
		p12.length = 360;

        Platform p13 = new Platform();
        p13.platformId = 113;
		p13.platformName = "PF13"; 
		p13.capacity = 550; 
		p13.type = "Express";
		p13.length = 600;

        Platform p14 = new Platform();
        p14.platformId = 114;
		p14.platformName = "PF14"; 
		p14.capacity = 360;
		p14.type = "Local"; 
		p14.length = 400;

        Platform p15 = new Platform();
        p15.platformId = 115;
		p15.platformName = "PF15"; 
		p15.capacity = 720; 
		p15.type = "Express";
		p15.length = 800;

        Platform p16 = new Platform();
        p16.platformId = 116; 
		p16.platformName = "PF16";
		p16.capacity = 280;
		p16.type = "Local"; 
		p16.length = 320;

        Platform p17 = new Platform();
        p17.platformId = 117;
		p17.platformName = "PF17";
		p17.capacity = 500; 
		p17.type = "Express";
		p17.length = 550;

        Platform p18 = new Platform();
        p18.platformId = 118;
		p18.platformName = "PF18";
		p18.capacity = 390; 
		p18.type = "Local";
		p18.length = 430;

        Platform p19 = new Platform();
        p19.platformId = 119;
		p19.platformName = "PF19";
		p19.capacity = 610;
		p19.type = "Express";
		p19.length = 670;

        Platform p20 = new Platform();
        p20.platformId = 120;
		p20.platformName = "PF20"; 
		p20.capacity = 430; 
		p20.type = "Local";
		p20.length = 480;


        r1.platform = p1;
		r1.getRailwayStationDetails();
        r2.platform = p2; 
		r2.getRailwayStationDetails();
        r3.platform = p3;
		r3.getRailwayStationDetails();
        r4.platform = p4;
		r4.getRailwayStationDetails();
        r5.platform = p5;
		r5.getRailwayStationDetails();
        r6.platform = p6; 
		r6.getRailwayStationDetails();
        r7.platform = p7; 
		r7.getRailwayStationDetails();
        r8.platform = p8; 
		r8.getRailwayStationDetails();
        r9.platform = p9; 
		r9.getRailwayStationDetails();
        r10.platform = p10;
		r10.getRailwayStationDetails();
        r11.platform = p11; 
		r11.getRailwayStationDetails();
        r12.platform = p12;
		r12.getRailwayStationDetails();
        r13.platform = p13; 
		r13.getRailwayStationDetails();
        r14.platform = p14; 
		r14.getRailwayStationDetails();
        r15.platform = p15; 
		r15.getRailwayStationDetails();
        r16.platform = p16;
		r16.getRailwayStationDetails();
        r17.platform = p17; 
		r17.getRailwayStationDetails();
        r18.platform = p18; 
		r18.getRailwayStationDetails();
        r19.platform = p19;
		r19.getRailwayStationDetails();
        r20.platform = p20;
		r20.getRailwayStationDetails();
    }
}