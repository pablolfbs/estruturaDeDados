package list;

public class CircularLinkedList {

	private Node head;
	private Node tail;
	private int countSize = 0;

	public void insertHead(int content) {
		Node newNode = new Node(this.tail, content, this.head);
		if (this.countSize == 0) {
			this.head = newNode;
			this.tail = this.head;
			newNode.setNext(this.head);
			newNode.setPrevious(this.tail);
		} else {
			this.tail.setNext(newNode);
			newNode.setPrevious(this.tail);
			newNode.setNext(this.head);
			this.head.setPrevious(newNode);
			this.head = newNode;
		}
		countSize++;
	}

	public void insertTail(int content) {
		Node newNode = new Node(this.tail, content, this.head);
		if (this.countSize == 0) {
			insertHead(content);
		} else {
			this.tail.setNext(newNode);
			newNode.setPrevious(this.tail);
			newNode.setNext(this.head);
			this.head.setPrevious(newNode);
			this.tail = newNode;
			this.countSize++;
		}
	}

	public Node getNode(int position) {
		Node temp = this.head;
		for (int i = 0; i < position; i++) {
			temp = temp.getNext();
		}
		return temp;
	}

	public void removeHead() {
		if (this.countSize == 0) {
			System.out.println("A lista está vazia!");
		} else {
			Node temp = this.head.getNext();
			this.head.setNext(null);
			this.head.setPrevious(null);
			temp.setPrevious(this.tail);
			this.tail.setNext(temp);
			this.head = temp;
			this.countSize--;
		}
	}

	public void removeTail() {
		if (this.countSize <= 1) {
			removeHead();
		} else {
			Node temp = this.tail.getPrevious();
			temp.setNext(this.head);
			this.head.setPrevious(temp);
			this.tail.setPrevious(null);
			this.tail.setNext(null);
			this.tail = temp;
			this.countSize--;
		}
	}

	public void remove(int position) {
		if (position == 0) {
			this.removeHead();
		} else if (position == this.countSize - 1) {
			this.removeTail();
		} else {
			Node node = this.getNode(position);
			Node temp1 = node.getPrevious();
			Node temp2 = node.getNext();
			temp1.setNext(temp2);
			temp2.setPrevious(temp1);
			node.setNext(null);
			node.setPrevious(null);
			countSize--;
		}
	}

	public String toString() {
		String str = "";
		Node temp = this.head;
		for (int i = 0; i < countSize; i++) {
			str += temp.getContent() + " ";
			temp = temp.getNext();
		}
		return str;
	}

	public int size() {
		return this.countSize;
	}
	
}
