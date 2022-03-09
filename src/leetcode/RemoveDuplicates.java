package leetcode;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {1,1,2};
        int output = removeDuplicates(nums);
        System.out.println(output);
    }

    public static int removeDuplicates(int[] nums)
    {
        int index = 1;

        for (int i = 0; i < nums.length-1; i++) {

            if(nums[i] != nums[i+1]) {
                nums[index++] = nums[i+1];
            }

        }

        return index;
    }

}
