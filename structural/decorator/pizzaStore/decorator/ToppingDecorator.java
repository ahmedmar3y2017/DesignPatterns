package structural.decorator.pizzaStore.decorator;

import structural.decorator.pizzaStore.component.Pizza;

// اضافات
public abstract class ToppingDecorator extends Pizza {
    public abstract String desciption();
}
