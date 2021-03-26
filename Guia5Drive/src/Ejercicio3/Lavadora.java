package Ejercicio3;

public class Lavadora extends Electrodomestico{
	/*Su atributo es carga, ademas de los atributos heredados.
	Por defecto, la carga es de 5 kg. Usa una constante para ello.
	Los constructores que se implementaran serán:
	Un constructor por defecto.
	Un constructor con el precio y peso. El resto por defecto.
	Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.*/

	private double carga;
	
	private final double CARGA_DEF = 5; 
	
	public Lavadora() {
		super();
		this.carga = CARGA_DEF;
	}
	
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = CARGA_DEF; 
	}
	
	public Lavadora(double precio, String color,char consumoEnerg ,double peso, double carga) {
		super(precio, color, consumoEnerg, peso);
		this.carga = carga;
	}
	
	public double getCarga() {
		return carga;
	}

	@Override
	public double precioFinal() {
		double precioFinal = super.precioFinal();
		
		if(getCarga() > 30) {
			precioFinal += 30;
		}
		
		return precioFinal;
	}
}
