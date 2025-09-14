package problems.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class _MethodPreferences {

    public static void main(String[] args) {

//        🔹 A. Static Method Reference – ClassName::staticMethod
        Function<Double, Double> doubleConsumer = Math::abs;
        System.out.println(doubleConsumer.apply(-5.5));

        // using lambda
        Function<Double, Double> doubleConsumer1 = value -> Math.abs(value);
        System.out.println(doubleConsumer1.apply(-5.0));

//        🔹 B. Instance Method Reference – object::instanceMethod
        List<String> stringList = List.of("ahmed", "marey");
        stringList.forEach(System.out::println);

//        🔹 C. Instance Method on Parameter – ClassName::instanceMethod
        stringList.stream().map(String::toUpperCase).forEach(System.out::println);
//          🔹 D. Constructor Reference – ClassName::new
        Supplier<List<String>> supplier = ArrayList::new;

        List<String> strings = supplier.get();


    }
}
