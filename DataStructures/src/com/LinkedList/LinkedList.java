package com.LinkedList;

public class LinkedList {
	private Node head;
	private int position;

	public Node getHead() {
		return head;
	}

	public LinkedList() {
		head = null;
	}

	/*
	 * Create Methods To Perform Operations 1-Insert 2-InsertIntoPosition 3-Display
	 * 4-DisplayRev 5-Deletebyval 6-DeleteByposition 7-Reverse
	 */

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;

		}
		if (head == null) {
			head = newNode;
			return true;
		}
		Node last = head;
		while (last.getNext() != null) {
			last.getNext();
		}
		last.setNext(newNode);
		return true;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();

	}

	public boolean inertbyposition(int data, int position) {
		if (position <= 0) {
			return false;
		}
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (position == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		Node prev = head;
		for (int i = 0; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}
			
		}

		return true;
	}
}
