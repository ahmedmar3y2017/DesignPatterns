package problems;

/*
* Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
Output: 11
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.

Input: arr[] = {-2, -4}
Output: –2
Explanation: The subarray {-2} has the largest sum -2.

Input: arr[] = {5, 4, 1, 7, 8}
Output: 25
Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25.
*
* */
public class maxSubarraySum {


    public static void main(String[] args) {


        System.out.println(getMaxSubarraySum(new int[]{2, 3, -8, 7, -1, 2, 3}));
        System.out.println(getMaxSubarraySum(new int[]{-2, -4}));
        System.out.println(getMaxSubarraySum(new int[]{5, 4, 1, 7, 8}));
    }

    ///////////// solution 1 -> but not efficient as
    public static int getMaxSubarraySum(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Arr is empty");
            return -1;
        }
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                res = Math.max(sum, res);

            }
        }

        return res;
    }
}
