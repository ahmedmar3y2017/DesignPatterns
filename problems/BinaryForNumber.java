package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BinaryForNumber {
    public static void main(String[] args) {
        System.out.println(getOneBits(161));

    }

    public static List<Integer> getOneBits(int n) {
        // Write your code here
        String binaryString = Integer.toBinaryString(n);
        List<Integer> result = new ArrayList<>();
        Stream<String> stream = Arrays.stream(binaryString.split(""));
        long countOnes = stream.filter(string -> string.equalsIgnoreCase("1"))
                .count();

        System.out.println(countOnes);
        result.add((int) countOnes);

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                result.add(i + 1);
            }

        }

        return result;
    }
}
