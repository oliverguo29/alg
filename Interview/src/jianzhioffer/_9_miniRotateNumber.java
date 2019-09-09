package jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入：3,4,5,1,2
 * 输出：1,2,3,4,5
 * 解题思路：
 * 1。因为局部有序，因此使用二分法
 */
public class _9_miniRotateNumber {

    public static void main(String[] args) {
        int [] arr = new int[]{3,4,5,1,2};
        int i = minNumberInRotateArray(arr);
        System.out.println(i);
    }
    public static  int minNumberInRotateArray(int [] array) {
        if(array.length==0||array==null){
            return 0;
        }


        int head =0;
        int tail=array.length-1;
        int mid =0;

        while (head<tail){
             mid =(tail+head)/2;
             if(array[mid]>array[tail]){
                 head=mid+1;                            //前半部分最大值>后半部分最大值
             }else if(array[mid]==array[tail]){         //无法判断在哪边，一个一个试试
                tail=tail-1;
             }else {
                 tail=mid;                              //如果只有两个元素，那么mid 一定会指向下标靠前的数字，
             }
        }
        return array[head];                             //因为局部有序，非递减序列
    }
}
