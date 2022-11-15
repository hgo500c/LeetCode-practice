package BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class buildTreepreandinorder {
	Map<Integer,Integer> check=new HashMap<Integer,Integer>();
	 public TreeNode buildTree(int[] preorder, int[] inorder) {
		    for(int i = 0;i<inorder.length;i++) {
		    	   check.put(inorder[i], i);
		       }
		       return construct(inorder,0,inorder.length,preorder,0,preorder.length);
		    }
		 private TreeNode construct(int[] inorder,int inbegin,int inend,int[]preorder, int prebegin,int preend) {
			 if(inbegin>=inend||prebegin>=preend)return null;
			 int rootval = preorder[prebegin];
			 int location = check.get(rootval);
			 int len = location - inbegin;
			 TreeNode root = new TreeNode(rootval);
		  root.left=construct(inorder,inbegin,location,preorder,prebegin+1,prebegin+1+len);
	 root.right=construct(inorder,location+1,inend,preorder,prebegin+len+1,preend);
			 return root;
			 
		 }
	    }

