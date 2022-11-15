package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ȫ�����ظ�2 {
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
	        HashSet<Integer> hashSet = new HashSet<>();//��ȥ��
	        for (int i = 0; i < nums.length; i++) {
	            if (hashSet.contains(nums[i]))
	                continue;
	            if (used[i] == true)//֦ȥ��
	                continue;
	            hashSet.add(nums[i]);//��¼Ԫ��
	            used[i] = true;
	            path.add(nums[i]);
	            backtracking(nums);
	            path.remove(path.size() - 1);
	            used[i] = false;
	        }
	    }
	}

