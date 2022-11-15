package BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelTREENUmber {
	
	    public int maxDepth(TreeNode root) {	    	 
	   	  if(root == null)return 0;
	   	  Queue<TreeNode> temp = new LinkedList<>();	  
	   	  temp.add(root);
	   	 int number =0;
	   	  while(!temp.isEmpty()) {
	   		  int len = temp.size();	   		  
	   		  while(len>0) {
	   			  TreeNode currentNode= temp.poll();
	   			  if(currentNode.left!=null)temp.add(currentNode.left);
	   			  if(currentNode.right!=null)temp.add(currentNode.right);   			 
	   			  len--;
	   		  }
               number++;
	   	  }
	   	  return number;
	   	 	   	 
	       }
	    }
	

