package problems.functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        Supplier<String> getString = () -> "Hello World" ;


        Supplier<List<String>> getList = () -> Arrays.asList("Hello", "World");
        System.out.println(getString.get());
        System.out.println(getList.get());

    }



}
