package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class newInorder {
	 public List<Integer> inorderTraversal(TreeNode root) {
		 List<Integer> list = new ArrayList<Integer>();
		 inorder(list,root);
		 return list;
	 }
	 private void inorder(List<Integer>list,TreeNode current) {
		 if(current == null) {
			 return;
		 }
		 inorder(list,current.left);
		 list.add(current.val);
		 inorder(list,current.right);
	 }
}
