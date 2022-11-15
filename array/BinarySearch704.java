package array;

public class BinarySearch704 {
	 public static int search(int[] nums, int target) {
		 
	       int n = nums.length/2;
	       for(int i = 0;i<=n;i++) {
	    	   if(nums[n]==target)return n;
	    	   if(nums[n]>target) {
	    		   n=n/2;
	    	   }
	    	   else {
	    		   int p = n/2;
	    		   n= p+n;
	    	   }
	       }
	       return -1;
	    }
	 public static void main(String[] args) {
		 int x = 2;
		 int[] z = {1,3,4,2,3};
		 int c = search(z,x);
		 System.out.print(c);
		
	 }
	}

