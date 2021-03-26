package Ejercicio2;

public class EComision extends Empleado{
    
	private  int cantidadClientes;
	private double montoCliente;
	
	public EComision() {
		super();
	}
	
	public EComision(String dni, String nombre, String apellido, int añoIngreso, int cantidadClientes, double montoCliente) {
		super(dni,nombre,apellido,añoIngreso);
		this.cantidadClientes = cantidadClientes;
		this.montoCliente = montoCliente;
	}
	
	public int getCantidadClientes() {
		return cantidadClientes;
	}

	public void setCantidadClientes(int cantidadClientes) {
		this.cantidadClientes = cantidadClientes;
	}

	public double getMontoCliente() {
		return montoCliente;
	}

	public void setMontoCliente(double montoCliente) {
		this.montoCliente = montoCliente;
	}

	@Override
	public double obtenerSalario() {
		double salarioClietes = getCantidadClientes() * getMontoCliente() ;
		double salarioTotal = 750;
		
		if(salarioClietes >= salarioTotal) {
			salarioTotal += salarioClietes;
		}
		
		return salarioTotal;
	}

	
	@Override
	public String imprimir() {
		return super.imprimir()+"\nCantidad clientes: "+getCantidadClientes()+"\nMonto clientes: "+getMontoCliente()+"\nSalario: "+obtenerSalario();
	}

}
