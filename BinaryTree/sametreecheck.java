package BinaryTree;

public class sametreecheck {
	 public boolean isSameTree(TreeNode p, TreeNode q) {
	        return checktree(p,q);
	    }
	private boolean checktree(TreeNode p,TreeNode q) {
		if(p==null&&q!=null)return false;
		if(p!=null&&q==null)return false;
		if(p==null&&q==null)return true;
		else if(p.val!=q.val)return false;
		boolean left = checktree(p.left,q.left);
		boolean right = checktree(p.right,q.right);
		return left&&right;
	}
}
