package problems.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Sessions {

    public static void main(String[] args) {

        Function<Double, Double> del1 = (x) -> test1(x);
        Function<Double, Double> del2 = (x) -> test2(x);
        // 1 - normal function call result of function inside
        System.out.println("output " + test1(test2(5)));
        // 2 - List of delegates to deal with functions as a variables or data
        List<Function<Double, Double>> listOfDelegates = new ArrayList<>();
        listOfDelegates.add(del1);
        listOfDelegates.add(del2);
        System.out.println("output " + listOfDelegates.get(0).apply(5.0));

        // Higher Order function (function take another one as an argument or return function as an output or BOTH )
        // 3 - output higher order function

        System.out.println("testHiigherOrder : " + testHiigherOrder(del1 , 5));
        System.out.println("testHiigherOrder : " + testHiigherOrder(del2 , 5));
    }

    public static double test1(double x) {

        return x / 5 + 1;
    }

    public static double test2(double x) {

        return x / 5 + 5;
    }


    // higher order function
    public static double testHiigherOrder(Function<Double, Double> function, double x) {
        return function.apply(x) + x;
    }


}
