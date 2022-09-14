package leetcode;

public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while ( start <= end ) {

            System.out.println("Start -> " + start);
            System.out.println("End -> " + end);


            int index = start + (end - start)/2;
            System.out.println("Index -> " + index);

            if(nums[index] == target) {
                return index;
            }

            else if (nums[index] < target) {
                start = index + 1;
            }

            else  {
                end = index -1;
            }



        }


        return start;
    }
}
