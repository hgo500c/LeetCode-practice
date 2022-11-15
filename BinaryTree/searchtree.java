package BinaryTree;

public class searchtree {
	  public TreeNode searchBST(TreeNode root, int val) {
	        TreeNode check= new TreeNode();
	        if(root==null)return null;
	        return find(root,val,check);
	    }
	  private TreeNode find (TreeNode temp, int val,TreeNode check) {
		  if(temp==null) {return null;}
		  if(temp.val==val) {return temp;}

		  if(temp.val>val) {return find(temp.left,val,check);
		  }else {
			  return find(temp.right,val,check);		  		  
	  }
	}
}
