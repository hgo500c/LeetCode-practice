package BinaryTree;

import java.util.Deque;
import java.util.LinkedList;

public class FindBottomLeftTreeValue {
	 public int findBottomLeftValue(TreeNode root) {
	         Deque<TreeNode> check= new LinkedList<>();
	         if(root==null)return 0;
	         check.push(root);
	         int length=0;
	         int number=0;
	         while(!check.isEmpty()) {
	        	length=check.size();
	        	for(int i =0;i<length;i++) {
	        		if(i==0)number=check.peek().val;
	        		TreeNode temp =check.pop();
	        		if(temp.left!=null)check.addLast(temp.left);
	        		if(temp.right!=null)check.addLast(temp.right);
	        	}
	         }
	         return number;
	    }
}
