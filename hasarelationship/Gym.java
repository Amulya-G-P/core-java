class Gym
{
    int gymId;
    String gymName;
    String location;
    int numberOfMembers;
    Trainer trainer;

    public void getGymDetails()
    {
        System.out.println("Gym Id: " + gymId);
        System.out.println("Gym Name: " + gymName);
        System.out.println("Location: " + location);
        System.out.println("Number Of Members: " + numberOfMembers);

        trainer.getTrainerDetails();
    }
}