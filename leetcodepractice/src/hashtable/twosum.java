package hashtable;
import java.util.*;
class twosum {
    public int[] twoSum(int[] nums, int target) {
            int length = nums.length;
            Hashtable leftnumber = new Hashtable();
          for (int i = 0;i<length;i++) {
        	  leftnumber.put(target-nums[i],i);
          }
          
          for (int j = 0;j<length;j++) {
          Integer n = (Integer)leftnumber.get(nums[j]);
          if (n != null && n!=j) {
        	  int[]output = {n,j};
          return output;
          }
          }
          
        return null;
        }
      }