class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = 0
        for curDay in range(len(prices)):
            DayProfit =0
            for i in range(curDay,len(prices)):

                profit = prices[i] - prices[curDay]
                DayProfit = max(profit, DayProfit)
            
            #overall max Profit

            maxProfit = max(DayProfit, maxProfit)
        
        return maxProfit