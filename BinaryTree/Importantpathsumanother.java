package BinaryTree;

public class Importantpathsumanother {
	  private static boolean hasPathSum(TreeNode root, int targetSum) {
			 if(root==null)return false;
		        int sum = 0;
				        return check(root,targetSum,sum);
				    }
				 private static boolean check(TreeNode temp,int target,int sum) {
					 if(temp==null)return false;
					  sum= sum+temp.val;
					 if(temp.left==null&&temp.right==null) {
						 if(sum==target)return true;
					 }
					if(temp.left!=null) {
						 System.out.println("1before"+sum);
					 boolean left = check(temp.left,target,sum);
					 System.out.println("1after"+sum);
					 if(left)return true;
		               
					
					}
					if(temp.right!=null) {
						 System.out.println("before"+sum);
						 boolean right = check(temp.right,target,sum);
						 System.out.println("after"+sum);
						 if(right)return true;
		               				
						}
					return false;
					 
				 }
				 public static void main(String[] args) {					 
					 TreeNode temp = new TreeNode(1);
					 TreeNode temp2 = new TreeNode(1);
					 TreeNode root = new TreeNode(0,temp,temp2);
					 System.out.print(hasPathSum(root,1));
				 }
		}