package com.BinarySearchTree;

import java.util.Stack;

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (root == null) {
			root = newNode;
			return true;
		}
		Node temp = root;
		while (true) {
			if (data == temp.getData()) {

				return false;
			}
			if (data < temp.getData()) {
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();

			} else {

				if (temp.getRigth() == null) {
					temp.setRigth(newNode);
					return true;
				}
				temp = temp.getRigth();
			}
		}
	}

	public void preOrder() {
		Node temp = root;
		Stack<Node> stack = new Stack<>();
		while (temp != null || !stack.empty()) {
			while (temp != null) {
				System.out.println(temp.getData() + " ");
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop();
			temp = temp.getRigth();
		}
		System.out.println();
	}

	public void inOrder() {
		Node temp = root;
		Stack<Node> stack = new Stack<>();
		while (temp != null || !stack.empty()) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.getLeft();

			}
			temp = stack.pop();
			System.out.println(temp.getData() + " ");
			temp = temp.getRigth();
		}
		System.out.println();
	}

	public void postOrder() {
		class Pair {
			Node node;
			char falg;

			public Pair(Node node, char pair) {
				this.node = node;
				this.falg = falg;
			}
		}
		Node temp = root;
		Stack<Pair> stack = new Stack<>();
		while (temp != null || !stack.empty()) {
			while (temp != null) {
				stack.push(new Pair(temp, 'L'));
				temp = temp.getLeft();
			}
			Pair pair = stack.pop();
			if (pair.falg == 'L') {
				temp = pair.node.getRigth();
				pair.falg = 'R';
				stack.push(pair);
			} else {
				System.out.println(pair.node.getData() + " ");
			}
		}
		System.out.println();

	}

	public void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.getData() + " ");
		preOrder(root.getLeft());
		preOrder(root.getRigth());

	}

	public void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.getLeft());
		System.out.println(root.getData() + " ");
		inOrder(root.getRigth());

	}

	public void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.getLeft());
		postOrder(root.getRigth());
		System.out.println(root.getData() + " ");
	}

	public int getCount(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + getCount(root.getLeft()) + getCount(root.getRigth());
	}

	public boolean find(Node root, int data) {
		if (root == null) {
			return false;
		}
		if (root.getData() == data) {
			return true;
		}
		if (data < root.getData()) {
			return find(root.getLeft(), data);
		}
		return find(root.getRigth(), data);
	}

	public Node getRoot() {
		return root;
	}

	public boolean delete(int data) {
		if (root == null) {
			return false;
		}
		Node parent = root, del = root;
		while (del.getData() != data) {
			if (data < del.getData()) {
				parent = del;
				del = del.getLeft();
			} else {
				parent = del;
				del = del.getRigth();
			}
			if (del == null) {
				return false;
			}
		}
		while (true) {
			if (del.getLeft() == null && del.getRigth() == null) {
				if (del == root) {
					root = null;
					return true;
				}
				if (parent.getLeft() == del) {
					parent.setLeft(null);
				} else {
					parent.setRigth(null);
				}
				return true;
			} else {
				if (del.getLeft() != null) {
					parent = del;
					Node max = del.getLeft();

					while (max.getRigth() != null) {
						parent = max;
						max = max.getRigth();
					}
					int temp = max.getData();
					max.setData(del.getData());
					del.setData(temp);
					del = max;
				} else {
					parent = del;
					Node min = del.getRigth();
					while (min.getLeft() != null) {
						parent = min;
						min = min.getLeft();
					}
					int temp = min.getData();
					min.setData(del.getData());
					del.setData(temp);
					del = min;

				}
			}
		}
	}
}
