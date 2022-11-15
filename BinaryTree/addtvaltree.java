package BinaryTree;

public class addtvaltree {
	   int sum=0;
	   public TreeNode convertBST(TreeNode root) {
	        return build(root);
	    }
	   private TreeNode build(TreeNode temp) {
		   if(temp==null)return temp;
		   temp.right = build(temp.right);
           sum = sum+temp.val;
	       temp.left = build(temp.left);
	    	return temp;	 
	   }
	}
