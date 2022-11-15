package BinaryTree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class AverageofLevelsinBinaryTree {
	  public List<Double> averageOfLevels(TreeNode root) {
	        List<Double> res = new ArrayList<>();
	        Deque <TreeNode> temp = new LinkedList<>();
	        if(root==null)return res;
	        temp.addLast(root);
	        while(!temp.isEmpty()) {
	        	int len = temp.size();
	        	double all = 0;
	        	int len2 = len;
	        	while(len>0) {
	        		TreeNode current = temp.pollFirst();
	        	    all = all + current.val;
	        	    if(current.left!=null) temp.addLast(current.left);
	        	    if(current.right!=null) temp.addLast(current.right);
	        		len--;
	        	}
	        	double ave = all/len2;
	        	res.add(ave);
	        }
	        return res;
	    }
}
