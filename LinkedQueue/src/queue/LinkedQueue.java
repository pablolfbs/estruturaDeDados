package queue;

import java.util.NoSuchElementException;

public class LinkedQueue {
	
	private Node first;
	private Node last;
	private int size;
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public int size() {
		return this.size;
	}
	
	//Enfileirar.
	public void enqueue(int content) {
		Node oldLast = this.last;
		this.last = new Node(content);
		this.last.setNext(null);
		
		if(isEmpty()){
			this.first = this.last;
		} else {
			oldLast.setNext(this.last);
		}
		this.size++;
	}
	
	//Desenfileirar
	public int dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}
		
		Node oldFirst = this.first;
		this.first = oldFirst.getNext(); 
		oldFirst.setNext(null);
		
		this.size--;
		
		if (isEmpty()) {
			//this.first = null;
			//this.last = null;
			this.first = this.last = null;
		}
		return oldFirst.getContent();
	}
	
	public int peek() {
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		return this.first.getContent();
	}
	
	public String toString() {
		String str = "";
		
		Node tmp = this.first;
		
		for (int i = 0; i < this.size; i++) {
			str += tmp.getContent() + " ";
			tmp = tmp.getNext();
		}
		return str;
	}

}
