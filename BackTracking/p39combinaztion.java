package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class p39combinaztion {
	 List<List<Integer>> output = new LinkedList<List<Integer>>();
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		 int start = 0;
		 List<Integer> temp = null;
		 Arrays.sort(candidates);
		 getlist(new ArrayList<Integer>(),start,target,0,candidates);
	        return output;
	        
	    }
	public void  getlist(ArrayList<Integer> temp,int start,int target, int sum,int[]candidates) {
	if(target==sum) {
		output.add(new ArrayList<>(temp));
	}
	else if(sum>target) {
		return;
	}else {
	for(int i = 0;i<candidates.length;i++) {
		temp.add(candidates[i]);
		getlist(temp,start+1,target,sum+candidates[i],candidates);
		temp.remove(temp.size()-1);
	}
	}
	}
	}

