package BinaryTree;

public class depthcheck {
	 public int maxDepth(TreeNode root) {
      if(root ==null)return 0;
      int depth =0;
      return depth(root,depth);
	 }
	 private int depth(TreeNode temp,int level) {
        if(temp==null)return level;
        level = level+1;
        int left = depth(temp.left,level);
        int right = depth(temp.right,level);
        if(left>right)return left;
        else {return right;}
	 }
}
