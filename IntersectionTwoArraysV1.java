package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionTwoArraysV1 {

    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));

    }

    public static int[] intersect(int[] nums1, int[] nums2){

        List<Integer> arr = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if(hm1.containsKey(nums1[i])){
                hm1.put(nums1[i], hm1.get(nums1[i]) + 1);
            }
            else {
                hm1.put(nums1[i], 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if(hm2.containsKey(nums2[i])){
                hm2.put(nums2[i], hm2.get(nums2[i]) + 1);
            }
            else {
                hm2.put(nums2[i], 1);
            }
        }

        for(Integer key : hm1.keySet()) {
            if(hm2.containsKey(key)){
                int x = Math.min(hm2.get(key), hm1.get(key));
                while(x-- > 0) {
                    arr.add(key);
                }
            }
        }

        int res[] = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
    }

}
