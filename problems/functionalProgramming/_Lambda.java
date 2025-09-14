package problems.functionalProgramming;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Function;

public class _Lambda {

    public static void main(String[] args) {



        // ------------------------ lambda -> functional interface ---------------------------

        Function<String , Integer> stringLength = (str) -> str.length();
        System.out.println(stringLength.apply("hello"));

        // java way
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        }).start();
        // using lambda {anonomous function} // no  arguments
        new Thread (() -> {

            System.out.println("Hello World");
        }).start();
    }


}
