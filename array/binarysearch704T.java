package array;

public class binarysearch704T{
	public static int search(int[] nums, int target) {
	 if (nums == null || nums.length == 0) return -1;
     int left = 0;
     int right = nums.length - 1;
     while (left <= right) {
         int mid = left + (right - left) / 2;
         if (nums[mid] == target) return mid;
         if (nums[mid] > target) right = mid - 1;
         else left = mid + 1;
         
     }
     return -1;
}
	 public static void main(String[] args) {
		 int x = 2;
		 int[] z = {0,1,4,3,5,6};
		 int c = search(z,x);
		 System.out.print(c);
		
	 }
}
