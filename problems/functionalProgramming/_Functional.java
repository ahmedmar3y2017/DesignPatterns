package problems.functionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class _Functional {


    public static void main(String[] args) {

        // function -> take 1 ar ang get 1 response
        Function<Integer, Integer> inc1 = integer -> integer + 1;
        Function<Integer, Integer> multiple10 = integer -> integer * 10;

        Integer apply = inc1.apply(1);
        Integer multiple = multiple10.apply(2);
        System.out.println(apply);
        System.out.println(multiple);
        // combine  2
        Integer apply1 = inc1.andThen(multiple10).apply(2); // 2+1 -> 3 * 10 = 30
        System.out.println("combine : " + apply1);
//    Represents a predicate (boolean-valued function) of one argument.

        Predicate<Integer> isOne = integer -> integer == 1;

        boolean test = isOne.test(1);
        System.out.println(test);


        // BIFunction
        BiFunction<Integer, Integer, Integer> integerIntegerIntegerBiFunction = (integer1, integer2) -> (integer1 + 1) * integer2;
        System.out.println("BiFunction : " + integerIntegerIntegerBiFunction.apply(2, 10));



    }

}
