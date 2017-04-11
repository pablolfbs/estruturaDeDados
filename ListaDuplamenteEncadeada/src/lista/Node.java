package lista;

public class Node {
	
	private Produto conteudo;
	private Node anterior;
	private Node proximo;
	
	public Node(Produto conteudo, Node anterior, Node proximo) {
		this.conteudo = conteudo;
		this.anterior = anterior;
		this.proximo = proximo;
	}

	public Produto getConteudo() {
		return conteudo;
	}

	public void setConteudo(Produto conteudo) {
		this.conteudo = conteudo;
	}

	public Node getAnterior() {
		return anterior;
	}

	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
	
}
