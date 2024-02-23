public class WeatherWebsite {
    private IStubWeatherForecaster forecaster;

    // Constructor Injection
    public WeatherWebsite(IStubWeatherForecaster forecaster) {
        this.forecaster = forecaster;
    }

    public String displayTemperature(String city) {
        int temperature = forecaster.predictWeather(city);
        return "The current temperature in " + city + " is " + temperature + " degrees.";
    }
}