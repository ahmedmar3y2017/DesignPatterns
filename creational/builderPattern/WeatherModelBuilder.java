package creational.builderPattern;

public class WeatherModelBuilder {

    private int temperature;
    private int humidity;
    private int windSpeed;

    public WeatherModelBuilder setTemperature(int temperature) {
        this.temperature = temperature;
        return this;
    }

    public WeatherModelBuilder setHumidity(int humidity) {
        this.humidity = humidity;
        return this;
    }

    public WeatherModelBuilder setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    public WeatherModel build() {

        return new WeatherModel( temperature, humidity, windSpeed);
    }
}
