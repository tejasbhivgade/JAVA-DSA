package com.Tejas.Stack;

import java.util.EmptyStackException;
import java.util.List;

public class Stack {
	
	 private ListNode top;
	 private int length;
	 
	 private class ListNode{
		 private int data;
		 private ListNode next;
		 
		 public ListNode(int data) {
			this.data=data;
		}
	 }
	 
	 // Implimentation of stack using a linked list
	 
	 public Stack(){
		 top = null;
		 length = 0;
	 }
	 
	 public int length() {
		return length;
	}
	 
	 public boolean isEmpty() {
		return length == 0;
	}
	 
	 public void push(int data) {
		ListNode temp = new ListNode(data);
		temp.next=top;
		top = temp;
		length++;
	}
	 
	 
	 public int pop() {
		if (isEmpty()) 
		{
			throw new EmptyStackException();
		}
		
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}
	 
	 public int peek() {
		if (isEmpty()) 
		{
			throw new EmptyStackException();
		}
		return top.data;
	}

    // main method
	public static void main(String[] args) {

		Stack stack = new Stack();
		
		// pushing element
		stack.push(10);
		stack.push(15);
		stack.push(20); 
		stack.push(25);
		
		// peek the element
		System.out.println(stack.peek());
		
		stack.pop();
		
		System.out.println(stack.peek());

		// length of a array
		System.out.println(stack.length());

    }
}
