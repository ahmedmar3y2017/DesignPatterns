package problems.interviews.common;

public class BinarySearch_9 {


    public static void main(String[] args) {


        int[] nums = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 9;
        System.out.println(search(nums, target));  // Expected Output: 4 (index of 9)


    }

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        while ( start <= end) {

            int mid = start + (end-start)/2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target )
                end = mid-1;
            if (nums[mid] < target)
                start = mid+1;

        }

        return -1;
    }
}
