package Linkedlist;

public class removeLinkedListElements203{
public ListNode removeElements(ListNode head, int val) {
        ListNode tempNode = new ListNode();
        ListNode currentNode = tempNode;
        while(head!=null) {
        	if(head.val!=val) {
        		currentNode.next=head;
        		currentNode = head;//still stop in here
        		head = head.next;
        	}else {
        		head = head.next;
        	}
        	
        }
        currentNode.next =null;
		return tempNode.next;
        
    }

}
