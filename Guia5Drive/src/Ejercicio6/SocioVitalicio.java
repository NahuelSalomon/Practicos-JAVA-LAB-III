package Ejercicio6;

/**
 * Clase socio vitalicio hija de la clase socio, en esta el socio realiza ningun tipo de pago.
 * @author Nahuel
 *
 */
public class SocioVitalicio extends Socio{
	
	/*********************************************
	 METODOS
	 *********************************************/
	
	
	/*---------------------------------------------
	 METODOS CONSTRUCTORES
	 ---------------------------------------------*/
	
	public SocioVitalicio() {
		super();
	}

	public SocioVitalicio(String nombre, String apellido, String nroSocio, String dni, String telefono, int edad) {
		super(nombre, apellido, nroSocio, dni, telefono, edad);
	}
	
	
	/*---------------------------------------------
	 METODOS ABSTRACTOS SOBREESCRITOS
	 ---------------------------------------------*/
	@Override
	public String getTipoDeSocio() {
		return "Socio Vitalicio";
	}

	@Override
	public double cuotaMensualAPagar() {
		return 0;
	}

	@Override
	public double cuotaAnualAPagar() {
		return 0;
	}
}
