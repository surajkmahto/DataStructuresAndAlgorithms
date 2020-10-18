package com.tree;

public class NodeB {
	NodeB left;
	int data;
	NodeB right;
	int hd;

	public NodeB() {
		super();
	}

	public NodeB(NodeB left, int data, NodeB right, int hd) {
		super();
		this.left = left;
		this.data = data;
		this.right = right;
		this.hd = hd;
	}

	public NodeB(int data) {
		super();
		this.left = null;
		this.data = data;
		this.right = null;
		this.hd = Integer.MAX_VALUE;
	}

	public NodeB getLeft() {
		return left;
	}

	public void setLeft(NodeB left) {
		this.left = left;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public NodeB getRight() {
		return right;
	}

	public void setRight(NodeB right) {
		this.right = right;
	}

	public int getHd() {
		return hd;
	}

	public void setHd(int hd) {
		this.hd = hd;
	}

	@Override
	public String toString() {
		return "NodeB [left=" + left + ", data=" + data + ", right=" + right + ", hd=" + hd + "]";
	}
}
