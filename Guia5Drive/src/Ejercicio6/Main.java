package Ejercicio6;

import javax.swing.JOptionPane;

/**
 * Main en el que se puede admisnistrar el estado contable de tres distintos tipo de socios, agregar o eliminar socios. 
 * @author Nahuel
 *
 */
public class Main {
	public static void main(String[] args) { 
		ManejoDelestadoContableSocios socios = new ManejoDelestadoContableSocios();
		
		boolean mander = true;
		int op;
		String clave;
		String nombre, apellido, nroSocio, dni, telefono;
		int numMes; 
		int edad;
		
		/**
		 * Se cargan socios para no tener que cargar datos
		 */
		socios.addSocio(new SocioNormal("Juan", "Fernandez", "1", "42587941", "223568794", 20));
		socios.addSocio(new SocioVitalicio("Juanita", "Gonzales", "2", "58974123", "223587941", 24));
		socios.addSocio(new SocioAusente("Carlita", "Gomez", "3", "45987412", "2236987412", 58));
		socios.addSocio(new SocioNormal("Josefina", "Betros", "4", "12587461", "2234569871", 29));
		socios.addSocio(new SocioVitalicio("Matias", "Rinaldo", "5", "39687456", "22897412", 19));
		socios.addSocio(new SocioAusente("Carla", "Peterson", "6", "456987123", "223487946", 29));
		socios.addSocio(new SocioNormal("Maria", "Cabrera", "7", "58974123", "22354698", 14));
		socios.addSocio(new SocioVitalicio("Juan", "Piraldo", "8", "23129156", "0114566489", 25));
		socios.addSocio(new SocioAusente("Martin", "Miraldo", "9", "25897941", "23231456", 58));
		socios.addSocio(new SocioNormal("Pablo", "Sambsum", "10", "25698741", "223147456", 47));
		
		
		while(mander) {
			op = Integer.parseInt(JOptionPane.showInputDialog("1. Listar socio\n2. Agregar nuevo socio\n3. Eliminar socio\n0. Salir"));
			
			switch(op) {
			/*---------------------------------------
			 CASE 1: LISTAR()
			 --------------------------------------*/
				case 1:
					boolean manderTwo = true;
					clave = JOptionPane.showInputDialog(socios.listarClaves()+"\nClave");
					if(socios.existeSocio(clave)) {
												
						
						while(manderTwo) {
							String estadoCotableSocio = socios.getSocios().get(clave).getEstadoContable().imprimirEstadoContable();
							op = Integer.parseInt(JOptionPane.showInputDialog(socios.listarUnSocio(clave)+"\n\nESTADO CONTABLE\n"+estadoCotableSocio+
								 "\nAccion a realizar. \n1. Pagar cuota socio\n2. Adeudar cuota socio\n3. Pagar cuota anual socio\n0. Volver"));
							switch(op) {
							/**
							 * Listar() case 1: Pagar cuota socio  
							 */
							case 1:
								numMes = Integer.parseInt(JOptionPane.showInputDialog(socios.getSocios().get(clave).getNombre()+" "+socios.getSocios().get(clave).getApellido()+estadoCotableSocio+"\nNumero de mes: "));
								socios.getSocios().get(clave).getEstadoContable().pagar(numMes);
								break;
							/**
							 * Listar() case 2: Adeudar cuota socio
							 */
							case 2:
								numMes = Integer.parseInt(JOptionPane.showInputDialog(socios.getSocios().get(clave).getNombre()+" "+socios.getSocios().get(clave).getApellido()+estadoCotableSocio+"\nNumero de mes: "));
								socios.getSocios().get(clave).getEstadoContable().adeudar(numMes);
								break;
							/**
							 * Listar() case 3: Pagar cuota anual socio
							 */
						    case 3:
								socios.getSocios().get(clave).getEstadoContable().pagarCuotaAnual();
								break;
							/**
							 * Listar() case 0: Volver al menu principal
							 */
						    case 0: 
								manderTwo = false;
								break;
							default :
								JOptionPane.showMessageDialog(null, "Opcion invalida");
								break;
							}
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "La clave ingresada es inexistente");
					}
					break;
				/*---------------------------------------
				 CASE 2: AGREGAR()
				 --------------------------------------*/
				case 2:
					boolean manderThree = true;
					while(manderThree) {
					op = Integer.parseInt(JOptionPane.showInputDialog("1. Socio vitalicio\n2. Socio normal\n3. Socio ausente\n0. Volver"));
						switch(op) {
							/**
							 * Agregar() case 1: Agregar un socio vitalicio
							 */
							case 1:
								nombre = JOptionPane.showInputDialog("Nombre");
								apellido = JOptionPane.showInputDialog("Apellido");
								nroSocio = JOptionPane.showInputDialog("NroSocio");
								dni = JOptionPane.showInputDialog("Dni");
								telefono = JOptionPane.showInputDialog("Telefono");
								edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
								SocioVitalicio vitalicio = new SocioVitalicio(nombre, apellido, nroSocio, dni, telefono, edad);
								socios.addSocio(vitalicio);
								break;
							/**
							 * Agregar() case 2: Agregar un socio normal
							 */
							case 2:
								nombre = JOptionPane.showInputDialog("Nombre");
								apellido = JOptionPane.showInputDialog("Apellido");
								nroSocio = JOptionPane.showInputDialog("NroSocio");
								dni = JOptionPane.showInputDialog("Dni");
								telefono = JOptionPane.showInputDialog("Telefono");
								edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
								SocioNormal normal = new SocioNormal(nombre, apellido, nroSocio, dni, telefono, edad);
								socios.addSocio(normal);
								break;
							/**
							 * Agregar() case 3: Agregar un socio ausente
							 */
							case 3: 
								nombre = JOptionPane.showInputDialog("Nombre");
								apellido = JOptionPane.showInputDialog("Apellido");
								nroSocio = JOptionPane.showInputDialog("NroSocio");
								dni = JOptionPane.showInputDialog("Dni");
								telefono = JOptionPane.showInputDialog("Telefono");
								edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
								SocioAusente ausente = new SocioAusente(nombre, apellido, nroSocio, dni, telefono, edad);
								socios.addSocio(ausente);
								break;
						
							/**
							 * Agregar() case 0: Volver al menu principal
							 */
							case 0: 
								manderThree = false;
								break;
							default:
								JOptionPane.showMessageDialog(null, "Opcion invalida");
								break;
						}
					}
					
					break;
				/*---------------------------------------
				 CASE 3: ELIMINAR()
				 --------------------------------------*/
				case 3:
					clave = JOptionPane.showInputDialog(socios.listarClaves()+"\nClave");
					if(socios.existeSocio(clave)) {
						socios.eliminarUnSocio(clave);
						JOptionPane.showMessageDialog(null, "Se ha eliminado el socio con exito");						
					}
					else {
						JOptionPane.showMessageDialog(null, "La clave ingresada es inexistente");
					}
					break;
				/*---------------------------------------
				 CASE 0: SALIR()
				 --------------------------------------*/
				case 0:
					mander = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion invalida");
					break;
			}	
		}
	}
}
