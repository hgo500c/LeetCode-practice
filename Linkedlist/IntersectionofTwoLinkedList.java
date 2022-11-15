package Linkedlist;

public class IntersectionofTwoLinkedList {
	  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        int counta = 0;
	        int countb =0;
	        ListNode cura = headA;
	        ListNode curb = headB;
	        while (cura!=null) {
	        	counta++;
	        	cura=cura.next;
	        }
	        while (curb!=null) {
	        	countb++;
	        	curb=curb.next;
	        }
	        cura=headA;
	        curb=headB;
	        if(counta>=countb) {
	        	int a = counta-countb;
	        	for(int i =0;i<a;i++) {
	        		cura=cura.next;
	        	}
	        	while(cura!=null) {
	        		if(cura==curb)return cura;
	        		cura=cura.next;
	        		curb=curb.next;
	        		}
	        	}
	        if(counta<countb) {
	        	int a = countb-counta;
	        	for(int i =0;i<a;i++) {
	        		curb=curb.next;
	        	}
	        	while(cura!=null) {
	        		if(cura==curb)return cura;
	        		cura=cura.next;
	        		curb=curb.next;
	        		}
	        	}
	        return null;
	    }
}
