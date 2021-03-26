package Ejercicio5;

/**
 * Clase hija de vehiculo
 * @author Nahuel
 *
 */
public class Automovil extends Vehiculo{
	
	
	/*********************************************
	 METODOS
	 *********************************************/
	
	
	/*---------------------------------------------
	 METODOS CONSTRUCTORES
	 ---------------------------------------------*/
	
	public Automovil() {
		super();
	}
	
	public Automovil(String patente, String marca, int modelo, double km, double precioDiario, String estado) {
		super( patente,  marca,  modelo,  km,  precioDiario,  estado);
	}

}
