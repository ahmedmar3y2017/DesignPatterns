package problems.interviews.common;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LargestElement_2 {

    public static void main(String[] args) {

        System.out.println(findLargest(new int[]{1, 3, 6, 8, 55, 4, 7, 9, 22,}));
        System.out.println(findLargestByStreams(new int[]{1, 3, 6, 8, 55, 4, 7, 9, 22,}));
    }

    // 1 -
    public static int findLargest(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    // 2 -
    public static int findLargestByStreams(int[] arr) {

        IntStream stream = Arrays.stream(arr);
        int asInt = stream.max().getAsInt();

        return asInt;
    }


}
