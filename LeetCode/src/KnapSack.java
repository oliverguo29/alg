public class KnapSack {
    public int knapsack(int W,int V,int [] weights,int [] values){
        int [][]dp=new int [V+1][W+1];
        for(int i=1;i<=V;i++){
            int w=weights[i-1];
            int v=values[i-1];
            for(int j=1;j<=W;j++){
                if(j>=w){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-w]+v);//第i件添加进背包
                }else{
                    dp[i][j]=dp[i-1][j];        //没添加
                }
            }
        }
        return dp[V][W];
    }
}
