package hashtable;

import java.util.Hashtable;

public class bettertwosum {
	  public int[] twoSum(int[] nums, int target) {
          int length = nums.length;
          Hashtable leftnumber = new Hashtable();
        for (int i = 0;i<length;i++) {
        Integer n = (Integer)leftnumber.get(nums[i]);
        if (n != null && n!=i) {
        	int[]output = {n,i};
            return output;
        }
      	  leftnumber.put(target-nums[i],i);
        }
        
      return null;
      }
    }