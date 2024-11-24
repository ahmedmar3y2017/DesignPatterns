package structural.decorator.pizzaStore.decorator;

import structural.decorator.pizzaStore.component.Pizza;

public class PeppersDecorator extends ToppingDecorator {
    Pizza pizza;

    public PeppersDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String desciption() {
        return pizza.desciption() + " , Peppers";
    }

    @Override
    public double cost() {
        return pizza.cost() + 5;
    }
}
