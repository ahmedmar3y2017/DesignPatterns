package problems.Generics.example.code;

import java.util.ArrayList;
import java.util.List;

public class Fruit implements Boxable {
    String name;
    double weight;
    public Fruit(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
