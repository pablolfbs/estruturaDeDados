package hanoi;

import stack.LinkedStack;

public class InterativeHanoiTower {

	// Responsável pelo empilhamento dos comandos
	private LinkedStack stack = new LinkedStack();

	// Realiza o movimento
	private void move(int source, int destination) {
		System.out.println(source + " -> " + destination);
	}

	// Método interativo da Torre de Hanoi
	public void executeHanoi(int n, int source, int destination, int aux) {

		// Declarando e empilhando o primeiro comando
		Command currentCommand = new Command(n, source, destination, aux);
		stack.push(currentCommand);

		// Executamos o restante do alg enquanto tivermos comandos da pilha
		while (!stack.isEmpty()) {
			
			// Empilha um novo comando sempre que n > 1
			if (n > 1) {
				n--;
				source = currentCommand.getSource();
				destination = currentCommand.getDestination();
				aux = currentCommand.getAux();
				
				// Seria uma chamada recursiva
				currentCommand = new Command(n, source, aux, destination);
				stack.push(currentCommand);
				
			// Desempilha e executa um comando
			} else {
				// Cast
				currentCommand = (Command) stack.pop();
				n = currentCommand.getN();
				source = currentCommand.getSource();
				destination = currentCommand.getDestination();
				aux = currentCommand.getAux();
				
				// Executa o movimento
				move(currentCommand.getSource(), currentCommand.getDestination());
				
				// Fazemos um novo empilhamento
				if (n > 1) {
					n--;
					
					// Seria uma chamada recursiva
					currentCommand = new Command(n, aux, destination, source);
					stack.push(currentCommand);
				}
			}
		}
	}
}
