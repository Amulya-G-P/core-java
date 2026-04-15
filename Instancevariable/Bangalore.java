class Bangalore
{
    int cityId;
    String cityName;
    String state;
    int population;
    MallOfAsia mallOfAsia;

    public void getBangaloreDetails()
    {
        System.out.println("City Id: " + cityId);
        System.out.println("City Name: " + cityName);
        System.out.println("State: " + state);
        System.out.println("Population: " + population);

        mallOfAsia.getMallDetails();
    }
}