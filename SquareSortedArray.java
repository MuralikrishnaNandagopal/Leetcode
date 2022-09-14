package leetcode;

import java.util.Arrays;

public class SquareSortedArray {

    public static void main(String[] args) {
        int[] input = {-4,-1,0,3,10};

        System.out.println(Arrays.toString(sortedSquares(input)));
    }

    public static int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int start = 0;
        int end = A.length - 1;

        for (int i = A.length - 1; i >= 0; i--) {
            if (Math.abs(A[start]) < Math.abs(A[end])) {
                result[i] = A[end] * A[end];
                end--;
            } else {
                result[i] = A[start] * A[start];
                start++;
            }
        }
        return result;
    }


}
