package behaviour.observer.code;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    WeatherModel weatherModel = new WeatherModel();

    List<behaviour.observer.code.observers.Observer> observers;

    public WeatherStation() {
        this.observers = new ArrayList<behaviour.observer.code.observers.Observer>();

    }

    @Override
    public void registerObserver(behaviour.observer.code.observers.Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(behaviour.observer.code.observers.Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {

        for (behaviour.observer.code.observers.Observer observer : observers) {
            observer.update(weatherModel);

        }
    }

    public void setWindSpeed(int windSpeed) {
        weatherModel.setWindSpeed(windSpeed);
    }

    public void setHumidity(int humidity) {
        weatherModel.setHumidity(humidity);
    }

    public void setTemperature(int temperature) {
        weatherModel.setTemperature(temperature);
    }
}
