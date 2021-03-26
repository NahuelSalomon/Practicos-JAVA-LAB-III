package Ejercicio5;


import java.util.HashMap;
import java.util.Random;
import java.util.Map.Entry;

/**
 * Clase para la administracion de alquileres de vehiculos. Teniendo asi registrados los alquileres, los clientes,
   y la historia de registro de alquileres en uso y los que ya fueron efectuados.
 * @author Nahuel
 *
 */
public class AdministracionAlquileres {

	
	/*********************************************
	 ATRIBUTOS
	 *********************************************/
	
	private HashMap<String, Vehiculo> vehiculos;
	private HashMap<String, Cliente> clientes;
	private HashMap<String, RegistroAlquiler> alquileres;
	
	
	/*********************************************
	 METODOS
	 *********************************************/
	
	
	/*---------------------------------------------
	 METODOS CONSTRUCTORES
	 ---------------------------------------------*/
	
	
	public AdministracionAlquileres() {
		vehiculos = new HashMap<String, Vehiculo>();
		clientes = new HashMap<String, Cliente>();
		alquileres = new HashMap<String, RegistroAlquiler>();
	}
	
	
	/*---------------------------------------------
	 METODOS GETTERS
	 ---------------------------------------------*/
	
	/**
	 * Funcion que retorna los vehiculos de la clase
	 * @return los vehiculos
	 */
	public HashMap<String, Vehiculo> getVehiculos() {
		return vehiculos;
	}

	/**
	 * Funcion que retorna los clientes de la clase
	 * @return los clientes
	 */
	public HashMap<String, Cliente> getClientes() {
		return clientes;
	}
	
	/**
	 * Funcion que retorna los registros de alquileres de la clase
	 * @return los alquileres
	 */
	public HashMap<String, RegistroAlquiler> getAlquileres() {
		return alquileres;
	}
	
	/*---------------------------------------------
	 METODOS PARA AGREGAR
	 ---------------------------------------------*/
	/**
	 * Agrega un vehiculo
	 * @param vehiculo a agregar
	 */
	public void addVehiculo(Vehiculo vehiculo) {
		String clave = generarClaveVehiculo();
		vehiculo.setClaveVehiculo(clave);
		vehiculos.put(clave, vehiculo);
	}
	
	/**
	 * Agrega un cliente
	 * @param cliente a agregar
	 */
	public void addCliente(Cliente cliente) {
		clientes.put(generarClaveCliente(), cliente);
	}
	
	/**
	 * Agrega un registro de alquiler
	 * @param alquiler a agregar
	 */
	public void addRegistroAlquiler(RegistroAlquiler alquiler) {
		alquileres.put(generarClaveAlquiler(), alquiler);
	}
	
	/*---------------------------------------------
	 METODOS PARA CLAVES AUTOMATICAS
	 ---------------------------------------------*/
	/**
	 * Genera una clave aleatoria para un vehiculo que no exista
	 * @return la clave
	 */
	private String generarClaveVehiculo() {
		Random ra = new Random();	
		Integer numero = ra.nextInt(9999);
		String clave = numero.toString();
		if (!vehiculos.containsKey(clave)){
			return clave;
		}else {
			return generarClaveVehiculo();
		}
	}

	/**
	 * Genera una clave aleatoria para un cliente que no exista
	 * @return la clave
	 */
	private String generarClaveCliente() {
		Random ra = new Random();	
		Integer numero = ra.nextInt(9999);
		String clave = numero.toString();
		if (!vehiculos.containsKey(clave)){
			return clave;
		}else {
			return generarClaveCliente();
		}
	} 
	
	/**
	 * Genera una clave aleatoria para un registro de alquiler que no exista
	 * @return la clave
	 */
	private String generarClaveAlquiler() {
		Random ra = new Random();	
		Integer numero = ra.nextInt(9999);
		String clave = numero.toString();
		if (!alquileres.containsKey(clave)){
			return clave;
		}else {
			return generarClaveCliente();
		}
	} 
	
	/*---------------------------------------------
	 METODOS PARA LISTAR CLAVES
	 ---------------------------------------------*/
	/**
	 * Lista todas las claves de los vehiculos con su marca y estado
	 * @return la lista de vehiculos en forma de String
	 */
	public String listarClavesVehiculos() {
		StringBuilder builder = new StringBuilder();
		for(Entry<String, Vehiculo> entry : vehiculos.entrySet()) {
			builder.append(entry.getKey()+" - "+entry.getValue().getMarca()+" - "+entry.getValue().getEstado()+"\n");
		}
	return builder.toString();
	}
	
	/** 
	 * Lista todas las claves de los clientes con sus nombres y apellidos 
	 * @return los clientes en forma de String
	 */
	public String listarClavesClientes() {
		StringBuilder builder = new StringBuilder();
		for(Entry<String , Cliente> entry : clientes.entrySet()) {
			builder.append(entry.getKey()+" - "+entry.getValue().getnombreYapellido()+"\n");
		}
		return builder.toString();
	}
	
	/**
	 * Lista todos los alquileres que estan en curso y los que ya fueron efectuados. Los ya efectuados de los que no
	   se diferencian con la disponibilidad true(ya efectuado) y false(No efectuado)
	 * @return
	 */
	public String listarClavesAlquileresEnCursoYYaEfectuados() {
		StringBuilder builder = new StringBuilder();
		for(Entry<String , RegistroAlquiler> entry : alquileres.entrySet()) {
			builder.append(entry.getKey()+" - "+entry.getValue().getCliente().getnombreYapellido()
					       +"- "+entry.getValue().getVehiculo().getMarca()+"\n");
		}
		return builder.toString();
	}
	
	/**
	 * Lista todos los alquileres que estan en curso.
	 * @return los alquileres en curso en forma de String.
	 */
	public String listarClavesAlquileresEnCurso() {
		StringBuilder builder = new StringBuilder();
		for(Entry<String , RegistroAlquiler> entry : alquileres.entrySet()) {
		if(!entry.getValue().isDisponible()) {	
			builder.append(entry.getKey()+" - "+entry.getValue().getCliente().getnombreYapellido()
					       +"- "+entry.getValue().getVehiculo().getMarca()+"\n");
			}
		}
		return builder.toString();
	}
	
	/*---------------------------------------------
	 METODOS PARA LISTAR INFORMACION
	 ---------------------------------------------*/
	/**
	 * Lista toda la informacion de un vehiculo
	 * @param clave es para acceder al vehiculo
	 * @return el vehiculo en forma de String
	 */
	public String listarInformacionVehiculo(String clave) {
		StringBuilder builder = new StringBuilder();
		if(vehiculos.containsKey(clave)) {
			builder.append(vehiculos.get(clave).toString());
		}
	return builder.toString();
	}
	
	/**
	 * Lista toda la informacion de un cliente
	 * @param clave es para acceder al cliente
	 * @return el cliente en forma de String
	 */
	public String listarInformacionCliente(String clave) {
		StringBuilder builder = new StringBuilder();
		if(clientes.containsKey(clave)) {
			builder.append(clientes.get(clave).toString());
		}
	return builder.toString();
	
	}
	
	/**
	 * Lista toda la informacion de un alquiler
	 * @param clave es para acceder al alquiler
	 * @return el vehiculo en forma de String
	 */
	public String listarInformacionAlquiler(String clave) {
		StringBuilder builder = new StringBuilder();
		if(alquileres.containsKey(clave)) {
			builder.append(alquileres.get(clave).toString());
		}
	return builder.toString();
	
	}
	/*---------------------------------------------
	 METODOS PARA ELIMINAR INFORMACION
	 ---------------------------------------------*/
	/**
	 * Elimina un vehiculo mediante su clave
	 * @param clave para acceder al vehiculo
	 */
	public void eliminarVehiculo(String clave) {
		if(vehiculos.containsKey(clave)) {
			vehiculos.remove(clave);
		}
	}
	
	/**
	 * Elimina un cliente mediante su clave
	 * @param clave para acceder al cliente
	 */
	public void eliminarCliente(String clave) {
		if(clientes.containsKey(clave)) {
			clientes.remove(clave);
		}
	}
	
	
	/*---------------------------------------------
	 METODOS PARA ALQUILAR VEHICULOS
	 ---------------------------------------------*/
	/**
	 * Verifica si un vehiculo esta disponible o no para ser alquilado
	 * @param clave es para acceder al vehiculo
	 * @return true si esta disponible, false si no lo esta
	 */
	public boolean isVehiculoDisponible(String clave) {
		boolean disponible = false;
		if(vehiculos.containsKey(clave)) {
			if(vehiculos.get(clave).getEstado().equalsIgnoreCase("Disponible")) {
				disponible = true;
			}
		}
	return disponible;
	}
	
	/**
	 * Metodo para alquilar un vehiculo y generar un registro a la vez. Aqui se le cambia el estado al vehiculo. Y pasa
	   de estar disponible a estar alquilado 
	 * @param claveAutomovil es la clave del automovil que se desea alquilar
	 * @param claveCliente es la clave del cliente que desea alquilar el vehiculo
	 * @param fechaInicio es la fecha de inicio en que alquila el vehiculo
	 * @param fechaFin es la fecha fin en que alquila el vehiculo
	 */
	public void alquilarVehiculo(String claveAutomovil, String claveCliente, String fechaInicio, String fechaFin) {
		if(isVehiculoDisponible(claveAutomovil)) {
			if(clientes.containsKey(claveCliente)) {
			RegistroAlquiler alquiler = new RegistroAlquiler(clientes.get(claveCliente), vehiculos.get(claveAutomovil), fechaInicio, fechaFin,false);
			vehiculos.get(claveAutomovil).setEstado("Alquilado");
			addRegistroAlquiler(alquiler);
			}
		}
	}
	
	/**
	 * Funcion para que un cliente devueva un vehiculo, el vehiculo se devuelve y se manda a revison, osea que 
	   el estado del vehiculo cambia a "En revision". Y a la vez ya queda
	   registrado el alquiler solo que con la disponibilidad true(ya fue efectuado).
	 * @param claveAlquiler clave del registro de alquiler para acceder a el
	 * @param kmDevolucion los km con los que devuelven el vehiculo
	 */
	public void devolverVehiculo(String claveAlquiler, double kmDevolucion) {
		if(alquileres.containsKey(claveAlquiler)) {
			if(alquileres.get(claveAlquiler).getVehiculo().getEstado().equalsIgnoreCase("Alquilado")) {
				System.out.println("Llegue");
				vehiculos.get(alquileres.get(claveAlquiler).getVehiculo().getClaveVehiculo()).setEstado("En revision");
				alquileres.get(claveAlquiler).getVehiculo().setEstado("En revision");
				alquileres.get(claveAlquiler).setDisponible(true);
				alquileres.get(claveAlquiler).setKmDevolucion(kmDevolucion);
				}
			}
		}
	
	/**
	 * Funcion para sacar auto de revision y tenerlo disponible devuelta para otro alquiler
	 * @param clave
	 */
	public void sacarAutoDeRevision(String clave) {
		if(vehiculos.containsKey(clave)) {
			vehiculos.get(clave).setEstado("Disponible");
		}
	}
	
	
	
	/*---------------------------------------------
	 METODOS PARA COMPROBAR EXISTENCIA DE CLAVES
	 ---------------------------------------------*/
	/**
	 * Metodo para comprobar si existe determinada clave en los clientes
	 * @param clave deñ clietne
	 * @return si existe o no
	 */
	public boolean existeClaveCliente(String clave) {
		boolean existe = false;
		if(clientes.containsKey(clave)) {
			existe = true;
		}
	return existe;
	}

	/**
	 * Metodo para comprobar si existe de determinada clave en los vehiculos
	 * @param clave del vehiculo
	 * @return si existe o no
	 */
	public boolean existeClaveVehiculo(String clave) {
		boolean existe = false;
		if(vehiculos.containsKey(clave)) {
			existe = true;
		}
	return existe;
	}
	
	/**
	 * Metodo para comprobar si existe determinada clave en los registros de alquileres
	 * @param clave del alquiler
	 * @return si existe o no
	 */
	public boolean existeClaveAlquiler(String clave) {
		boolean existe = false;
		if(alquileres.containsKey(clave)) {
			existe = true;
		}
	return existe;
	}

	



}
