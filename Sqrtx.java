package leetcode;

public class Sqrtx {

    public static void main(String[] args) {

        int input = 9;
        System.out.println(mySqrt(input));

    }

    public static int mySqrt(int x) {

        if (x == 0) return 0;

        int start = 1;
        int end = x;
        int result = 0;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (mid <= x/mid) {
                result = mid;
                start = mid+ 1;
            }
            else {
                end = mid - 1;
            }
        }
        return result;
    }

}
