package ClaseContenedora;

import java.io.Serializable;
import java.util.ArrayList;

import org.json.JSONObject;

import Clases.IntegranteSeleccion;

public class ContenedorIntegrantesSeleccion <E extends IntegranteSeleccion> implements Serializable{
	
	private ArrayList <E> integrantes;
	
	public ContenedorIntegrantesSeleccion() {
		integrantes = new ArrayList<E>();
	}
	
	public boolean agregarUnIntegrante(E integrante) {
		return integrantes.add(integrante);
	}
	
	public boolean quitarUnIntegrante(E integrante) {
		return integrantes.remove(integrante);
	}
	
	public E quitarUnIntegrante(int index) {
		return integrantes.remove(index);
	}

	public String listarIntegrantes() {
		
		StringBuilder builder = new StringBuilder();
		
		for(E integrante : integrantes) {
			builder.append(integrante.toString());
		}
		
		return builder.toString();	
	}
	
	public E buscarUnIntegrante(int index) {
		return integrantes.get(index); 
	}
	
	public int cantidadDeIntegrantes() {
		return integrantes.size();
	}
	
}
