package Ejercicio4Bis;

import java.util.ArrayList;
import java.util.Calendar;

public abstract class FacturaCliente {
	
	private int nroFactura;
	private String fecha;
	Cliente2 cliente;
	private ArrayList<RenglonFactura> renglones;   
	private double precioTotal;
	
	
	public FacturaCliente() {
		this.nroFactura = 0;
		this.fecha = obtenerFechaHoy();
		cliente = new Cliente2();
		this.renglones = new ArrayList<RenglonFactura>();
		this.precioTotal = 0;
	}

	public FacturaCliente(int nroFactura, Cliente2 cliente) {
		this.nroFactura = nroFactura;
		this.fecha = obtenerFechaHoy();
		this.cliente = cliente;
		this.renglones = new ArrayList<RenglonFactura>();
		this.precioTotal = 0;
		
	}

	public String getFecha() {
		return this.fecha;
	}
	
	public int getNroFactura() {
		return nroFactura;
	}

	public ArrayList<RenglonFactura> getRenglones() {
		return renglones;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setNroFactura(int nroFactura) {
		this.nroFactura = nroFactura;
	}

	public void setCliente (Cliente2 cliente) {
		this.cliente = cliente;
	}

	public void setRenglones(ArrayList<RenglonFactura> renglones) {
		this.renglones = renglones;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public abstract double obtenerDescuento();
	
	/**
	 * Funcion que obtiene la fecha actual
	 * @return la fecha en forma de string
	 */
	public String obtenerFechaHoy() {
		Calendar cal = Calendar.getInstance();
		StringBuilder builder = new StringBuilder();
		
		Integer añoActual = cal.get(Calendar.YEAR);
		Integer mesActual = cal.get(Calendar.MONTH);
		Integer diaActual = cal.get(Calendar.DAY_OF_MONTH);
		builder.append(añoActual.toString()+" / "+mesActual.toString()+" / "+diaActual.toString());
		
		return builder.toString();
	}
	
	/**
	 * Agrega un renglon a la factura
	 * @param cantidadArticulos de un mismo articulo especifico
	 * @param codigoArticulo identificacion del articulo
	 * @param precioUnitario precio unitario de cada articulo
	 */
	public void addRenglon(int cantidadArticulos, String codigoArticulo, double precioUnitario) {
		RenglonFactura nuevoRenglon = new RenglonFactura(cantidadArticulos, codigoArticulo, precioUnitario);
		renglones.add(nuevoRenglon);
		precioTotal += nuevoRenglon.getPrecioTotal();
	}

	
	public String imprimirRenglones() {
		StringBuilder builder = new StringBuilder();
		for(RenglonFactura e : renglones) {
			builder.append(e.toString()+"\n");
		}
		
		return builder.toString();
	}
	
	public String imprimirFactura() {
		return "Nro factura: "+getNroFactura()+"\nFecha: "+getFecha()+"\nNombre: "+cliente.getNombre()+"\nCuit: "+cliente.getCuit()+"\nDomicilio: "+cliente.getDomicilio()
		        +"\nRENGLONES \n"+imprimirRenglones()+"\nPrecio total: "+getPrecioTotal()+"\nPrecio c/ descuento: "+obtenerDescuento();
	}
	

}

