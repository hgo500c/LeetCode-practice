package linkedlist;

public class mergetwoclass {
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode t1 = new ListNode(0),temp=t1 = new ListNode(0);
        t1.next=temp;
        while(l1!=null||l2!=null) {
        	if(l1==null) {
        		temp.next=l2;
        		temp=temp.next;
        		l2=l2.next;
        	}
        	else if(l2==null) {
        		temp.next=l1;
        		temp=temp.next;
        		l1=l1.next;
        	}else {
        		if(l1.val>=l2.val) {
        			temp.next=l2;
            		temp=temp.next;
            		l2=l2.next;
        		}else {
        			temp.next=l1;
            		temp=temp.next;
            		l1=l1.next;	
        		}
        	}
        	
        }
        return t1.next.next;
    }
}
