package com.edu;

/**
 * Created by RHAJELA on 5/10/2017.
 */
public class BestTimeToBuyAndSellStock2 {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices.length < 2) return maxProfit;
        int buy = prices[0];

        int size = prices.length;
        for (int i = 1; i < size; i++) {
            if (buy < prices[i]) {
                maxProfit = maxProfit + prices[i] - buy;
            }
            buy = prices[i];
        }


        return maxProfit;
    }
}
