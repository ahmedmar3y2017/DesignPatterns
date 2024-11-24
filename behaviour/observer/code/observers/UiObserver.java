package behaviour.observer.code.observers;

import behaviour.observer.code.Subject;
import behaviour.observer.code.WeatherModel;


public class UiObserver implements Observer {

    WeatherModel weatherModel;
    Subject subject;

    public UiObserver(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(WeatherModel weatherModel) {

        this.weatherModel = weatherModel;

        display(this.weatherModel);
    }

    private void display(WeatherModel weatherModel) {
        System.out.println("UI : " + weatherModel.getTemperature() + " " + weatherModel.getHumidity() + " " + weatherModel.getWindSpeed());
    }

    private void display(int temperature, int humidity, int windSpeed) {

        System.out.println("UI : " + temperature + " " + humidity + " " + windSpeed);
    }
}
