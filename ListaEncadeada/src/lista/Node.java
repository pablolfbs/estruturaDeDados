package lista;

public class Node {

	private Produto conteudo;
	private Node proximo;

	public Node(Produto conteudo, Node proximo) {
		this.conteudo = conteudo;
		this.proximo = proximo;
	}

	public Produto getConteudo() {
		return conteudo;
	}

	public void setConteudo(Produto conteudo) {
		this.conteudo = conteudo;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}

}
