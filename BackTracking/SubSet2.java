package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubSet2 {
	LinkedList<Integer> paths = new LinkedList<>();
	ArrayList<List<Integer>>res = new ArrayList<>();
	   public List<List<Integer>> subsetsWithDup(int[] nums) {
		   Arrays.sort(nums);
		    backtracking(nums,0);
	        return res;
	    }
	  private void backtracking (int[]nums,int start) {
		  res.add(new ArrayList<>(paths));
		  for(int i = start;i<nums.length;i++) {
			  if(i>start&&nums[i]==nums[i-1]) {
				  continue;
			  }
			  paths.add(nums[i]);
			  backtracking(nums,i+1);
			  paths.removeLast();
		  }
		  
	  }
}
