package jianzhioffer;

import java.util.ArrayList;

/**
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class _26_FindPath {
     private  ArrayList<ArrayList<Integer>> res = new ArrayList<>();

     public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
         BackTrack(root,target,new ArrayList<Integer>());
         return res;
    }

    private void BackTrack(TreeNode node,int target, ArrayList<Integer> list){
        if(node==null){
            return;
        }
        list.add(node.val);
        target-=node.val;                                       //因为是dfs所以每次list长的会在前边

        if(target==0&&node.left==null&&node.right==null){       //node 为叶子节点
            res.add(new ArrayList<>(list));
        }else {
            BackTrack(node.left,target,list);                   //找左子树
            BackTrack(node.right,target,list);                  //找右子树
        }
        list.remove(list.size()-1);                       //因为每次 list.add(node.val);
                                                                //会破坏当前的状态，无论找没找到，都-1
                                                                //找到了的会加入到res
    }
}
