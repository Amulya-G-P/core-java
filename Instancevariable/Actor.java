class Actor
{
    int actorId;
    String actorName;
    int age;
    String gender;
    int numberOfMovies;

    public void getActorDetails()
    {
        System.out.println("Actor Id: " + actorId);
        System.out.println("Actor Name: " + actorName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Number Of Movies: " + numberOfMovies);
        System.out.println("-----------------------------------");
    }
}