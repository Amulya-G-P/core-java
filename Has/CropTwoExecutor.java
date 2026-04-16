class CropTwoExecutor {
    public static void main(String[] args) {
        Crop c = new Crop();
        Season s = new Season();

        s.seasonId = 2;
        s.type = "Rabi";

        c.createSeason(s);
        c.getCropDetails();
    }
}

