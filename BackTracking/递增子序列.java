package BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 递增子序列 {
	LinkedList<Integer> paths = new LinkedList<>();
	ArrayList<List<Integer>>res = new ArrayList<>();
	  public List<List<Integer>> findSubsequences(int[] nums) {
	        back(nums,0);
	        return res;
	    }
	  private void back(int[]nums, int start) {
		  if(paths.size()>1) {
			  res.add(new ArrayList<>(paths));
		  }
		  int[] used = new int[201]; // 这里使用数组来进行去重操作，题目说数值范围[-100, 100]
		  for(int i = start;i<nums.length;i++) {
			  if((paths.size()!=0&&nums[i]<paths.get(paths.size()-1))||(used[nums[i] + 100] == 1)) {
				continue;
			  }
			  else {
				  used[nums[i] + 100] = 1;
				  paths.add(nums[i]);
				  back(nums,i+1);
				  paths.removeLast();
			  }
		  }
	  }
	}

