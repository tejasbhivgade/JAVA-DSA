package com.Tejas.BinaryTree;

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
	public void inOrder(TreeNode root) {
		if (root == null) 
		{
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
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

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		
		// Recursive preorder
		//bt.preOrder(bt.root);
		
		// Iterative preorder
		//bt.preOrder();
		
		// recursive inorder
		//bt.inOrder(bt.root);
		
		// Iterative inorder
		bt.inOrder();

	}

}
