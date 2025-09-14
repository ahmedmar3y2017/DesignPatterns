package problems.functionalProgramming.Session;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class HigherOrder {

    public static void main(String[] args) {


        System.out.println(test1(test2(5))); // pure function to function as an argument

        // delegate -> like as a pointer of function in memory
        Function<Double, Double> funTest1 = num -> test1(num); // delegate -> funTest1 delegate to test1
        Function<Double, Double> funTest2 = num -> test2(num); // delegate -> funTest2 delegate to test2
        // use delegate as a reference or variable
        List<Function<Double, Double>> functions = new ArrayList<>(); // list of delegates
        functions.add(funTest1);
        functions.add(funTest2);

        System.out.println(functions.get(0).apply(5.0));
        System.out.println(functions.get(1).apply(6.0));

        // ----------------- complete higher order example
        System.out.println("------------ Higher Order -----------");

        System.out.println(test3(HigherOrder::test1, 2));
        System.out.println(test3(HigherOrder::test2, 3));
        // set function as an argument to another function
        // get function as a retturn value from function
        // or use both
    }


    static double test1(double x) {

        return x + 2;
    }

    static double test2(double y) {

        return 2 * y;
    }

    // test 3 should task
    // - 1 arg -> function take double and return double
    static double test3(Function<Double, Double> funTest, double y) {

        return funTest.apply(y) + y;
    }
}
