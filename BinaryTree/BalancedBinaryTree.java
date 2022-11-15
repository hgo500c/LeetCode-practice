package BinaryTree;

public class BalancedBinaryTree {
	   public boolean isBalanced(TreeNode root) {
	        return height(root)!=-1;
	    }
	   private int height(TreeNode temp) {
		   if(temp==null)return 0;
		   int leftheight = height(temp.left);
		   if(leftheight==-1)return -1;
		   int rightheight = height(temp.right);
		   if(rightheight==-1)return -1;
		   if(Math.abs(leftheight-rightheight)>1)return -1;
		   return Math.max(leftheight, rightheight)+1;
	   }
	
}
