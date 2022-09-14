package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,11,15,7};
        int target = 9;
        int[] output = twoSum(nums, target);
        //int[] output1 = twoSumV1(nums, target);

        System.out.println(Arrays.toString(output));
    }

    public static int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {

            int temp = target - nums[index];

            if (map.containsKey(temp)) {
                return new int[] { map.get(temp), index} ;
            }
            map.put(nums[index], index);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
//
//    public static int[] twoSumV1(int[] nums, int target)
//    {
//        Map<Integer, Integer> hm = new HashMap<>();
//        for (int i = 0; i < nums.length; i++){
//
//        }
//    }

}
