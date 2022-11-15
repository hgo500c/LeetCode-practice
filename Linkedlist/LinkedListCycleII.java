package Linkedlist;

public class LinkedListCycleII {
	 public ListNode detectCycle(ListNode head) {
	        ListNode fast=new ListNode();
	        ListNode slow =new ListNode();
	        fast = head;
	        slow = head;
	        while(fast.next!=null) {
	        	slow = slow.next;
	        	fast = fast.next.next;
	        	if(slow==fast) {
	        		ListNode newone = head;
	        		ListNode cur = fast;
	        		while(newone!=cur) {
	        			newone = newone.next;
	        			cur = cur.next;
	        		}
	        		return newone;
	        	}
	        	
	        }
	        return null;
	    }
}
