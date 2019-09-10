package jianzhioffer;

import java.util.Arrays;

/**
 * 变态跳台阶，可以跳1 和 2 和 n
 *
 * 2*f(n-1)
 */
public class _12_AdvanceJump {
    public int JumpFloorII(int target) {
        int [] dp = new int [target];
        Arrays.fill(dp,1);

        for(int i=1;i<target;i++){      //一次跳n
            for(int j=0;j<i;j++){       // 跳1
                dp[i]+=dp[j];
            }
        }
        return dp[target-1];
        //return (int)Math.pow(2,target-1);     //等比数列
    }
}
