class WeatherTwoExecutor {
    public static void main(String[] args) {
        Weather w = new Weather();
        Climate c = new Climate();

        c.climateId = 2;
        c.condition = "Dry";

        w.createClimate(c);
        w.getWeatherDetails();
    }
}

