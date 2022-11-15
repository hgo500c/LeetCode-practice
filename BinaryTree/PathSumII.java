package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathSumII {
public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>res = new LinkedList<>();
        List<Integer>path= new LinkedList<>();
        int sum =0;
        if(root==null)return res;
        return check (res,path,root,sum,targetSum);
    }
private List<List<Integer>> check (List<List<Integer>>res,List<Integer>path,TreeNode temp,int sum,int target) {
	path.add(temp.val);
	sum = sum+temp.val;
	if(temp.left==null&&temp.right==null&&sum==target) {
		res.add(new ArrayList<>(path));
	}
	if(temp.left!=null) {
		check (res,path,temp.left,sum,target);
		path.remove(path.size()-1);
	}
	if(temp.right!=null) {
		check (res,path,temp.right,sum,target);
		path.remove(path.size()-1);
	}
	return res;
}
}
