package creational.abstractFacoryPattern.code;

import creational.abstractFacoryPattern.code.fatories.CarFactory;
import creational.abstractFacoryPattern.code.fatories.EuropeCarFactory;
import creational.abstractFacoryPattern.code.fatories.NorthCarFactory;

public class main {

    public static void main(String[] args) {

        // europe
        CarFactory carFactory = new EuropeCarFactory();
        Car car = carFactory.createCar();
        CarSpecification carSpecification = carFactory.createCarSpecification();

        car.assemble();
        carSpecification.display();


        // north car
        CarFactory NorthCarFactory = new NorthCarFactory();
        Car NorthCar = NorthCarFactory.createCar();
        CarSpecification NorthSpecification = NorthCarFactory.createCarSpecification();

        NorthCar.assemble();
        NorthSpecification.display();

    }
}
