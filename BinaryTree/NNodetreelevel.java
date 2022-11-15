package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class NNodetreelevel {
	  public List<List<Integer>> levelOrder(Node root) {
		  List<List<Integer>> res = new LinkedList<>();
		  if(root == null)return res;
		  Queue<Node> temp = new LinkedList<>();
	       temp.add(root);
		  while(!temp.isEmpty()) {
			  int len = temp.size();
			  List<Integer>currentlevel = new ArrayList<>(); 
			  while(len>0) {
				  Node currentNode= temp.poll();
				  List<Node>nextlevel = currentNode.children;
				  for(int i = 0;i<nextlevel.size();i++) {
					  if(nextlevel.get(i)!=null) {
                 temp.add(nextlevel.get(i));
			  }	 
				  }
				  currentlevel.add(currentNode.val);
				  len--;
			  }
			  res.add(currentlevel);
		  }
		  return res;
	}	  
}
