package BinaryTree;

public class deleteBST {
	  public TreeNode deleteNode(TreeNode root, int key) {
	        return delete(root,key);
	    }
	  private TreeNode delete(TreeNode temp,int val) {
		  if(temp==null)return null;
		  else if(temp.val>val)temp.left=delete(temp.left,val);
		  else if(temp.val<val)temp.right=delete(temp.right,val);
		  else {
			 if(temp.left==null)return temp.right;
			 if(temp.right==null)return temp.left;
				 TreeNode ri=temp.right;
				 TreeNode right = temp.right;
				 while(ri.left!=null) {
					 ri=ri.left;
				 }
				 ri.left=temp.left;
				 right=delete(right,val);
				  temp =right;
				  return temp;
				
			 }
		  
		  return temp;
	  }
}
