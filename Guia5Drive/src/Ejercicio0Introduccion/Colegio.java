package Ejercicio0Introduccion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


import Ejercicio1.Persona;

public class Colegio {
	
	HashMap <String , ArrayList<Persona>> alumnos;
	int cantidadAlumnos;
	
	
	public Colegio() {
		alumnos = new HashMap <String , ArrayList<Persona>>();
		cantidadAlumnos = 0;
	}
	
	public void addAlumno(String nacionalidad, Persona persona) {
		if(!alumnos.containsKey(nacionalidad)) {
			alumnos.put(nacionalidad, new ArrayList<Persona>());
			cantidadAlumnos++;
		}
		else {
			alumnos.get(nacionalidad).add(persona);
			cantidadAlumnos++;
		}
	}
	
	public String showAll() {
		StringBuilder builder = new StringBuilder();
		for(Entry<String, ArrayList<Persona>> entry : alumnos.entrySet()) {
			for(Persona p : entry.getValue()) {
				builder.append(p.toString()+"\n");
			}
		}
	return builder.toString();
	}
	
	public String showNacionalidad(String nacionalidad) {
		StringBuilder builder = new StringBuilder();
		for(Persona p : alumnos.get(nacionalidad)) {
			builder.append(p.toString()+"\n");
		}
	return builder.toString();
	}
	
	public int cuantos() {
		return cantidadAlumnos;
	}
	
	public boolean borrar(String nacionalidad) {
		boolean seBorro = false;
		if(alumnos.containsKey(nacionalidad)) {
			alumnos.remove(nacionalidad);
			seBorro = true;
		}
		return seBorro;
	}

}

