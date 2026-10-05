class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            int current_price = prices[i];

            if (current_price < min_price) {
                min_price = current_price;
                continue;
            }

            max_profit = Math.max(max_profit, current_price - min_price);
        }

        return max_profit;
    }
}
