package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeLevel222 {
	  public List<List<Integer>> levelOrderBottom(TreeNode root) {
	  List<List<Integer>> res = new LinkedList<>();
	  if(root == null)return res;
	  Queue<TreeNode> temp = new LinkedList<>();
	  
	  temp.add(root);
	  while(!temp.isEmpty()) {
		  int len = temp.size();
		  List<Integer>currentlevel = new ArrayList<>(); 
		  while(len>0) {
			  TreeNode currentNode= temp.poll();
			  if(currentNode.left!=null)temp.add(currentNode.left);
			  if(currentNode.right!=null)temp.add(currentNode.right);
			  currentlevel.add(currentNode.val);
			  len--;
		  }
		  res.add(currentlevel);
	  }
	  return res;
	  
	  }
}
