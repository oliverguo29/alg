package jianzhioffer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 按层遍历，借助一个队列实现
 * bfs
 * 使用queue
 */
public class _24_LevelPrint {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();

        if(root==null){
            return res;
        }

        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            res.add(poll.val);
            if(poll.left!=null){
                queue.add(poll.left);
            }
            if(poll.right!=null){
                queue.add(poll.right);
            }
        }
        return res;

    }
}
