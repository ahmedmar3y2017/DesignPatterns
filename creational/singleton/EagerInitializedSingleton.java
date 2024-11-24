package creational.singleton;



/*
 *
In eager initialization, the instance of the singleton class is created at the time of class loading.
*  The drawback to eager initialization is that the method is created even though the client application
*  might not be using it. Here is the implementation of the static initialization singleton class:
 *
 * */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor to avoid client applications using the constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
