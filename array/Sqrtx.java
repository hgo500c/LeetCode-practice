package array;

public class Sqrtx {
public int mySqrt(int x) {
        if(x==0)return 0;
        int left = 0;
        int right = Integer.MAX_VALUE;
        while(true) {
        	int mid = (left+right)/2;
        	if((x/mid)==mid)return mid;
        	if((x/mid)>mid) {
        		left=mid+1;
        	}
        	else {
        		if(x/(mid-1)>(mid-1)) {
        			return mid-1;
        		}
        		right = mid -1;
        	}
        }
    }
}
