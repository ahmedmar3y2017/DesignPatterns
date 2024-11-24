package creational.abstractFacoryPattern.code.fatories;

import creational.abstractFacoryPattern.code.Car;
import creational.abstractFacoryPattern.code.CarSpecification;

public interface CarFactory {
    // car , spec
    public Car createCar();

    public CarSpecification createCarSpecification();

}
