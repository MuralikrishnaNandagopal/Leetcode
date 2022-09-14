package leetcode;


public class MaxProfitV2 {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};
        int output = maxProfit(prices);

        System.out.println(output);

    }

    public static int maxProfit(int[] prices) {
        int maxProfit =0;

        if(prices == null || prices.length == 0){
            return 0;
        }

        for (int i=0; i<prices.length-1; i++ ){
            if (prices[i+1] > prices[i]) {
                maxProfit += prices[i+1]-prices[i];
            }
        }


        return maxProfit;
    }


}
