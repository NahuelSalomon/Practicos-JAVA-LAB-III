package Ejercicio2;


import java.util.Calendar;


public class EAsalariado extends Empleado{
	
	private double salarioBase;
	
	public EAsalariado() {
		super();
	}
	
	public EAsalariado(String dni, String nombre, String apellido, int añoIngreso, double salarioBase) {
		super(dni, nombre, apellido, añoIngreso);
		this.salarioBase = salarioBase;
	} 
	
	public double getSalarioBase() {
		return this.salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	/**
	 * Funcion para sacar los años que lleva en la empresa un empleado.
	 * @return los años en la empresa
	 */
	public int añosEnLaEmpresa (){
		Calendar cal = Calendar.getInstance();
		int añoActual = cal.get(Calendar.YEAR);
		
		int añosEnLaEmpresa = añoActual - getAñoIngreso();
		
		return añosEnLaEmpresa;
	}
	
	/*
	 * Los empleados con salario fijo tienen un sueldo básico y 
	 * un porcentaje adicional en función del número de años que llevan: 
	 * menos de 2 años salario base, 
	 * de 2 a 3 años: 5% más; 
	 * de 4 a 7 años: 10% más; de 8 a 15 años: 15% más 
	 * y más de 15 años: 20% más. 
	 */
	@Override
	public double obtenerSalario() {
		double salarioTotal = 0; 
		
		if(añosEnLaEmpresa() < 2) {
			salarioTotal = getSalarioBase(); 
		}
		
		if((añosEnLaEmpresa() >= 2) || (añosEnLaEmpresa() <= 3)) {
			salarioTotal = getSalarioBase() + (getSalarioBase()* 0.05);
		}
		
		if((añosEnLaEmpresa() >= 4) || (añosEnLaEmpresa() <= 7)) {
			salarioTotal = getSalarioBase() + (getSalarioBase()* 0.10);
		}
		
		if((añosEnLaEmpresa() >= 8) || (añosEnLaEmpresa() <= 15)) {
			salarioTotal = getSalarioBase() + (getSalarioBase()* 0.15);
		}
		
		if(añosEnLaEmpresa() > 15) {
			salarioTotal = getSalarioBase() + (getSalarioBase()* 0.20); 
		}
		
		return salarioTotal;
	}
	
	@Override
	public String imprimir() {
		return super.imprimir()+"\nAños en la empresa: "+añosEnLaEmpresa()+"\nSalario base: "+getSalarioBase()+"\nSalario total: "+obtenerSalario()+"\n";
	}
	
}
