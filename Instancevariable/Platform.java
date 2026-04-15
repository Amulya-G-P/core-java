class Platform
{
    int platformId;
    String platformName;
    int capacity;
    String type;
    int length;

    public void getPlatformDetails()
    {
        System.out.println("Platform Id: " + platformId);
        System.out.println("Platform Name: " + platformName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Type: " + type);
        System.out.println("Length: " + length + " meters");
        System.out.println("-----------------------------------");
    }
}