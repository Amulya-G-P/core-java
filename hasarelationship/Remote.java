class Remote
{
    int remoteId;
    String remoteBrand;
    int batteryCapacity;
    String color;
    int price;

    public void getRemoteDetails()
    {
        System.out.println("Remote Id: " + remoteId);
        System.out.println("Remote Brand: " + remoteBrand);
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("-----------------------------------");
    }
}