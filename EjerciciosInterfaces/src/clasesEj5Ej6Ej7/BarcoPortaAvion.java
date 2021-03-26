package clasesEj5Ej6Ej7;

import InterfacesEj5EJ6Ej7.funcionesBarco;

public class BarcoPortaAvion implements funcionesBarco {
	private int cantidadDeAviones;
	private boolean alarma;
	
	public BarcoPortaAvion() {
		cantidadDeAviones = 0;
	}
	
	public BarcoPortaAvion(int cantidadDeAviones) {
		this.cantidadDeAviones = cantidadDeAviones;
	}
	
	public int getCantidadDeCamas() {
		return cantidadDeAviones;
	}
	
	public void agregarAvion() {
		cantidadDeAviones++;
	}
	
	public void quitarAvion() {
		cantidadDeAviones--;
	}
	
	@Override
	public String toString() {
		return "Barco porta aviones\nCantidad de aviones: "+cantidadDeAviones+"\nAlarma: "+alarma;
	}
	
	
	@Override
	public String msgeSocorro() {
		return "Barco porta aviones necesita ayuda";
	}

	@Override
	public void alarma() {
		if(alarma) alarma = false;
		else alarma = true;
	}

}
