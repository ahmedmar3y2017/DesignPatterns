package structural.decorator.pizzaStore.component;

public abstract class Pizza {
    String desc = "Unknown pizza";

    public String desciption() {
        return desc;
    }

    public abstract double cost();
}
