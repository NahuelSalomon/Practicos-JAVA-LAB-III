package clasesEj1Ej2Ej3;

import java.util.ArrayList;

import InterfacesEj1Ej2Ej3.Estadisticas;

public class ArrayReales implements Estadisticas{

	ArrayList <Double> numeros = new ArrayList <Double>();
	
	public ArrayReales() {
		
	} 
	
	public void addNumero(double numero) {
		numeros.add(numero);
	}
	
	
	public void addNumeros(double numero1, double numero2, double numero3, 
						   double numero4, double numero5) {		   
		numeros.add(numero1);
		numeros.add(numero2);
		numeros.add(numero3);
		numeros.add(numero4);
		numeros.add(numero5);
		
	}
	
	@Override
	public double minimo() {
		double minimo = 0;
		if(!numeros.isEmpty()) {
			minimo = numeros.get(0);
			for(int i = 1 ; i < numeros.size(); i++) {
				if(numeros.get(i) < minimo) {
					minimo = numeros.get(i);
				}
			}
		}
		return minimo;
	}

	@Override
	public double maximo() {
		double maximo = 0;
		if(!numeros.isEmpty()) {
			maximo = numeros.get(0);
			for(int i = 1 ; i < numeros.size(); i++) {
				if(numeros.get(i) > maximo) {
					maximo = numeros.get(i);
				}
			}
		}
		return maximo;
	}

	@Override
	
	public double sumatorio() {
		double suma = 0;
		if(!numeros.isEmpty()) {
			for(int i = 0 ; i < numeros.size(); i++) { 
					suma = suma + numeros.get(i);
				}
			}
		
		return suma;
	}

	
}
