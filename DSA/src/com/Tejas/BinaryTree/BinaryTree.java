package com.Tejas.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	
	private TreeNode root;
	
	private class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
			
		}
		
	}
	
	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);

		
		root = first;
		first.left=second;
		first.right=third;
		
		second.left=fourth;
		second.right=fifth;
		
		third.left=sixth;
		third.right=seventh;
	}
	
	// Recursive preorder traversal of a binary tree
//	public void preOrder(TreeNode root) {
//		if (root == null) 
//		{
//			return;
//		}
//		System.out.print(root.data+" ");
//		preOrder(root.left);
//		preOrder(root.right);
//	}
	
	// Iterative preorder traversal of a binary tree
	public void preOrder() {
		if (root == null) 
		{
			return;
		}
		
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		
		while (!stack.isEmpty()) 
		{
			TreeNode temp = stack.pop();
			System.out.print(temp.data+" ");
			if (temp.right != null) 
			{
				stack.push(temp.right);
			}
			if (temp.left != null) 
			{
				stack.push(temp.left);
			}
		}
	}
	
	// Recursive inorder traversal of a binary tree
//	public void inOrder(TreeNode root) {
//		if (root == null) 
//		{
//			return;
//		}
//		inOrder(root.left);
//		System.out.print(root.data+" ");
//		inOrder(root.right);
//	}
	
	// Iterative inorder traversal of a binary tree
	public void inOrder() {
		if (root == null) 
		{
			return;
		}
		
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while (!stack.isEmpty() || temp!= null) 
		{
			if (temp != null) 
			{
				stack.push(temp);
				temp = temp.left;
			}
			else 
			{
				temp = stack.pop();
				System.out.print(temp.data+" ");
				temp = temp.right;
			}
			
		}
			
	}
	
	// Recursive postorder traversal of a bianry tree
//	public void postOrder(TreeNode root) {
//		if (root == null) {
//			return;
//		}
//		postOrder(root.left);
//		postOrder(root.right);
//		System.out.print(root.data+" ");
//	}
	
	// Iterative postorder traversal of as bianry tree
	public void postOrder() {
		if (root == null) 
		{
			return;
		}
		TreeNode current = root;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = null;
		while (current != null || !stack.isEmpty()) 
		{
			if (current != null) 
			{
				stack.push(current);
				current=current.left;
			}
			else 
			{
			    temp = stack.peek().right;
				if (temp == null) 
				{
					temp= stack.pop();
					System.out.print(temp.data+" ");
					while (!stack.isEmpty() && temp == stack.peek().right) 
					{
						temp = stack.pop();
						System.out.print(temp.data+" ");
					}
				}
				else 
				{
					current = temp;
				}
			}
		}
	}
	
	// Level order traversal of a binary tree
	public void LevelOrder() {
		if (root == null) 
		{
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) 
		{
			TreeNode temp = queue.poll();
			System.out.print(temp.data+" ");
			if (temp.left!=null) 
			{
				queue.offer(temp.left);
			}
			if (temp.right!=null) 
			{
				queue.offer(temp.right);
			}
		}
	}
	
	// Recursively find maximum value in binary tree
	public int findMax(TreeNode root) {
	    if (root == null) {
	        return Integer.MIN_VALUE;  // Return a very small value if the tree is empty
	    }
	    
	    // Recursively find the maximum value in the left and right subtrees
	    int leftMax = findMax(root.left);
	    int rightMax = findMax(root.right);
	    
	    // Return the maximum of the current node's value, leftMax, and rightMax
	    return Math.max(root.data, Math.max(leftMax, rightMax));
	}


	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		
		// Recursive preorder
		//bt.preOrder(bt.root);
		
		// Iterative preorder
		//bt.preOrder();
		
		// Recursive inorder
		//bt.inOrder(bt.root);
		
		// Iterative inorder
		//bt.inOrder();
		
		// Recursive postorder
		//bt.postOrder(bt.root);
		
		// Iterative postorder
		//bt.postOrder();

		// Levelorder
		//bt.LevelOrder();
		
		// Max value 
		int max = bt.findMax(bt.root);
		System.out.println(+max);
	}

}
