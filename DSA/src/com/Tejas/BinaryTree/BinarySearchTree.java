package com.Tejas.BinaryTree;

public class BinarySearchTree {
	
	private TreeNode root;
	
	private class TreeNode{
		private int data;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int data){
			this.data=data;
		}
	}
	
	// Insert the value in a binary search tree recursively
	public void insert(int value) {
		root = insert(root,value);
	}
	
	public TreeNode insert(TreeNode root, int value) {
		if (root == null) 
		{
			root = new TreeNode(value);
			return root;
		}
		if (value < root.data) 
		{
			root.left = insert(root.left, value);
		}
		else 
		{
			root.right = insert(root.right, value);
		}
		return root;
	}
	
	public void createBinarySearchTree() {
//		TreeNode first = new TreeNode(6);
//		TreeNode second = new TreeNode(4);
//		TreeNode third = new TreeNode(8);
//		TreeNode fourth = new TreeNode(2);
//		TreeNode fifth = new TreeNode(8);
//		TreeNode sixth = new TreeNode(5);
//		TreeNode seventh = new TreeNode(9);
//		
//		root=first;
//		root.left= second;
//		root.right=third;
//		
//		second.left=fourth;
//		second.right=fifth;
//		
//		third.left=sixth;
//		third.right=seventh;
	}
	
	// Recursive inorder traversal of a binary search tree
	public void inOrder() {
		inOrder(root);
	}

	public void inOrder(TreeNode root) {
		if (root == null) 
		{
			return;
		}
		inOrder(root.left);
		System.out.println(root.data+" ");
		inOrder(root.right);
	}
	
	// Search a given key in binary search tree recursively
//	public TreeNode search(TreeNode root , int key) {
//		if (root == null || root.data == key) 
//		{
//			return root;
//		}
//		if (key < root.data ) 
//		{
//			return search(root.left, key);
//		}
//		else 
//		{
//			return search(root.right, key);
//		}
//	}
	
	// Search a given key in binary search tree iteratively
	public TreeNode search(TreeNode root, int key) {
	    while (root != null && root.data != key) {
	        // Traverse the left subtree if the key is smaller than the root
	        if (key < root.data) {
	            root = root.left;
	        }
	        // Traverse the right subtree if the key is larger than the root
	        else {
	            root = root.right;
	        }
	    }
	    // Return the node if found, or null if not found
	    return root;
	}

	
	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst.createBinarySearchTree();
		
		// Insert value recursively
		bst.insert(5);
		bst.insert(9);
		bst.insert(7);
		bst.insert(2);
		bst.insert(4);
		bst.insert(6);
		bst.insert(1);
		bst.insert(8);
		bst.insert(3);
		
		// Recursive inorder
		bst.inOrder();
		
		// search key
		int key = 6;
		TreeNode result = bst.search(bst.root, key);
		
		if (result!=null) 
		{
			System.out.println("key "+key+" found in a tree");
		}
		else 
		{
			System.out.println("key "+key+" not found in a tree");
		}		

	}

}
