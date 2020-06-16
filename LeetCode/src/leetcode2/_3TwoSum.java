package leetcode2;

import java.util.*;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 输入"abcabcbb"
 * 输出: 3
 */
class _3TwoSum {
    //暴力解法，找出每个字母开头的最长的子串
    public static int lengthOfLongestSubstring(String s) {
        int res = 0;



        for(int i = 0; i < s.length(); i++){
            List<Character> ll = new ArrayList<>();
            for(int j = i; j < s.length(); j++ ){
                if(ll.contains(s.charAt(j))){
                    break;
                }
                ll.add(s.charAt(j));
                res = Math.max(ll.size(), res);
            }
        }
        return res;
    }

    //双指针
    public static int lengthOfLongestSubstring2(String s) {
        int left = 0 ;
        int right = 0;
        int res = Integer.MIN_VALUE;
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        while (right < chars.length){
            if(map.containsKey(chars[right])){
                res = Math.max(res, right-left); //记录当前最大值
                int tmp = map.get(chars[right]);
                for(int i = left; i <= tmp; i++){
                    map.remove(chars[i]);   //清空当前重复的map
                }
                left = tmp + 1;
            }
            map.put(chars[right], right);
            right++;
        }
        return Math.max(res, right-left);

    }

    public static void main(String[] args) {
        int pwwkew = lengthOfLongestSubstring2("pwwkew");
        System.out.println(pwwkew);
    }
}
