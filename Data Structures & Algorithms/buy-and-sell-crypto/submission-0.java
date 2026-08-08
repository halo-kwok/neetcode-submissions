class Solution {
    public int maxProfit(int[] prices) {
        // not fixed window
        // parallel ptr traversal
        int l = 0, r = 1, maxProfit = 0;
        while (r < prices.length) {
            // update left ptr if prces[r] < prices[l]
            if(prices[r] < prices[l]) {l = r;}
            else {
                // updates maxProf if prices[r] > prices[l]
                maxProfit = Math.max(prices[r] - prices[l], maxProfit);
            }
            r++; // increase r regardless
        }
        return maxProfit;
    }
}
