package problems.interviews.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DublicateElement_10 {
    public static void main(String[] args) {

        Arrays.stream(dublicateElement(new int[]{1, 5, 8, 9, 88, 20, 5, 4, 11, 1, 1})).forEach(System.out::println);
    }

    public static int[] dublicateElement(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i]))
                list.add(arr[i]);
        }

        return list.stream().mapToInt(value -> value).toArray();
    }
}
