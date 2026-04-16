class CropOneExecutor {
    public static void main(String[] args) {
        Crop c = new Crop();
        Season s = new Season();

        s.seasonId = 1;
        s.type = "Kharif";

        c.cropId = 101;
        c.name = "Rice";
        c.season = s;

        c.getCropDetails();
    }
}

