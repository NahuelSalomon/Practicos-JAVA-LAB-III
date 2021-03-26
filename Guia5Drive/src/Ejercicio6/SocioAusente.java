package Ejercicio6;

/**
 * Clase SocioAusente hija de la clase Socio. Esta clase implementa metodos para ver si el socio esta presento o no.
   ya que cuento esta presente paga cuota minima de mantenimiento y cuando no , no paga nada. Paga tambien una cuota anual
   normal
 * @author Nahuel
 *
 */
public class SocioAusente extends Socio{
	
	/*********************************************
	 ATRIBUTOS
	 *********************************************/
	
	private boolean estaPresente;
	
	/*********************************************
	 METODOS
	 *********************************************/
	
	/*---------------------------------------------
	 METODOS CONSTRUCTORES
	 ---------------------------------------------*/
	
	public SocioAusente() {
		super();
		this.estaPresente =  false;
	}
	
	public SocioAusente(String nombre, String apellido, String nroSocio, String dni, String telefono, int edad) {
		super(nombre, apellido, nroSocio, dni, telefono, edad);
		this.estaPresente = false;
	}
	
	/*---------------------------------------------
	 METODOS ABSTRACTOS SOBREESCRITOS
	 ---------------------------------------------*/
	@Override
	public double cuotaMensualAPagar () {
		if(getEstaPresente())
		return 350;
		else {
	    return 0;
		}
	}
	
	@Override
	public double cuotaAnualAPagar() {
		return 1000;
	}

	@Override
	public String getTipoDeSocio() {
		return "Socio Ausente";
		 
	}
	
	/*---------------------------------------------
	 METODOS PARA MANIPULAR ESTADO DEL SOCIO AUSENTE
	 ---------------------------------------------*/
	public void cambiarEstadoPresencia() {
		if(estaPresente) {
			estaPresente = true;
		}
		else {
			estaPresente = false;
		}
	}
	
	public boolean getEstaPresente() {
		return estaPresente;
	}
	
	

}
