class Solution {
    public int maxProfit(int[] prices) {
        // keep track of the minimum value so far and check if selling on each day after that gives a better outcome.
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int currProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (min > prices[i]) min = prices[i];
            currProfit = prices[i + 1] - min;
            if (currProfit > maxProfit) {
                maxProfit = currProfit;
            }

        }
        if (maxProfit <= 0)
            return 0;
        else
            return maxProfit;
    }
}
