package leetcode;

public class SingleNumber {

    public static void main(String[] args) {

        int[] input = {2,2,1};
        int output = singleNumber(input);

        System.out.println(output);
    }

    private static int singleNumber(int[] input) {

        int result = 0;


        for(int i=0;i<input.length;i++){
            result ^= input[i];
        }


        return result;
    }

}
