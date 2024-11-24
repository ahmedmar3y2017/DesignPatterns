package problems;

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {3, 0, 1, 5, 2, 6, 4 , 7}; // Example array
        int missing = findMissingNumber(nums);
        System.out.println("The missing number is: " + missing);

    }

    public static int findMissingNumber(int[] nums) {
        int expectedSum = 0;
        int sumOf = 0;

        for (int i = 0; i < nums.length; i++) {
            expectedSum += i + 1;
            sumOf += nums[i];
        }

        return expectedSum - sumOf;
    }
}
