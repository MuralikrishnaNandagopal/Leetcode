package leetcode;

public class MaxProfitV1 {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int output = maxProfit(prices);

        System.out.println(output);

    }

    public static int maxProfit(int[] prices) {

        int max_profit = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i<prices.length-1; i++ ){

            if(prices[i]<min) {
                min = prices[i];
            }
            else if (prices[i] - min > max_profit){
                max_profit = prices[i]-min;
            }
        }
        return max_profit;
    }
}
