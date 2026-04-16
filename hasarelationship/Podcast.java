class Podcast
{
    int podcastId;
    String podcastName;
    String hostName;
    int numberOfEpisodes;
    Guest guest;

    public void getPodcastDetails()
    {
        System.out.println("Podcast Id: " + podcastId);
        System.out.println("Podcast Name: " + podcastName);
        System.out.println("Host Name: " + hostName);
        System.out.println("Number Of Episodes: " + numberOfEpisodes);

        guest.getGuestDetails();
    }
}