package Linkedlist;

public class SWAP24 {
	 public ListNode swapPairs(ListNode head) {
		 if(head==null||head.next==null)return head;
		 ListNode dummyhead = new ListNode();
		 dummyhead.next = head;
		 ListNode current = dummyhead;		
		 while(current.next!=null&&current.next.next!=null) {
			 ListNode temp = current.next;
			 ListNode temp2= temp.next;
			 current.next = temp2;
			 temp.next = temp2.next;
			temp2.next = temp;
			current = temp;
			
		 }
		 return dummyhead.next;
		 
	 }
}
