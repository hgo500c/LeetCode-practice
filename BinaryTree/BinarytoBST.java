package BinaryTree;

public class BinarytoBST {
public TreeNode sortedArrayToBST(int[] nums) {
        
        return sort(nums,0,nums.length);
    }
private TreeNode sort(int[]nums,int l,int r) {
	if(l>=r)return null;
	if((r-l)==1) {
      TreeNode te = new TreeNode(nums[l]);
      return te;
} 
	int mid =(l+r)/2;
	int len = mid-l;
	TreeNode root = new TreeNode(nums[mid]);
	root.left=sort(nums,l,mid);
	root.right=sort(nums,mid+1,r);
	return root;		
}
}
