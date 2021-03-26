package Ejercicio6;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
/**
 * Clase para manejar y configurar el estado contable de un grupo de socios almacenados en un HashMap
 * @author Nahuel
 *
 */
public class ManejoDelestadoContableSocios {
	
	/*********************************************
	 ATRIBUTOS
	 *********************************************/
	
	private HashMap<String, Socio> socios;
	
	
	/*********************************************
	 METODOS
	 *********************************************/
	
	
	/*---------------------------------------------
	 METODOS CONSTRUCTORES
	 ---------------------------------------------*/
	
	public ManejoDelestadoContableSocios() {
		socios = new HashMap<String, Socio>();
	}
	
	/*---------------------------------------------
	 METODOS PARA AGREGAR
	 ---------------------------------------------*/
	
	public void addSocio(Socio socio) {
		socios.put(generarClave(), socio);
	}
	
	
	/*---------------------------------------------
	 METODOS GETTERS
	 ---------------------------------------------*/
	public HashMap<String, Socio> getSocios() {
		return socios;
	}
	
	/*---------------------------------------------
	 METODOS PARA GENERAR CLAVE UNICA PARA CADA SOCIO
	 ---------------------------------------------*/
	private String generarClave() {
		Random ra = new Random();	
		Integer numero = ra.nextInt(9999);
		String clave = numero.toString();
		if (!socios.containsKey(clave)){
			return clave;
		}else {
			return generarClave();
		}
	}
	
	
	/*---------------------------------------------
	 METODOS PARA LISTAR
	 ---------------------------------------------*/
	
	/**
	 * Metodo que lista todas las claves de los socios con su nombre apellido y tipo de socio
	 * @return claves de los socios con su nombre apellido y tipo de socio en forma de String
	 */
	public String listarClaves() {
		StringBuilder builder = new StringBuilder();
		for(Entry<String, Socio> entry : socios.entrySet()) {
			builder.append(entry.getKey()+" - "+entry.getValue().getNombre()+" "+entry.getValue().getApellido()+" - "+entry.getValue().getTipoDeSocio()+"\n");
		}
		return builder.toString();
	}
	
	/**
	 * Metodo para listar la informacion de un tipo de socio
	 * @param clave del socio para acceder a toda su informacion
	 * @return el socio en forma de String
	 */
	public String listarUnSocio(String clave) {
		StringBuilder builder = new StringBuilder();
		if(socios.containsKey(clave)) {
			builder.append(socios.get(clave).toString());
		}
		return builder.toString();
	}

	/*---------------------------------------------
	 METODOS PARA ELIMINAR
	 ---------------------------------------------*/
	/**
	 * Metodo para eliminar un socio
	 * @param clave del socio a eliminar
	 * @return true si fue eliminado con exito y false si no pudo ser eliminado
	 */
	public boolean eliminarUnSocio(String clave) {
		boolean fueEliminado = false;
		if(socios.containsKey(clave)) {
			socios.remove(clave);
			fueEliminado = true;
		}
		return fueEliminado;
	}
	
	/*---------------------------------------------
	 METODOS PARA IMPRIMIR
	 ---------------------------------------------*/
	/**
	 * Imprime el estado contable de los socios. Todos los meses, la cuota anual y si fue pagado o adeuda
	 * @param clave del socio para acceder al estado contable
	 * @return
	 */
	public String imprimirEstadoContable(String clave) {
		StringBuilder builder = new StringBuilder();
		if(socios.containsKey(clave)) {
			builder.append(socios.get(clave).getEstadoContable().imprimirEstadoContable());
		}
	return builder.toString();
	}
	
	
	/*---------------------------------------------
	 METODOS PARA CONFIGURAR ESTADO CONTABLE
	 ---------------------------------------------*/
	/**
	 * Configura el estado contable pasando por parametro el numero del mes, a pagado.
	 * @param clave del socio a modificar el estado contable
	 * @param numMes el mes que se desea pagar
	 */
	public void pagarMesSocio(String clave, int numMes) {
		if(socios.containsKey(clave)) {
			socios.get(clave).getEstadoContable().pagar(numMes);
		}
	}
	
	/**
	 * Configura el estado contable pasando por parametro el numero del mes, a deudor.
	 * @param clave del socio a modificar el estado contable
	 * @param numMes el mes que se desea adeudar
	 */
	public void adeudarMesSocio(String clave, int numMes) {
		if(socios.containsKey(clave)) {
			socios.get(clave).getEstadoContable().adeudar(numMes);
		}
	}
	
	/**
	 * Configura el estado contable pasando por parametro el numero del mes, a proximo a pagar.
	 * @param clave del socio a modificar el estado contable
	 * @param numMes el mes que se desea convertir a prox a pagar
	 */
	public void proxAPagarMesSocio(String clave, int numMes) {
		if(socios.containsKey(clave)) {
			socios.get(clave).getEstadoContable().proxAPagar(numMes);
		}
	}
	
	
	/*---------------------------------------------
	 METODOS PARA COMPROBAR EXISTENCIA DE SOCIOS
	 ---------------------------------------------*/
	/**
	 * Metodo para comprobar si existe determinado socio mediante su clave
	 * @param clave del socio buscado
	 * @return true si existe y false si no existe.
	 */
	public boolean existeSocio(String clave) {
		boolean existe = false;
		if(socios.containsKey(clave)) {
			existe = true;
		}
		return existe;
	}
}
