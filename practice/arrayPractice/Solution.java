class Solution {
    public static int maxProfit(int[] prices) {
        int Max_Profit = 0;
        int lowestPrice = prices[0];
        int current_profit = 0;

        for (int index = 1; index < prices.length; index++) {
            current_profit = prices[index] - lowestPrice;
            if (current_profit > Max_Profit)
                Max_Profit = current_profit;
            if (current_profit < 0)
                current_profit = 0;
            if (prices[index] < lowestPrice)
                lowestPrice = prices[index];
            Max_Profit = +current_profit;

        }

        return Max_Profit;
    }

    public static void main(String args[]) {
        int[] prices = new int[] { 7, 6, 4, 3, 1 };
        int result = maxProfit(prices);
        System.out.println(result);
    }

}