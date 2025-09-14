package problems.functionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class _Said {

    static Predicate<String> phoneValid = phone -> phone.length() == 11 ;

    // Custom functional interface
    @FunctionalInterface
    static interface Calculator {
        int multiple(int x, int y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public int multiple(int x, int y) {
                return x * y;
            }
        };
//
        Calculator calculator2 = (x, y) -> x * y;
        System.out.println(calculator.multiple(1, 2));
        System.out.println(calculator2.multiple(2, 2));


        Function<Integer , Integer> mutiple = x -> x*x;

        BiFunction<Integer , Integer , Integer> biMutiple = (x, y) -> x*y;
        System.out.println(mutiple.apply(2));



        System.out.println(biMutiple.apply(2 , 5));

        System.out.println(phoneValid.test("01201288779"));


        new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println(
                        "Thread running..."
                );
            }
        }) ;

        new Thread(()->System.out.println("Thread running...")).start();

    }

    public static boolean phoneValid(String phone) {
        if (phone.length() == 11) {
            return true;
        }
        return false;
    }


}
