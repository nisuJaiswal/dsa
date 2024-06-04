package Arrays;

public class StockBuySell {
    public static int predictBuy(int[] prices) {
        int buyVal = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Find the minimum buy value from current index and buyVal
            if (buyVal > prices[i])
                buyVal = prices[i];

            maxProfit = Math.max(maxProfit, Math.abs(buyVal - prices[i]));
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println("\nMaximum Profit will be: " + predictBuy(prices));
    }
}
