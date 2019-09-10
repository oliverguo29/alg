package jianzhioffer;

/**
 * 青蛙跳台阶
 *          1       n=1
 *  f(n)=   2       n=2
 *          f(n-1)+f(n-2)   n>1
 */
public class _11_jumpfloor {
    public static void main(String[] args) {
        int i = JumpFloor(3);
        System.out.println(i);
    }


    public static int JumpFloor(int target) {
        if(target<=2){
            return target;
        }

       int[]  sum=new int[target];
        sum[0]=1;
        sum[1]=2;

        for(int i=2;i<target;i++){
            sum[i]=sum[i-1]+sum[i-2];
        }

        return sum[target-1];
    }
}
