package BinaryTree;

public class sumofleft {
	 public int sumOfLeftLeaves(TreeNode root) {
	       return sum(root);
	    }
	 private int sum(TreeNode temp) {
		 if(temp==null)return 0;
		 int left = sum(temp.left);
		 int right = sum(temp.right);
		 int mid =0;
		 if(temp.left!=null&&temp.left.left==null&&temp.left.right==null) {
			 mid =temp.left.val;
		 }
		 return left+right+mid;
	 }
}
