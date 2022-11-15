package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class 全排列重复2 {
	  private List<List<Integer>> res = new ArrayList<>();
	    private List<Integer> path = new ArrayList<>();
	    private boolean[] used = null;

	    public List<List<Integer>> permuteUnique(int[] nums) {
	        used = new boolean[nums.length];
	        Arrays.sort(nums);
	        backtracking(nums);
	        return res;
	    }

	    public void backtracking(int[] nums) {
	        if (path.size() == nums.length) {
	            res.add(new ArrayList<>(path));
	            return;
	        }
	        HashSet<Integer> hashSet = new HashSet<>();//层去重
	        for (int i = 0; i < nums.length; i++) {
	            if (hashSet.contains(nums[i]))
	                continue;
	            if (used[i] == true)//枝去重
	                continue;
	            hashSet.add(nums[i]);//记录元素
	            used[i] = true;
	            path.add(nums[i]);
	            backtracking(nums);
	            path.remove(path.size() - 1);
	            used[i] = false;
	        }
	    }
	}

