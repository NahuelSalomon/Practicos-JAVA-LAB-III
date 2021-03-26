package Ejercicio6;

/**
 * Clase socio normal hija de la clase socio, en esta el socio paga cuota una cuota mensual normal y una cuota anual normal
 * @author Nahuel
 *
 */
public class SocioNormal extends Socio{
	
	/*********************************************
	 METODOS
	 *********************************************/
	
	/*---------------------------------------------
	 METODOS CONSTRUCTORES
	 ---------------------------------------------*/
	
	public SocioNormal() {
		super();
	}

	public SocioNormal(String nombre, String apellido, String nroSocio, String dni, String telefono, int edad) {
		super(nombre, apellido, nroSocio, dni, telefono, edad);
	}
	
	/*---------------------------------------------
	 METODOS ABSTRACTOS SOBREESCRITOS
	 ---------------------------------------------*/
	@Override
	public String getTipoDeSocio() {
		return "Socio Normal";
	}

	@Override
	public double cuotaMensualAPagar() {
		return 600;
	}

	@Override
	public double cuotaAnualAPagar() {
		// TODO Auto-generated method stub
		return 1000;
	}
}
