package leetcode;

public class GuessGame {

    static int a = 5;
    static int range = 10;

    public static void main(String[] args) {
        System.out.println(guessNumber(a));

    }

    public static int guessNumber(int n) {
        int start = 1;
        int end = range;
        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(guess(mid) == 0) { return mid; }
            else if(guess(mid) == 1) { start = mid + 1; }
            else { end = mid -1; }
        }
        return -1;
    }


    public static int guess(int pick) {

        if ( pick < a ) {
             return -1;
        }
        else if ( pick > a ){
            return 1;
        }
        else {
            return 0;
        }
    }
}
