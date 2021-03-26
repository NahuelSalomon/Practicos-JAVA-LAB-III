package Ejercicio5;

/**
 * Metodo para registrar un alquiler de vehiculo y asi relacionar los clientes con el los vehiculos que alquilan,
   agregandole la fecha en que emprezo el alquiler y en la que finaliza. Tambien cuenta con los km con que devolvio 
   el cliente el auto.
 * @author Nahuel
 *
 */

public class RegistroAlquiler {
	
	
	/*********************************************
	 ATRIBUTOS
	 *********************************************/
	
	private Cliente cliente;
	private Vehiculo vehiculo;
	private String fechaInicial;
	private String fechaFinal;
	private double kmDevolucion;
	private boolean disponible;
	
	

	/*********************************************
	METODOS
	 *********************************************/
	
	
	/*---------------------------------------------
	 METODOS CONSTRUCTORES
	 ---------------------------------------------*/
	public RegistroAlquiler() {
		cliente = new Cliente();
		vehiculo = new Vehiculo();
		fechaInicial = "0 / 0 /0";
		fechaFinal = "0 / 0 / 0";
		kmDevolucion = 0;
		disponible = false;
	}
	
	
	public RegistroAlquiler(Cliente cliente, Vehiculo vehiculo, String fechaInicial,String fechaFinal, boolean disponible) {
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
		this.kmDevolucion = 0;
		this.disponible = disponible;
	}


	/*---------------------------------------------
	 METODOS GETTERS Y SETTTERS
	 ---------------------------------------------*/
	public double getKmDevolucion() {
		return kmDevolucion;
	}

	public void setKmDevolucion(double kmDevolucion) {
		this.kmDevolucion = kmDevolucion;
	}
	
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public String getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	
	/*------------------------------------------------------------------------
	 METODO PARA VER SI ESTA DISPONIBLE EL VEHICULO UTILIZADO EN ESTE ALQUILER
	 -------------------------------------------------------------------------*/
	
	public boolean isDisponible() {
		return disponible;
	}
	
	
	/*---------------------------------------------
	 METODOS TOSTRING
	 ---------------------------------------------*/
	@Override
	public String toString() {
		return "Cliente:" + cliente.getnombreYapellido() + "\nVehiculo: " + vehiculo.getMarca() + "\nFechaInicial: " + fechaInicial
				+ "\nFechaFinal: " + fechaFinal+"\nDiponibilidad del vehiculo: "+isDisponible()+"\n";
	}
	
	
}

