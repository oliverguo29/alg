package mianshijindian;

import java.util.*;

/**
 * "waterbottle","erbottlewat"
 * 解题思路：
 * 1。 如果s2是s1旋转后得到的，必然是2个s1的子串
 *
 * waterbottlewaterbottle 包含erbottlewat
 */
public class _8_ReverseEqual {
    public boolean checkReverseEqual(String s1, String s2) {
        // write code here
        if(s1.length()!=s2.length()){
            return false;
        }
        String ss = s1+s1;

        return  ss.contains(s2);
    }
}