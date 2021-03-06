package problem;

import list.CircularLinkedList;

public class JosephusProblem {
	
	public static void main(String[] args) {
		
		int m, n;
		int count = 0;
		
		CircularLinkedList soldiers = new CircularLinkedList();
		
		n = 41;
		m = 3;
		
		for (int i = 1; i <= n; i++) {
			soldiers.insertTail(i);
		}
		System.out.println(soldiers.toString());
		
		while (soldiers.size() > 1) {

			for (int i = 0; i < m; i++) {
				if(count == soldiers.size()) {
					count = 0;
				}
				count++;
				if (count == soldiers.size()) {
					count = 0;
				}
			}
			soldiers.remove(count);
			System.out.println(soldiers.toString());
		}
		System.out.println("Sobrevivente: " + soldiers.toString());
	}
	
}
