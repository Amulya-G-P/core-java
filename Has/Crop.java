class Crop {
    int cropId;
    String name;
    Season season;

    public void getCropDetails() {
        System.out.println("Crop Id: " + cropId);
        System.out.println("Name: " + name);
        season.getSeasonDetails();
    }

    Crop() {}

    Crop(int cropId, String name, Season season) {
        this.cropId = cropId;
        this.name = name;
        this.season = season;
    }

    public boolean createSeason(Season season) {
        this.season = season;
        return true;
    }
}

