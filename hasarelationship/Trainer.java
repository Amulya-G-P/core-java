class Trainer
{
    int trainerId;
    String trainerName;
    int experience;
    String specialization;
    int salary;

    public void getTrainerDetails()
    {
        System.out.println("Trainer Id: " + trainerId);
        System.out.println("Trainer Name: " + trainerName);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Specialization: " + specialization);
        System.out.println("Salary: " + salary);
        System.out.println("-----------------------------------");
    }
}