package problems.functionalProgramming;

import java.util.function.Consumer;
import java.util.function.Function;

public class _CallBack {

    public static void main(String[] args) {

        getStringDefault("ahmed", null,
                firstname -> System.out.println("Invalid Lastname for : " + firstname));

        // callback using thread -> runnable -> custom functional interface
        getStringDefault1("ahmed", null,
                () -> System.out.println("Invalid Lastname for "));


    }

    // callback like javascript , pass function to method as a paramater
    public static void getStringDefault(String firstname, String lastname, Consumer<String> consumer) {

        if (lastname != null) {
            System.out.println(firstname + " -> " + lastname);

        } else {

            consumer.accept(firstname);

        }


    }

    public static void getStringDefault1(String firstname, String lastname, Runnable runnable) {

        if (lastname != null) {
            System.out.println(firstname + " -> " + lastname);

        } else {

            runnable.run();

        }


    }

}
