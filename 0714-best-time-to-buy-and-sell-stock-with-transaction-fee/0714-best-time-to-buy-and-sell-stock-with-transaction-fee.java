class Solution {
    public int maxProfit(int[] prices, int fee) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        // 'hold' represents the max profit if we currently hold a stock.
        // Initially on day 0, if we buy a stock, our profit is -prices[0].
        int hold = -prices[0];

        // 'free' represents the max profit if we currently do NOT hold a stock.
        // Initially on day 0, if we hold no stock, our profit is 0.
        int free = 0;

        for (int i = 1; i < prices.length; i++) {
            int prevFree = free;

            // State 1: We don't hold a stock today.
            // Either we didn't hold one yesterday, OR we sold the stock we held yesterday today (paying the fee).
            free = Math.max(free, hold + prices[i] - fee);

            // State 2: We hold a stock today.
            // Either we held one yesterday, OR we bought a new stock today using profit from prevFree.
            hold = Math.max(hold, prevFree - prices[i]);
        }

        return free; // Maximum profit ending with no stock held
    }
}
