package mianshijindian;

import java.util.*;

/**
 * 1 2 3             1 4 7        7 4 1
 * 4 5 6        -->  2 5 8  -->   8 5 2
 * 7 8 9             3 6 9        9 6 3
 * 解题思路：
 * 1. 副对角线元素交换
 * 2. 第0列和最后一列交换， i++, j--
 */
public class _6_Transform {
    public int[][] transformImage(int[][] mat, int n) {
        // write code here
        if(mat.length==0||mat[0].length==0){
            return mat;
        }

        for(int i=0;i<mat.length;i++){              //副对角线元素交换
            int tmp=0;
            for(int j=i+1;j<mat[0].length;j++){
                tmp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=tmp;
            }
        }

        int i=0;
        int j=n-1;

        while (i<j){
            int k=0;
            int tmp=0;
            while (k<n){
                tmp=mat[k][i];
                mat[k][i]=mat[k][j];                //第0列和最后一列交换， i++, j--
                mat[k][j]=tmp;
                k++;
            }
            i++;
            j--;
        }
        return mat;
    }
}
