package BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class È«ÅÅÁĞ {
	LinkedList<Integer> paths= new LinkedList<>();
	ArrayList<List<Integer>>res= new ArrayList<>();
	 public List<List<Integer>> permute(int[] nums) {
	      backtracking(nums);
	        return res;
	    }
	  private void backtracking (int[]nums) {
		  if(nums.length==paths.size()) {
		  res.add(new ArrayList<>(paths));
		  return;
		  }
		  boolean[] used = new boolean[nums.length];
		  for(int i = 0;i<nums.length;i++) {
			//  if (paths.contains(nums[i])) {
	       //         continue;
	        //    } 
			  if (used[i]){
	                continue;
	            }
	            used[i] = true;
			  paths.add(nums[i]);
			  backtracking(nums);
			  paths.removeLast();
			  used[i] = false;
		  }
		  
	  }
}
