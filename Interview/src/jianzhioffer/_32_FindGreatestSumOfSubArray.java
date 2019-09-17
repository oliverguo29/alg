package jianzhioffer;

/**
 * 连续子数组的最大和
 * {6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8
 * 解题思路：
 * 1。如果和遇到负数,就判断单个数的值
 * 2。如果和为正数，判读和是否是最大的
 */
public class _32_FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0||array==null){
            return 0;
        }
        int sum=0;
        int greatSum = Integer.MIN_VALUE;

        for(int value:array){
            sum=sum<=0?value:sum+value;
            greatSum=Integer.max(sum,greatSum);
        }
        return greatSum;
    }
}
