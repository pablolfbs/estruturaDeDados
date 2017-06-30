package tree;

public class BinaryTree {

	private Node root;

	public BinaryTree() {
		this.root = null;
	}

	public void insertNode(int data) {

		// Instanciar um novo nó.
		Node newNode = new Node(data);

		// Se a árvore está vazia.
		if (root == null) {
			this.root = newNode;
		} else {
			// Iniciamos com foco na raiz.
			Node focusNode = this.root;

			// Futuro pai do novo nó.
			Node parent;

			while (true) {
				parent = focusNode;

				// Checa se o novo nó deve ir para a esquerda.
				if (data < focusNode.getData()) {

					// Troca o foco para o filho da esquerda.
					focusNode = focusNode.getLeftChild();

					// Se não há filho na esquerda.
					if (focusNode == null) {

						// O novo nó será inserido à esquerda.
						parent.setLeftChild(newNode);

						// Interrompe o laço.
						return;
					
					// Se chegamos aqui adicionamos à direita.
					} else {

						// Troca o foco para o filho da direita.
						focusNode = focusNode.getRightChild();
						
						// Se não há filho na direita.
						if (focusNode == null) {

							// O novo nó será inserido à direita.
							parent.setRightChild(newNode);

							// Interrompe o laço.
							return;
						} else {
							
							return;
						}
					}
				}
			}
		}
	}
	
	// Busca por um nó de acordo com o valor informado.
	public Node findNode(int data) {
		
		// Inicia no topo da árvore.
		Node focusNode = this.root;
		
		while (focusNode.getData() != data) {
			
			// Se o valor for menor que o nó, buscamos à esquerda.
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
}
