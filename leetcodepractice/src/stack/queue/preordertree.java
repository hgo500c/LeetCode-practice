package stack.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class preordertree {
public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> temp = new Stack<>();
        TreeNode curr =root;
        while(!temp.isEmpty()||curr!=null) {
        while(curr!=null) {
         list.add(curr.val);
         temp.add(curr);
         curr= curr.left;
        }
        curr=temp.pop();
        curr=curr.right;
        }
        return list;
    }
}
