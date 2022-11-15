package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNodeII {
	 public Nodee connect(Nodee root) {
		  if(root == null)return null;
		  Queue<Nodee> temp = new LinkedList<>();
		  temp.add(root);
		  while(!temp.isEmpty()) {
			  int len = temp.size();
			 
			  while(len>0) {
				  Nodee currentNode= temp.poll();
				  if(currentNode.left!=null)temp.add(currentNode.left);
				  if(currentNode.right!=null)temp.add(currentNode.right);
				  if(len==1)currentNode.next =null;
				  else {
				  currentNode.next = temp.peek();
				  }
				  len--;
			  }
			 
		  }
		  return root;
	    }
}
