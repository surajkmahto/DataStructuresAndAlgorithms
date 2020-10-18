package com.tree;

import java.util.*;
import java.util.Map.Entry;

public class TopView {

	NodeB root;

	public TopView() {
		super();
	}

	public TopView(NodeB root) {
		super();
		this.root = root;
	}

	public NodeB getRoot() {
		return root;
	}

	public void setRoot(NodeB root) {
		this.root = root;
	}

	public static void main(String[] args) {
		NodeB root = new NodeB(1);
		TopView tree = new TopView();
		tree.setRoot(root);
		tree.getRoot().setLeft(new NodeB(2));
		tree.getRoot().setRight(new NodeB(3));
		tree.root.left.setLeft(new NodeB(4));
		tree.root.left.setRight(new NodeB(5));
		tree.root.right.setLeft(new NodeB(6));
		tree.root.right.setRight(new NodeB(7));

		tree.root.left.left.setLeft(new NodeB(8));
		tree.root.left.left.setRight(new NodeB(9));
		printTopView(tree.root);
	}

	private static void printTopView(NodeB root) {
		if(root==null){
			return;
		}

		Queue<NodeB> queue = new LinkedList<>();
		Map<Integer, NodeB> map = new HashMap<>();
		root.hd = 0;
		queue.add(root);
		map.put(0,root);
		while(!queue.isEmpty()){

			NodeB top = queue.poll();
			if(!map.containsKey(top.hd)){
				map.put(top.hd,top);
			}

			if(top.left!=null){
				top.left.setHd(top.hd -1);
				queue.add(top.left);
			}

			if(top.right!=null){
				top.right.setHd(top.hd + 1);
				queue.add((top.right));
			}
		}

		for(Map.Entry<Integer, NodeB> m: map.entrySet()){
			System.out.print(m.getValue().data + " ");
		}
	}

}
