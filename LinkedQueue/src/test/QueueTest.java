package test;

import queue.LinkedQueue;

public class QueueTest {
	
	public static void main(String[] args) {
		
		LinkedQueue queue = new LinkedQueue();
		
		queue.enqueue(50);
		queue.enqueue(15);
		
		System.out.println(queue.toString());
		
		System.out.println("Peek: " + queue.peek());
		
		System.out.println(queue.toString());
		
		System.out.println("Dequeue: " + queue.dequeue());
		
		System.out.println(queue.toString());
		
		System.out.println("Dequeue: " + queue.dequeue());
		
		System.out.println("Peek: " + queue.peek());		
	}

}
