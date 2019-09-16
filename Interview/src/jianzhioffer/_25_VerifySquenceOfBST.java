package jianzhioffer;

import java.util.Arrays;

/**
 * 二叉搜索树的后序遍历序列
 *
 *解题思路
 * BST的后序序列的合法序列是，对于一个序列S，最后一个元素是x （也就是根），
 * 如果去掉最后一个元素的序列为T，那么T满足：T可以分成两段，前一段（左子树）小于x，
 * 后一段（右子树）大于x，且这两段（子树）都是合法的后序序列。
 */
public class _25_VerifySquenceOfBST {
    public static void main(String[] args) {
        int arr [] = new int[]{4,8,6,12,16,14,10};
        boolean b = VerifySquenceOfBST(arr);
        System.out.println(b);
    }

    public static  boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0||sequence==null){
            return false;
        }
        int root  = sequence[sequence.length-1];
        int i;
        for(i=0;i<sequence.length-1;i++){
            if(sequence[i]>root){
                break;                          //找到左子树
            }
        }

        int j=i;
        for(;j<sequence.length-1;j++){
            if(sequence[j]<root){
                return false;                   //如果右子树小于左子树，不为搜索树
            }
        }

        boolean left = true;  boolean right=true;

        if(i>0){                                //遍历左子树
            int left_tree[] = new int[i];
            Arrays.copyOfRange(sequence,0,i);
            left=VerifySquenceOfBST(left_tree);
        }
        if(i<sequence.length-1){               //遍历右子树
            int right_tree[] = new int[sequence.length-1-i];
            Arrays.copyOfRange(sequence,i,sequence.length-1);
            right=VerifySquenceOfBST(right_tree);
        }
        return  left&&right;
    }
}
