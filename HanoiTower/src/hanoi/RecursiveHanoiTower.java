package hanoi;

public class RecursiveHanoiTower {
	
	//Realiza o movimento
	private void move(int source, int destination) {
		System.out.println(source + " -> " + destination);
	}
	
	//Implementa o algoritmo recursivo
	public void executeHanoi(int n, int source, int destination, int aux) {
		if (n > 0) {
			executeHanoi(n - 1, source, aux, destination);
			move(source, destination);
			executeHanoi(n - 1, aux, destination, source);
		}
	}

}
