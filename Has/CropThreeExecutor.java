class CropThreeExecutor {
    public static void main(String[] args) {
        Season s = new Season();
        s.seasonId = 3;
        s.type = "Summer";

        Crop c = new Crop(102, "Wheat", s);
        c.getCropDetails();
    }
}