package Linkedlist;

public class MyLinkedList {
   
    int size;
    
    ListNode head;


    MyLinkedList() {
       size = 0;
       head = new ListNode(0);
    }
    
    public int get(int index) {
    	ListNode current = head;
    	if(index<size && index>=0) {
        for(int i = 0;i<index;i++) {
        	current = current.next;
        }
        return current.val;
    	}
    	else {
    		return -1;
    	}
    }
    
    public void addAtHead(int val) {
        ListNode newhead = new ListNode(val);
        newhead.next=head;
        head = newhead;
        size++;
    }
    
    public void addAtTail(int val) {
    	ListNode current = head;
    	ListNode tail = new ListNode(val);
    	if(size==0)head=tail;
    	 for(int i = 0;i<size-1;i++) {
         	current = current.next;
         }
    	 current.next = tail;
    	 size++;
    }
    
    public void addAtIndex(int index, int val) {
    	ListNode Insert = new ListNode(val);
    	ListNode current = head;
    	if(index<size&&index>=0) {
        for(int i = 0;i<index-1;i++) {
        	current = current.next;
        }
        ListNode temp = current.next;
        current.next= Insert;
        Insert.next=temp;
        size++;
    	}if(index==size) {
    		addAtTail(val);
    	}
    	if(index<0) {
    		addAtHead(val);
    	}
    	if(index>size) {
    		return;
    	}
    }
    
    public void deleteAtIndex(int index) {
    	ListNode current = head;
    	if(index==0) {
    		head= head.next;
    		size--;
    	}
    	if(index<size && index>0) {
        for(int i = 0;i<index-1;i++) {
        	current = current.next;
        }
        ListNode temp =current.next;
        ListNode nextNode = temp.next;
        current.next= nextNode;
        size--;
    	}
    
    }
    public static void main(String[] args) {
		 MyLinkedList temp = new MyLinkedList();
		 temp.addAtHead(1);
		 System.out.print(temp.get(0));
		 System.out.print(temp.get(1));
		 System.out.print(temp.get(2));
		 System.out.print(temp.get(3));
		 System.out.print(temp.get(4));
		 System.out.println(temp.get(5));
		 temp.addAtTail(3);
		 System.out.print(temp.get(0));
		 System.out.print(temp.get(1));
		 System.out.print(temp.get(2));
		 System.out.print(temp.get(3));
		 System.out.print(temp.get(4));
		 System.out.println(temp.get(5));
		 temp.addAtIndex(1, 2);
		 System.out.print(temp.get(0));
		 System.out.print(temp.get(1));
		 System.out.print(temp.get(2));
		 System.out.print(temp.get(3));
		 System.out.println(temp.get(4));
		 temp.deleteAtIndex(0);
		 System.out.print(temp.get(0));
		 System.out.print(temp.get(1));
		 System.out.print(temp.get(2));
		 System.out.print(temp.get(3));
		 System.out.println(temp.get(4));
	 }
}
