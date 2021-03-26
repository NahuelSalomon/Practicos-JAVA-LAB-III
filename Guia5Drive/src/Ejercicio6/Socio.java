package Ejercicio6;

/**
 * Clase abstracta socio para reunir caracteristicas de los tres tipos de socios. Continete metodos abstractos en los que 
   es distintamente aplicable en los tres casos. En lo que difieren los entre si los otros socios es en 
   su estado contable con el club.
 * @author Nahuel
 *
 */
public abstract class Socio {
	
	/*********************************************
	 ATRIBUTOS
	 *********************************************/
	
	private String nombre;
	private String apellido;
	private String nroSocio;
	private String dni;
	private String telefono;
	private int edad;
	private EstadoContable estadoContable;
	
	
	/*********************************************
	 METODOS
	 *********************************************/
	
	
	/*---------------------------------------------
	 METODOS CONSTRUCTORES
	 ---------------------------------------------*/
	
	public Socio() {
		this.nombre = "";
		this.apellido = "";
		this.nroSocio = "";
		this.dni = "";
		this.telefono = "";
		this.edad = 0;
		estadoContable = new EstadoContable();
	}
	
	public Socio(String nombre, String apellido, String nroSocio, String dni, String telefono, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroSocio = nroSocio;
		this.dni = dni;
		this.telefono = telefono;
		this.edad = edad;
		estadoContable = new EstadoContable();
	}

	
	/*---------------------------------------------
	 METODOS GETTERS
	 ---------------------------------------------*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public EstadoContable getEstadoContable() {
		return estadoContable;
	}

	public String getNroSocio() {
		return nroSocio;
	}

	public void setNroSocio(String nroSocio) {
		this.nroSocio = nroSocio;
	}

	public String getDni() {
		return dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/*---------------------------------------------
	 METODOS TOSTRING
	 ---------------------------------------------*/
	
	@Override
	public String toString() {
		return "\nNombre: " + nombre + "\npellido: " + apellido + "\nNroSocio: " + nroSocio + "\nDni: " + dni
				+ "\nTelefono: " + telefono + "\nEdad: " + edad  +"\nCuota mensual: "+cuotaMensualAPagar()
				+"\nCuota anual: "+cuotaMensualAPagar()+"\nTipo de socio: "+getTipoDeSocio();
	}
	
	/*---------------------------------------------
	 METODOS ABSTRACTOS
	 ---------------------------------------------*/
	
	public abstract double cuotaMensualAPagar();
	public abstract double cuotaAnualAPagar();
	public abstract String getTipoDeSocio();
	
	
}
