package Ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
		/**********************************
		  HECHO CON ARREGLOS
		 **********************************/
	
	
	System.out.println("----------------ARREGLOS----------------");
	int cantidadContraseña = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de contraseñas que quiere generar con los arreglos"));
	ArrayList <Password> contraseñas = new ArrayList <Password>();
	ArrayList <Boolean> fuertes = new ArrayList <Boolean>();
	
	for(int i = 0; i < cantidadContraseña; i++) {
		contraseñas.add(new Password(20));
		System.out.println("Contraseña: "+contraseñas.get(i).getContrasenia());
		fuertes.add(new Boolean(contraseñas.get(i).esFuerte()));
		System.out.println("Es fuerte: "+fuertes.get(i).booleanValue());
		System.out.println("\n");
	}
	
		
	/**********************************
	  HECHO CON HASHMAP
	 **********************************/
	
	System.out.println("\n\n");
	System.out.println("----------------MAPAS----------------");
	int cantidadContraseña1 = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de contraseñas que quiere generar con los mapas")); 
	
	HashMap<Password, Boolean> contraseñas1 = new HashMap<Password, Boolean>();
	
	for(int i = 0; i < cantidadContraseña1 ; i++) {
		Password contra = new Password(20);
		contraseñas1.put(contra, contra.esFuerte());
	}
	
	for(Entry<Password, Boolean> entry : contraseñas1.entrySet()) {
		System.out.println("Contraseña: "+entry.getKey().getContrasenia()+"\nEs fuerte: "+entry.getValue()+"\n\n");
	}
	
	}
	
	
}
