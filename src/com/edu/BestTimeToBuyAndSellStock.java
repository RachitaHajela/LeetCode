package com.edu;

/**
 * Created by RHAJELA on 4/27/2017.
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices.length < 2) return maxProfit;
        int size = prices.length;

        //Brute Force:
        /*for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (prices[j] - prices[i] > maxProfit) {
                    maxProfit = prices[j] - prices[i];
                }
            }

        }*/

        //Dynamic Programming:
        int buy = prices[0];
        int sell = 0;
        for (int i = 1; i < size; i++) {
            if (buy < prices[i]) {
                maxProfit = Math.max(maxProfit, prices[i] - buy);
            } else {
                buy = prices[i];
            }
        }
        return maxProfit;
    }

}
