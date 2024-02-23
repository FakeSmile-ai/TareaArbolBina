package tarea1;

import java.util.Scanner;

public class Nodo {
	int valor;
	Nodo siguiente;

	Nodo(int valor) {
	this.valor = valor;
		this.siguiente = null;
	}
	public void agregar(int valor) {
		Nodo nuevoNodo = new Nodo(valor);
		Nodo actual=this;

		while (actual.siguiente != null) {
		actual=actual.siguiente;
		}
		actual.siguiente= nuevoNodo;
}
	

	public class Main {
	  public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
		  
		  System.out.println("Ingrese el valor para la raiz");
		  	int valorRa= entrada.nextInt();
	        Nodo raiz = new Nodo(valorRa);
	        System.out.println("Ingrese el valor para el siguiente nodo");
	        int valornod= entrada.nextInt();
	        raiz.agregar(valornod);
	        System.out.println("Ingrese el valor para el siguiente nodo");
	        valornod= entrada.nextInt();
	        raiz.agregar(valornod);
	        System.out.println("Ingrese el valor para el siguiente nodo");
	         valornod= entrada.nextInt();
	        raiz.agregar(valornod);
	        imprimirLista(raiz);  }

	    public static void imprimirLista(Nodo raiz) {
	        Nodo actual=raiz;
	        while (actual != null) {
	            System.out.print(actual.valor +"-->");
	            actual=actual.siguiente;
	       }
	        System.out.println("null");
	 }
}
}
