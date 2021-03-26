package Ejercicio2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList <Empleado> empleados = new ArrayList<Empleado>();	
		
		EAsalariado empleado1 = new EAsalariado("569587A", "Javier", "Gómez", 2008, 1225);
		
		EComision empleado2 = new EComision("695235B", "Eva", "Nieto", 2010, 179, 8.10);
		 
		EComision empleado3 = new EComision();
		empleado3.setNombre("José");
		empleado3.setApellido("Ruiz");
		empleado3.setDni("741258C");
		empleado3.setAñoIngreso(2012);
		empleado3.setCantidadClientes(81);
		empleado3.setMontoCliente(7.90);
		
		EAsalariado empleado4 = new EAsalariado();
		empleado4.setNombre("María");
		empleado4.setApellido("Núñez");
		empleado4.setDni("896325D");
		empleado4.setAñoIngreso(2013);
		empleado4.setSalarioBase(1155.00);
		
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		empleados.add(empleado4);
		
		System.out.println("Empleados: "+mostrarTodos(empleados));
		System.out.println("Sueldo mayor: "+sueldoMayor(empleados));  
		
	}
	
	public static String mostrarTodos(ArrayList<Empleado> empleados) {
		StringBuilder builder = new StringBuilder();
		for(Empleado e : empleados) {
			builder.append(e.imprimir()+"\n\n");
		}
	return builder.toString();
	} 
	
	public static String sueldoMayor (ArrayList<Empleado> empleados) {
		Empleado sueldoMayor = empleados.get(0);
		StringBuilder builder = new StringBuilder();
		
		for(Empleado e : empleados) {
			if(e.obtenerSalario() > sueldoMayor.obtenerSalario()) {
				sueldoMayor = e;
			}
		}
	builder.append(sueldoMayor.getNombre()+" "+sueldoMayor.getApellido()+" | "+sueldoMayor.obtenerSalario());
	
	return builder.toString();
	}
	
}
