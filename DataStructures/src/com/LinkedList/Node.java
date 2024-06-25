package com.LinkedList;

public class Node {

	// to insert the data i take one variable
	private int data;
	// to enter next node i take another varibale
	private Node next;

	// make a constructure & geter seter

	public Node(int data) {
		this.data = data;
		next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
