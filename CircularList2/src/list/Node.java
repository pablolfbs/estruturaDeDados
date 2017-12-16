package list;

public class Node {
	
	private Node previous;
	private int content;
	private Node next;
	
	public Node(Node previous, int content, Node next){
		this.previous = previous;
		this.content = content;
		this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
