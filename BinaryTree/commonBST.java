package BinaryTree;

public class commonBST {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
	   return common(root,p,q); 
}
private TreeNode common(TreeNode root,TreeNode p, TreeNode q) {
 if(root.val>p.val&&root.val>q.val)return common(root.left,p,q);
 if(root.val<p.val&&root.val<q.val)return common(root.right,p,q);
 return root;
}
}