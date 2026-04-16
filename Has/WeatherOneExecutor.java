class WeatherOneExecutor {
    public static void main(String[] args) {
        Weather w = new Weather();
        Climate c = new Climate();

        c.climateId = 1;
        c.condition = "Humid";

        w.weatherId = 101;
        w.type = "Rainy";
        w.climate = c;

        w.getWeatherDetails();
    }
}

