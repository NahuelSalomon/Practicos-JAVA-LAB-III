package clasesEj4;

import InterfacesEj4.Prestable;

public class Libro extends Elemento implements Prestable{
	private boolean fuePrestado; 
	
	public Libro(int codigo, String titulo, int añoPublicacion) {
		super(codigo,titulo,añoPublicacion);
		this.fuePrestado = false;
	}

	@Override
	public String toString() {
		return "LIBRO\nCodigo: "+getCodigo()+"\nTitulo: "+getTitulo()+
			   "\nAño de publicacion: "+getAñoPublicacio()+"\nFue prestado: "+fuePrestado+"\n\n";
	}

	@Override
	public void prestar() {
		if(!fuePrestado) fuePrestado = true;
	}

	@Override
	public void devolver() {
		if(fuePrestado)fuePrestado =  false;
	}
	

}
