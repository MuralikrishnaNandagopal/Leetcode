package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindKClose {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        int x = 5;
        System.out.println(findClosestElements(input, k, x));

    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        // Initialize binary search bounds
        int left = 0;
        int right = arr.length - k;

        // Binary search against the criteria described
        while (left < right) {
            int mid = (left + right) / 2;

            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // Create output in correct format
        List<Integer> result = new ArrayList<Integer>();
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }

        return result;
    }

}
