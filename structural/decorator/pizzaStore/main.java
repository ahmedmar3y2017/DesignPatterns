package structural.decorator.pizzaStore;

import structural.decorator.pizzaStore.component.Pizza;
import structural.decorator.pizzaStore.component.ThickPizza;
import structural.decorator.pizzaStore.decorator.CheeseDecorator;
import structural.decorator.pizzaStore.decorator.OliverDecorator;
import structural.decorator.pizzaStore.decorator.PeppersDecorator;

public class main {

    public static void main(String[] args) {

        Pizza thickPizza = new ThickPizza();
        thickPizza = new OliverDecorator(thickPizza);
        thickPizza = new CheeseDecorator(thickPizza);
        thickPizza = new PeppersDecorator(thickPizza);

        System.out.println(thickPizza.desciption() + "   " + thickPizza.cost());
    }
}
