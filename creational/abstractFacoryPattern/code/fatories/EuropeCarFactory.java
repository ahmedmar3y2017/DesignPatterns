package creational.abstractFacoryPattern.code.fatories;

import creational.abstractFacoryPattern.code.Car;
import creational.abstractFacoryPattern.code.CarSpecification;
import creational.abstractFacoryPattern.code.EuropeCarSpec;
import creational.abstractFacoryPattern.code.Sedan;

public class EuropeCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }

    @Override
    public CarSpecification createCarSpecification() {
        return new EuropeCarSpec();
    }
}
