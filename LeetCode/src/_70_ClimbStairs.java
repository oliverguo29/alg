class _70_ClimbStairs {
    /**
     * 动态规划
     * 最小子问题的解为 1， 2
     *
     */
    public int climbStairs(int n) {
        if (n < 2){
            return n;
        }
        int cur;
        int pre1 = 1 ; int pre2 = 2 ;

        for(int i = 2; i < n; i++ ){
            cur = pre1 + pre2;
            pre1 = pre2;
            pre2 = cur;
        }
        return pre2;
    }
}