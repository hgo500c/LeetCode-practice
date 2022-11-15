package Linkedlist;

public class RemoveNthNodeFormEND {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
			ListNode tempp = new ListNode();
			ListNode temppp = new ListNode();
			tempp = head;
			temppp = head;
			int i = 0;
			int j = 0;
			while(temppp!=null) {
				if(temppp!=null) {
					 j++;
					 temppp=temppp.next;
				 }
			}
			int z = j-n-1;
			while(head!=null) {
		        if(j==1&&n==1){
		            head = null;
		            return head;
		        }
		        if(z==-1){
		            return head.next;
		        }
			 if(i==z) {
				 ListNode temp = new ListNode(0);
				 ListNode ttemp = new ListNode(0);
		         if(head.next==null){
		             head=null;
		         }else{
				 temp = head.next;
		         if(temp.next==null){
		             head.next=null;
		         }else{
				 ttemp = temp.next;
				 head.next=ttemp;
		         }
			 }
		     }
			 if(head!=null) {
				 i++;
				 head=head.next;
			 }
			}
			return tempp;
		    }
}
