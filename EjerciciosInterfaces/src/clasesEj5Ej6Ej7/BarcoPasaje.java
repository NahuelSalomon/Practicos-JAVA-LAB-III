package clasesEj5Ej6Ej7;

import InterfacesEj5EJ6Ej7.funcionesBarco;

public class BarcoPasaje implements funcionesBarco {
	private int cantidadDeCamas;
	private boolean alarma;
	
	public BarcoPasaje() {
		cantidadDeCamas = 0;
		alarma = false;
	}
	
	public BarcoPasaje(int cantidadDeCamas) {
		this.cantidadDeCamas = cantidadDeCamas;
	}
	
	public int getCantidadDeCamas() {
		return cantidadDeCamas;
	}
	
	public void agregarCama() {
		cantidadDeCamas++;
	}
	
	public void quitarCama() {
		cantidadDeCamas--;
	}
	
	@Override
	public String toString() {
	return "Barco pasaje\nCantida de camas: "+cantidadDeCamas+"\nAlarma: "+alarma;
	}
	
	@Override
	public String msgeSocorro() {
		return "Barco de pasajeros necesita ayuda";
	}

	@Override
	public void alarma() {
		if(alarma) alarma = false;
		else alarma = true;
	}
	
}
