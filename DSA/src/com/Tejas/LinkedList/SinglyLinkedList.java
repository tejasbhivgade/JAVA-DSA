package com.Tejas.LinkedList;

public class SinglyLinkedList {
	
private ListNode head;

private static class ListNode{
	
	private int data;
	private ListNode next;
	
	public ListNode(int data) {
		
		this.data = data;
		this.next = null;
	}
}

    // For printing the singly linked list
    public void display() {
		ListNode current = head;
		while (current!=null) 
		{
			System.out.print (current.data+ "-->");
			current = current.next;
		}
		System.out.println("null");
	}
    
    // For finding the length of singly linked list
    public int length() {
		
    if (head == null) 
    {
		return 0;
	}
    
    int count = 0;
    ListNode current = head;
    while (current!=null) 
    {
		count++;
		current = current.next;
	}
    return count;
    	
	}
    
    // Insert the node at first
    public void insertFirst(int value) {
    	ListNode newnode = new ListNode(value);
    	newnode.next=head;
    	head=newnode;
    	
    }
    
    // Insert the node at last
    public void insertLast(int value) {
		ListNode newnode = new ListNode(value);
		if (head==null) 
		{
			head = newnode;
			return; 
		}
		
		ListNode current = head;
		while (null!=current.next) 
		{
			current=current.next;
		}
		current.next=newnode;
	}
    

	public static void main(String[] args) {
		
	    SinglyLinkedList s = new SinglyLinkedList();
		s.head = new ListNode(5);
		ListNode first = new ListNode(4);
		ListNode second = new ListNode(9);
		ListNode third = new ListNode(2);
		ListNode forth = new ListNode(8);

		
		//Now we will connect together to form chain
		s.head.next=first; //5-->4
		first.next=second; //5-->4-->9
		second.next=third; //5-->4-->9-->2
		third.next=forth;  //5-->4-->9-->2-->8
		
		s.insertFirst(10);
		s.insertFirst(4);
		s.insertFirst(1);
		
		s.insertLast(54);
		s.insertLast(90);
		s.insertLast(7);

		
		s.display();
		System.out.println("Length is : "+s.length());
	}
}
