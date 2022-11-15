package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class ModeinBST {
	int number;
	int max;
	TreeNode pre;
	List<Integer> reslist = new ArrayList<>();	
 public int[] findMode(TreeNode root) {
	 number =0;
	 max =0;
        mode(root);
        int[] ans = new int[reslist.size()];
       for(int i =0;i<reslist.size();i++) {
    	   ans[i]=reslist.get(i);
       }
       return ans;
    }
 private void mode(TreeNode root) {
	 if(root==null)return;
	 mode(root.left);
	 int rootValue = root.val;
	 if(pre!=null&&root.val==pre.val) {
		number++;
	 }else {
		 number = 1;
	 }
	 if(max<number) {
			max=number;
			reslist.clear();
			reslist.add(rootValue);
		}if(max==number) {
			reslist.add(rootValue);
		}
	 pre=root;
	 mode(root.right);
 }
}
