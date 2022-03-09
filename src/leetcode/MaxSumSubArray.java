package leetcode;

public class MaxSumSubArray {

    public static void main(String[] args) {
        int[] A = {-2,1,-3,4,-1,2,1,-5,4};
        int output = maxSubArray(A);
        System.out.println(output);
    }

    public static int maxSubArray(int[] nums) {

        int max_sum = nums[0];
        int current_sum = max_sum;

        for (int i=1; i<nums.length; i++)
        {

            current_sum = Math.max(nums[i] + current_sum, nums[i]);

            max_sum = Math.max(current_sum, max_sum);

        }

        return max_sum;
    }

}

/*Output Explanation
int[] A = {-2,1,-3,4,-1,2,1,-5,4};
Iteration 1 : max_sum => first element ; current_sum => max_sum

current_sum -> Max ( sum till that loop pt , pt )
max_sum -> Max (current_sum, max_sum)

 */