package com.BinarySearchTree;

public class Node {
	private int data;
	private Node left, rigth;

	public Node(int data) {
		this.data = data;
		left = rigth = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRigth() {
		return rigth;
	}

	public void setRigth(Node rigth) {
		this.rigth = rigth;
	}

}
