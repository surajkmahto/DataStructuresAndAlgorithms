package com.tree;

public class RightView {

	Node root;
	static int maxdepth = 0;

	public RightView() {
		super();
	}

	public RightView(Node root) {
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
		RightView tree = new RightView();
		tree.setRoot(root);
		tree.getRoot().setLeft(new Node(2));
		tree.getRoot().setRight(new Node(3));
		tree.root.right.setRight(new Node(4));

		tree.root.right.right.setLeft(new Node(5));
		tree.root.right.right.setRight(new Node(6));
		tree.root.right.right.left.setLeft(new Node(7));
		printRightView(tree.root);
	}

	private static void printRightView(Node root) {
		util(root,0);
	}

	private static void util(Node head, int depth) {
		if(head == null){
			return;
		}

		if(depth>=maxdepth){
			System.out.print(head.data + " ");
			maxdepth += 1;
		}
		util(head.right,depth+1);
		util(head.left, depth+1);

	}

}
