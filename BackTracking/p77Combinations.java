package BackTracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class p77Combinations {
	List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer>paths= new LinkedList<>();
	   public List<List<Integer>> combine(int n, int k) {
	     combination(n,k,1);
	     return res;
	    }
	   private void combination (int n,int k,int start) {
		  if(paths.size()==k) {
			  res.add(new ArrayList<>(paths));
			  return;
		  }
		  for(int i = start;i<=n-(k-paths.size())+1;i++) {
			  paths.add(i);
			  combination(n,k,i+1);
			  paths.removeLast();
		  }
	   }
	}
