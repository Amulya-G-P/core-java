class Weather {
    int weatherId;
    String type;
    Climate climate;

    public void getWeatherDetails() {
        System.out.println("Weather Id: " + weatherId);
        System.out.println("Type: " + type);
        climate.getClimateDetails();
    }

    Weather() {}

    Weather(int weatherId, String type, Climate climate) {
        this.weatherId = weatherId;
        this.type = type;
        this.climate = climate;
    }

    public boolean createClimate(Climate climate) {
        this.climate = climate;
        return true;
    }
}

