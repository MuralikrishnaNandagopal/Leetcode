package leetcode;

public class MinimumRotatedArray {

    public static void main(String[] args) {
        int[] input = {4,5,6,1,2,3};
        System.out.println(findMin(input));
    }

    public static int findMin(int[] nums) {


        int L = 0, N = nums.length, R = N - 1;

        if(nums[L] < nums[R]) return nums[L];

        while(L + 1 < R){

            System.out.println("L+1 --> " + (L + 1));
            System.out.println("R   --> " + R);

            int mid = (L + R)/2;
            System.out.println("M   --> " + mid);
            if(nums[mid] < nums[R]){
                R = mid;
            }
            else{
                L = mid;
            }
        }


        return Math.min(nums[R], nums[L]);

    }
}
