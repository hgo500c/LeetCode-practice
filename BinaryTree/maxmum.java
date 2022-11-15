package BinaryTree;

public class maxmum {
	 public TreeNode constructMaximumBinaryTree(int[] nums) {
	        return theroot(0,nums.length,nums);
 }
private TreeNode theroot(int begin,int end,int[]nums) {
	 if(begin>=end)return null;
  if((end-begin)==1) return new TreeNode(nums[begin]);
	 int maxvalue = Integer.MIN_VALUE;
	 int number =-1;
	 for(int i =begin;i<end;i++) {
		if(nums[i]>maxvalue) {
			maxvalue = nums[i];
			number = i;
		}
	 }
	 TreeNode root = new TreeNode(maxvalue);
	 root.left=theroot(begin,number,nums);
	 root.left=theroot(number+1,end,nums);
	 return root;
}
}