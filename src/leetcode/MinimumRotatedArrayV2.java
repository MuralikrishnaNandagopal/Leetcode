package leetcode;

public class MinimumRotatedArrayV2 {

    public static void main(String[] args) {
        int[] input = {4,5,6,7,0,1,4};
        System.out.println(findMinV2(input));
    }

    public static int findMinV2(int[] nums){


        int l = 0;
        int r = nums.length - 1;

        if(nums[l] <  nums[r]) {
            return nums[l];
        }

        while (l+1 < r) {
            int mid = l + (r-l)/2;

            if(nums[mid] > nums[r]) {
                l++;
            }
            else {
                r--;
            }
        }

        return Math.min(nums[l], nums[r]);

    }

}
