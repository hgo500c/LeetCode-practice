package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Inorder {
	 public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> arr = new ArrayList<>();
TreeNode current = root;
Stack<TreeNode> temp = new Stack<TreeNode>();
while(!temp.empty()  || current != null) {
 if(current!=null) {
	  temp.push(current);
	  current=current.left;
 }else {
	  current = temp.pop();
	  arr.add(current.val);
	  current = current.right;
 }
}
return arr; 
}
}

