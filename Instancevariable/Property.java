class Property
{
    int propertyId;
    String propertyType;
    int price;
    String area;
    int size;

    public void getPropertyDetails()
    {
        System.out.println("Property Id: " + propertyId);
        System.out.println("Property Type: " + propertyType);
        System.out.println("Price: " + price);
        System.out.println("Area: " + area);
        System.out.println("Size: " + size + " sqft");
        System.out.println("-----------------------------------");
    }
}