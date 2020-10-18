package com.tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

public class BottomView {

	NodeB root;

	public BottomView() {
		super();
	}

	public BottomView(NodeB root) {
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
		BottomView tree = new BottomView();
		tree.setRoot(root);
		tree.getRoot().setLeft(new NodeB(2));
		tree.getRoot().setRight(new NodeB(3));
		tree.root.left.setLeft(new NodeB(4));
		tree.root.left.setRight(new NodeB(5));
		tree.root.right.setLeft(new NodeB(6));
		tree.root.right.setRight(new NodeB(7));

		tree.root.left.left.setLeft(new NodeB(8));
		tree.root.left.left.setRight(new NodeB(9));
		printBottomView(tree.root);
	}

	private static void printBottomView(NodeB root) {
		Queue<NodeB> queue = new LinkedList<NodeB>();
		Map<Integer,NodeB> map = new TreeMap<>();
		int hd = 0;
		root.hd = hd;
		if(root==null){
			return;
		}
		map.put(hd, root);
		queue.add(root);
		while(!queue.isEmpty()){
			hd=root.hd;
			map.put(hd, root);
			if(root.left != null)
			{
				root.left.hd=hd-1;
				queue.add(root.left);
			}
			if(root.right!=null)
			{
				root.right.hd=hd+1;
				queue.add(root.right);
			}
			queue.poll();
			root=queue.peek();
		}

		for (Entry<Integer, NodeB> entry : map.entrySet()) {
			System.out.print(entry.getValue().data + " ");
		}
	}

}
