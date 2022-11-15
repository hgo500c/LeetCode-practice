package stack.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class postorder {
	  public List<Integer> postorderTraversal(TreeNode root) {
	        LinkedList<Integer> list= new LinkedList<>();
	        Stack<TreeNode> temp = new Stack<>();
	        TreeNode curr = root;
	        while(!temp.isEmpty()||curr!=null) {
	        	if(curr!=null) {
	        		temp.push(curr);
	        		list.addFirst(curr.val);
	        		curr=curr.right;
	        	}else {
	        		curr=temp.pop();
	        		curr=curr.left;
	        	}	
	        	}
	        return list;
	    }
}
