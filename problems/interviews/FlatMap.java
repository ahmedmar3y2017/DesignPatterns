package problems.interviews;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        Stream.of(array).flatMap(strings -> Arrays.stream(strings)).forEach(string -> System.out.println(string));

    }

}
