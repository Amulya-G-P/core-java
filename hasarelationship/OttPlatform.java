class OttPlatform
{
    int platformId;
    String platformName;
    String language;
    int numberOfMovies;
    Subscription subscription;

    public void getOttPlatformDetails()
    {
        System.out.println("Platform Id: " + platformId);
        System.out.println("Platform Name: " + platformName);
        System.out.println("Language: " + language);
        System.out.println("Number Of Movies: " + numberOfMovies);

        subscription.getSubscriptionDetails();
    }
}