package jianzhioffer;

/**
 * 计算二进制中1的个数
 * n:       10110100
 * n-1:     10110011
 *
 * n&(n-1): 10110000
 */
public class _14_CountOne {
    public int NumberOf1(int n) {
        int count=0;
        while (n!=0){
            count++;
            n &=(n-1);
        }
        return count;

        //return Integer.bitCount(n);
    }
}