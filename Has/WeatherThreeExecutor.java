class WeatherThreeExecutor {
    public static void main(String[] args) {
        Climate c = new Climate();
        c.climateId = 3;
        c.condition = "Cold";

        Weather w = new Weather(102, "Winter", c);
        w.getWeatherDetails();
    }
}