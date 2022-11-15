package BinaryTree;

public class ValidateBinarySearchTree {
	TreeNode Max;
	 public boolean isValidBST(TreeNode root) {
	        return check(root);
	    }

	 private boolean check(TreeNode temp) {
		 if(temp==null)return true;
		 boolean left = check(temp.left);
		 if(!left) {
			 return false;
		 }
		 if(Max!=null&&temp.val<=Max.val) {
			 return false;
		 }
		 Max=temp;
		 return check(temp.right);
	 }
	 
}
