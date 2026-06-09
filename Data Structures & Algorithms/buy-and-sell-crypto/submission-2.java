class Solution {
    public int maxProfit(int[] prices) {
        int MaxProfit =0;
        int MinBuy = prices[0];
        
        for (int price : prices){
            MinBuy = Math.min(MinBuy, price);
            int CurrProfit = price - MinBuy; 

            MaxProfit = Math.max(MaxProfit, CurrProfit);
        }
        return MaxProfit ;
    }
}
