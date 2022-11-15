package linkedlist;
import java.util.*;
import java.util.LinkedList;

public class addtwonumbers {
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	  ListNode tempp = new ListNode(0);
	  ListNode output = new ListNode();
      ListNode p = l1, q = l2;
	  output =tempp;
	  int sum=0;
	  int cur=0;
	  while(p!=null||q!=null) {
		  int a, b;
		  if(p==null) {
			  a=0;
		  }else {
			  a=p.val;
		  }
		  if(q==null) {
			  b=0;
		  }else {
			  b=q.val;
		  }
		  sum = a+b+cur%10;
		  cur =  a+b+cur/10;
		  output.next = new ListNode(sum);
          output = output.next;
		  if(p.next!=null) {
			  p=p.next;
		  }
		  if(q.next!=null) {
			  q=q.next;
		  }
	  }
	  if(cur>0) {
	
		  output=new ListNode(cur);
	  }	  
	  return tempp.next;
    }
}
