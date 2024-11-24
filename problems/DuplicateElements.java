package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateElements {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 2, 6, 7, 8, 3}; // Example array with duplicates


        int[] dublicationElements = findDublicationElements(nums);
        Arrays.stream(dublicationElements).forEach(value -> System.out.println(value));
    }

    public static int[] findDublicationElements(int[] arr) {

        // add only unique element
        HashSet<Integer> set = new HashSet<Integer>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            if (!set.add(arr[i]))
                list.add(arr[i]);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
