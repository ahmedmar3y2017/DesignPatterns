package problems.Generics.example.code;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Boxable> {
    List<T> items;

    Box() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public T getLastItem() {
        return items.get(items.size() - 1);
    }

    public static <T extends Boxable> Box<T> of(T t) {
        Box<T> box = new Box<T>();
        box.add(t);
        return box;

    }

    // upper bounded wildcard
    public static double getAverageOfFruit(Box<? extends Fruit> box) {

        return box.items.stream().mapToDouble(Fruit::getWeight).sum() / box.items.size();

    }

    // lower bounded wildcard
    public static void addAppleWildcard(Box<? super Apple> box) {

        box.add(new Apple("ddd", 50));

    }

    @Override
    public String toString() {
        return "Fruit{" +
                "items=" + items +
                '}';
    }

}

// complete and modify this code making it a singleton
final class DatabaseConnection {
    private String databaseURL;

    private static DatabaseConnection databaseConnection;

    private DatabaseConnection(String databaseURL) {
        this.databaseURL = databaseURL;
    }

    public static synchronized DatabaseConnection getInstance() {
        if (databaseConnection == null) {
            databaseConnection = new DatabaseConnection("jdbc:mysql://localhost:3306/mydatabase");
            return databaseConnection;
        } else
            return databaseConnection;
    }

    // dummy implementation of executing a query
    public void executeQuery(String query) {
        System.out.println("Executing query on " + databaseURL + ": " + query);
    }

    // dummy implementation of closing the connection
    public void close() {
        System.out.println("Closing connection with: " + databaseURL);
    }
}

