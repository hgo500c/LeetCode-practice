package array;

public class Searchinsertedposition {
	public int searchInsert(int[] nums, int target) {
	int high = nums.length-1;
    int low = 0;
	 for (int i = 0;i<nums.length;i++) {
		 if(nums[i]==target) {
			 return i;
		 }
		 if(nums[0]>target){
			 return 0;
		 }
		 if(nums[high]<target) {
			 return high+1;
		 }
		 if(nums[i]<target&&nums[i+1]>target) {
			 return i+1;
		 }
	 }
	 return 0;
}
}
