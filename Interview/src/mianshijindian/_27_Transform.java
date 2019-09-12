package mianshijindian;

/**
 * 首先A转化B要改变多少位，即A和B有多少位不同，
 * 异或相同则为0，不同为1，接下来就是求一个数的二进制中的1的个数
 */
public class _27_Transform {
    public int calcCost(int A, int B) {
        // write code here
        int num=A^B;
        int count =0;

        while (num!=0){
            count++;
            num=num&num-1;
        }
        return count;
    }
}
