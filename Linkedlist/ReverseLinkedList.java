package Linkedlist;

public class ReverseLinkedList {
	 public ListNode reverseList(ListNode head) {
	        ListNode pre = new ListNode();
	        ListNode cur = new ListNode();
	        pre = head;
	        if(head==null)return head;
	        if(pre.next==null) {
	        	return head;
	        }
	        cur = head.next;
	        if(cur.next==null) {
        		cur.next=pre;
        		pre.next=null;
        		head = cur;
        		return head;
        	}else {
        		pre.next=null;
	        while(cur.next!=null) {
	        	ListNode temp = cur.next;
	        	cur.next=pre;
	            pre=cur;
	            cur = temp;   
	        }
	        cur.next=pre;
        	}
	        head = cur;
	        return head;
	    }
}
