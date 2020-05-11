class _121_BestTimeSellStock_1 {
    /**
     * 前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
     */
    public int maxProfit(int[] prices) {
        if(prices.length < 2 ){
            return 0;
        }

        int max = 0;  int min = prices[0];

        for(int i = 1; i < prices.length; i++){
            max = Math.max(max, prices[i]- min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}