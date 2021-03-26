package EjercicioHashMap2;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


/**
 * Esta biblioteca esta pensada con un HashMap dentro de otra HashMap. Esto es para que los libros tengan dos claves 
   La primera clave es para que esten dividios por genero, y la segunda es una clave unica para cada libro. Por mas que sean
   distintos los mapas que agrupan los libros por genero, ningun libro puede repetir su clave con la de otro libro, por mas 
   que esten en dos generos distintos, es decir, por mas que los libros esten en distintos mapas en cuanto al genero la clave sigue siendo
   unica para cada libro.
   Esto es para implementar la idea de mapas y que se manejen todos con una clave unica.
   
 * @author nahuel salomon
 *
 */
public class Biblioteca implements Serializable{
	
	/***********************************************
    ATRIBUTOS
    ************************************************/
	
	HashMap<String, HashMap<String, Libro>> libros;
	int cantidadLibros;
	
	
	/***********************************************
    METODOS
    ************************************************/
	
	
	/*----------------------------------------------
	CONSTRUCTOR
	-----------------------------------------------*/ 
	
	public Biblioteca() {
		libros = new HashMap<String, HashMap<String, Libro>>();
		cantidadLibros = 0;
	}
	
	public Biblioteca(Biblioteca biblioteca) {
		this.libros = biblioteca.libros;
		this.cantidadLibros = biblioteca.cantidadLibros;
	}
	
	
	/*----------------------------------------------
	METODOS PARA INSERTAR UN LIBRO
	-----------------------------------------------*/ 
	/**
	 * Este metodo agrega un libro al genero que corresponda , si el genero no existe se crea. Tambien el sistema le crea una 
	   clave por defecto.
	 * @param libro es el libro que se desea agregar
	 */
	public void addLibro(Libro libro) {
		String key = new String();
		String genero = libro.getGenero();
		
		if(!libros.containsKey(genero)) {
			libros.put(genero, new HashMap<String, Libro>());
			key = generarClave();
			libros.get(genero).put(key, libro);
			cantidadLibros++;
		}
		else {
			key = generarClave();
			libros.get(genero).put(key, libro);
			cantidadLibros++;
		}
	}
	
	
	/**
	 * Este metodo genera una clave unica para cada libro al momento de agregarlo.
	   Lo hace a travez de la recursividad	
	 * @return la clave generada.
	 */
	public String generarClave() {
		Random ra = new Random();	
		Integer numero = ra.nextInt(9999);
		String clave = numero.toString();
		if (!existeClave(clave)){
			return clave;
		}else {
			return generarClave();
		}
	}
	
	/**
	 * Comprueba la existencia de una determanada clave.
	 * @param clave es la clave que se desea saber si existe
	 * @return true si la clave existe y false si no existe.
	 */
	public boolean existeClave(String clave) {
		boolean flag = false;
		for(Entry<String , HashMap<String, Libro>> entry : libros.entrySet()) {
			if(entry.getValue().containsKey(clave)) {
				flag = true;
			}			
		}
		return flag;	
	}		
		
	
	/**
	 * Este metodo devuelve el genero de un libro con determinada clave
	 * @param clave es la clave del libro que se desea saber el genero
	 * @return el genero del libro, y en caso de que no exista ningun genero retorna un string vacio.
	 */
	public String devolverGeneroPorClave(String clave) {
		String genero = new String();
		
		if(existeClave(clave)) {
			
			for(Entry<String , HashMap<String, Libro>> entry : libros.entrySet()) {
				
				if(entry.getValue().containsKey(clave)) {
					
					genero = entry.getKey();
				}
			}
			
		}
	return genero;
	}
	
	/*----------------------------------------------
	METODO PARA ELIMINAR LIBRO
	-----------------------------------------------*/ 
	
	/**
	 * Elimina un libro a travez de su clave
	 * @param clave es la clave del libro que se desea eliminar.
	 */
	public void eliminarLibroPorClave(String clave) {
		String genero = new String();
		
		if(existeClave(clave)) {
			genero = devolverGeneroPorClave(clave);
			libros.get(genero).remove(clave);
			if(libros.get(genero).isEmpty()) {
				libros.remove(genero);
			}
			cantidadLibros--;
		}
	}
	
	/**
	 * es el get para retornar el atributo cantidadLibros
	 * @return la cantidad de libros totales en la biblioteca.
	 */
	public int getCantidadLibro() {
		return cantidadLibros;
	}
	
	/*----------------------------------------------
	METODO PARA LISTAR LIBRO
	-----------------------------------------------*/ 
	
	/**
	 * Lista toda la información de un libro a travez de su clave
	 * @param clave es la clave del libro que se desea listar.
	 * @return la informacion del libro.
	 */
	public String listarLibro(String clave) {
		StringBuilder builder = new StringBuilder();
		
		if(existeClave(clave)) {
			
			String genero = devolverGeneroPorClave(clave);

			builder.append(libros.get(genero).get(clave).toString());
			
		}
	return builder.toString();
	}
	
	
	/*----------------------------------------------
	METODOS PARA VER CLAVES DE LIBROS. 
	Estos metodos son pensados como metodos de busqueda, solo que para acceder 
	a la informacion de uno se hace mediante la clave en la opcion listar libro.
	-----------------------------------------------*/ 
	
	/**
	 * Este metodo es para ver las claves de todos los libros
	 * @return todos los libros con sus claves
	 */
	public String allLibros() {
		StringBuilder builder = new StringBuilder();
		
		for(Entry <String, HashMap<String, Libro>> entry : libros.entrySet()) {
			builder.append("Genero: "+entry.getKey()+"\n");
			for(Entry <String, Libro> entryTwo : libros.get(entry.getKey()).entrySet()) {
				builder.append(entryTwo.getKey()+" | "+entryTwo.getValue().getTitulo()+"\n");
			}
		builder.append("\n\n");
		}
	return builder.toString();
	}
	
	/**
	 * Este metodo es para ver las claves de los libros con un determinado titulo, puede haber dos libros con el 
	   mismo titulo ya que pueden estar en destintos formatos.
	 * @param titulo es el titulo que se desea saber la clave
	 * @return el o los libros con determinado titulo
	 */
	public String clavesLibrosPorTitulo(String titulo) {
		StringBuilder builder = new StringBuilder();
		
		for(Entry<String , HashMap<String, Libro>> entry : libros.entrySet()) {
			for(Entry<String, Libro> entryTwo : libros.get(entry.getKey()).entrySet()) {
				if(entryTwo.getValue().getTitulo().equals(titulo)) {
					builder.append(entryTwo.getKey()+"  |  "+entryTwo.getValue().getTitulo()+"\n");
				}
			}
		}
		return builder.toString();
	}
	
	
	/**
	 * Este metodo es para ver las claves de los libros de un determinado genero.
	 * @param genero es el genero de los libros que se desea saber las claves
	 * @return los libros de determinado genero con sus claves.
	 */
	public String clavesLibrosPorGenero(String genero) {
		StringBuilder builder = new StringBuilder();
		
		if(libros.containsKey(genero)) {
			for(Entry <String, Libro> entry : libros.get(genero).entrySet()){			
				builder.append(entry.getKey()+" | "+entry.getValue().getTitulo()+"\n");
			}
		}
		return builder.toString();
	}
	
	
	/**
	 * Este metodo es para ver las claves de los libros de determinado autor.
	 * @param autor es el autor del cual se desean ver las claves de sus libros.
	 * @return los libros de determinado autor.
	 */
	public String clavesLibrosPorAutor(String autor) {
		StringBuilder builder = new StringBuilder();
		
		
		for(Entry <String, HashMap<String, Libro>> entry : libros.entrySet()) {
			
			for(Entry <String, Libro> entryTwo : libros.get(entry.getKey()).entrySet()) {
				if(entryTwo.getValue().getAutor().equals(autor));
				builder.append(entryTwo.getKey()+"  |  "+entryTwo.getValue().getTitulo()+"\n");
			}
		}
	return builder.toString();
	}
	
	
	public JSONArray toJsonArray() throws JSONException {
		JSONArray jsonArrayLibros = new JSONArray();
		
		for(Entry <String, HashMap<String, Libro>> entry : libros.entrySet()) { 
			
			String genero = entry.getKey(); 
			JSONArray jsonArrayLibrosDeUnGenero = new JSONArray();
			
			for(Entry <String, Libro> entryTwo : libros.get(entry.getKey()).entrySet()) {
				jsonArrayLibrosDeUnGenero.put(entryTwo.getValue().toJSONObject());
			}
		
			JSONObject jsonObjectGenero = new JSONObject();
			jsonObjectGenero.put(genero, jsonArrayLibrosDeUnGenero);
			jsonArrayLibros.put(jsonObjectGenero);
		}
		return jsonArrayLibros;
	}
	
	
	
}