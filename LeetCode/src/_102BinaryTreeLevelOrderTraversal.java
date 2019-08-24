import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * BFS stack
 */
class _102BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        if(root==null){
            return  result;
        }

        Deque<TreeNode> deque = new LinkedList<>();

        deque.add(root);
        TreeNode node;

        while (deque.size()!=0){
            int length=deque.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<length;i++) {
                node = deque.poll();
                level.add(node.val);
                if(node.left!=null){
                    deque.add(node.left);
                }
                if(node.right!=null){
                    deque.add(node.right);
                }
            }
            result.add(level);

        }


        return result;
    }
}