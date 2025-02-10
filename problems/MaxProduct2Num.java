package problems;

import java.util.Arrays;

public class MaxProduct2Num {
    public static void main(String[] args) {

        System.out.println(result(new int[]{7, 17, 13, 19, 5}));
        System.out.println(resultSort(new int[]{7, 17, 13, 19, 5}));
    }

    public static int result(int[] arr) {
        int max = 0;
        if (arr.length < 2) return 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] * arr[j] > max) max = arr[i] * arr[j];
            }
        }

        return max;

    }

    public static int resultSort(int[] arr) {

        Arrays.sort(arr);

        return arr[arr.length - 1] * arr[arr.length - 2];

    }
}
