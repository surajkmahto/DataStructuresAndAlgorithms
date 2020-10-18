package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	Node root;

	public LevelOrderTraversal() {
		super();
	}

	public LevelOrderTraversal(Node root) {
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
		LevelOrderTraversal tree = new LevelOrderTraversal();
		tree.setRoot(root);
		tree.getRoot().setLeft(new Node(2));
		tree.getRoot().setRight(new Node(3));
		tree.root.left.setLeft(new Node(4));
		tree.root.left.setRight(new Node(5));
		tree.root.right.setLeft(new Node(6));
		tree.root.right.setRight(new Node(7));

		tree.root.left.left.setLeft(new Node(8));
		tree.root.left.left.setRight(new Node(9));
		printLevelOrderTraversal(tree.root);
	}


	private static void printLevelOrderTraversal(Node root) {
		Queue<Node> myQueue =  new LinkedList<>();
		if(root == null){
			return;
		}else{

			myQueue.add(root);
			while(!myQueue.isEmpty()){
				root = myQueue.peek();
				int temp = myQueue.peek().data;
				System.out.print(temp + " ");
				myQueue.remove();
				if(root.left!=null){
					myQueue.add(root.left);
				}
				if(root.right!=null){
					myQueue.add(root.right);
				}
			}
		}
	}

}
