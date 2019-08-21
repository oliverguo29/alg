public class Day14BestTimetoBuyandSellStock {
	 
	public static int maxProfit(int[] prices) {
        if(prices.length<=1) {
        	return 0;
        }
        int profit=0;
		for(int i=0;i<prices.length;i++) {
			for(int j=i+1;j<prices.length;j++) {
				if(prices[i]<prices[j]) {
					int tmp= prices[j]-prices[i];
					if(tmp>profit) {
						profit=tmp;
					}
				}
			}
		}
		
        return profit;
    }
	
	public static void main(String[] args) {
		int [] s= new int[] {2,1,2,0,1};
		maxProfit(s);
	}
}
/**
 * 76431
 * ss=76431
 * i=0-->1,3,4,6
 * 
 * i=1
 * ss=
 */
