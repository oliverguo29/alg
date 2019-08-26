import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class _199BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null){
            return  result;
        }

        helper(root,result,0);



        return  result;
    }

     public void helper(TreeNode node,List<Integer> ll,int level){

        if (node!=null){
            if(level==ll.size()){
                ll.add(node.val);
            }

            this.helper(node.right,ll,level+1);
            this.helper(node.left,ll,level+1);
        }

    }
}