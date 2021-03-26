package Ejercicio4;

public class Serie implements Prestar{
	 
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	

	private final int NUM_TEMP = 3;
	private final boolean ENTREGADO = false;
	
	public Serie() {
		this.titulo = "";
		this.numTemporadas = NUM_TEMP;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = "";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.numTemporadas = NUM_TEMP;
		this.entregado = ENTREGADO;
		this.genero = "";
	}
	
	public Serie(String titulo, String creador, int numTemporadas, String genero) {
		this.titulo = titulo;
		this.creador = creador;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.entregado = ENTREGADO;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public void entregar() {
		this.entregado = true;
		
	}

	@Override
	public void devolver() {
		this.entregado = false;
		
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}
	

}
