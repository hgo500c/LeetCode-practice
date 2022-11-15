package array;

public class MostWater {
	 public int maxArea(int[] height) {
	      int sum = 0;
	      int output =0;
	       output = getarea(height);
	      return output;
	    }
	 public int getarea(int[] height) {
		       int heightfirst = 0;
		       int sum = 0;
			 for(int i = 0;i <height.length;i++) {
				 heightfirst = height[i];
				 int heightnow = 0;
				 for(int j = i; j<height.length;j++) {
					 int lengthh = j-i;
					 int sumnow =0;
					 if(height[j]<=heightfirst) {
					    sumnow = lengthh * height[j]; 
					 }else {
					  sumnow = lengthh * heightfirst; 
					 }
					 if(sumnow>sum) {
						 sum = sumnow;
					 }
				 }
			 }
				 return sum;
				 
			 }
	 }

