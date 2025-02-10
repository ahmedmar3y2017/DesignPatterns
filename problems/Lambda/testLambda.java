package problems.Lambda;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface lamdda {

    public String printLambda();
}

public class testLambda {
    public static void main(String[] args) {

        // call functional interface via lambda
        lamdda lamdda = () -> {
            System.out.println("Error Handling");

            return "Hello World";
        };
        System.out.println(lamdda.printLambda());

        // function
        Function<String, String> function = string -> string + " " + string;
        System.out.println(function.apply("ahmed marey"));

        // predict
        Predicate<Integer> predicate = o -> {
            boolean b = o % 3 == 0;
            return b;
        };
        System.out.println(predicate.test(2));
        System.out.println(predicate.test(3));

        // supplier
        Supplier<Double> supplier = () -> Math.random()*5;
        System.out.println(supplier.get());
    }
}
