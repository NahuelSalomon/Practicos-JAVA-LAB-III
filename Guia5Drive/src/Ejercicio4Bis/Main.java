package Ejercicio4Bis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
		Random random = new Random();
		
		/**
		 * Se arma un arreglo de clientes para agregarlos aleatoriamente a los renglones de las facturas.
		 */
		ArrayList <Cliente2> clientes = new ArrayList <Cliente2>();
		clientes.add(new Cliente2("Pablo Perez", 925879461,"Saavedra 1855", 223587948, "pabloperez@hotmail.com"));
		clientes.add(new Cliente2("Karla Gomez", 147895123,"Castelli 2879", 223487946, "karlagomez@hotmail.com"));
		clientes.add(new Cliente2("Luciana Gonzales", 745612812,"Brown 8978", 223879451, "luciGonz@hotmail.com"));
		clientes.add(new Cliente2("Damian Simples", 879451231,"Colon 1879", 223458642, "DamianSimpl@hotmail.com"));
		clientes.add(new Cliente2("Agustina Nane", 87945612,"Fortunato de la plaza 1546", 223587946, "agusmdp@hotmail.com"));
		clientes.add(new Cliente2("Vanina Adulsm", 789456123,"Cordoba 1845", 223546987, "Ninass@hotmail.com"));
		clientes.add(new Cliente2("Silvia Campes", 741235687,"14 de julio 7898", 223545687, "Silvitamdp@hotmail.com"));
		clientes.add(new Cliente2("Damian Gomez", 789456321,"Tucuman 2255", 223569874, "DamianGomenz@hotmail.com"));
		clientes.add(new Cliente2("Alma Fernandez", 456987158,"Arenales 5878", 223598764, "Almintamdp@hotmail.com"));
		clientes.add(new Cliente2("Amparo Gonzalez", 456987123,"Buenos Aires 7898", 223564784, "AmpiGonzales@hotmail.com"));
		
		/**
		 * Se arma un arreglo de articulos para agregarlos aleatoriamente a los renglones de las facturas.
		 */
		ArrayList <String> articulos = new ArrayList <String>();
		articulos.add("Moladora");
		articulos.add("Maquina cortar pasto");
		articulos.add("Martillo");
		articulos.add("Sierra");
		articulos.add("Perforadora");
		articulos.add("Destornillador electrico");
		articulos.add("Camara");
		articulos.add("Parlante");
		articulos.add("Sierra electrica");
		articulos.add("Fuentes");
		
		/**
		 * Agraga aleatoriamente clientes minoritas para realizarles una facturacion y agrega aleatoriamente renglones
		   a la factura.
		 */
		
		
		/**********************************
		  HECHO CON ARREGLOS
		 **********************************/
		ArrayList<FacturaCliente> facturas = new ArrayList<FacturaCliente>();
		
		for(int i = 0; i < 5 ; i++) {
			facturas.add(new FacturaClienteMinorista(i, clientes.get(random.nextInt(9))));
			facturas.get(i).addRenglon(random.nextInt(10), articulos.get(random.nextInt(9)), (random.nextInt(1000)));
			facturas.get(i).addRenglon(random.nextInt(10), articulos.get(random.nextInt(9)), (random.nextInt(1000)));
			
		}
		
		/**
		 * Agraga aleatoriamente clientes mayoristas para realizarles una facturacion y agrega aleatoriamente renglones
		   a la factura.
		 */
		for(int i = 0; i < 5 ; i++) {
			facturas.add(new FacturaClienteMayorista(50+i, clientes.get(random.nextInt(9)),(random.nextInt(100))));
			facturas.get(5+i).addRenglon(random.nextInt(10), articulos.get(random.nextInt(9)), (random.nextInt(1000)));
			facturas.get(5+i).addRenglon(random.nextInt(10), articulos.get(random.nextInt(9)), (random.nextInt(1000)));
			
		}
		
		/**
		 * Recorre el arreglo de factura y las imprime a todas.
		 */
		for(FacturaCliente factura : facturas) {
			System.out.println(factura.imprimirFactura());
			System.out.println("\n\n");
		}
		
		
		/**********************************
		  HECHO CON HASHMAP
		 **********************************/
		System.out.println("\n\n\n");
		System.out.println("----------HashMap----------");
		HashMap<String, FacturaCliente> facturas1= new HashMap<String, FacturaCliente>();
		int cantidadDeFacturas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas facturas quiere generar en los HashMap"));
		int i = 0;
		String clave;
		
		/**
		 * Se llena el HashMap con facturas aleatoriamente
		 */
		while(i < cantidadDeFacturas) {
			clave = generarClave(facturas1);
			facturas1.put(clave, new FacturaClienteMinorista(i, clientes.get(random.nextInt(9))));
			facturas1.get(clave).addRenglon(random.nextInt(10), articulos.get(random.nextInt(9)), (random.nextInt(1000)));
			facturas1.get(clave).addRenglon(random.nextInt(10), articulos.get(random.nextInt(9)), (random.nextInt(1000)));
			i++;
			clave = generarClave(facturas1);
			facturas1.put(clave, new FacturaClienteMayorista(i, clientes.get(random.nextInt(9)),(random.nextInt(100))));
			facturas1.get(clave).addRenglon(random.nextInt(10), articulos.get(random.nextInt(9)), (random.nextInt(1000)));
			facturas1.get(clave).addRenglon(random.nextInt(10), articulos.get(random.nextInt(9)), (random.nextInt(1000)));
			i++;
		}
		
		/**
		 * Se recorre el HashMap y se imprime cada factura
		 */
		for(Entry<String, FacturaCliente> entry : facturas1.entrySet()) {
			System.out.println(entry.getValue().imprimirFactura()+"\n\n");
		} 
		
	}
	
	/**
	 * Es para generar claves aleatoreamente no repetidas
	 * @param facturas
	 * @return
	 */
	public static String generarClave(HashMap<String, FacturaCliente> facturas) {
		Random ra = new Random();	
		Integer numero = ra.nextInt(9999);
		String clave = numero.toString();
		if (!facturas.containsKey(clave)){
			return clave;
		}else {
			return generarClave(facturas);
		}
	}
}
