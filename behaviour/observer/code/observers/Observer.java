package behaviour.observer.code.observers;

import behaviour.observer.code.WeatherModel;

public interface Observer {


    public void update(WeatherModel weatherModel);
}
