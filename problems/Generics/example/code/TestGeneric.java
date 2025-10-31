package problems.Generics.example.code;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestGeneric {
    public static void main(String[] args) {
        // fruit
        Box<Fruit> fruitBox = new Box<>();
        fruitBox.add(new Fruit("Apple", 10));
        fruitBox.add(new Fruit("Banana", 20));

        System.out.println(fruitBox.getLastItem());
        System.out.println(fruitBox.toString());

        System.out.println(Boxutil.getCount(fruitBox));
        // book
        Box<Book> bookBox = new Box<>();
        bookBox.add(new Book("book1", 10));
        bookBox.add(new Book("book2", 20));
        System.out.println(bookBox.getLastItem());
        System.out.println(bookBox.toString());
        System.out.println(Boxutil.getCount(bookBox));

        // test hirarechies

        CardBox<Fruit> box = new CardBox<>();

        Box<Fruit> box2 = new Box<>();

        box = box;

        // test type hirerchies
        Box<Fruit> box3 = new Box<>();
        Box<Apple> box4 = new Box<>();
        // not match as there is limitation in type reference hirerchies
//        box3 = box4;
//        box4 = box3;

        System.out.println(" ------------------ type inference ----------------");
        // type inference
        Fruit fruit = new Fruit("Apple", 10);
        Apple apple = new Apple("Apple", 20);

        Boxable fruit1 = pickOne(fruit, apple);
        Fruit fruit2 = pickOne(fruit, apple);

        // 1 - instatiation type
        Box<Fruit> fruitBox1 = new Box<>(); // instead of  Box<Fruit> fruitBox1   = new Box<Fruit>();
        // 2 - method arguments
        Box<Fruit> apple1 = Box.of(new Fruit("fr", 10));
        Box<Apple> apple2 = Box.of(new Apple("apple", 20));

        // 3 - inference base on type target
        List<String> objects = Collections.emptyList();
        List<Integer> integers = Collections.emptyList();
        // custom
        Box<Boxable> boxableBox = Boxutil.emptyBox();
        Box<Fruit> fruitBox2 = Boxutil.emptyBox(); // target reference
        Box<Apple> appleBox = Boxutil.emptyBox(); // target reference

        // wildcard
        System.out.println("------------- wildcard --------- ");
        // 1 unbounded wildcard - any type
        System.out.println(Boxutil.getCountWildcard(fruitBox));
        System.out.println(Boxutil.getCountWildcard(boxableBox));

        // upper bounded wildcard

        System.out.println(Box.getAverageOfFruit(fruitBox2));
        System.out.println(Box.getAverageOfFruit(appleBox));
//        System.out.println(Box.getAverageOfFruit(bookBox)); // compile error because required any thing inherit from friut

        // lower bounded wildcard

        Box.addAppleWildcard(appleBox);
        Box.addAppleWildcard(fruitBox1);
        Box.addAppleWildcard(boxableBox);
//        Box.addAppleWildcard(bookBox); // compiilation error anything super of apple


    }

    public static <T> T pickOne(T t1, T t2) {

        if (Math.random() < 0.5) {
            return t2;
        } else
            return t1;
    }
}
