package leetcode;

public class MissingElement {

    public static void main(String[] args) {
        int[] input = {4,7,9,10};
        int limit = 1;
        System.out.println(missingElement(input,limit));
    }

        // Return how many numbers are missing until nums[idx]
        static int missing(int idx, int[] nums) {
//            System.out.println(nums[idx]-nums[0]-idx);
//            System.out.println(nums[idx]);
//            System.out.println(nums[0]);
//            System.out.println(idx);
            return nums[idx] - nums[0] - idx;
        }

        public static int missingElement(int[] nums, int k) {
            int n = nums.length;
            if (k > missing(n - 1, nums))
                return nums[n - 1] + k - missing(n - 1, nums);

            int left = 0;
            int right = n - 1;
            int pivot;

            while (left != right) {
                pivot = left + (right - left) / 2;
                System.out.println("Pivot : " + pivot);

                if (missing(pivot, nums) < k)
                    left = pivot + 1;
                else right = pivot;
            }


            return nums[left - 1] + k - missing(left - 1, nums);
        }
    }
