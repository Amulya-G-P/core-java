class RealEstate
{
    int realEstateId;
    String companyName;
    String location;
    int numberOfProperties;
    Property property;

    public void getRealEstateDetails()
    {
        System.out.println("RealEstate Id: " + realEstateId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Location: " + location);
        System.out.println("Number Of Properties: " + numberOfProperties);

        property.getPropertyDetails();
    }
}