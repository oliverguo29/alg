package jianzhioffer;

import java.util.HashMap;
import java.util.Map;

/**
 * 根据前序和中序，重建二叉树
 *
 * 根据前序遍历的第一个值，将中序遍历分为两部分，左部分作为树的左子树中序结果，右部分作为右子树中序结果
 */


 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

public class _7rebuildBinaryTree {
    private Map<Integer, Integer> indexFromInorder = new HashMap<>();

    public TreeNode reConstructBinaryTree(int[] preOrder, int[] inOreder) {
        for (int i = 0; i < inOreder.length; i++) {
            indexFromInorder.put(inOreder[i], i);
        }
        return reConstructBinaryTree(preOrder, 0, preOrder.length - 1, 0);
    }


    private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL) {
        if (preL > preR) {
            return null;
        }

        TreeNode root = new TreeNode(pre[preL]);
        int inIndex = indexFromInorder.get(root.val);
        int leftTreeSize = inIndex - inL;
        root.left = reConstructBinaryTree(pre, preL + 1, preL + leftTreeSize, inL);
        root.right = reConstructBinaryTree(pre, preL + leftTreeSize + 1, preR, inL + leftTreeSize + 1);
        return root;
    }
}