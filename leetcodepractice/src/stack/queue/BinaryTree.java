package stack.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Definition for a binary tree node.
  
public class BinaryTree {
	 public List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> arr = new ArrayList<>();
	        TreeNode current = root;
	       Stack<TreeNode> temp = new Stack<TreeNode>();
	       while(!temp.empty() || current != null) {
	    	   while(current!= null) {
	    		   temp.add(current);
	    		   current=current.left;
	    	   }
	    	   current=temp.pop();
	    	   arr.add(current.val);
	    	   current=current.right;		
	        	}
	        return arr;
	    }
	}
