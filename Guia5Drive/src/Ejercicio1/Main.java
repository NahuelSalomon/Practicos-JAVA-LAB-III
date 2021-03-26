package Ejercicio1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Persona uno = new Persona();
		Persona dos = new Persona();
		Persona tres = new Persona();
		
		String nombre, dni;
		char sexo;
		int edad;
		double peso, altura;
		
		nombre = JOptionPane.showInputDialog("Nombre");
		sexo = JOptionPane.showInputDialog("Sexo (H o M)").charAt(0);
		edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
		dni = JOptionPane.showInputDialog("Dni");
		peso =  Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		altura =  Double.parseDouble(JOptionPane.showInputDialog("Altura"));
		uno = new Persona(nombre, edad, dni , peso, altura, sexo);
		
		
		JOptionPane.showMessageDialog(null, "Ahora ingresa los datos de la segunda persona");
		nombre = JOptionPane.showInputDialog("Nombre");
		sexo = JOptionPane.showInputDialog("Sexo (H o M)").charAt(0);
		edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
		dos = new Persona(nombre, edad, sexo);
		
		dos.generarDni();
		dos.setAltura(180);
		dos.setPeso(80);
		
		
		tres.setNombre("Juan");
		tres.setPeso(62.3);
		tres.setAltura(175);
		tres.setEdad(20);
		tres.setSexo('M');
		tres.generarDni();
		
		
		System.out.println(uno.toString()+"\n");
		int pesoUno = uno.CalcularMC();
		boolean esMayoruno = uno.esMayorDeEdad();
		String mayorUno;
		
		if(esMayoruno) {
			mayorUno = "es mayor de edad";
		}
		else {
			mayorUno = "no es mayor de edad";
		}
		
		
		if(pesoUno == -1) {
			System.out.println(uno.getNombre()+" tiene peso ideal y "+mayorUno);
		} 
		else {
			if(pesoUno == 0) {
				System.out.println(uno.getNombre()+" esta por debajo de su peso y "+mayorUno);
			}
			else {
				System.out.println(uno.getNombre()+" tiene sobrepeso y "+mayorUno);
			}
		}
		
		System.out.println("\n\n");
		System.out.println(dos.toString()+"\n");
		int pesoDos = dos.CalcularMC();
		boolean esMayordos = dos.esMayorDeEdad();
		String mayorDos;
		
		if(esMayordos) {
			mayorDos = "es mayor de edad";
		}
		else {
			mayorDos = "no es mayor de edad";
		}
		
		
		if(pesoDos == -1) {
			System.out.println(dos.getNombre()+" tiene peso ideal y "+mayorDos);
		} 
		else {
			if(pesoDos == 0) {
				System.out.println(dos.getNombre()+" esta por debajo de su peso y "+mayorDos);
			}
			else {
				System.out.println(dos.getNombre()+" tiene sobrepeso y "+mayorDos);
			}
		}
		
		System.out.println("\n\n");
		System.out.println(tres.toString()+"\n");
		int pesoTres = tres.CalcularMC();
		boolean esMayorTres = tres.esMayorDeEdad();
		String mayorTres;
		
		if(esMayorTres) {
			mayorTres = "es mayor de edad";
		}
		else {
			mayorTres = "no es mayor de edad";
		}
		
		
		if(pesoTres == -1) {
			System.out.println(tres.getNombre()+" tiene peso ideal y "+mayorTres);
		} 
		else {
			if(pesoTres == 0) {
				System.out.println(tres.getNombre()+" esta por debajo de su peso y "+mayorTres);
			}
			else {
				System.out.println(tres.getNombre()+" tiene sobrepeso y "+mayorTres);
			}
		}
	
	}

}
