package problems.Streams.collectors;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Collectors {

    public static void main(String[] args) {

        // collectors is a class implement collector interface in java and used in trminal stream oprtators
        BinaryOperator<String> sum = (a, b) -> a + " , " + b;
        List<String> strings = Arrays.asList("aa", "e", "c", "d", "e", "c", "aa");
        // print none duplicated
        strings.stream().collect(java.util.stream.Collectors.toSet())
                .forEach(System.out::println);

        System.out.println();
        // print map of these map {length , string}
        Object collect = strings.stream().collect(java.util.stream.Collectors.toMap(
                s -> s.length(), Function.identity(), sum

        ));
        System.out.println(collect);
        System.out.println();
        // print map of these Map {string , length}
        strings.stream().collect(
                java.util.stream.Collectors.toMap(
                        Function.identity()
                        , s -> s.length(),
                        (a, b) -> a

                )
        ).forEach((s, integer) -> System.out.println(s + " : " + integer));

        // print string distinct and orders

        System.out.println(" --------------- ");
        // 1
        System.out.println(strings.stream().collect(java.util.stream.Collectors.toCollection(

                        TreeSet::new
                ))
                .stream().collect(java.util.stream.Collectors.joining(" | ")));

        // 2
        System.out.println(strings.stream().distinct().sorted().collect(java.util.stream.Collectors.joining(" | ")));

        System.out.println(" ------------ IntSummaryStatistics --------- ");

        int[] arr = {5, 8, 9, 6, 55, 44, 77, 8, 22, 54, 33, 65, 41, 5};
        IntSummaryStatistics summaryStatistics = Arrays.stream(arr).boxed()
                .collect(java.util.stream.Collectors.summarizingInt(Integer::intValue));

        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getAverage());
        System.out.println(summaryStatistics.getCount());

        // ------------ the other way for get stream of integer summarize
        System.out.println(" ------------------------");
        System.out.println( Arrays.stream(arr)
                .boxed()
                .collect(java.util.stream.Collectors.minBy(Comparator.comparingInt(value -> value) )).get());
        System.out.println(Arrays.stream(arr)
                .boxed()
                .collect(java.util.stream.Collectors.maxBy(Comparator.comparingInt(value -> value) )).get());

        System.out.println(Arrays.stream(arr)
                .boxed()
                .collect(java.util.stream.Collectors.averagingInt(value -> value)));
        System.out.println(Arrays.stream(arr)
                .boxed()
                .collect(java.util.stream.Collectors.counting()));



    }


}
