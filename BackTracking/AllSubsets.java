package BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllSubsets {
	LinkedList<Integer> paths = new LinkedList<>();
	ArrayList<List<Integer>>res = new ArrayList<>();
	
	  public List<List<Integer>> subsets(int[] nums) {
	        backtracking(nums,0);
	        return res;
	    }
	  private void backtracking (int[]nums,int start) {
		  res.add(new ArrayList<>(paths));
		  for(int i = start;i<nums.length;i++) {
			  paths.add(nums[i]);
			  backtracking(nums,i+1);
			  paths.removeLast();
		  }
		  
	  }
}
