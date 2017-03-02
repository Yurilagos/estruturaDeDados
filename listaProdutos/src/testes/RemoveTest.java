package testes;

import lista.Lista;
import lista.Produto;

public class RemoveTest {
public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		Produto p = new Produto();
		p.setNome("Arroz");
		Produto p2 = new Produto();
		p2.setNome("Feijao");
		Produto p3 = new Produto();
		p3.setNome("Carne");
		Produto p4 = new Produto();
		p4.setNome("Farofa");
		
		lista.adds(p);
		lista.adds(p2);
		lista.adds(p3);
		lista.adds(p4);
		System.out.println(lista.toString());
		
		lista.remove(2);
		
		System.out.println(lista.toString());
	}

}
