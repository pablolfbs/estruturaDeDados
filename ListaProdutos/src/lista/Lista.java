package lista;

public class Lista {

	private Produto[] listaProdutos = new Produto[2];
	private int countSize = 0;

	public void add(Produto produto) {
		this.giveMeMoreSpace();
		for (int i = 0; i < listaProdutos.length; i++) {
			if (listaProdutos[i] == null) {
				listaProdutos[i] = produto;
				this.countSize++;
				break;
			}
		}
	}

	public void add(int pos, Produto produto) {
		this.giveMeMoreSpace();
		for (int i = countSize - 1; i >= pos ; i--) {
			listaProdutos[i + 1] = listaProdutos[i];
		}
		listaProdutos[pos] = produto;
		this.countSize++;
	}
	
	/**
	 * Dobrar tamanho da lista.
	 */
	private void giveMeMoreSpace() {
		if (this.countSize == this.listaProdutos.length) {
			System.out.println("Aumentou...");
			Produto[] newList = new Produto[(listaProdutos.length)*2];
			for (int i = 0; i < listaProdutos.length; i++) {
				newList[i] = listaProdutos[i];
			}
			this.listaProdutos = newList;
		}
	}

	public void remove(int pos) {
		for (int i = pos; i < countSize - 1; i++) {
			listaProdutos[i] = listaProdutos[i + 1];			
		}
		listaProdutos[countSize - 1] = null;
		this.countSize--;
	}

	public boolean contains(Produto produto) {
		return false;
	}

	public int search(Produto produto) {
		return 0;
	}

	public int size() {
		return this.countSize;
	}
	
	public String toString() {
		String tmp = "";
		for (int i = 0; i < countSize; i++) {
			tmp += listaProdutos[i].getNome() + " ";
		}
		return tmp;
		
	}
}
