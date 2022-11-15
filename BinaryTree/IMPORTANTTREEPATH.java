package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class IMPORTANTTREEPATH {
	  public static List<String> binaryTreePaths(TreeNode root) {
	        List<String>res= new ArrayList<>();
	        List<Integer>path= new ArrayList<>();        
	        return add(root,res,path);
	    }
	  private static List<String> add (TreeNode temp,List<String>res,List<Integer>path){
		  path.add(temp.val);
		  System.out.print("ff "+path.toString());
		  if(temp.left==null&&temp.right==null) {
			  StringBuffer s= new StringBuffer();
			  for(int i = 0;i<path.size()-1;i++) {
				  s.append(path.get(i)+"->");
			  }
			  s.append(path.get(path.size()-1));
			  res.add(s.toString());
		  }
		  if(temp.left!=null) {
			  add(temp.left,res,path);
			  System.out.print(" 1"+path.toString());
			  path.remove(path.size()-1);
			  System.out.print(" 2"+path.toString());
		  }
		  if(temp.right!=null) {
			  System.out.print(" test"+path.toString());
			  System.out.print(" "+temp.right.val+" ");
			  add(temp.right,res,path);
			  System.out.print(" 3"+path.toString());
			  path.remove(path.size()-1);
			  System.out.print(" 4"+path.toString());
		  }
		  return res;
	  }
	  public static void main(String[] args) {					 
			 
			 TreeNode temp3 = new TreeNode(3);
			 TreeNode temp4 = new TreeNode(4);
			 TreeNode temp5 = new TreeNode(5);
			 TreeNode temp2 = new TreeNode(2,temp3,temp4);
			 TreeNode temp1 = new TreeNode(1,null,temp5);
			 TreeNode root = new TreeNode(0,temp1,temp2);
			binaryTreePaths(root);
		 }
}

