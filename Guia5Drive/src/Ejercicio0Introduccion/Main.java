package Ejercicio0Introduccion;

import javax.swing.JOptionPane;

import Ejercicio1.Persona;

public class Main {

	public static void main(String[] args) {
		boolean mander = true;
		int op;
		String nombre, dni, nacionalidad;
		int edad;
		char sexo;
		double  peso, altura;
		Colegio colegio = new Colegio();
		
		while(mander) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar alumno\n2. Mostrar alumnos de una nacionalidad\n3. Mostrar todos"
														    + "\n4. Borar alumnos de una nacionalidad"));
			switch (op) {
			case 1:
				nombre = JOptionPane.showInputDialog("Nombre");
				edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
				dni = JOptionPane.showInputDialog("Dni");
				peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
				altura =Double.parseDouble(JOptionPane.showInputDialog("Altura"));
				sexo = JOptionPane.showInputDialog("Sexo (M o F)").charAt(0);
				nacionalidad =  JOptionPane.showInputDialog("Nacionalidad");
				Persona p = new Persona(nombre, edad, dni, peso, altura, sexo, nacionalidad);
				colegio.addAlumno(nacionalidad, p);
				break;
			case 2:
				nacionalidad =  JOptionPane.showInputDialog("Nacionalidad");
				JOptionPane.showMessageDialog(null, colegio.showNacionalidad(nacionalidad));
				break;
			case 3:
				JOptionPane.showMessageDialog(null, colegio.showAll());
				break;
			case 4:
				nacionalidad =  JOptionPane.showInputDialog("Nacionalidad");
				colegio.borrar(nacionalidad);
				break;
			case 0:
				mander = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion incorrecta");
				break;
			}
			
		}

	}

}
