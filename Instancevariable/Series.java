class Series
{
    int seriesId;
    String seriesName;
    String genre;
    int numberOfSeasons;
    Episode episode;

    public void getSeriesDetails()
    {
        System.out.println("Series Id: " + seriesId);
        System.out.println("Series Name: " + seriesName);
        System.out.println("Genre: " + genre);
        System.out.println("Number Of Seasons: " + numberOfSeasons);

        episode.getEpisodeDetails();
    }
}