package clasesEj5Ej6Ej7;

import InterfacesEj5EJ6Ej7.funcionesBarco;

public class BarcoPesquero implements funcionesBarco {
	private String nombre;
	private int cantidadPescadores;
	private int potencia;
	private boolean alarma;
	
	public BarcoPesquero() {
		nombre = "";
		cantidadPescadores = 0;
		potencia = 0;
		alarma = false;
	}
	
	public BarcoPesquero(String nombre, int cantidadPescadores, int potencia) {
		this.nombre = nombre;
		this.cantidadPescadores = cantidadPescadores;
		this.potencia = potencia;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getCantidadPescadores() {
		return cantidadPescadores;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	@Override
	public String toString() {
		return "Barco pesquero\nNombre: "+nombre+"\nCantidadPescadores: "+cantidadPescadores+"\nPotencia: "+potencia+"\nAlarma: "+alarma; 
	}
	
	@Override
	public String msgeSocorro() {
		return "Barco de pesca "+nombre+" necesita ayuda";
	}

	@Override
	public void alarma() {
		if(alarma) alarma = false;
		else alarma = true;
	}

}
