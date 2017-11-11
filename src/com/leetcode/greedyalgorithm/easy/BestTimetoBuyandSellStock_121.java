package com.leetcode.greedyalgorithm.easy;

/**
 * Created by ruvinyusubov on 11/11/2017.
 */
public class BestTimetoBuyandSellStock_121 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minn = 1000 * 1000 * 1000;

        for (int i = 0; i < prices.length; i++) {
            minn = Math.min(minn, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minn);
        }

        return maxProfit;
    }
}
