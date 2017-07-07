package tree;

public class BinaryTree {

	private Node root;

	public BinaryTree() {
		this.root = null;
	}

	public Node getRoot() {
		return this.root;
	}

	public void insertNode(int data) {

		// Instanciar um novo n�.
		Node newNode = new Node(data);

		// Se a �rvore est� vazia.
		if (root == null) {
			this.root = newNode;
		} else {
			// Iniciamos com foco na raiz.
			Node focusNode = this.root;

			// Futuro pai do novo n�.
			Node parent;

			while (true) {
				parent = focusNode;

				// Checa se o novo n� deve ir para a esquerda.
				if (data < focusNode.getData()) {

					// Troca o foco para o filho da esquerda.
					focusNode = focusNode.getLeftChild();

					// Se n�o h� filho na esquerda.
					if (focusNode == null) {

						// O novo n� ser� inserido � esquerda.
						parent.setLeftChild(newNode);

						// Interrompe o la�o.
						return; // tamb�m pode ser usado o break;
					}
					// Se chegamos aqui adicionamos � direita.
				} else if (data > focusNode.getData()) {

					// Troca o foco para o filho da direita.
					focusNode = focusNode.getRightChild();

					// Se n�o h� filho na direita.
					if (focusNode == null) {

						// O novo n� ser� inserido � direita.
						parent.setRightChild(newNode);

						// Interrompe o la�o.
						return; // tamb�m pode ser usado o break;
					}
				} else {

					return; // tamb�m pode ser usado o break;
				}
			}
		}
	}

	// Busca por um n� de acordo com o valor informado.
	public Node findNode(int data) {

		// Inicia no topo da �rvore.
		Node focusNode = this.root;

		while (focusNode.getData() != data) {

			// Se o valor for menor que o n�, buscamos � esquerda.
			if (data < focusNode.getData()) {

				// Direciona o foco para o filho da esquerda.
				focusNode = focusNode.getLeftChild();
			} else {

				// Direciona o foco para o filho da direita.
				focusNode = focusNode.getRightChild();
			}

			if (focusNode == null) {

				return null;
			}
		}
		return focusNode;
	}

	// Percurso em ordem.
	public void inOrder(Node focusNode) {

		if (focusNode != null) {

			// Visita recursivamente a sub-�rvore da esquerda.
			inOrder(focusNode.getLeftChild());

			// Visita a raiz.
			System.out.println(focusNode.getData());

			// Visita recursivamente a sub-�rvore da direita.
			inOrder(focusNode.getRightChild());
		}
	}

	public void preOrder(Node focusNode) {
		
		if (focusNode != null) {

			// Visita a raiz.
			System.out.println(focusNode.getData());

			// Visita recursivamente a sub-�rvore da esquerda.
			preOrder(focusNode.getLeftChild());

			// Visita recursivamente a sub-�rvore da direita.
			preOrder(focusNode.getRightChild());
		}
	}

	public void postOrder(Node focusNode) {
		
		if (focusNode != null) {

			// Visita recursivamente a sub-�rvore da esquerda.
			postOrder(focusNode.getLeftChild());

			// Visita recursivamente a sub-�rvore da direita.
			postOrder(focusNode.getRightChild());

			// Visita a raiz.
			System.out.println(focusNode.getData());

		}
	}
}
