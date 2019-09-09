package mianshijindian;

import java.util.*;

/**
 * 替换空格
 *                  "Mr John Smith”,13
 *                  返回："Mr%20John%20Smith"
 * 解题思路：
 * 1。将数组变成char数组
 * 2。遍历数组，遇到空格使用StringBuilder添加"%20"
 * 3。否则添加字符
 */

public class _4_Replacement {
    public static void main(String[] args) {
        String s="Mr John Smith";
        String s1 = replaceSpace(s, 13);
        System.out.println(s1);
    }


    public static  String replaceSpace(String iniString, int length) {
        // write code here
        StringBuilder sb = new StringBuilder();
        char[] arr = iniString.toCharArray();

        for(char c:arr){

            if(c==' '){
                sb.append("%20");
            }else {
                sb.append(c);
            }
        }


        return sb.toString();
    }
}
