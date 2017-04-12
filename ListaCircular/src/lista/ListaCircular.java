package lista;

import java.util.Scanner;

public class ListaCircular {

	private Node head;
	private Node tail;
	private int countSize = 0;

	/*
	 * Adicionar no início.
	 */
	public void addInicio(int conteudo) {
		Node newNode = new Node(conteudo, this.tail, this.head);
		if (countSize == 0) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.head.setAnterior(newNode);
			this.tail.setProximo(newNode);
			this.head = newNode;
		}
		countSize++;
	}

	/*
	 * Adicionar no final.
	 */
	public void addFinal(int conteudo) {
		if (countSize == 0) {
			this.addInicio(conteudo);
		} else {
			Node newNode = new Node(conteudo, this.tail, this.head);
			this.tail.setProximo(newNode);
			this.tail = newNode;
			this.tail.setProximo(this.head);
			this.head.setAnterior(this.tail);
			if (countSize == 0) {
				this.head = newNode;
			}
			countSize++;
		}
	}

	/*
	 * Adiciona em posição específica.
	 */
	public void add(int posicao, int conteudo) {
		if (posicao == 0) {
			this.addInicio(conteudo);
		} else if (posicao >= this.countSize) {
			this.addFinal(conteudo);
		} else {
			Node anterior = this.getNode(posicao - 1);
			Node proximo = anterior.getProximo();
			Node newNode = new Node(conteudo, anterior, proximo);
			anterior.setProximo(newNode);
			proximo.setAnterior(newNode);
			countSize++;
		}
	}

	/*
	 * Método para pegar a posição.
	 */
	private Node getNode(int posicao) {
		Node tempNode = this.head;
		for (int i = 0; i < posicao; i++) {
			tempNode = tempNode.getProximo();
		}
		return tempNode;
	}

	/*
	 * Remover do início.
	 */
	public void removeInicio() {
		if (this.countSize == 0) {
			System.out.println("A lista está vazia!");
		} else if (this.countSize == 1) {
			this.head = null;
			this.tail = this.head;
		} else {
			Node aRemover = this.head;
			this.head = aRemover.getProximo();
			aRemover.setProximo(null);
			this.head.setAnterior(this.tail);
			this.tail.setProximo(this.head);
		}
		this.countSize--;
	}

	/*
	 * Remover do final.
	 */
	public void removeFinal() {
		if (this.countSize <= 1) {
			this.removeInicio();
		} else {
			Node novoTail = this.tail.getAnterior();
			this.tail.setAnterior(null);
			this.tail.setProximo(null);
			this.tail = novoTail;
			novoTail.setProximo(this.head);
			this.head.setAnterior(novoTail);
			countSize--;
		}
	}

	/*
	 * Remover da posição específica.
	 */
	public void remove(int posicao) {
		if (posicao == 0) {
			this.removeInicio();
		} else if (posicao == countSize - 1) {
			this.removeFinal();
		} else {
			Node removedNode = this.getNode(posicao);
			Node anterior = removedNode.getAnterior();
			Node proximo = removedNode.getProximo();
			removedNode.setAnterior(null);
			removedNode.setProximo(null);
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			countSize--;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		Node node = this.head;
		String list = "";
		for (int i = 0; i < countSize; i++) {
			list += node.getConteudo();
			node = node.getProximo();
			if (i == countSize - 1) {
				list += "";
			} else {
				list += " - ";
			}
		}
		return list;
	}
}
