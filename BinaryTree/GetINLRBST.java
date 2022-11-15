package BinaryTree;

public class GetINLRBST {
	 public TreeNode trimBST(TreeNode root, int low, int high) {
	        return LR(root,low,high);
	    }
	 private TreeNode LR(TreeNode temp,int l,int r) {
		 if(temp==null)return temp;
		 if(temp.val<l)return LR(temp.right,l,r);
		 if(temp.val>r)return LR(temp.left,l,r);
		 else {
			 temp.left=LR(temp.left,l,r);
			 temp.right=LR(temp.right,l,r);
			 return temp;
		 }
		
		 
	 }
}
