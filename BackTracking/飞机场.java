package BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class �ɻ��� {
	 private LinkedList<String> res;
	    private LinkedList<String> path = new LinkedList<>();
public List<String> findItinerary(List<List<String>> tickets) {
	  Collections.sort(tickets, (a, b) -> a.get(1).compareTo(b.get(1)));
	  path.add("JFK");
	  boolean[] used = new boolean[tickets.size()];
	  back((ArrayList) tickets, used);
      return res;
    }
private boolean back (List<List<String>> tickets,boolean[]used ) {
	if(path.size()==tickets.size()+1) {
		 res = new LinkedList(path);
		 return true;
}
	 for (int i = 0; i < tickets.size(); i++) {
		 if(used[i]==false&&tickets.get(i).get(0).equals(path.getLast())){
			 path.add(tickets.get(i).get(1));
             used[i] = true;
             if (back(tickets, used)) {
                 return true;
             }
             used[i] = false;
             path.removeLast();
		 }
	 }
	   return false;
}
}
