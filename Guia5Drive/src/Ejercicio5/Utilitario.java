package Ejercicio5;

/**
 * Clase utilitario hija de vehiculo, con un atributo mas especificando el tipo de carga
 * @author Nahuel
 *
 */
public class Utilitario extends Vehiculo{
	
	/*********************************************
	 ATRIBUTOS
	 *********************************************/
	
	private String tipoCarga;
	
	
	/*********************************************
	 METODOS
	 *********************************************/
	
	/*---------------------------------------------
	 METODOS CONSTRUCTORES
	 ---------------------------------------------*/
	
	public Utilitario() {
		super();
		this.tipoCarga = "";
	}

	public Utilitario(String patente, String marca, int modelo, double km, double precioDiario, String estado, String tipoCarga) {
		super(patente, marca, modelo, km, precioDiario,estado);
		this.tipoCarga = tipoCarga;
	}
	
	/*---------------------------------------------
	 METODO GETTTER
	 ---------------------------------------------*/
	
	public String getTipoCarga() {
		return this.tipoCarga;
	}
	
	
}
