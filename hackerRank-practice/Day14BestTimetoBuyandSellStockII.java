//buy everyday,once tommorrow's price is expensive than today.
public class Day14BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
    	if(prices.length<=1) {
    		return 0;
    	}
    	
    	int profit=0;
    	for(int i=0;i<prices.length-1;i++) {
    		if(prices[i+1]>prices[i]){
    			profit+=prices[i+1]-prices[i];
    		}
    	}
        
    	
    	
    	return profit;
    }
}
