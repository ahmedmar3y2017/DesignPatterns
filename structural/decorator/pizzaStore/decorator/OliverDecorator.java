package structural.decorator.pizzaStore.decorator;

import structural.decorator.pizzaStore.component.Pizza;

public class OliverDecorator extends ToppingDecorator {
    Pizza pizza;

    public OliverDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String desciption() {
        return pizza.desciption()+" , Oliver";
    }

    @Override
    public double cost() {
        return pizza.cost() + 20;
    }
}
