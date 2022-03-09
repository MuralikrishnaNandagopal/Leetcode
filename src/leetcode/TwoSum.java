package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,11,15,7};
        int target = 9;
        int[] output = twoSum(nums, target);
        System.out.println(Arrays.toString(output));
    }

    public static int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int temp = target - nums[i];

            if (map.containsKey(temp)) {
                return new int[] { map.get(temp), i} ;
            }
            map.put(nums[i], i);

        }

        throw new IllegalArgumentException("No two sum solution");
    }

}
