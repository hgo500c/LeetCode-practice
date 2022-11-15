package BinaryTree;

public class mergetwotree {
	 public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
	       return  merge(root1,root2);
	    }
	 private TreeNode merge(TreeNode temp1,TreeNode temp2) {
		 int val = 0;
		 if(temp1==null&&temp2==null)return null;
		 if(temp1!=null&&temp2==null) {
			 return temp1;
		 }
		 if(temp1==null&&temp2!=null) {
			 return temp2;
		 }
		 if(temp1!=null&&temp2!=null) {
			 val = temp1.val+temp2.val;
		 }
		 TreeNode root = new TreeNode(val);
		 root.left=merge(temp1.left,temp2.left);
		 root.right=merge(temp1.right,temp2.right);
		 return root;
	 }
}
