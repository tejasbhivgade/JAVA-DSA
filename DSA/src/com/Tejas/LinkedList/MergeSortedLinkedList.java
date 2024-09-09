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
	
	  public void display(ListNode head) {
	        ListNode current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
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
		
		MergeSortedLinkedList msll = new MergeSortedLinkedList();
		
		// Create two sorted linked lists
		int[] list1Data = {1, 4, 8};  // First sorted list
		int[] list2Data = {3, 6};     // Second sorted list

		// Create linked lists from the arrays
		ListNode list1 = msll.createList(list1Data);
		ListNode list2 = msll.createList(list2Data);

		// Display the original lists
		System.out.print("List 1: ");
		msll.display(list1);

		System.out.print("List 2: ");
		msll.display(list2);

		// Merge the two sorted linked lists
		ListNode mergedList = msll.merge(list1, list2);

		// Display the merged linked list
		System.out.print("Merged List: ");
		msll.display(mergedList);
	}
}