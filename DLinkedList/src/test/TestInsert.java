package test;

import list.DLinkedList;

public class TestInsert {

	public static void main(String[] args) {
		
		DLinkedList myList = new DLinkedList();
		
		myList.insertHead(15);
		System.out.println(myList.toString());
		
		myList.insertHead(85);		
		System.out.println(myList.toString());
		
		myList.insertTail(25);
		System.out.println(myList.toString());
		
		myList.insertPosition(4, 30);
		System.out.println(myList.toString());
		
		myList.insertHead(15);
		myList.insertHead(10);
		myList.insertHead(5);
		System.out.println(myList.toString());
		
		myList.insertPosition(3, 50);
		System.out.println(myList.toString());
		
		myList.removeHead();
		myList.removeHead();
		System.out.println(myList.toString());
		
		myList.insertTail(90);
		myList.insertTail(80);
		myList.insertTail(60);
		System.out.println(myList.toString());
		
		myList.insertPosition(2, 30);
		System.out.println(myList.toString());
		
		myList.removeTail();
		System.out.println(myList.toString());
		
		myList.remove(1);
		System.out.println(myList.toString());

		myList.remove(0);
		System.out.println(myList.toString());
		
		myList.insertHead(40);
		System.out.println(myList.toString());
		
		myList.insertPosition(2, 60);
		System.out.println(myList.toString());
	}
	
}
