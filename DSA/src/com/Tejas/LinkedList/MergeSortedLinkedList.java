package com.Tejas.LinkedList;

public class MergeSortedLinkedList {
	
	private ListNode head;
	
	private class ListNode{
		private ListNode next;
		private int data;
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}

	
	public ListNode merge(ListNode a, ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while (a!=null && b!=null) 
		{
			if (a.data <= b.data) 
			{
				tail.next = a;
				a = a.next;
			}
			else 
			{
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		if (tail == null) 
		{
			tail.next = b;
		}
		else 
		{
			tail.next = a;
		}
		return dummy.next;
	}
	
	  public void display() {
	        ListNode current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }

	  
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

	  
	  public ListNode createList(int[] data) {
			if (data.length == 0) return null; // Handle empty list case

			ListNode head = new ListNode(data[0]); // Create the head node
			ListNode current = head;
			for (int i = 1; i < data.length; i++) {
				current.next = new ListNode(data[i]); // Add the next node
				current = current.next;
			}
			return head; // Return the head of the created list
		}
	  
	  
	public static void main(String[] args) {
		
		MergeSortedLinkedList msll1 = new MergeSortedLinkedList();
		
		msll1.insertLast(1);
		msll1.insertLast(4);
		msll1.insertLast(8);

		MergeSortedLinkedList msll2 = new MergeSortedLinkedList();

		msll2.insertLast(3);
		msll2.insertLast(6);
		
		msll1.display();
		msll2.display();
		
		MergeSortedLinkedList result = new MergeSortedLinkedList();
		
		result.head = result.merge(msll1.head, msll2.head);
		
		result.display();
		

	}

}
