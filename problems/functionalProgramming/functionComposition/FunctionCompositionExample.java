package problems.functionalProgramming.functionComposition;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCompositionExample {


    static List<Double> doubles = List.of(10.0, 20.0, 30.0);

    public static void main(String[] args) {

        // map multiple
        doubles.stream().map(FunctionCompositionExample::addOne).map(FunctionCompositionExample::square)
                .map(FunctionCompositionExample::subtractTen)
                .forEach(System.out::println);

        System.out.println(" ------------------------- ");
        // function to function
        doubles.stream().map(aDouble -> subtractTen(square(addOne(aDouble))))
                .forEach(System.out::println);

        System.out.println(" -------------------------- ");
        // combine function to function and return double
        doubles.stream().map(aDouble -> combineFunctions(aDouble))
                .forEach(System.out::println);

        System.out.println(" -------------------- compose Function --------------");
        Function<Double, Double> fun = FunctionCompositionExample::addOne;
        doubles.stream().map(aDouble ->
                        composeFunctions(aDouble)
                )
                .forEach(System.out::println);
    }

    public static double composeFunctions(double num) {

        Function<Double, Double> addOne = FunctionCompositionExample::addOne;
        Function<Double, Double> square = FunctionCompositionExample::square;
        Function<Double, Double> subtractTen = FunctionCompositionExample::subtractTen;
        // compose functions
        return subtractTen.compose(square).compose(addOne).apply(num);

    }
    public static double combineFunctions(double num) {

        Function<Double, Double> addOne = FunctionCompositionExample::addOne;
        Function<Double, Double> square = FunctionCompositionExample::square;
        Function<Double, Double> subtractTen = FunctionCompositionExample::subtractTen;

        return subtractTen(square.apply(addOne.apply(num)));

    }

    public static double addOne(double num) {

        return num + 1;

    }

    public static double square(double num) {

        return num * num;

    }

    public static double subtractTen(double num) {

        return num - 10.0;

    }

    public static Function<Double, Double> addOneFun(double num) {

        return aDouble -> num + 1;

    }

    public static Function<Double, Double> squareFun(double num) {

        return aDouble -> num * num;

    }

    public static Function<Double, Double> subtractTenFun(double num) {

        return aDouble -> num - 10.0;

    }

}
