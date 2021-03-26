package Ejercicio3;

public class Television extends Electrodomestico{
	private double resolucion;
	private boolean sintonizadorTDT;
	
	/*
	 * Valores por defecto
	 */
	
	private final boolean  SINTONIZADOR_DEF = false;
	private final double  RESOLUCION_DEF = 20;
	
	public Television() {
		super();
		this.resolucion = RESOLUCION_DEF;
		this.sintonizadorTDT = SINTONIZADOR_DEF;
	}
	
	public Television(double precio, double peso) {
		super(precio, peso);
		this.resolucion = RESOLUCION_DEF;
		this.sintonizadorTDT = SINTONIZADOR_DEF;
	}

	public Television(double precio, String color, char consumoEnerg, double peso, 
			 		  double resolucion, boolean sintonizador) {
		super(precio, color, consumoEnerg, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizador;
	}

	public double getResolucion() {
		return resolucion;
	}
	
	public boolean getSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		
		if(getResolucion() > 0) {
			precioFinal += precioFinal*0.3;
		}
		if(getSintonizadorTDT()) {
			precioFinal += 50;
		}
		
		return precioFinal;
	}
	
}
