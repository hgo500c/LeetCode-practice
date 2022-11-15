package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class combination3 {
	List<List<Integer>> output = new LinkedList<List<Integer>>();
	LinkedList<Integer> temp = new LinkedList<Integer>();
	 public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		 Arrays.sort(candidates);
		 back(candidates,target,0,0);
		 return output;
	    }
	 private void back(int[]candidates,int target,int start,int sum) {
		 
		 if(sum==target) {
			 output.add(new ArrayList<>(temp));
			 return;
		 }else if(sum>target) {
			 return;
		 }else {
			 for(int i = start;i<candidates.length;i++) {
				 if ( i > start && candidates[i] == candidates[i - 1] ) {
				        continue;
				      }
				 temp.add(candidates[i]);
				 back(candidates,target,i+1,sum+candidates[i]);
				 temp.removeLast();
			 }
		 }
	 }
}
