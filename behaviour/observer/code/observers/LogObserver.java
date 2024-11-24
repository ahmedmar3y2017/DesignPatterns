package behaviour.observer.code.observers;

import behaviour.observer.code.Subject;
import behaviour.observer.code.WeatherModel;

public class LogObserver implements Observer {
    WeatherModel weatherModel;
    Subject subject;

    public LogObserver(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(WeatherModel weatherModel) {

        this.weatherModel = weatherModel;

        logFun(this.weatherModel);
    }

    private void logFun(WeatherModel weatherModel) {
        System.out.println("logFun : " + weatherModel.getTemperature() + " " + weatherModel.getHumidity() + " " + weatherModel.getWindSpeed());
    }

    private void logFun(int temperature, int humidity, int windSpeed) {
        System.out.println("logFun : " + temperature + " " + humidity + " " + windSpeed);
    }

}
