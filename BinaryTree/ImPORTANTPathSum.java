package BinaryTree;

public class ImPORTANTPathSum {	 
		 public boolean hasPathSum(TreeNode root, int targetSum) {
			 if(root==null)return false;
		        return check(root,targetSum,0);
		    }
		 private boolean check(TreeNode temp,int target,int sum) {
			 if(temp==null)return false;
			 sum= sum+temp.val;
			 if(temp.left==null&&temp.right==null) {
				 if(sum==target)return true;
			 }
			
			 boolean left = check(temp.left,target,sum);
		
		
			 boolean right = check(temp.right,target,sum);
			
			
			return left||right;
			 
		 }
 }