package leetcode;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] input = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreat(input, target));
    }

    public static char nextGreat(char[] input, char target) {

        int n = input.length;
        int left = 0;
        int right = n-1;

        if(input[0] > target || target >= input[n-1]) {
            return input[0];
        }

        while(left + 1 < right){
            int mid = left + (right - left)/2;

            if (target > input[mid]){
                left = mid;
            }
            else {
                right = mid;
            }
        }
        return input[right];
    }

}
