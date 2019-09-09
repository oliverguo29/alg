package mianshijindian;

import java.util.*;

/**
 *                      "This is nowcoder","is This nowcoder"
 *                      返回：true
 *
 * 判断重新排列"字符"后是否一样****，不是重新排单词
 *
 * 解题思路：
 * 将数组变成char数组，
 * 进行排列
 * 判断是否每一位相同
 *
 *
 */
public class _3_Same {

    public static  boolean checkSam(String stringA, String stringB) {
        // write code here
        if(stringA.length()!=stringB.length()){
            return false;
        }

        char[] arr_1 = stringA.toCharArray();
        char[] arr_2 = stringB.toCharArray();

        if(arr_1.length!=arr_2.length){
            return false;
        }

        Arrays.sort(arr_1);
        Arrays.sort(arr_2);

        for(int i=0;i<arr_1.length;i++){
            if(arr_1[i]!=arr_2[i]){
                return false;
            }
        }




        return true;
    }
}
