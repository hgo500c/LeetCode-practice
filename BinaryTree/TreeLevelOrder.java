package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class TreeLevelOrder {
	  public List<List<Integer>> levelOrder(TreeNode root) {
          List<List<Integer>> res = new ArrayList<List<Integer>>();
	    	treelevel (root,0,res);
	    	return res;
	    }
	    public void treelevel (TreeNode temp,int level,List<List<Integer>>res) {
	    	if(temp==null)return;
	    	level++;
	    
	    if(res.size()<level) {
	    	List<Integer> newone = new ArrayList<Integer>();
	    	res.add(newone);
	    }
	    res.get(level-1).add(temp.val);
	    treelevel(temp.left,level,res);
	    treelevel(temp.right,level,res);
	}
  
}

