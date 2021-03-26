package clasesEj1Ej2Ej3;

import java.util.LinkedList;

import InterfacesEj1Ej2Ej3.Extremos;

public class Matematicas implements Extremos {
	
	LinkedList <Double> numeros = new LinkedList <Double>(); 
	
	public void agregarUnNumero(double numero) {
		numeros.add(numero);
	}
	
	public void agregarNUmeros(double numero1,double numero2,double numero3,double numero4) {
		numeros.add(numero1);
		numeros.add(numero2);
		numeros.add(numero3);
		numeros.add(numero4);
	}
	
	public void agregarCantidadDeNumeros(int cantidad, int limite) {
		for(int i = 0; i < cantidad ; i++) {
			numeros.add(Math.random()*limite);
		}
	}
	
	public void mostrarNumeros() {
		for(double numero : numeros) {
			System.out.print(" | "+numero);
		}
	}
	
	@Override
	public double inicio() {
		return numeros.getFirst();
	}

	@Override
	public double fin() {
		return numeros.getLast();
	}

	
}
