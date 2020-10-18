package com.tree;

public class MaxDepthInBinaryTree {

	private Node root;

	public MaxDepthInBinaryTree() {
		super();
	}

	public MaxDepthInBinaryTree(Node root) {
		super();
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}


	public static void main(String[] args) {
		Node root = new Node(1);
		MaxDepthInBinaryTree tree = new MaxDepthInBinaryTree();
		tree.setRoot(root);
		tree.getRoot().setLeft(new Node(2));
		tree.getRoot().setRight(new Node(3));
		tree.root.left.setLeft(new Node(4));
		tree.root.left.setRight(new Node(5));
		tree.root.right.setLeft(new Node(6));
		tree.root.right.setRight(new Node(7));

		tree.root.left.left.setLeft(new Node(8));
		tree.root.left.left.setRight(new Node(9));
		int maxDepth = getMaxDepth(tree.root);
		System.out.println(maxDepth-1);
	}

	private static int getMaxDepth(Node root) {
		if(root==null){
			return 0;
		}
		else return 1 + Math.max(getMaxDepth(root.left),getMaxDepth(root.right));
	}

}
