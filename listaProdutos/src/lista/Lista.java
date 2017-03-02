package lista;

public class Lista {

	private Produto[] listProduct = new Produto[5];
	private int countSize = 0;

	public void adds(Produto produto) {
		for (int i = 0; i < listProduct.length; i++) {
			if (listProduct[i] == null) {
				listProduct[i] = produto;
				this.countSize++;
				break;
			}
		}
	}

	public void adds(int pos, Produto product) {
		for (int i = countSize - 1; i >= pos; i--) {
			listProduct[i + 1] = listProduct[i];
		}
		listProduct[pos] = product;
		this.countSize++;
	}

	public void remove(int position) {
		for (int i = position; i < countSize - i; i++) {
			listProduct[i] = listProduct[i + 1];
		}

		listProduct[countSize - 1] = null;

		this.countSize--;
	}

	public boolean contains(Produto produto) {
		for (int i = 0; i < listProduct.length; i++) {
			if (listProduct[i].equals(produto)) {
				return true;

			}
		}
		return false;

	}

	public int search(Produto produto) {
		for (int i = 0; i < listProduct.length; i++) {
			if (listProduct[i].equals(produto)) {
				return i;
			}

		}

		return 0;
	}

	public int size() {
		return this.countSize;

	}

	public String toString() {
		String tmp = "";

		for (int i = 0; i < countSize; i++) {
			tmp += listProduct[i].getNome() + " ";
		}

		return tmp;

	}

}
