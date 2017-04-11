package lista;

public class ListaEncadeada {

	private Node primeiro;
	private Node ultimo;
	private int countSize;

	// Adiciona no final.
	public void add(Produto conteudo) {
		if (this.countSize == 0) {
			this.addInicio(conteudo);
		} else {
			Node novoNo = new Node(conteudo, null);
			this.ultimo.setProximo(novoNo);
			this.ultimo = novoNo;
			this.countSize++;
		}		
	}

	// Adiciona em posição específica.
	public void add(int posicao, Produto conteudo) {
		if (posicao == 0) {
			this.addInicio(conteudo);
		} else if (posicao == this.countSize) {
			this.add(conteudo);
		} else {
			Node anterior = this.getNode(posicao - 1);
			Node novoNo = new Node(conteudo, anterior.getProximo());
			anterior.setProximo(novoNo);
			this.countSize++;
		}
	}

	public Node getNode(int posicao) {
		Node tempNode = this.primeiro;
		for (int i = 0; i <= posicao; i++) {
			tempNode = tempNode.getProximo();
		}
		return tempNode;
	}

	// Adiciona no início.
	public void addInicio(Produto conteudo) {
		Node novoNo = new Node(conteudo, this.primeiro);
		this.primeiro = novoNo;
		if (this.countSize == 0) {
			this.ultimo = novoNo;
		}
		countSize++;
	}

	public void remove(int posicao) {
		Node anterior = this.getNode(posicao - 1);
		Node proximo = this.getNode(posicao + 1);
		anterior.getProximo().setProximo(null);
		anterior.setProximo(proximo);
		countSize--;
	}

	public void removeInicio() {
		Node no = this.primeiro.getProximo();
		this.primeiro.setProximo(null);
		this.primeiro = no;
		countSize--;
	}

	public void removeFinal() {
		Node penultimo = this.getNode(countSize - 2); /*ao invés de 'countSize-2', pode ser 'posição-1'?*/
		this.ultimo = penultimo;
		this.ultimo.setProximo(null);
		countSize--;
	}

	public void trocar(int posAtual, int posFinal) {

	}

	public int tamanho() {
		return countSize;
	}

	public String toString() {
		String string;
		Node nodeForPrint = this.primeiro;
		for (int i = 0; i <= tamanho(); i++) {
			string = nodeForPrint.getConteudo().getNome() + " ";
			nodeForPrint = nodeForPrint.getProximo();
		}
		string = "coisa";
		return string;
	}
	
}
