package app;

import javax.swing.JOptionPane;

import clasesEj5Ej6Ej7.BarcoPasaje;
import clasesEj5Ej6Ej7.BarcoPesquero;
import clasesEj5Ej6Ej7.BarcoPortaAvion;
import clasesEj5Ej6Ej7.Pila;
import clasesEj5Ej6Ej7.PruebaPila;

public class MainEj5Ej6Ej7 {

	public static void main(String[] args) {
	
	//EJERCICIO 5 Y 6
	/*	
		Pila pilita = new Pila();
		PruebaPila p = new PruebaPila();
		p.rellenar(pilita);
		p.imprimirYVaciar(pilita);*/

	// EJERCICIO 7.
		
		BarcoPasaje pasaje = new BarcoPasaje(100);
		BarcoPesquero pesquero = new BarcoPesquero("La pinta", 42, 200);
		BarcoPortaAvion portaAvion = new BarcoPortaAvion(5);
	
	boolean mander = true;
	int op, opcion;
	while (mander) {
		
		op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido.\n1. Mostrar Barcos \n2. Pedir socorro \n3. Activar/desactivar alarma \n4. Salir"));
		
		switch (op) {
		case 1:
			JOptionPane.showMessageDialog(null,pasaje.toString()+"\n\n"+pesquero.toString()+"\n\n"+portaAvion.toString());
			break;
		case 2:
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Socorro\n1. Pesquero\n2. Pasaje\n3. Aviones"));
			if(opcion == 1) JOptionPane.showMessageDialog(null, pesquero.msgeSocorro());
			else if(opcion == 2)  JOptionPane.showMessageDialog(null,pasaje.msgeSocorro());
			else if(opcion == 3)  JOptionPane.showMessageDialog(null,portaAvion.msgeSocorro());
			break;
		case 3:
		    opcion = Integer.parseInt(JOptionPane.showInputDialog("Alarma\n1. Pesquero\n2. Pasaje\n3. Aviones"));
			if(opcion == 1)  pesquero.alarma();
			else if(opcion == 2)  pasaje.alarma();
			else if(opcion == 3)  portaAvion.alarma();
			break;
		case 4:
			mander = false;
			break;
		
		default:
			break;
		}
		
		
	}
	
	}

}
