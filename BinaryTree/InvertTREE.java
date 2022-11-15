package BinaryTree;

public class InvertTREE {
	  public TreeNode invertTree(TreeNode root) {
	        invert(root);
	        return root;
	    }
	  private void invert(TreeNode temp) {
		  if(temp==null)return;
		  TreeNode switchNode = temp.left;
		 temp.left=temp.right;
		 temp.right=switchNode;
		 invert(temp.left);
		 invert(temp.right);
	  }
}
