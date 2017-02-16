package lista;

public class Lista {

	private Produto[] listaProdutos = new Produto[10];
	private int countSize = 0;

	public void adds(Produto produto) {
		for (int i = 0; i < listaProdutos.length; i++) {
			if (listaProdutos[i] == null) {
				listaProdutos[i] = produto;
				break;

			}

		}

		this.countSize++;
	}

	public void adds(int pos, Produto produto) {
		for (int i = countSize; i >= pos; i--) {
			listaProdutos[i] = listaProdutos[i+1];
		}
		listaProdutos[pos] = produto;

	}

	public void remove(int pos) {
		listaProdutos[pos] = null;

		this.countSize--;
	}

	public boolean contains(Produto produto) {
		for (int i = 0; i < listaProdutos.length; i++) {
			if (listaProdutos[i].equals(produto)) {
				return true;
				
			}
		}
		return false;

	}

	public int search(Produto produto) {
		for (int i = 0; i < listaProdutos.length; i++) {
			if(listaProdutos[i].equals(produto)){
				return i;
			}
			
		}
		
		
		return 0;
	}

	public int size() {
		return this.countSize;

	}

}

	