class SeriesExecutor
{
    public static void main(String[] args)
    {
        Series s1 = new Series();
        s1.seriesId = 1; 
		s1.seriesName = "Day Dreamer"; 
		s1.genre = "Sci-Fi"; 
		s1.numberOfSeasons = 4;

        Series s2 = new Series();
        s2.seriesId = 2; 
		s2.seriesName = "Money Heist";
		s2.genre = "Crime";
		s2.numberOfSeasons = 5;

        Series s3 = new Series();
        s3.seriesId = 3; 
		s3.seriesName = "Full Moon";
		s3.genre = "Drama";
		s3.numberOfSeasons = 5;

        Series s4 = new Series();
        s4.seriesId = 4; 
		s4.seriesName = "Game of Thrones"; 
		s4.genre = "Fantasy"; 
		s4.numberOfSeasons = 8;

        Series s5 = new Series();
        s5.seriesId = 5; 
		s5.seriesName = "Wednesday"; 
		s5.genre = "Mystery"; 
		s5.numberOfSeasons = 1;

        Series s6 = new Series();
        s6.seriesId = 6;
		s6.seriesName = "The Witcher";
		s6.genre = "Fantasy"; 
		s6.numberOfSeasons = 3;

        Series s7 = new Series();
        s7.seriesId = 7;
		s7.seriesName = "Dark"; 
		s7.genre = "Sci-Fi";
		s7.numberOfSeasons = 3;

        Series s8 = new Series();
        s8.seriesId = 8; 
		s8.seriesName = "Friends"; 
		s8.genre = "Comedy"; 
		s8.numberOfSeasons = 10;

        Series s9 = new Series();
        s9.seriesId = 9;
		s9.seriesName = "Lucifer";
		s9.genre = "Crime";
		s9.numberOfSeasons = 6;

        Series s10 = new Series();
        s10.seriesId = 10;
		s10.seriesName = "Peaky Blinders";
		s10.genre = "Crime";
		s10.numberOfSeasons = 6;

        Series s11 = new Series();
        s11.seriesId = 11;
		s11.seriesName = "Vikings";
		s11.genre = "History"; 
		s11.numberOfSeasons = 6;

        Series s12 = new Series();
        s12.seriesId = 12; 
		s12.seriesName = "Narcos";
		s12.genre = "Crime";
		s12.numberOfSeasons = 3;

        Series s13 = new Series();
        s13.seriesId = 13; 
		s13.seriesName = "The Boys";
		s13.genre = "Action"; 
		s13.numberOfSeasons = 3;

        Series s14 = new Series();
        s14.seriesId = 14;
		s14.seriesName = "Loki"; 
		s14.genre = "Sci-Fi"; 
		s14.numberOfSeasons = 2;

        Series s15 = new Series();
        s15.seriesId = 15;
		s15.seriesName = "Flash"; 
		s15.genre = "Action"; 
		s15.numberOfSeasons = 9;

        Series s16 = new Series();
        s16.seriesId = 16;
		s16.seriesName = "Arrow"; 
		s16.genre = "Action"; 
		s16.numberOfSeasons = 8;

        Series s17 = new Series();
        s17.seriesId = 17;
		s17.seriesName = "Supernatural"; 
		s17.genre = "Horror"; 
		s17.numberOfSeasons = 15;

        Series s18 = new Series();
        s18.seriesId = 18; 
		s18.seriesName = "Sherlock"; 
		s18.genre = "Mystery"; 
		s18.numberOfSeasons = 4;

        Series s19 = new Series();
        s19.seriesId = 19; 
		s19.seriesName = "Love is in air"; 
		s19.genre = "Drama"; 
		s19.numberOfSeasons = 4;

        Series s20 = new Series();
        s20.seriesId = 20;
		s20.seriesName = "House of the Dragon"; 
		s20.genre = "Fantasy"; 
		s20.numberOfSeasons = 1;


        Episode e1 = new Episode();
        e1.episodeId = 101; 
		e1.episodeName = "Episode 1";
		e1.duration = 45;
		e1.rating = 8.5;

        Episode e2 = new Episode();
        e2.episodeId = 102; 
		e2.episodeName = "Episode 2";
		e2.duration = 50; e2.rating = 8.7;

        Episode e3 = new Episode();
        e3.episodeId = 103;
		e3.episodeName = "Episode 3"; 
		e3.duration = 55;
		e3.rating = 9.0;

        Episode e4 = new Episode();
        e4.episodeId = 104;
		e4.episodeName = "Episode 4";
		e4.duration = 60; 
		e4.rating = 9.2;

        Episode e5 = new Episode();
        e5.episodeId = 105;
		e5.episodeName = "Episode 5";
		e5.duration = 40; 
		e5.rating = 8.3;

        Episode e6 = new Episode();
        e6.episodeId = 106; 
		e6.episodeName = "Episode 6"; 
		e6.duration = 48;
\		e6.rating = 8.8;

        Episode e7 = new Episode();
        e7.episodeId = 107; 
		e7.episodeName = "Episode 7";
		e7.duration = 52;
		e7.rating = 9.1;

        Episode e8 = new Episode();
        e8.episodeId = 108; 
		e8.episodeName = "Episode 8"; 
		e8.duration = 46; 
		e8.rating = 8.6;

        Episode e9 = new Episode();
        e9.episodeId = 109; 
		e9.episodeName = "Episode 9";
		e9.duration = 58;
		e9.rating = 9.3;

        Episode e10 = new Episode();
        e10.episodeId = 110; 
		e10.episodeName = "Episode 10";
		e10.duration = 44;
		e10.rating = 8.4;

        Episode e11 = new Episode();
        e11.episodeId = 111;
		e11.episodeName = "Episode 11";
		e11.duration = 47; 
		e11.rating = 8.9;

        Episode e12 = new Episode();
        e12.episodeId = 112; 
		e12.episodeName = "Episode 12";
		e12.duration = 53; 
		e12.rating = 9.0;

        Episode e13 = new Episode();
        e13.episodeId = 113;
		e13.episodeName = "Episode 13"; 
		e13.duration = 49;
		e13.rating = 8.7;

        Episode e14 = new Episode();
        e14.episodeId = 114; 
		e14.episodeName = "Episode 14"; 
		e14.duration = 57;
		e14.rating = 9.2;

        Episode e15 = new Episode();
        e15.episodeId = 115;
		e15.episodeName = "Episode 15"; 
		e15.duration = 42; 
		e15.rating = 8.5;

        Episode e16 = new Episode();
        e16.episodeId = 116; 
		e16.episodeName = "Episode 16"; 
		e16.duration = 51;
		e16.rating = 8.8;

        Episode e17 = new Episode();
        e17.episodeId = 117;
		e17.episodeName = "Episode 17"; 
		e17.duration = 59;
		e17.rating = 9.4;

        Episode e18 = new Episode();
        e18.episodeId = 118; 
		e18.episodeName = "Episode 18";
		e18.duration = 43;
		e18.rating = 8.6;

        Episode e19 = new Episode();
        e19.episodeId = 119;
		e19.episodeName = "Episode 19"; 
		e19.duration = 54; 
		e19.rating = 9.1;

        Episode e20 = new Episode();
        e20.episodeId = 120;
		e20.episodeName = "Episode 20";
		e20.duration = 45;
		e20.rating = 8.7;


        s1.episode = e1; 
		s1.getSeriesDetails();
        s2.episode = e2; 
		s2.getSeriesDetails();
        s3.episode = e3; 
		s3.getSeriesDetails();
        s4.episode = e4; 
		s4.getSeriesDetails();
        s5.episode = e5; 
		s5.getSeriesDetails();
        s6.episode = e6; 
		s6.getSeriesDetails();
        s7.episode = e7; 
		s7.getSeriesDetails();
        s8.episode = e8; 
		s8.getSeriesDetails();
        s9.episode = e9; 
		s9.getSeriesDetails();
        s10.episode = e10; 
		s10.getSeriesDetails();
        s11.episode = e11; 
		s11.getSeriesDetails();
        s12.episode = e12; 
		s12.getSeriesDetails();
        s13.episode = e13; 
		s13.getSeriesDetails();
        s14.episode = e14; 
		s14.getSeriesDetails();
        s15.episode = e15; 
		s15.getSeriesDetails();
        s16.episode = e16;
		s16.getSeriesDetails();
        s17.episode = e17; 
		s17.getSeriesDetails();
        s18.episode = e18;
		s18.getSeriesDetails();
        s19.episode = e19; 
		s19.getSeriesDetails();
        s20.episode = e20; 
		s20.getSeriesDetails();
    }
}