package stack;

import java.util.NoSuchElementException;

public class LinkedStack {
	
	private Node top;
	private int size;
	
	public LinkedStack() {
		this.top = null;
		this.size = 0;
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return (this.top) == null;
	}
	
	public void push(int content) {
		Node oldTop = top;
		
//		Node newNode = new Node(content);
//		top = newNode;
		
		top = new Node(content);
		top.setNext(oldTop);
		
		size++;
	}
	
	//Desempilhamento
	public int pop() {
		
		if(isEmpty()) {
			throw new NoSuchElementException("Stack is empty"); 
		}
		Node oldTop = top;
		int content = oldTop.getContent();
		top = oldTop.getNext();
		oldTop.setNext(null);
		
		size--;
		
		return content;
	}
	
	//Olhadinha ou Espiada: não desempilha
	public int peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Stack is empty");
		}
		return top.getContent();
	}
	
	public String toString() {
		String str = "";
		
		Node tmp = top;
		
		for (int i = 0; i < this.size; i++) {
			str += tmp.getContent() + "\n";
			tmp = tmp.getNext();
		}
		return str;
	}
}
