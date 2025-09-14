package problems.functionalProgramming;


import java.util.Optional;
import java.util.function.Supplier;

public class _Optional {


    public static void main(String[] args) throws Exception {

        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.isPresent() +"   " + optional.isEmpty() );

        Supplier<String> getStringDefault = () -> "DefaultValue";
        System.out.println(optional.orElseGet(getStringDefault));

        Optional<String> optional1 = Optional.ofNullable("ahmed");

        optional.ifPresentOrElse(System.out::println, () -> {
            System.out.println("Not Found");
        });

        System.out.println(optional1.isPresent()?"Length : " + optional1.map( str -> str.length()).get() : optional1.orElseGet( getStringDefault));

        Supplier<Exception> exceptionSupplier = () -> new Exception("Error NUll");
        optional.orElseThrow( exceptionSupplier );

    }

}
