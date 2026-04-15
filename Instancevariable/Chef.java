class Chef
{
    int chefId;
    String chefName;
    String specialty;
    int experience;

    public void getChefDetails()
    {
        System.out.println("Chef Id: " + chefId);
        System.out.println("Chef Name: " + chefName);
        System.out.println("Specialty: " + specialty);
        System.out.println("Experience: " + experience + " years");
        System.out.println("------------------------------------");
    }
}