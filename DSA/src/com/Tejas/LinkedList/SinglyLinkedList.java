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
			System.out.print (current.data+ " ==> ");
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
    
    // Insert the node at beginning of singly linked list
    public void insertFirst(int value) {
    	ListNode newnode = new ListNode(value);
    	newnode.next=head;
    	head=newnode;
    	
    }
    
    // Insert the node at the end of singly linked list
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
    
    // Insert the node in singly linked list at the given position
    public void insertPosition(int position, int value) {
    	ListNode newnode = new ListNode(value);
    	
    	if (position == 1) 
    	{
			newnode.next=head;
			head = newnode;
		}
    	else 
    	{
			ListNode trav = head;
			int count=1;
			while (count<position-1) 
			{
				trav=trav.next;
				count++;
			}
			ListNode current = trav.next;
			trav.next=newnode;
			newnode.next=current;
			
		}
    }
   
    // Delete first node of singly linked list
    public void deleteFirst() {
    	if (head == null) 
    	{
    		return;
    	}
    	else 
    	{
    		head = head.next;
    	}
    }
    
    // Delete last node of singly linked list 
    public void deleteLast() {
		if (head == null) 
		{
			return;
		}
		else if (head.next == null) 
		{
			head.next = null;
		}
		else 
		{
			ListNode trav = head;
			while (trav.next.next != null) 
			{
				trav = trav.next;
			}
			trav.next=null;
		}
	}
    
    // Delete the node in singly linked list at  given position
    public void deletePosition(int position) {
    	if (position == 1) 
    	{
			head = head.next;
		}
    	else 
    	{
			ListNode trav = head;
			int count=1;
			while (count < position-1) 
			{
				trav = trav.next;
				count++;
			}
			ListNode current = trav.next;
			trav.next=current.next;
		}
	}
    
    // Remove a given key from singly linked list
    public void deleteNode(int key) {
    	if (head == null) 
    	{
    		return;
    	}
    	if(head.data == key) 
    	{
    		head.next= head;
    	}
    	ListNode current = head;
    	ListNode trav = null;
    	while (current != null && current.data != key) 
    	{
    		trav = current;
    		current = current.next;
    	}
    	if (current == null) 
    	{
    		return;
    	}
    	trav.next = current.next;
    }
    
    // Insert the node in sorted singly linked list
    public void insertInSortedList(int value) {
    	ListNode newnode = new ListNode(value);
		ListNode current = head;
		ListNode trav = null;
		while (current != null && current.data < newnode.data) 
		{
			trav = current;
			current = current.next;
		}
		newnode.next = current;
		trav.next = newnode;
	}
    
    // Remove duplicates from sorted singly linked list
    public void removeDuplicates() {
		ListNode current = head;
		while (current != null && current.next != null) 
		{
			if (current.data == current.next.data) 
			{
				current.next = current.next.next;
			}
			else 
			{
				current = current.next;
			}
		}
	}
    
    //Search an element in singly linked list
    public boolean find(int searchkey) {
		ListNode current = head;
		if (head == null) 
		{
			return false;
		}
		while (current != null) 
		{	
		if (current.data == searchkey) 
		{
			return true;
		}
		current = current.next;
	}
		return false;
    }
    
    // Reverse a singly linked list in java
    public ListNode reverse() {
    	if (head == null) 
    	{
    		return head;
		}
    	
    	ListNode current = head;
    	ListNode trav = null;
    	ListNode next = null;
    	
    	while (current != null) 
    	{
			next = current.next;
			current.next = trav;
			trav = current;
			current = next;
		}
		return trav;
	}
    
    // Find middle node in singly linked list
    public ListNode getMiddleNode () {
    	if (head == null) 
    	{
			return null;
		}
		ListNode slowptr = head;
		ListNode fastptr = head;
		while (fastptr != null && fastptr.next != null) 
		{
			slowptr = slowptr.next;
			fastptr = fastptr.next.next;
		}
    	return slowptr;
	}
    
    // Find nth node from the end of the singly linked list
    public ListNode getNthNodeFromEnd(int n) {
		if (head == null) 
		{
			return null;
		}
		
		if (n<=0) 
		{
		     throw new IllegalArgumentException("Invalid value of n : "+n);
		}
		
		ListNode mainptr = head;
		ListNode refptr = head;
		
		int count = 0;
		
		while (count < n) 
		{
			if (refptr == null) 
			{
				throw new IllegalArgumentException(n+ "is greater than the number of nodes in list");
			}
			refptr = refptr.next;
			count++;
		}
    	while (refptr != null) 
    	{
			refptr = refptr.next;
			mainptr = mainptr.next;
		}
    	return mainptr;
	}
    
    // Detect a loop in singly linked list
//    public boolean containsLoop() {
//		ListNode fastptr = head;
//		ListNode slowptr = head;
//		
//		while (fastptr != null && fastptr != null) 
//		{
//			fastptr = fastptr.next.next;
//			slowptr = slowptr.next;
//			
//			if (slowptr == fastptr) 
//			{
//				return true;
//			}
//		}
//    	return false;	
//	}
    
    // Create a loop linked list
//    public void createLoopLinkedlist() {
//		ListNode first = new ListNode(1);
//		ListNode second = new ListNode(2);
//		ListNode third = new ListNode(3);
//		ListNode fourth = new ListNode(4);
//		ListNode fifth = new ListNode(5);
//		ListNode sixth = new ListNode(6);
//		
//		head = first;
//		first.next=second; 
//		second.next=third; 
//		third.next=fourth; 
//		fourth.next=fifth;
//		fifth.next=sixth;
//		sixth.next=third;
//	}
    

    // Main method
	public static void main(String[] args) {
		
		SinglyLinkedList s = new SinglyLinkedList();
		s.head = new ListNode(10);
		ListNode first = new ListNode(20);
		ListNode second = new ListNode(30);
		ListNode third = new ListNode(40);
		ListNode fourth = new ListNode(50);
		
		//Now we will connect together to form chain
		s.head.next=first; 
		first.next=second; 
		second.next=third; 
		third.next=fourth;  
		
		//Add first
		s.insertFirst(4);
		s.insertFirst(6);
		s.insertFirst(1);
		
		//Add last
		s.insertLast(60);
		s.insertLast(60);
		s.insertLast(6);
		s.insertLast(70);
		s.insertLast(7);
		
		//Add position
		s.insertPosition(2, 5);
		
		//Delete first 
		s.deleteFirst();
		
		//Delete last
		s.deleteLast();
		
		//Delete position
		s.deletePosition(3);
		
		//Delete node 
		s.deleteNode(10);
		
		//Insert in sorted linked list
		s.insertInSortedList(45);
		
		//Remove duplicates in sorted linked list
		s.removeDuplicates();
		
		//Print the singly linked list
		s.display();
		
		//Search element
		if (s.find(6)) 
		{
			System.out.println("Search key found");
		}
		else 
		{
			System.out.println("Search key not found");
		}
		
		//Reverse singly linked list
		s.head = s.reverse();
		s.display();
		
		//Get middle node
		ListNode me = s.getMiddleNode();
		System.out.println("Middle node : "+me.data);
		
		//nth node from the end of singly linked list
		ListNode nthnode = s.getNthNodeFromEnd(7);
		System.out.println("nth node fron end is : "+nthnode.data);
				
		//Detect loop
//		s.createLoopLinkedlist();
//		System.out.println(s.containsLoop());
		
		//Length of linked list
		System.out.println("Length is : "+s.length());
	}
}
