package testes;

import lista.Lista;
import lista.Produto;

public class AddTest {
	
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		Produto p = new Produto();
		p.setNome("Arroz");
		
		Produto p2 = new Produto();
		p2.setNome("Feijão");
		
		Produto p3 = new  Produto();
		p3.setNome("Carne");
		
		Produto p4 = new  Produto();
		p4.setNome("Farofa");
		
		lista.add(p);
		System.out.println(lista.toString());
		lista.add(p2);		
		System.out.println(lista.toString());
		lista.add(p3);
		System.out.println(lista.toString());
		lista.add(p4);
		System.out.println(lista.toString());
		
		Produto p5 = new Produto();
		p5.setNome("Peixe");
		lista.add(p5);
		System.out.println(lista.toString());
		
		Produto p6 = new Produto();
		lista.add(p6);
		p6.setNome("Fígado");
		System.out.println(lista.toString());
		
	}

}
