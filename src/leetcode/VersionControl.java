package leetcode;

public class VersionControl {

    public static void main(String[] args) {

        int n = 10;
        int output = firstBadVersion(n);

        System.out.println(output);

    }

    public static int firstBadVersion(int n) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;

    }


    private static boolean isBadVersion(int midpoint) {

        boolean output = true;
        switch (midpoint) {
            case 1:
                output = false; break;
            case 2:
                output = false; break;
            case 3:
                output = false; break;
            case 4:
                output = false; break;
            case 5:
                output = false; break;
            case 6:
                output = false; break;
            case 7:
                output = true; break;
            case 8:
                output = true; break;
            case 9:
                output = true; break;
            case 10:
                output = true; break;
        }


        return output;
    }
}
