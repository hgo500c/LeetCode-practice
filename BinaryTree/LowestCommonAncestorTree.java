package BinaryTree;

public class LowestCommonAncestorTree {
	
	  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	       return common(root,p,q); 
	    }
	  private TreeNode common(TreeNode root,TreeNode p, TreeNode q) {
		  if(root==null||root==p||root==q) {
			  return root;
		  }//hou xu
		  TreeNode left = common(root.left,p,q);
		  TreeNode right= common(root.right,p,q);
		  if(left==null&&right==null)return null;
		  if(left!=null&&right==null)return left;
		  if(left==null&&right!=null)return right;
		  else {return root;}
	  }
}
