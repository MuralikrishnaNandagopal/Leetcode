package leetcode;


public class MissingElementV2 {

    public static void main(String[] args) {
            int[] input = {4,7,9,10};
            int limit = 1;
            System.out.println(missingElementV2(input, limit));
    }

    public static int missingV2(int idx, int[] nums) {
        return nums[idx] - nums[0] - idx;
    }


    public static int missingElementV2(int[] nums, int k) {
        int n = nums.length;

        if ( k > missingV2(n-1, nums)){
            return nums[n-1] + k - missingV2(n-1, nums);
        }

        int left = 0;
        int right = n-1;
        int pivot;

        while (left != right) {
            pivot = left + (right - left)/2;

            if(missingV2(pivot,nums) < k) {
                left = pivot + 1;
            }
            else {
                right = pivot;
            }
        }

        return nums[left-1] + k - missingV2(left-1, nums);

    }

}
