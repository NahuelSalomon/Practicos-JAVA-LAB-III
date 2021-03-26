package Ejercicio3;

public class Electrodomestico {
	
	
	private double precioBase;
	private String color;
	private char consumoEnegético;
	private double peso;
	
	 
	/**
	 * Valores por defecto.
	 */
	private final String COLOR_DEF = "Blanco";
	private final double PRECIO_BASE_DEF = 100;
	private final char CONSM_ENERG_DEF = 'F';
	private final double PESO_DEF = 5;
	
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE_DEF;
		this.color = COLOR_DEF;
		this.consumoEnegético = CONSM_ENERG_DEF;
		this.peso = PESO_DEF;
	}

	public Electrodomestico(double precio, double peso) {
		this.precioBase = precio;
		this.color = COLOR_DEF;
		this.consumoEnegético = CONSM_ENERG_DEF;
		this.peso = peso;
		
	}
	
	public Electrodomestico(double precio, String color, char consumoEnerg, double peso) {
		this.precioBase = precio;
		this.color = comprobarColor(color);
		this.consumoEnegético = comprobarConsumoEnergetico(consumoEnerg);
		this.peso = peso;
		
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnegético() {
		return consumoEnegético;
	}

	public double getPeso() {
		return peso;
	}

	private char comprobarConsumoEnergetico(char consumo) {
		char comprobacion = CONSM_ENERG_DEF;
		char [] consumosDisponibles = {'A','B','C','D','E','F'};
		
		for(char elemento : consumosDisponibles) {
			if(elemento == consumo) {
				comprobacion = consumo;
			}
		}
		return comprobacion;
	}
	
	private String comprobarColor(String color) {
		String comprobacion = COLOR_DEF;
		String [] coloresDisponibles = {"BLANCO" , "NEGRO" , "ROJO" , "AZUL", "GRIS"};
		
		for(String elemento : coloresDisponibles) {
			if(elemento.equals(color)) {
				comprobacion = color;
			}
		}
	return comprobacion;
	}
	
	
	public double precioFinal() {
		double precioFinal = 0;
		
		precioFinal = getPrecioBase() + precioAdicionalConsumo(getConsumoEnegético()) 
		+ precioAdicionalTamaño(getPeso());
		
		return precioFinal;
	}

	private double precioAdicionalConsumo(char consumo) {
		double precioAdicional = 0;
		if(consumo == 'A') {
			precioAdicional = 100;
		}
		if(consumo == 'B') {
			precioAdicional = 80;
		}
		if(consumo == 'C') {
			precioAdicional = 60;
		}
		if(consumo == 'D') {
			precioAdicional = 50;
		}
		if(consumo == 'E') {
			precioAdicional = 30;
		}
		if(consumo == 'F') {
			precioAdicional = 10;
		}
		return precioAdicional;
	}
	
	private double precioAdicionalTamaño(double tamaño) {
		double precioAdicional = 0;
		
		if((tamaño >= 0) && (tamaño <= 19)) {
			precioAdicional = 10;
		}
		if((tamaño >= 20) && (tamaño <= 49)) {
			precioAdicional = 50;
		}
		if((tamaño >= 50) && (tamaño <= 79)) {
			precioAdicional = 80;
		}
		if(tamaño >= 80) {
			precioAdicional = 100;
		}
		return precioAdicional;
	}

	
	
}
