class Subscription
{
    int subscriptionId;
    String planName;
    int duration;
    int price;
    String quality;

    public void getSubscriptionDetails()
    {
        System.out.println("Subscription Id: " + subscriptionId);
        System.out.println("Plan Name: " + planName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Price: " + price);
        System.out.println("Quality: " + quality);
        System.out.println("-----------------------------------");
    }
}