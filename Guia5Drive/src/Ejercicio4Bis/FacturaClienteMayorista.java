package Ejercicio4Bis;

public class FacturaClienteMayorista extends FacturaCliente{
	private double porcentajeDescuento;
	
	public FacturaClienteMayorista() {
		super();
		this.porcentajeDescuento = 0;
	}
	
	public FacturaClienteMayorista(int nroFactura, Cliente2 cliente, double porcentajeDescuento){
		super(nroFactura, cliente);
		this.porcentajeDescuento = comprobarPorsentajeDescuento(porcentajeDescuento);
		
	}
	
	public double getPorcentajeDescuento() {
		return this.porcentajeDescuento;
	}
	
	public double comprobarPorsentajeDescuento(double porcentajeDescuento) {
		double porcentajeConfirmado = 0;
		if(porcentajeDescuento <= 100 ) {
			porcentajeConfirmado = porcentajeDescuento;
		}
		return porcentajeConfirmado;
	}
	
	@Override
	public double obtenerDescuento() {
		return getPrecioTotal() - ((getPrecioTotal()*getPorcentajeDescuento()) / 100);
	}
	 
}
