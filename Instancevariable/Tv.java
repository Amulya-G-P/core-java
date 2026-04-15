class Tv
{
    int tvId;
    String brand;
    int screenSize;
    String type;
    Remote remote;

    public void getTvDetails()
    {
        System.out.println("TV Id: " + tvId);
        System.out.println("Brand: " + brand);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Type: " + type);

        remote.getRemoteDetails();
    }
}