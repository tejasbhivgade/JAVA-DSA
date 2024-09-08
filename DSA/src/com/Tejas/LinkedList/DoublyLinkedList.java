package com.Tejas.LinkedList;

import java.security.PublicKey;
import java.util.NoSuchElementException;

public class DoublyLinkedList {
	
	private ListNode head;
	private ListNode tail;
	private int length;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	private class ListNode{
		private int data;
		private ListNode prev;
		private ListNode next;
	
	
	public ListNode(int data) {
		this.data = data;
		//this.prev = null;
		//this.next = null;
	}
    }
	
	public boolean isEmpty() {
		return length == 0;
	} 
	
	public int length() {
		return length;
	}
	
	// Insert the node at last
	public void insertLast(int value) {
		
		ListNode newNode = new ListNode(value);
		
		if (isEmpty()) 
		{
			head = newNode;
		}
		else 
		{
			tail.next = newNode;
		}
		newNode.prev = tail;
		tail = newNode;
		length++;
	}
	
	// Display the doubly linked list from forward
	public void displayForward() {
		
		if (head == null) 
		{
			return;
		}
		
		ListNode temp = head;
		while (temp != null) 
		{
			System.out.print(temp.data+" ==> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	// Display the doubly linked list from backward
	public void displayBackward() {
		
		if (tail == null) 
		{
			return;
		}
		
		ListNode temp = tail;
		while (temp != null) 
		{
			System.out.print(temp.data+" ==> ");
			temp = temp.prev;
		}
		System.out.println("null");
	}
	
	// insert the node at first
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		
		if (isEmpty()) 
		{
			tail = newNode;
		}
		else 
		{
			head.prev = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}
	
	// Delete first node from doubly linked list
	public void deleteFirst() {
		if (isEmpty()) 
		{
			throw new NoSuchElementException("no node");
		}
		ListNode temp = head;
		if (head == tail) 
		{
			tail = null;
		}
		else 
		{
			head.next.prev = null;
		}
		head = head.next ;
		temp.next = null;
		length--;
	}
	
	// Delete last node from doubly linked list
	public void deleteLast() {
		if (isEmpty()) 
		{
			throw new NoSuchElementException();
		}
		ListNode temp = tail;
		if (tail == head) 
		{
			head = null;
		}
		else 
		{
			tail.prev.next = null;
		}
		tail = tail.prev;
		temp.prev = null;
		length--;
	}
	
	
	//main method
	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		// Insert last
		dll.insertLast(10);
		dll.insertLast(15);
		dll.insertLast(20);
		dll.insertLast(30);
		dll.insertLast(40);

		// Display forward and backward
		dll.displayForward();
		dll.displayBackward();
		
		// Length of doubly linked list
		System.out.println(dll.length);
		
		//Insert first
		dll.insertFirst(2);
		dll.insertFirst(5);
		dll.insertFirst(8);
		dll.insertLast(10);

		dll.displayForward();
		dll.displayBackward();
		
		System.out.println(dll.length);

		dll.deleteFirst();
		dll.displayForward();
		
		dll.deleteLast();
		dll.displayForward();
	}

}
