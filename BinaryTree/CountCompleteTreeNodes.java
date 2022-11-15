package BinaryTree;

public class CountCompleteTreeNodes {
	 public int countNodes(TreeNode root) {
	        return number(root);
	    }
	 private int number(TreeNode temp) {
		 if(temp==null) {
			 return 0;
		 }
		 int left = number(temp.left);
		 int right = number(temp.right);
		 return left+right+1;
	 }
}
