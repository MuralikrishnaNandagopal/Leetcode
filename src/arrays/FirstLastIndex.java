package arrays;

import java.util.Arrays;

public class FirstLastIndex {

    public static void main(String[] args) {
        int[] nums = {5,7,8,8,10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] searchRange(int[] nums, int target){

        int[] result = new int[2];

        result[0] = findStartingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);

        return result;
    }

    public static int findStartingIndex(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length -1;

        while(start <= end) {
            int midpoint = start + (end-start)/2;

            if (nums[midpoint] >= target) {
                end = midpoint - 1;
            } else {
                start = midpoint + 1;
            }

            if(nums[midpoint] == target) {
                index = midpoint;
            }
        }


        return index;
    }

    public static int findEndingIndex(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length -1;

        while(start <= end) {
            int midpoint = start + (end-start)/2;

            if (nums[midpoint] <= target) {
                start = midpoint + 1;
            } else {
                end = midpoint - 1;
            }

            if(nums[midpoint] == target) {
                index = midpoint;
            }
        }


        return index;
    }

}
