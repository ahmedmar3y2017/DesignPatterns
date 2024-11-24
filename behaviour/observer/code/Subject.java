package behaviour.observer.code;

import java.util.Observer;

public interface Subject {

    public void registerObserver(behaviour.observer.code.observers.Observer observer);

    public void removeObserver(behaviour.observer.code.observers.Observer observer);

    public void notifyObservers();

}
