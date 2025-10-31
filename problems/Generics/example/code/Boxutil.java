package problems.Generics.example.code;

public class Boxutil {

    public static <T extends Boxable> int getCount(Box<T> box) {

        return box.items.size();
    }

    public static int getCountWildcard(Box<?> box) {

        return box.items.size();
    }

    // return emptybox
    public static <T extends Boxable> Box<T> emptyBox() {
        return new Box<>();
    }
}
