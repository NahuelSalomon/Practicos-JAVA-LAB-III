package Ejercicio4Bis;

public class Cliente2 {
	private String nombre;
	private int cuit;
	private String domicilio;
	private int telefono;
	private String mail;
	
	public Cliente2() {
		nombre = "";
		cuit = 0;
		domicilio = "";
		telefono = 0;
		mail = "";
	}

	public Cliente2(String nombre, int cuit, String domicilio, int telefono, String mail) {
		
		this.nombre = nombre;
		this.cuit = cuit;
		this.domicilio = domicilio;
		this.telefono = telefono;
		this.mail = mail;
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	public String toString() {
		return "Nombre: "+getNombre()+"\nCuit: "+getCuit()+"\nDomicilio: "+getDomicilio()+"\nTelefono: "+getTelefono()+"\nMail: "+getMail()+"";
	}

}

