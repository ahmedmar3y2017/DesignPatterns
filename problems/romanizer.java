package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class romanizer {

    public static void main(String[] args) {
        System.out.println(romanizer(Arrays.asList(75, 80, 99, 100, 50)));

    }

    private static final String[] ROMAN_LETTERS = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM",  "M" };
    private static final int[] ROMAN_NUMBERS    = {  1,    4,   5,    9,  10,   40,  50,   90, 100,  400, 500,  900, 1000 };

    public static String romanizer(int num) {
        StringBuilder result = new StringBuilder();
        for (int h = ROMAN_NUMBERS.length - 1; h >= 0; h--) {
            result.append(ROMAN_LETTERS[h].repeat(num / ROMAN_NUMBERS[h]));
            num = num % ROMAN_NUMBERS[h];
        }
        return result.toString();
    }

    public static List<String> romanizer(List<Integer> numbers) {
        List<String> result = new ArrayList<>();
        for (int num : numbers)
            result.add(romanizer(num));
        return result;
    }

}
