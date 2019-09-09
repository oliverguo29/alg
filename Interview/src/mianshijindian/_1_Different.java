package mianshijindian;

import java.util.*;

/**
 * 确定字符串是否互异
 *                      "aeiou"
 *                       返回：True
 * 1.排序
 * 2.挨个判断当前的和前边的是否相同
 */

public class _1_Different {
    public boolean checkDifferent(String iniString) {
        // write code here
        char[] arrs = iniString.toCharArray();
        Arrays.sort(arrs);

        for(int i=1;i<arrs.length;i++){
                if(arrs[i]==arrs[i-1]){
                    return false;
                }
        }



        return  true;
    }
}
