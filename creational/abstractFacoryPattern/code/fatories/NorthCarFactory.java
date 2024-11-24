package creational.abstractFacoryPattern.code.fatories;

import creational.abstractFacoryPattern.code.Car;
import creational.abstractFacoryPattern.code.CarSpecification;
import creational.abstractFacoryPattern.code.HatchBack;
import creational.abstractFacoryPattern.code.NorthCarSpec;

public class NorthCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new HatchBack();
    }

    @Override
    public CarSpecification createCarSpecification() {
        return new NorthCarSpec();
    }
}
