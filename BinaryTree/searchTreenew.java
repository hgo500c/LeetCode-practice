package BinaryTree;

public class searchTreenew {
	 TreeNode check= new TreeNode();
	 public TreeNode searchBST(TreeNode root, int val) {
	        if(root==null)return null;
	        find(root,val);
	        return check;
	    }
	  private void find (TreeNode temp, int val) {
		  if(temp==null) {return;}
		  if(temp.val==val) {check = temp;}

		  find(temp.left,val);
          find(temp.right,val);		  		  
	  }
	}

