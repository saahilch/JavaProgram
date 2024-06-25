package com.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();

		l1.insert(10);
		l1.insert(20);
		l1.insert(60);
		l1.insert(80);
		l1.insert(30);
		l1.display();
		l1.inert(100, 1);
		l1.display();
		l1.displayRev(l1.getHead());
		// l1.deleteByVal(0);
		// l1.display();
		System.out.println();
		System.out.println("---------------------");
		while (l1.deleteByVal(80))
			;
		l1.display();
		System.out.println("---------------------");
		l1.deleteByPosition(2);
		l1.display();
		l1.reverse();
		l1.display();

	}

}
