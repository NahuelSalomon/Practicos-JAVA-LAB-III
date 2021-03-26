package clasesEj4;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.lang.model.element.Element;


public class Biblioteca {
	private ArrayList <Libro> libro = new ArrayList<Libro>(); 
	private ArrayList <Revista> revista = new ArrayList<Revista>(); 
	
	public void agregarUnElemento(Elemento e) {
		if(e instanceof Libro)
		libro.add((Libro) e);
		else if(e instanceof Revista) {
		revista.add((Revista)e);
		}
	}

	public String mostrarElementos() {
		StringBuilder builder = new StringBuilder();
		for(Libro e : libro) {
			builder.append(e.toString());
		}
		for(Revista e : revista) {
			builder.append(e.toString());
		}
	return builder.toString();
	}
	
	public void borrarUnLibro(String titulo) {
		boolean flag = true;
		int i = 0;
		while((i < libro.size()) && (flag)) {
			if(libro.get(i).getTitulo().equals(titulo)) {
				libro.remove(i);
				flag = false;
			} 
			i++;
		}
	}
	
	public void borrarUnaResvista(String titulo) {
		boolean flag = true;
		int i = 0;
		while((i < revista.size()) && (flag)) {
			if((revista.get(i)).getTitulo().equals(titulo)) {
				revista.remove(i);
				flag = false;
			} 
			i++;
		}
	}
	
	public void prestarUnLibro(String titulo) {
		for(int i = 0; i < libro.size(); i++) {
			if(libro.get(i).getTitulo().equals(titulo)) {
				libro.get(i).prestar();
				}
			}
		}
		
	public void devolverUnLibro(String titulo) {
		for(int i = 0; i < libro.size(); i++) {
			if(libro.get(i).getTitulo().equals(titulo)) {
				libro.get(i).devolver();
				}
			}
		}

	
}
