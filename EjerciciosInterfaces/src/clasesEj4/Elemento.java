package clasesEj4;

public class Elemento {
	private int codigo;
	private String titulo;
	private int añoPublicacion;
	
	public Elemento(int codigo, String titulo, int añoPublicacion) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
	}
	
	public int getAñoPublicacio() {
		return añoPublicacion;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
}
