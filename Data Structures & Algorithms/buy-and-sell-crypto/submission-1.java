class Solution {
    public int maxProfit(int[] prices) {
        int MaxProfit =0;
        int MinBuy = prices[0];
        
        for (int i = 0; i < prices.length; i++ ){
            MinBuy = Math.min(MinBuy, prices[i]);
            int CurrProfit = prices[i] - MinBuy; 

            MaxProfit = Math.max(MaxProfit, CurrProfit);
        }
        return MaxProfit ;
    }
}
