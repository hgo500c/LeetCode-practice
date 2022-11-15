package linkedlist;

public class swapnode {
public ListNode swapPairs(ListNode head) {
        ListNode temp = new ListNode(0);
        if(head==null||head.next==null) return head;
        temp.next=head.next;
        ListNode cur = new ListNode(0);
        while(head!=null||head.next!=null) {
        	 cur=head;
        	 head=head.next;
        	 cur.next=head.next;
        	 head.next=cur;
        	 head=cur.next;
        	 if(head!=null&&head.next!=null)cur.next=head.next;
        	}
        return temp.next;
        }
    }


