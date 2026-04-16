class Factory
{
    int factoryId;
    String factoryName;
    String location;
    int numberOfWorkers;
    Machine machine;

    public void getFactoryDetails()
    {
        System.out.println("Factory Id: " + factoryId);
        System.out.println("Factory Name: " + factoryName);
        System.out.println("Location: " + location);
        System.out.println("Number Of Workers: " + numberOfWorkers);

        machine.getMachineDetails();
    }
}