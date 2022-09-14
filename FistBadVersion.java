package leetcode;

public class FistBadVersion {

    public static void main(String[] args) {
        int n = 1;
        int bad = 1;
        System.out.println(firstBadVersion(n));
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

    private static boolean isBadVersion(int mid) {

    if (mid < 1) {
        return false;
    }

    return true;
    }
}
