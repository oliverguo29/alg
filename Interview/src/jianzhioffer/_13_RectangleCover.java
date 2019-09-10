package jianzhioffer;

/**
 *  矩形覆盖
 *              1   target=1
 *  f(n)=       2   target=2
 *              (n-1)+(n-2) n>1
 */
public class _13_RectangleCover {
    public int RectCover(int target) {
        if(target<=2){
            return target;
        }
        int dp[] = new int[target];
        dp[0]=1;
        dp[1]=2;

        for(int i=2;i<target;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[target-1];
    }
}
