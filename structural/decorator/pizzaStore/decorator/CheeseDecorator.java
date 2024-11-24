package structural.decorator.pizzaStore.decorator;

import structural.decorator.pizzaStore.component.Pizza;

public class CheeseDecorator extends ToppingDecorator {
    Pizza pizza;

    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String desciption() {
        return pizza.desciption() + " , Cheese";
    }

    @Override
    public double cost() {
        return pizza.cost() + 10;
    }
}
