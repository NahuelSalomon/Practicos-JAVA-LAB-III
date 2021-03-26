package Ejercicio5;

import java.util.ArrayList;

import javax.swing.JOptionPane;


/**
 * Clase main donde se compruevan todos las clases del paquete. Tiene un menu principal y distintos submenus para 
   realizar distintas acciones. 
 * @author Nahuel
 *
 */
public class Main {

	
	public static void main(String[] args) {
		boolean mander = true;
		int op = 0;
		AdministracionAlquileres admAlquileres = new AdministracionAlquileres();
		String claveVehiculo,patente,marca,clave;
		int modelo;
		double km, precioDiario;
		
		/**
		 * Se cargan clientes para no tener que cargar datos
		 */
		ArrayList <Cliente> clientess = new ArrayList <Cliente>(); 
		
		clientess.add(new Cliente("Pablo Perez", 925879461,"Saavedra 1855", 223587948, "pabloperez@hotmail.com"));
		clientess.add(new Cliente("Karla Gomez", 147895123,"Castelli 2879", 223487946, "karlagomez@hotmail.com"));
		clientess.add(new Cliente("Luciana Gonzales", 745612812,"Brown 8978", 223879451, "luciGonz@hotmail.com"));
		clientess.add(new Cliente("Damian Simples", 879451231,"Colon 1879", 223458642, "DamianSimpl@hotmail.com"));
		clientess.add(new Cliente("Agustina Nane", 87945612,"Fortunato de la plaza 1546", 223587946, "agusmdp@hotmail.com"));
		clientess.add(new Cliente("Vanina Adulsm", 789456123,"Cordoba 1845", 223546987, "Ninass@hotmail.com"));
		clientess.add(new Cliente("Silvia Campes", 741235687,"14 de julio 7898", 223545687, "Silvitamdp@hotmail.com"));
		clientess.add(new Cliente("Damian Gomez", 789456321,"Tucuman 2255", 223569874, "DamianGomenz@hotmail.com"));
		clientess.add(new Cliente("Alma Fernandez", 456987158,"Arenales 5878", 223598764, "Almintamdp@hotmail.com"));
		clientess.add(new Cliente("Amparo Gonzalez", 456987123,"Buenos Aires 7898", 223564784, "AmpiGonzales@hotmail.com"));

		for(Cliente cliente1 : clientess) {
			admAlquileres.addCliente(cliente1);
		}
		
		/**
		 * Se cargan vehiculos para no tener que cargar datos
		 */
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		vehiculos.add(new Automovil("WG5897", "147", 2010, 10000, 500, "Disponible"));
		vehiculos.add(new Utilitario("JKE894", "Amarok", 2005, 8000, 1000, "Disponible", "Equipaje"));
		vehiculos.add(new Automovil("TRA123", "VolksWagen vento", 2013, 30000, 1250, "Disponible"));
		vehiculos.add(new Utilitario("JKE894", "Renault kangoo", 2005, 8000, 1000, "Disponible", "Equipaje"));
		vehiculos.add(new Automovil("QWE789", "VolksWagen corsa classic", 2014, 87945, 850, "Disponible"));
		vehiculos.add(new Utilitario("JKE894", "Ducato", 2005, 8000, 1000, "Disponible", "Equipaje, personas"));
		vehiculos.add(new Automovil("MPO897", "Audi A4", 2018, 10369, 10000, "Disponible"));
		vehiculos.add(new Utilitario("JKE894", "Citroen Berlingo", 2005, 80000, 1100, "Disponible", "Equipaje"));
		
		for(Vehiculo vehiculo : vehiculos) {
			admAlquileres.addVehiculo(vehiculo);
		}
		
		/**
		 * Se cargan registros de admAlquileres para no tener que cargar datos
		 */
		admAlquileres.addRegistroAlquiler(new RegistroAlquiler(clientess.get(0), vehiculos.get(0), "1/3/20", "22/3/20",true));
		admAlquileres.addRegistroAlquiler(new RegistroAlquiler(clientess.get(1), vehiculos.get(1), "2/3/20", "23/3/20",true));
		admAlquileres.addRegistroAlquiler(new RegistroAlquiler(clientess.get(2), vehiculos.get(2), "3/3/20", "24/3/20",true));
		admAlquileres.addRegistroAlquiler(new RegistroAlquiler(clientess.get(3), vehiculos.get(3), "4/3/20", "25/3/20",true));
		admAlquileres.addRegistroAlquiler(new RegistroAlquiler(clientess.get(4), vehiculos.get(4), "5/3/20", "26/4/20",true));
		admAlquileres.addRegistroAlquiler(new RegistroAlquiler(clientess.get(5), vehiculos.get(5), "6/3/20", "27/3/20",true));
		
		
		while(mander) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1. Listar\n2. Agregar \n3. Eliminar\n4. Alquilares y devoluciones"
					+"\n0. Salir"));
			
			switch(op) {
			
			/*---------------------------------------
			 CASE 1: LISTAR()
			 --------------------------------------*/
			case 1:
				boolean manderThree = true;
				while(manderThree) {
					op = Integer.parseInt(JOptionPane.showInputDialog("Listar \n1. Vehiculo\n2. Cliente\n3. admAlquileres en curso y ya efectuados\n0. Volver"));	
					
					switch (op) {
						/**
						 * Listar() Case 1: Lista las claves de los vehiculos con sus estados y permite acceder a la inforcion 
						   especifica de uno a la vez.
						 */
						case 1:
							clave = JOptionPane.showInputDialog(admAlquileres.listarClavesVehiculos()+"\nClave");
							if(admAlquileres.existeClaveVehiculo(clave)) {
								JOptionPane.showMessageDialog(null, admAlquileres.listarInformacionVehiculo(clave));
							}
							else {
								JOptionPane.showMessageDialog(null, "Clave inexistente");
							}
							break;			
						/**
						 * Listar() Case 2: Lista las claves de los clientes con sus estados y permite acceder a la inforcion 
						   especifica de uno a la vez.
						 */
						case 2: 
							clave = JOptionPane.showInputDialog(admAlquileres.listarClavesClientes()+"\nClave");
							if(admAlquileres.existeClaveCliente(clave)) {
								JOptionPane.showMessageDialog(null, admAlquileres.listarInformacionCliente(clave));
						    }
							else {
								JOptionPane.showMessageDialog(null, "Clave inexistente");
							}
							break;							
						/**
						 * Listar() Case 3: Lista las claves de los admAlquileres con sus estados y permite acceder a la inforcion 
						   especifica de uno a la vez.
						 */
						case 3:
							clave = JOptionPane.showInputDialog(admAlquileres.listarClavesAlquileresEnCursoYYaEfectuados()+"\nClave");
							if(admAlquileres.existeClaveAlquiler(clave)) {
								JOptionPane.showMessageDialog(null, admAlquileres.listarInformacionAlquiler(clave));
							}
							else {
								JOptionPane.showMessageDialog(null, "Clave inexistente");
							}
							break;
						/**
						 * Listar() Case 4: Volver atras al menu principal
						 */
						case 0: 
							manderThree = false;
							break;
						default:
							JOptionPane.showMessageDialog(null, "Opcion no valida");
							break;
					}
				}
				
				break;
			
			/*--------------------------------------
			CASE 2: AGREGAR()
			--------------------------------------*/
			case 2:
				 boolean manderFour = true;
				 while(manderFour) {
					 op = Integer.parseInt(JOptionPane.showInputDialog("Agregar. \n1. Clinete\n2. Vehiculo\n0. Volver"));
					 switch(op) {
					 /**
					  * Agregar() Case 1: Es para agregar un nuevo cliente 
					  */
					 case 1:
						 String nombreYapellido = JOptionPane.showInputDialog("Nombre y apellido");
						 int cuit = Integer.parseInt(JOptionPane.showInputDialog("cuit"));
						 String domicilio = JOptionPane.showInputDialog("Domicilio");
						 int telefono = Integer.parseInt(JOptionPane.showInputDialog("Telefono"));
						 String mail = JOptionPane.showInputDialog("Mail");
						 Cliente nuevoCliente = new Cliente(nombreYapellido, cuit, domicilio, telefono, mail);
						 admAlquileres.addCliente(nuevoCliente);
					 break;
					 /**
					  * Agregar() Case 1: Es para agregar un nuevo vehiculo
					  */
					 case 2:
					 boolean maderFive = true;
					 	 while(maderFive) {
							 op = Integer.parseInt(JOptionPane.showInputDialog("1.Automovil\n2. Utilitario\n0. Volver"));
							 switch (op) {
								 /**
								  * Case 1 : Agregar un automovil
								  */
							     case 1:
									 patente = JOptionPane.showInputDialog("Patente");
									 marca = JOptionPane.showInputDialog("Marca");
									 modelo = Integer.parseInt(JOptionPane.showInputDialog("Modelo"));
									 km = Double.parseDouble(JOptionPane.showInputDialog("Km"));
									 precioDiario =  Double.parseDouble(JOptionPane.showInputDialog("Patente"));
									 
									 Automovil auto = new Automovil(patente, marca, modelo, km, precioDiario, "Disponible");
									 admAlquileres.addVehiculo(auto);
									 break;
								 /**
								  * Case 2 : Agregar un utilitario
								  */
							     case 2:
									 patente = JOptionPane.showInputDialog("Patente");
									 marca = JOptionPane.showInputDialog("Marca");
									 modelo = Integer.parseInt(JOptionPane.showInputDialog("Modelo"));
									 km = Double.parseDouble(JOptionPane.showInputDialog("Km"));
									 precioDiario =  Double.parseDouble(JOptionPane.showInputDialog("Precio diario"));
									 String tipoCarga = JOptionPane.showInputDialog("Tipo carga");
									
									 Utilitario util = new Utilitario(patente, marca, modelo, km, precioDiario, "Disponible", tipoCarga);
									 admAlquileres.addVehiculo(util);
									 break;
								 /**
								  * Case 0: Volver al menu Agregar().
								  */
							     case 0:
									 maderFive = false;
									 break;
								 default:
									break;
							}
					   }
					 	 break;
				 	/**
				      * Agregar() Case 0: Volver al menu principal 
				      */
					 case 0:
						 manderFour = false;
					 	break;
					 default:
						 JOptionPane.showMessageDialog(null, "Opcion no valida");
						 break;
					 }
				 }
				 break;
			
			/*--------------------------------------
			 CASE 3: ELIMINAR()
			 --------------------------------------*/
			case 3:
				boolean maderThree = true;
					while(maderThree) {
						op = Integer.parseInt(JOptionPane.showInputDialog("Eliminar. \n1. Cliente\n2. Vehiculo\n0. Volver"));
						switch (op) {
						/**
					      * Eliminar() Case 1: Eliminar un cliente
					      */
						case 1:
							clave = JOptionPane.showInputDialog(admAlquileres.listarClavesClientes()+"\nClave");
							if(admAlquileres.existeClaveCliente(clave)) {
								admAlquileres.eliminarCliente(clave);	
							}
							else {
								JOptionPane.showMessageDialog(null, "Clave inexistente");
							}
							break;
						/**
					      * Eliminar() Case 2: Eliminar un vehiculo
					      */
						case 2:
							clave = JOptionPane.showInputDialog(admAlquileres.listarClavesVehiculos()+"Clave");
							if(admAlquileres.existeClaveVehiculo(clave)) {
								admAlquileres.eliminarVehiculo(clave);
							}
							else {
								JOptionPane.showMessageDialog(null, "Clave inexistente");
							}
							break;
						/**
					      * Eliminar() Case 0: Volver al menu principal
					      */
						case 0:
							maderThree = false;
							break;
						default:
						JOptionPane.showMessageDialog(null, "Opcion no valida");
						break;
						}
					}
				break;
			/*--------------------------------------
			 CASE 4: admAlquileres()
			 --------------------------------------*/
			case 4: 
				boolean manderSix = true;	
				while(manderSix) {
				op = Integer.parseInt(JOptionPane.showInputDialog("alquileres. \n1. Alquilar auto\n2. Devolucion cliente\n3. Sacar de revision\n0. Volver"));	
				switch(op) {
					/**
					 * alquileres() Case 1: Alquilar un auto	
					 */
					case 1:
						String claveCliente = JOptionPane.showInputDialog(admAlquileres.listarClavesClientes()+"\nClave cliente");
						claveVehiculo = JOptionPane.showInputDialog(admAlquileres.listarClavesVehiculos()+"\nClave Vehiculo");	
						
						if(admAlquileres.isVehiculoDisponible(claveVehiculo)) {				
						
							if(admAlquileres.existeClaveVehiculo(claveVehiculo) && admAlquileres.existeClaveCliente(claveCliente)) {
							String fechaInicial = JOptionPane.showInputDialog("Fecha inicial");
							String fechaFinal = JOptionPane.showInputDialog("Fecha final");
							admAlquileres.alquilarVehiculo(claveVehiculo, claveCliente, fechaInicial, fechaFinal);
							}
						}
						else {
							JOptionPane.showMessageDialog(null, "Datos ingresados erroneos o vehiculo no disponible");
						}
						break;
					/**
					 * alquileres() Case 2: Devolver un auto. Aqui el cliente devuelve el auto, se toman los km con los que lo 
					   devolvio, se manda el auto a revision y cambia el estado del registro alquiler a true (ya fue efectuado) 	
					 */
					case 2:
						String claveAlquiler = JOptionPane.showInputDialog(admAlquileres.listarClavesAlquileresEnCurso()+"\nClave Alquiler");
						if(admAlquileres.existeClaveAlquiler(claveAlquiler)) {
							
							double kmDevolucion = Integer.parseInt(JOptionPane.showInputDialog("Km de devolucion"));
							admAlquileres.devolverVehiculo(claveAlquiler, kmDevolucion);
							admAlquileres.getVehiculos().get(admAlquileres.getAlquileres().get(claveAlquiler).getVehiculo().getClaveVehiculo());
						
						}
						else {
							JOptionPane.showMessageDialog(null, "Claves no coinciden");
						}
						break;
					/**
					 * aquileres() Case 3: Mandar un auto que esta en revision devuelta disponible para ser usado
					 */
					case 3:
						String claveee = JOptionPane.showInputDialog(admAlquileres.listarClavesVehiculos()+"\nClave");
						if(admAlquileres.existeClaveVehiculo(claveee)) {
							if(admAlquileres.getVehiculos().get(claveee).getEstado().equalsIgnoreCase("En revision")) {
								admAlquileres.getVehiculos().get(claveee).setEstado("Disponible");
							}
							else {
								JOptionPane.showMessageDialog(null, "Vehiculo fuera de revision");
							}
						}
						else {
							JOptionPane.showMessageDialog(null, "Clave inexistente");
						}
					/**
					 * admAlquileres() Case 0: Volver al menu principal
					 */
					case 0:
						manderSix = false;
						break;
			  		default:
			  			JOptionPane.showMessageDialog(null, "Opcion no valida");
			  			break;
					}
			}
				break;
			/*--------------------------------------
			 CASE 0: SALIR()
			 --------------------------------------*/
			case 0: 
				mander = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida");
				break;
			}
		}
	}
}
