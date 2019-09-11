package jianzhioffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 *
 * 解题思路：
 * 1。 通过把奇数和偶数分别变成stringBuilder进行拼接，转换成int
 */
public class _16_ReOrderArray {
    public static void main(String[] args) {
        int [] arr =new int [100];
        for(int i=0;i<100;i++){
            arr[i] = i;
        }

        reOrderArray(arr);
        for(int i=0;i<100;i++){
            System.out.println(arr[i]);

        }
    }

    public static  void reOrderArray(int [] array) {
       StringBuilder jishu = new StringBuilder();
       StringBuilder oushu = new StringBuilder();

        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                //oushu
                oushu.append(array[i]+" ");
            }else {
                jishu.append(array[i]+" ");
            }
        }

        StringBuilder s_res = jishu.append(oushu);
        String[] s = s_res.toString().split(" ");

        for(int i=0;i<array.length;i++){
            array[i]=Integer.valueOf(s[i]);
        }


    }
}