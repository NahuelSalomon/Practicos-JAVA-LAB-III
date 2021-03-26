package Ejercicio4Bis;

public class FacturaClienteMinorista extends FacturaCliente{

	public FacturaClienteMinorista() {
		super();
	}
	
	public FacturaClienteMinorista(int nroFactura, Cliente2 cliente){
		super(nroFactura, cliente);
		
	}
	
	@Override
	public double obtenerDescuento() {
		return getPrecioTotal();
	}
	
	

}
