package com.tree;

public class PreInPostTraversal {

	Node root;

	public PreInPostTraversal() {
		super();
	}

	public PreInPostTraversal(Node root) {
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
		Node node = new Node();
		PreInPostTraversal simpleTree = new PreInPostTraversal(node);

		simpleTree.root.data = 1;
		simpleTree.root.left = new Node(2);
		simpleTree.root.right = new Node(3);
		simpleTree.root.left.left = new Node(4);
		simpleTree.root.left.right = new Node(5);
		System.out.println("Inorder : " );
		printInOrderTree(simpleTree.root);
		System.out.println();
		System.out.println("Preorder : " );
		printPreOrderTree(simpleTree.root);
		System.out.println();
		System.out.println("Postorder : " );
		printPostOrderTree(simpleTree.root);

	}

	public static void printPostOrderTree(Node node) {
		if(node == null){
			return;
		}else{
			printPostOrderTree(node.left);
			printPostOrderTree(node.right);
			System.out.print(node.data +  " -> ");

		}

	}

	public static void printPreOrderTree(Node node) {
		if(node == null){
			return;
		}else{
			System.out.print(node.data +  " -> ");
			printPreOrderTree(node.left);
			printPreOrderTree(node.right);

		}

	}

	public static void printInOrderTree(Node node) {
		if(node == null){
			return;
		}else{
			printInOrderTree(node.left);
			System.out.print(node.data +  " -> ");
			printInOrderTree(node.right);

		}

	}

}
