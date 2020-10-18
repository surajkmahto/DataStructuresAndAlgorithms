package com.tree;

public class LeftView {

	static int maxdepth = 0;

	Node root;

	public LeftView() {
		super();
	}

	public LeftView(Node root) {
		super();
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}


	/*
	 *            1
	 * 		 2 			3
	 * 				          4
	 * 					5			6
	 *
	 */

	public static void main(String[] args) {
		Node root = new Node(1);
		LeftView tree = new LeftView();
		tree.setRoot(root);
		tree.getRoot().setLeft(new Node(2));
		tree.getRoot().setRight(new Node(3));
		tree.root.right.setRight(new Node(4));

		tree.root.right.right.setLeft(new Node(5));
		printLeftView(tree.root);
	}

	private static void printLeftView(Node root) {
		util(root,0);
	}

	private static void util(Node root2, int depth) {

		if (root2==null){
			return;
		}
		if(depth>=maxdepth){
			System.out.print(root2.data + " ");
			maxdepth=maxdepth+1;
		}
		util(root2.left,depth+1);
		util(root2.right,depth+1);
	}
}