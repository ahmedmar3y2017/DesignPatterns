package structural.decorator.pizzaStore.component;

public class ThickPizza extends Pizza {
    public ThickPizza() {
        desc = "ThickPizza";
    }

    @Override
    public double cost() {
        return 100;
    }
}
