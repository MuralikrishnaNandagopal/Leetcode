package leetcode;

public class MaxProfit {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int output = maxProfit(prices);

        System.out.println(output);

    }

    public static int maxProfit(int[] prices) {
        int maxProfit =0;
        int min_val = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {

            if(prices[i] < min_val){
                min_val = prices[i];
            } else if(prices[i]-min_val > maxProfit){
                maxProfit = prices[i]-min_val;
            }
        }
        return maxProfit;
    }


}
