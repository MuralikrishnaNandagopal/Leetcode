package leetcode;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums){
        int slow = 0;
        int fast = 0;

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(slow != fast);

        int find = 0;
        while(find != slow) {
            find = nums[find];
            slow = nums[slow];
        }

        return  find;
    }


}
