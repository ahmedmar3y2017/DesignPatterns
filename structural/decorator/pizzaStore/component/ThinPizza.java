package structural.decorator.pizzaStore.component;

public class ThinPizza extends Pizza {
    ThinPizza() {
        desc = "ThinPizza";
    }

    @Override
    public double cost() {
        return 50;
    }
}
