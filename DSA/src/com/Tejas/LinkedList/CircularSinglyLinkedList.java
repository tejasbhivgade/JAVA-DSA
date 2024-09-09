package com.Tejas.LinkedList;

import java.util.List;
import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
	
	private ListNode last;
	private int length;
	
	private class ListNode {
		private ListNode next;
		private int data;
	
	public ListNode(int data) {
		this.data = data;
	}
	}
	
	public CircularSinglyLinkedList() {
		this.last = null;
		this.length = 0;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	//
	public int length() {
		return length;
	}
	
	// Create circular singly linked list
	public void createCircularSinglyLinkedList() {
		ListNode first = new ListNode(5);
		ListNode second = new ListNode(10);
		ListNode third = new ListNode(15);
		ListNode fourth = new ListNode(20);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;
		length = 4;
	}
	
	// Display
	public void display() {
		if (last == null) 
		{
			return;
		}
		
		ListNode first = last.next;
		while (first != last) 
		{
			System.out.print(first.data+ " ");
			first = first.next;
		}
		System.out.print(first.data+ " ");

	}
	
	// Insert the node at first
	public void insertFirst(int data) {
		
		ListNode temp = new ListNode(data);
		
		if (last == null) 
		{
			last = temp;
		}
		else 
		{
			temp.next = last.next;
			length++;
		}
		last.next=temp;
	}
	
	public void insertLast(int data) {
		
		ListNode temp = new ListNode(data);
		
		if (last == null) 
		{
			last = temp;
			last.next = last;
		}
		else 
		{
			temp.next = last.next;
			last.next = temp;
			last = temp;
		}
		length++;
	}
	
	// Delete first node from the circular singly linked list
	public void deleteFirst() {
		
		if (isEmpty()) 
		{
			throw new NoSuchElementException();
		}
		
		ListNode temp = last.next;
		
		if (last.next == last) 
		{
			last = null;
		}
		else 
		{
			last.next = temp.next;
		}
		temp.next = null;
		length--;
	}

	// main method
	public static void main(String[] args) {

		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		csll.createCircularSinglyLinkedList();
		
		// Insertfirst
		csll.insertFirst(4);
		csll.insertFirst(3);
		csll.insertFirst(2);
		
		csll.insertLast(30);
		csll.insertLast(40);
		csll.insertLast(50);

		// Delete first
		csll.deleteFirst();
		
		// Length of circular linked list
		System.out.println("Length is : "+csll.length);
		
		// Display the node of circular singly linked list
		csll.display();
		
		
	}

}
