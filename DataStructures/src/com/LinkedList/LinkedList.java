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
		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
				return false;
			}

		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}

	public void displayRev(Node firstNode) {
		if (firstNode == null) {
			System.out.println();
			return;
		}
		displayRev(firstNode.getNext());
		System.out.print(firstNode.getData() + " ");
	}

	public boolean deleteByVal(int data) {
		if (head == null) {
			return false;
		}
		if (head.getData() == data) {
			head = head.getNext();
			return true;
		}
		Node del = head, prev = head;
		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}

	public boolean deleteByposition(int position) {
		if (head == null || position <= 0) {
			return false;
		}
		if (position == 1) {
			head = head.getNext();
			return true;
		}
		Node prev = head;
		for (int i = 0; i < position; i++) {
			prev = prev.getNext();
			if (prev.getNext() == null) {
				return true;
			}
		}
		Node del = prev.getNext();
		prev.setNext(del.getNext());
		return true;
	}

	public void reverse() {
		if (head == null || head.getNext() == null) {
			return;
		}
		Node n1 = head, n2 = head.getNext();
		Node n3;
		while (n2 != null) {
			n3 = n2.getNext();
			n2.setNext(n1);
			n1 = n2;
			n2 = n3;
		}
		head.setNext(null);
		head = n1;
	}
}
