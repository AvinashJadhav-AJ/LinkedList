package com.BridgeLabz.java;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Delete first node");
		list.addLast(56);
		list.addLast(30);
		list.addLast(70);
		list.display();
		list.pop();
		list.display();

	}
}