package com.tree;

public class ReverseLeftRightofTree {

	Node node;

	public ReverseLeftRightofTree() {
		super();
	}

	public ReverseLeftRightofTree(Node node) {
		super();
		this.node = node;

	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public static void main(String[] args) {
		Node node = new Node();
		SimpleTree simpleTree = new SimpleTree(node);

		simpleTree.root.data = 1;
		simpleTree.root.left = new Node(2);
		simpleTree.root.right = new Node(3);
		simpleTree.root.left.left = new Node(4);
		simpleTree.root.left.right = new Node(5);

		Node reverseNode = ReverseTree(simpleTree.root);
		SimpleTree.printInOrderTree(reverseNode);
	}

	private static Node ReverseTree(Node node) {
		Node root = node;
		Node temp = node.left;
		node.left = node.right;
		node.right = temp;

		if(node.left!=null){
			ReverseTree(node.left);
		}

		if(node.right!=null){
			ReverseTree(node.right);
		}

		return root;

	}
}
