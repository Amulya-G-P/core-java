class Movie
{
    int movieId;
    String movieName;
    String language;
    int duration;
    Actor actor;

    public void getMovieDetails()
    {
        System.out.println("Movie Id: " + movieId);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Language: " + language);
        System.out.println("Duration: " + duration + " minutes");

        actor.getActorDetails();
    }
}