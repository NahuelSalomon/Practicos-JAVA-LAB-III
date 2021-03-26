package clasesEj5Ej6Ej7;

import java.util.ArrayList;

import InterfacesEj5EJ6Ej7.ColeccionInterfaz;

public class Pila implements ColeccionInterfaz{
	
	ArrayList <Integer> enteros; 
	int cantidadDeObjetos;
	
	public Pila() {
		enteros =  new ArrayList<Integer>();
		cantidadDeObjetos = 0;
	}
	
	
	
	@Override
	public boolean estaVacia() {
		boolean flag;
		if(enteros.isEmpty()) flag = true;
		else flag = false;
		return flag;
	}

	@Override
	public Object extraer() {
		Object numAExtraer = primero();
		enteros.remove(cantidadDeObjetos - 1);
		cantidadDeObjetos--;
		return numAExtraer;
	}

	@Override
	public Object primero() {
		return enteros.get(cantidadDeObjetos - 1);
	}

	@Override
	public boolean añadir(Object objAAñadir) {
		boolean flag;
		if(objAAñadir instanceof Integer) {
			Integer num = new Integer((Integer)objAAñadir);
			enteros.add(num);
			cantidadDeObjetos++;
			flag = true;
		}
		else flag = false;
		return flag;
	}
	
}
