package HashMap;

import java.util.HashMap;

public class TwoNUmber {
	 public int[] twoSum(int[] nums, int target) {
		 int[]result = new int[2];
		 HashMap<Integer,Integer> checktable = new HashMap<Integer,Integer> ();
		 for(int i = 0;i<nums.length;i++) {
			 int n = target - nums[i];
			 if(checktable.containsKey(n)) {
				 result[0] = checktable.get(n);
				 result[1]=i;
				 return result;
			 }
			 checktable.put(nums[i], i);
		 }
		 return result;
	 }
}
