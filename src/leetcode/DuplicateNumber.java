package leetcode;

import java.util.Arrays;

public class DuplicateNumber {

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {

        if(nums.length == 0) return 0;

        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            System.out.println();

            if(nums[index] < 0) { return index + 1; }
            else { nums[index] = -nums[index]; }

            System.out.print("Index : " +  index  + "--> " + "Nums Array : " + Arrays.toString(nums));
        }
        return -1;
    }
}
