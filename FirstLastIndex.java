package leetcode;

import java.util.Arrays;

public class FirstLastIndex {



    public static void main(String[] args) {
        int[] nums = {5,7,8,8,10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] arr;
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        if(nums.length == 0) return res;
        arr = nums;
        res[0] = findLeft(target);
        res[1] = findRight(target);
        return res;
    }
    private static int findLeft(int target){
        int left = 0, right = arr.length - 1;
        while(left + 1 < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] < target){
                left = mid;
            }else{
                right = mid;
            }
        }
        if(arr[left] == target) return left;
        if(arr[right] == target) return right;
        return -1;
    }
    private static int findRight(int target){
        int left = 0, right = arr.length - 1;
        while(left + 1 < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] <= target){
                left = mid;
            }else{
                right = mid;
            }
        }
        if(arr[right] == target) return right;
        if(arr[left] == target) return left;
        return -1;
    }
}
