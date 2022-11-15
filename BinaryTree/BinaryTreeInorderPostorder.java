package BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeInorderPostorder {
	 Map<Integer,Integer> check = new HashMap<Integer,Integer>();
	 public TreeNode buildTree(int[] inorder, int[] postorder) {
		 
	       for(int i = 0;i<inorder.length;i++) {
	    	   check.put(inorder[i], i);
	       }
	       return construct(inorder,0,inorder.length,postorder,0,postorder.length);
	    }
	 private TreeNode construct(int[] inorder,int inbegin,int inend,int[]postorder, int postbegin,int postend) {
		 if(inbegin>=inend||postbegin>=postend)return null;
		 int rootval = postorder[postend-1];
		 int location = check.get(postorder[postend-1]);
		 int len = location - inbegin;
		 TreeNode root = new TreeNode(rootval);
	  root.left=construct(inorder,inbegin,location,postorder,postbegin,postbegin+len);
 root.right=construct(inorder,location+1,inend,postorder,postbegin+len,postend-1);
		 return root;
		 
	 }
}
