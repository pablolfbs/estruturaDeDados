package test;

import lista.ListaCircular;

public class Test {
	
	public static void main(String[] args) {
		
		ListaCircular myList = new ListaCircular();
		
//		myList.addInicio(15);
//		myList.addInicio(10);
		myList.addInicio(5);
		System.out.println(myList.toString());
		
//		myList.removeInicio();
//		System.out.println(myList.toString());
		
		myList.add(5, 50);
		System.out.println(myList.toString());
		
		myList.addFinal(90);
		myList.addFinal(80);
		myList.addFinal(60);
		System.out.println(myList.toString());
		
		myList.add(2, 30);
		System.out.println(myList.toString());
		
		myList.removeInicio();
		myList.removeInicio();
		System.out.println(myList.toString());
		
		myList.removeFinal();
		System.out.println(myList.toString());
		
		myList.remove(1);
		System.out.println(myList.toString());

		myList.remove(0);
		System.out.println(myList.toString());
		
		myList.addInicio(40);
		System.out.println(myList.toString());
		
		myList.add(2, 60);
		System.out.println(myList.toString());
	}
}
