class RailwayStation
{
    int stationId;
    String stationName;
    String location;
    int numberOfPlatforms;
    Platform platform;

    public void getRailwayStationDetails()
    {
        System.out.println("Station Id: " + stationId);
        System.out.println("Station Name: " + stationName);
        System.out.println("Location: " + location);
        System.out.println("Number Of Platforms: " + numberOfPlatforms);

        platform.getPlatformDetails();
    }
}