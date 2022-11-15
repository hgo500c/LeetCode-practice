package BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class p216CombinationSUM {
	LinkedList<Integer> path = new LinkedList<>() ;
    ArrayList<List<Integer>>res = new ArrayList<>();
 
public List<List<Integer>> combinationSum3(int k, int n) {
       backtracking(k,n,0,1);
       return res;
    }
private void backtracking(int k,int n,int sum,int start) {
	if(path.size()==k) {
	if(sum==n) {
		res.add(new ArrayList<>(path));
		return;
	}else {
		return;
	}
}
	for(int i = start;i<=9-(k-path.size())+1;i++){
		path.add(i);
		backtracking(k,n,sum+i,i+1);
		path.removeLast();		
	}
}
}
