package Ejercicio1;

public class Persona {
	
	private String nombre; 
	private int edad; 
	private String dni; 
	private double peso;
	private double altura;
	private char sexo;
	private String nacionalidad;


	public Persona() {
		nombre = ""; 
		edad = 0; 
		dni = ""; 
		peso = 0;
		altura = 0;
		sexo = 'H';
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public Persona(String nombre, int edad,String dni, double peso, double altura, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}
	
	public Persona(String nombre, int edad,String dni, double peso, double altura, char sexo, String nacionalidad) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
		this.nacionalidad = nacionalidad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	private final int BAJO_PESO = 0;
	private final int IDEAL = -1;
	private final int SOBRE_PESO = 1;
	

	public int CalcularMC() {
		int res = -1;
		double formula = getPeso()/Math.pow(getAltura(), 2);
		
		if(formula < 20) {
			res = BAJO_PESO;
		}
		else {
			if((formula >= 20) && (formula <= 25)) {
				res = IDEAL;
			}
			else {
				res = SOBRE_PESO;
			}
		}
		
		return res;
	}
	
	public boolean esMayorDeEdad() {
		boolean esMayor = false;
		if(getEdad() >= 18) {
			esMayor = true;
		}
	return esMayor;
	}
	
	public boolean comprobarSexo(char sexo) {
		boolean comprobacion = false;
		if(getSexo() == sexo) {
			comprobacion = true;
		}
	return comprobacion;
	}
	
	public void generarDni() {
		Integer dni = (int)(Math.random()*(99999999-1000000+1)+1000000);
		this.dni = dni.toString();
	} 
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", peso=" + peso + ", altura=" + altura
				+ ", sexo=" + sexo + "]";
	}
	
	
}
