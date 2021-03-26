package Ejercicio5;

/**
 * Clase cliente con sus metodos constructeres, lo getters, los setters y el toString().
 * @author Nahuel
 *
 */
public class Cliente {
	
	/*********************************************
	 METODOS
	 *********************************************/
	
	private String nombreYapellido;
	private int cuit;
	private String domicilio;
	private int telefono;
	private String mail;
	
	
	/*********************************************
	 METODOS
	 *********************************************/
	
	/*---------------------------------------------
	 METODOS CONSTRUCTORES
	 ---------------------------------------------*/
	
	public Cliente() {
		nombreYapellido = "";
		cuit = 0;
		domicilio = "";
		telefono = 0;
		mail = "";
	}

	public Cliente(String nombreYapellido, int cuit, String domicilio, int telefono, String mail) {
		
		this.nombreYapellido = nombreYapellido;
		this.cuit = cuit;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.mail = mail;
	
	}
	
	/*---------------------------------------------
	 METODOS GETTERS Y SETTERS
	 ---------------------------------------------*/
	
	public String getnombreYapellido() {
		return nombreYapellido;
	}

	public void setnombreYapellido(String nombreYapellido) {
		this.nombreYapellido = nombreYapellido;
	}

	public int getCuit() {
		return cuit;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	/*---------------------------------------------
	 METODO TOSTRING
	 ---------------------------------------------*/
	
	public String toString() {
		return "nombreYapellido: "+getnombreYapellido()+"\nCuit: "+getCuit()+"\nDomicilio: "+getDomicilio()+"\nTelefono: "+getTelefono()+"\nMail: "+getMail()+"";
	}

}
