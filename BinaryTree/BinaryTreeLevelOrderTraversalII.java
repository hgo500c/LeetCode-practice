package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
	   List<List<Integer>> res = new ArrayList<List<Integer>>();
	   List<List<Integer>> res2 = new ArrayList<List<Integer>>();
   	treelevel (root,0,res);
   	for(int i = res.size()-1; i>=0;i--) {
   		res2.add(res.get(i));
   	}
   	
   	return res2;
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
