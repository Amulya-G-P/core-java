class Episode
{
    int episodeId;
    String episodeName;
    int duration;
    double rating;

    public void getEpisodeDetails()
    {
        System.out.println("Episode Id: " + episodeId);
        System.out.println("Episode Name: " + episodeName);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Rating: " + rating);
        System.out.println("-----------------------------------");
    }
}