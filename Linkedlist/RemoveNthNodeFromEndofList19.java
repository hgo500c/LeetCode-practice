package Linkedlist;

public class RemoveNthNodeFromEndofList19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode fast = new ListNode();
		ListNode slow= new ListNode();
        ListNode dummyhead = new ListNode();
        ListNode current =head;
        dummyhead.next = head;
        slow = dummyhead;
        for (int i = 1;i<n;i++) {
        	current = current.next;
        }
        fast = current;
        while(fast.next!=null) {
        	fast = fast.next;
        	slow = slow.next;
        }
        ListNode RemoveNode = slow.next;
        slow.next =RemoveNode.next;
        return dummyhead.next;
	}
}
