package behaviour.observer.code;

import behaviour.observer.code.observers.LogObserver;
import behaviour.observer.code.observers.Observer;
import behaviour.observer.code.observers.UiObserver;

public class main {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.setWindSpeed(100);
        weatherStation.setTemperature(50);
        weatherStation.setHumidity(20);

        Observer uiObserver = new UiObserver(weatherStation);
        Observer observer = new LogObserver(weatherStation);

        weatherStation.notifyObservers();

        System.out.println("-------------- ");
        weatherStation.setHumidity(100);
        weatherStation.setTemperature(100);
        weatherStation.setWindSpeed(100);
        weatherStation.notifyObservers();
        System.out.println("-------------- ");

        weatherStation.setTemperature(50);
        weatherStation.notifyObservers();


    }
}
