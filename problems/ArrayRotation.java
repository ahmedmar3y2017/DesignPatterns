package problems;

import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        rotate(array, 3);
        Arrays.stream(array).forEach(value -> System.out.println(value));
//        7654321
//                5671234
    // Expected Output: [5, 6, 7, 1, 2, 3, 4]

    }

    public static void rotate(int[] arr, int k) {

        // reverse whole array
        // reverse from 0 to k -1
        // reverse from k to arr length
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);


    }

    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
