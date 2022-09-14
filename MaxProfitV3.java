package leetcode;

public class MaxProfitV3 {


    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int output = maxProfit(prices);

        System.out.println(output);

    }


    public static int maxProfit(int[] prices){
        int profit = 0;

        if(prices.length == 0 || prices == null){
            return 0;
        }

        for (int i = 0; i < prices.length - 1; i++){
            if (prices[i + 1] > prices[i]){
                profit += prices[i+1]-prices[i];
            }
        }

        return profit;
    }
}
