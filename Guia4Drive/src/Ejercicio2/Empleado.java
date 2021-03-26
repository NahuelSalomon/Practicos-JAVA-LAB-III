package Ejercicio2;

public abstract class Empleado {

	private String dni;
	private String nombre;
	private String apellido;
	private int añoIngreso;
	
	public Empleado() {
		dni = "";
		nombre = "";
		apellido = "";
		añoIngreso = 0;
	}
	
	public Empleado(String dni, String nombre, String apellido, int añoIngreso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.añoIngreso = añoIngreso;
	}

	public String getDni() {
		return this.dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public int getAñoIngreso() {
		return this.añoIngreso;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setAñoIngreso(int añoIngreso) {
		this.añoIngreso = añoIngreso;
	}

	public String imprimir() {
		return "Dni: "+getDni()+"\nNombre: "+getNombre()+"\nApellido: "+getApellido()+"\nAño de ingreso: "+getAñoIngreso();
	}
	
	public abstract double obtenerSalario();
}
