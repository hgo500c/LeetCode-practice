package array;

public class MoveZeroes {
 public void moveZeroes(int[] nums) {
        int s = 0;
        int f = 0;
        for(s =0;f<nums.length;f++) {
        	if(nums[f]!=0) {
        		nums[s]=nums[f];
        		s++;
        	}
        	
        }
        for(int i = s;i<nums.length;i++) {
        	nums[i]=0;
        }
    }
}
