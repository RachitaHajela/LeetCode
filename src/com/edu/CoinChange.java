package com.edu;

/**
 * Created by RHAJELA on 3/15/2017.
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        int[] total = new int[amount + 1];
        total[0] = 0;

        int numOfCoins = coins.length;

        for (int i = 1; i <= amount; i++) {
            total[i] = Integer.MAX_VALUE - 1;
        }

        for (int coin : coins) {

            for (int i = 1; i <= amount; i++) {
                if (coin <= i) {
                    if (total[i] > 1 + total[i - coin]) {
                        total[i] = 1 + total[i - coin];
                    }
                }
            }

        }
        if (total[amount] == Integer.MAX_VALUE - 1) return -1;
        return total[amount];
    }
}
