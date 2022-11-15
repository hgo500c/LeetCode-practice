package BinaryTree;

public class SymmetricTree {
	 public boolean isSymmetric(TreeNode root) {
		 if(root == null)return true;
	        return check(root.left,root.right);
	        
	    }
	 private boolean check(TreeNode temp,TreeNode right) {
		 if(temp==null&&right==null)return true;
		 if(temp!=null&&right==null)return false;
		 if(temp==null&&right!=null)return false;
		 if(temp.val!=right.val)return false;
		 boolean outcheck = check(temp.left,right.right);
		 boolean incheck = check(temp.right,right.left);
		 return outcheck&&incheck;
	 }
}
