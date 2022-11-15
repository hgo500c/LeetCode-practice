package array;

public class RemoveElement {
	 public int removeElement(int[] nums, int val) {
	        int fast = 0;
	        int slow = 0;
	        for (slow =0;fast<nums.length;fast++) {
	        	if(nums[fast]!=val) {
	        		nums[slow]=nums[fast];
	        		slow++;
	        	}
	        }
	        return slow;
	    }
}
