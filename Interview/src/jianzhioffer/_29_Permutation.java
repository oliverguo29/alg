package jianzhioffer;
/**
 * 字符串全排列
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _29_Permutation {
    public ArrayList<String> Permutation(String str) {
       ArrayList<String> res = new ArrayList<>();
        if (str.length()==0||str==null){
            return res;
        }

        char[] arr = str.toCharArray();
        helper(arr,res,0);
        Collections.sort(res);
        return res;

    }

    public void helper(char [] arr, ArrayList<String> list, int i){
        //结束条件
        if(i==arr.length-1){
            if(!list.contains(new String(arr))){
                list.add(new String(arr));
                return;
            }
        }
        for(int j=i;j<arr.length;j++ ){
            swap(arr,i,j);          //将第一个固定，让每个字母有机会成为第一个  第一轮为a 开头
            helper(arr,list,i+1); //递归得到后边的选项 abc acb
            swap(arr,i,j);          //复原，再排列 比如 acb 恢复成abc，因此for循环在执行时会从b开始

        }
    }

    public void swap(char [] arr , int i,int j){
        if(i!=j){
            char tmp = arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
    }
}
