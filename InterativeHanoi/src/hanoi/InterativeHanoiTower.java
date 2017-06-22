package hanoi;

import stack.LinkedStack;

public class InterativeHanoiTower {
	
	private LinkedStack stack = new LinkedStack();
	
	private void move(int source, int destination) {
		System.out.println(source + " -> " + destination);
	}
	
	public void executeHanoi(int n, int source, int destination, int aux) {
		while(n > 1) {
			
			n--;
		}
	}
}
