class Freelancer
{
    int freelancerId;
    String freelancerName;
    String skill;
    int experience;
    Client client;

    public void getFreelancerDetails()
    {
        System.out.println("Freelancer Id: " + freelancerId);
        System.out.println("Freelancer Name: " + freelancerName);
        System.out.println("Skill: " + skill);
        System.out.println("Experience: " + experience + " years");

        client.getClientDetails();
    }
}