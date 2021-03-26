package Ejercicio4Bis;

	public class RenglonFactura {
		private int cantidadArticulos;
		private String codigoArticulo;
		private double  precioUnitario; 
		private double precioTotalRenglon;
	
	
	public RenglonFactura() {
		cantidadArticulos = 0;
		codigoArticulo = "";
		precioUnitario = 0;
		precioTotalRenglon = 0;
	}
	
	public RenglonFactura(int cantidadArticulos, String codigoArticulo, double precioUnitario) {
		
	this.cantidadArticulos = cantidadArticulos;
	this.codigoArticulo  = codigoArticulo;
	this.precioUnitario = precioUnitario;
	this.precioTotalRenglon = this.precioUnitario * this.cantidadArticulos;
	}
	
	public int getCantidadArticulos () {
		return this.cantidadArticulos;
	}

	public String getCodigoArticulo() {
		return this.codigoArticulo;
	}

	public double getPrecioUnitario() {
		return this.precioUnitario;
	}

	public double getPrecioTotal () {
		return this.precioTotalRenglon;
	}

	public void setCantidadArticulos (int cantidadArticulos) {
		this.cantidadArticulos = cantidadArticulos;
	}
	
	public void setCodigoArticulo (String codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}
	
	public void setPrecioUnitario (double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public void obtenerPrecioTotal() {
		this.precioTotalRenglon = this.precioUnitario * this.cantidadArticulos; 
	}
	
	@Override
	public String toString() {
		return +getCantidadArticulos()+" - "+getCodigoArticulo()+" - "+getPrecioUnitario()+" - "+getPrecioTotal();
	}
	
}