/*
 *
 * Given a a Binary Tree, your task is to complete the function getLevelDiff which
 * returns the difference between the sum of nodes at odd level and the sum of nodes
 * at even level . The function getLevelDiff  takes only one argument  ie the root
 * of the binary tree .

       2
     /    \
    3     5

 * For the above tree the odd level sum is 2 and even level sum is 8 thus the difference is 2-8=-6
 *
 *
 */



package com.tree;

public class OddEvenLevelDifference {

	Node root;

	public OddEvenLevelDifference() {
		super();
	}

	public OddEvenLevelDifference(Node root) {
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
		OddEvenLevelDifference tree = new OddEvenLevelDifference();
		tree.setRoot(root);
		tree.getRoot().setLeft(new Node(2));
		tree.getRoot().setRight(new Node(3));
		tree.root.left.setLeft(new Node(4));
		tree.root.left.setRight(new Node(5));
		tree.root.right.setLeft(new Node(6));
		tree.root.right.setRight(new Node(7));

		int ans = getValue(tree.root);
		System.out.println(ans);


	}

	private static int getValue(Node root) {
		if(root==null){
			return 0;
		}
		else if(root.left==null && root.right==null){
			return root.data;
		}
		else if(root.left!=null && root.right==null){
			return root.data - getValue(root.left);
		}else if(root.left==null && root.right!=null){
			return root.data - getValue(root.right);
		}else{
			return root.data - (getValue(root.left) + getValue(root.right));
		}

	}

}
