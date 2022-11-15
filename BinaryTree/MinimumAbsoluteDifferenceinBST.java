package BinaryTree;

public class MinimumAbsoluteDifferenceinBST {
	int diff;
	TreeNode pre;
	   public int getMinimumDifference(TreeNode root) {
	        diff=Integer.MAX_VALUE;
	        getmin(root);
	        return diff;
	    }
	   private void getmin(TreeNode temp) {
		   if(temp==null)return;
		   getmin(temp.left);
		   if(pre!=null) {
			   int curlen= Math.abs(temp.val-pre.val);
			   if(curlen<diff)diff=curlen;
		   }
		   pre=temp;
		   getmin(temp.right);
	   }
}
