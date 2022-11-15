package stack.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class newpreorder {
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> temp = new Stack<>();
        TreeNode curr =root;
        while(!temp.isEmpty()||curr!=null) {
        if(curr!=null) {
        	temp.push(curr);
        	list.add(curr.val);
        	curr= curr.left;
        }else {
        	curr=temp.pop();
        	curr=curr.right;
        }
        
        }
        return list;
    }
}
