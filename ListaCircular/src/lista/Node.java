package lista;

public class Node {
	
	private int conteudo;
	private Node anterior;
	private Node proximo;
	
	public Node(int conteudo, Node anterior, Node proximo) {
		this.conteudo = conteudo;
		this.anterior = anterior;
		this.proximo = proximo;
	}
	public int getConteudo() {
		return conteudo;
	}
	public void setConteudo(int conteudo) {
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
