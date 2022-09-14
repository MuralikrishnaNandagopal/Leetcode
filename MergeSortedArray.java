package leetcode;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] nums1 = {9,8,7,0,0,0};
        int m = 3;

        int[] nums2 = {2,5,6};
        int n = 3;

        int[] output = merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(output));

    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        m--; n--;

        int index = nums1.length - 1;

        while(index >= 0){

            if(m<0){
                nums1[index] = nums2[n--];
            }
            else if(n < 0){
                nums1[index] = nums1[m--];
            }
            else {
                if(nums1[m] > nums2[n]) {
                    nums1[index] = nums1[m--];
                }
                else{
                    nums1[index] = nums2[n--];
                }
            }

            index--;
        }

        return nums1;
    }


}
