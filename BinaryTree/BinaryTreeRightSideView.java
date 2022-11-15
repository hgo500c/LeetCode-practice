package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
	  public List<Integer> rightSideView(TreeNode root) {
	  List<Integer> res = new ArrayList<Integer>();
	  Queue<TreeNode>temp = new LinkedList<TreeNode>();
	  if (root == null) {
          return res;
      }
	  temp.add(root);
	  while(!temp.isEmpty()) {
		  int len = temp.size();
		  for(int i = 0;i<len;i++) {
			  TreeNode current = temp.poll();
			  if(current.left!=null)temp.add(current.left);
			  if(current.right!=null)temp.add(current.right);
			  if(i==len-1)res.add(current.val);
		  }
	  }
	  return res;
	  }
}
