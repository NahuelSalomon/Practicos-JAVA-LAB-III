package clasesEj4;

public class Revista extends Elemento {
	
	private int numero; 


	public Revista(int codigo, String titulo, int añoPublicacion, int numero) {
		super(codigo, titulo, añoPublicacion);
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "REVISTA\nCodigo: "+getCodigo()+"\nTitulo: "+getTitulo()+"\nAño publicacion: "
				+getAñoPublicacio()+"\nNumero: "+numero+"\n\n";
	}

	
	
}
