package problems.Streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreams {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("aa", "bb"
                , "cc", "dd", "rr", "tt"
        );

        stringList.stream().forEach(string -> System.out.print(string + " , "));
        System.out.println();
        stringList.parallelStream().forEach(string -> System.out.print(string + " , "));
        System.out.println();
        stringList.parallelStream().forEachOrdered(string -> System.out.print(string + " , "));

    }
}
