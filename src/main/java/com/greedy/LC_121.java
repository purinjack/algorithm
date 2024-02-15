package com.greedy;

/**
 * 121. 买卖股票的最佳时机
 */
public class LC_121 {

    public int maxProfit1(int[] prices) {
        int length = prices.length;
        int max = prices[length - 1];
        int profit = 0;
        for(int i = length - 2; i >= 0; i--){
            if(max >= prices[i]){
                profit = Math.max(max - prices[i] , profit);
            }else{
                max = prices[i];
            }
        }
        return profit;
    }
}
