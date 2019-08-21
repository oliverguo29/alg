// * Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
class Day14MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
    	if(root==null) {
    		return 0;
    	}
    	int dep_l=maxDepth(root.left);	//每次return值会增加
    	int dep_r=maxDepth(root.right);
    		
    	
    	
    	return dep_l>dep_r?dep_l+1:dep_r+1;		
        
    }
    
    
}