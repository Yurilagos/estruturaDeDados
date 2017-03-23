package lista;

public class Node {
	
	private Product content;
	private Node next;
	
	public Node(Product content, Node next){

		this.content = content;
		this.next = next;
	}
	
	public Product getConteudo() {
		return content;
	}
	public void setContent(Product content) {
		this.content = content;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	

}
