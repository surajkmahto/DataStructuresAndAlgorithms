package com.tree;

public class MirrorTree {
	Node root;

	public MirrorTree() {
		super();
	}

	public MirrorTree(Node root) {
		super();
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Node root = new Node(1);
		MirrorTree tree = new MirrorTree();
		tree.setRoot(root);
		tree.getRoot().setLeft(new Node(2));
		tree.getRoot().setRight(new Node(3));
		tree.root.left.setLeft(new Node(4));
		tree.root.left.setRight(new Node(5));
		tree.root.right.setLeft(new Node(6));
		tree.root.right.setRight(new Node(7));

		PreInPostTraversal traverse = new PreInPostTraversal(root);
		traverse.printPreOrderTree(root);
		System.out.println();
		mirrorTree(root);
		traverse.printPreOrderTree(root);

	}

	private static void mirrorTree(Node root) {
		if(root.left!=null || root.right!=null){
			Node temp = root.left;
			root.left = root.right;
			root.right = temp;
			mirrorTree(root.left);
			mirrorTree(root.right);
		}
	}

}
