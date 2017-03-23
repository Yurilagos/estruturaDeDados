package lista;

public class ListaEncadeada {

	private Node first;
	private Node last;
	private int countSize;

	// adiciona no final
	public void addTail(Product content) {
		if (this.countSize == 0) {
			this.addHead(content);
		} else {
			Node newNo = new Node(content, null);
			this.last.setNext(newNo);
			this.last = newNo;

			this.countSize++;

		}
	}

	// adiciona em posicao especifica
	public void addPosition(int position, Product content) {

		if (position == 0) {
			this.addHead(content);
		} else if (position == this.countSize - 1) {
			this.addTail(content);
		} else {

			Node previousNo = this.getNode(position - 1);
			Node newNo = new Node(content, previousNo.getNext());
			previousNo.setNext(newNo);
			countSize++;
		}
	}

	public Node getNode(int position) {
		Node tempNode = this.first;
		for (int i = 0; i <= position; i++) {
			tempNode = tempNode.getNext();
		}
		return tempNode;
	}

	// adiciona no inicio
	public void addHead(Product content) {
		Node no = new Node(content, this.first);

		this.first = no;
		if (this.countSize == 0) {
			this.last = no;
		}
		countSize++;

	}

	public void removePosition(int position) {
		if (position == 0) {
			this.removeInicio();
		}else if(position == this.countSize -1){
			this.removeFinal();
		}else{
			Node previousNo = this.getNode(position - 1);
			previousNo.setNext(this.getNode(position + 1));
			getNode(position).setNext(null);
			
			countSize--;
			
			
		}

	}
	
	public void removeInicio(){
		Node no = this.first;
		this.first = no.getNext();
		no.setNext(null);
		countSize--;
		
	}
	
	public void removeFinal(){
		this.last = this.getNode(countSize-2);
		this.last.setNext(null);
		
		countSize--;
		
		
	}

	public void trocar(int posAtual, int posFinal) {
		
		Node no1 = this.getNode(posAtual);
		Node no2 = this.getNode(posFinal);
		Node temp = no1.getNext();
		
		no1.setNext(this.getNode(posFinal+1));
		this.getNode(posFinal-1).setNext(no1);
		this.getNode(posAtual-1).setNext(no2);
		no2.setNext(temp);
	

	}

	public int tamanho() {
		return 0;
	}

	public String toString() {
		return "";
	}

}
