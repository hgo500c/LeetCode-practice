package BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueinEachTreeRow {
public List<Integer> largestValues(TreeNode root) {
	 List<Integer> res = new LinkedList<>();
	  if(root == null)return res;
	  Queue<TreeNode> temp = new LinkedList<>();	  
	  temp.add(root);
	  while(!temp.isEmpty()) {
		  int len = temp.size();
		  int large = Integer.MIN_VALUE;
		  
		  while(len>0) {
			  TreeNode currentNode= temp.poll();
			  if(currentNode.left!=null)temp.add(currentNode.left);
			  if(currentNode.right!=null)temp.add(currentNode.right);
			 if(large<currentNode.val)large = currentNode.val;
			  len--;
		  }
		  res.add(large);
	  }
	  return res;
	  
	 
    }
}
