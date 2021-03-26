package Ejercicio5;

/**
 * Clase vehiculo para formar la base de automovil y utilitario con sus caracteristicas en comun, y cualquier 
   otro vehiculo que se quiera agregar siendo hija de esta
 * @author Nahuel
 *
 */
public class Vehiculo {
	
	/*********************************************
	 ATRIBUTOS
	 *********************************************/
	
	private String patente;
	private String marca;
	private int modelo;
	private double km;
	private double precioDiario;
	private String estado;
	private String claveVehiculo;
	
	
	/*********************************************
	 METODOS
	 *********************************************/
	
	
	/*---------------------------------------------
	 METODOS CONSTRUCTORES
	 ---------------------------------------------*/
	
	public Vehiculo() {
		this.patente = "";
		this.marca = "";
		this.modelo = 0;
		this.km = 0;
		this.precioDiario = 0;
		this.estado = "Disponible";
		this.claveVehiculo = "";
	}
	
	public Vehiculo(String patente, String marca, int modelo, double km, double precioDiario, String estado) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
		this.precioDiario = precioDiario;
		this.estado = comprobarEstado(estado);
		this.claveVehiculo = "";
	}
	
	
	/*--------------------------------------------------------------
	 METODO PARA COMPROBAR SI EL ESTADO ES UNO DE LOS TRES POSIBLES
	 --------------------------------------------------------------*/

	public String comprobarEstado(String estado) {
		String estadoComprobado = "No definido";
		if(estado.equalsIgnoreCase("Disponible") || estado.equalsIgnoreCase("Alquilado") || estado.equalsIgnoreCase("En revision")) {
			estadoComprobado = estado;
		}
		return estadoComprobado;
	}
	
	
	/*---------------------------------------------
	 METODOS GETTERS Y SETTERS
	 ---------------------------------------------*/
	
	public String getClaveVehiculo() {
		return claveVehiculo;
	}

	public void setClaveVehiculo(String claveVehiculo) {
		this.claveVehiculo = claveVehiculo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public double getPrecioDiario() {
		return precioDiario;
	}

	public void setPrecioDiario(double precioDiario) {
		this.precioDiario = precioDiario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	/*---------------------------------------------
	 METODOS TOSTRING
	 ---------------------------------------------*/
	
	@Override
	public String toString () {
		return "Patente: "+getPatente()+"\nMarca: "+getMarca()+"\nModelo: "+getModelo()
		+"\nKm: "+getKm()+"\nPrecioDiario: "+getPrecioDiario()+"\nEstado: "+getEstado()+"\n";
	}

}
