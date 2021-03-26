package EjercicioHashMap2;

import java.io.Serializable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class Libro implements Comparable<Libro>, Serializable
{	
	/***********************************************
    ATRIBUTOS
    ************************************************/
	
	private String titulo;
    private String autor;
    private String genero;
    private String editorial;
    private String idioma;
    private int añoPublicacion;
    private int cantidadhojas;
    
    /***********************************************
    METODOS
    ************************************************/
    
    /*----------------------------------------------
	CONSTRUCTOR
	-----------------------------------------------*/
    public Libro(String titulo, String autor,String genero,String editorial,String idioma
    			 ,int añoPublicacion,int CantidadHojas)
    {
    	this.titulo = titulo;
    	this.autor = autor;
    	this.genero = genero;
    	this.editorial = editorial;
    	this.idioma = idioma;
    	this.añoPublicacion = añoPublicacion;
        this.cantidadhojas = CantidadHojas;
    }
    
    
    /*----------------------------------------------
	METODO SETTERS.
	-----------------------------------------------*/
    public void setTitulo(String titulo) {
    	this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
    	this.autor = autor;
    }
    
    public void setGenero(String genero) {
    	this.genero = genero;
    }
    
    public void setEditorial(String editorial) {
    	this.editorial = editorial;
    }
    
    public void setIdioma (String idioma) {
    	this.idioma = idioma;
    }
    
    public void setAñoPublicacion (int añoPublicacion) {
    	this.añoPublicacion = añoPublicacion;
    }
    
    public void setCantidadhojas(int cantidadhojas) {
        this.cantidadhojas = cantidadhojas;
    }
    
    
    /*----------------------------------------------
	METODOS GETTERS.
	-----------------------------------------------*/
    
    public String getTitulo() {
    	return this.titulo;
    }
    
    public String getAutor() {
    	return this.autor;
    }
    
    public String getGenero() {
    	return this.genero;
    }
    
    public String getEditorial() {
    	return this.editorial;
    }
    
    public String getIdioma () {
    	return this.idioma;
    }
    
    public int getAñoPublicacion () {
    	return this.añoPublicacion;
    }
    
    public int getCantidadhojas() {
        return this.cantidadhojas;
    }
    
    
    public JSONObject toJSONObject() throws JSONException {
    	JSONObject jsonObject = new JSONObject();
    
    	jsonObject.put("Titulo: ", getTitulo());
    	jsonObject.put("Autor: ", getAutor());
    	jsonObject.put("Genero: ", getGenero());
    	jsonObject.put("Editorial: ", getEditorial());
    	jsonObject.put("Idioma: ", getIdioma());
    	jsonObject.put("Año de publicacion: ", getAñoPublicacion());
    	jsonObject.put("Cantidad de hojas", getCantidadhojas());
    	
    return jsonObject;
    }
    
    
    
    /*----------------------------------------------
	METODOS ABSTRACTOS
	-----------------------------------------------*/
    public abstract double getPrecio();
    public abstract String getFormato();
     
       
    /*----------------------------------------------
	METODOS SOBREESCRITOS
	-----------------------------------------------*/
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Titulo: "+getTitulo()+"\nAutor: "+getAutor()+"\nEditorial: "+getEditorial()+"\nIdioma: "+getIdioma()+"\nAño publicacion: "+getAñoPublicacion()
               +"\nCantidad de hojas: "+getCantidadhojas()+
        		"\nFormato: "+getFormato()+"\nPrecio: "+getPrecio();
    }
     
    @Override
    public int compareTo(Libro o)
    {
        //si son iguales > 0
        if (o.getCantidadhojas() == getCantidadhojas()) return 0;
        if (getCantidadhojas() > o.getCantidadhojas()) return 1;
        if (getCantidadhojas() < o.getCantidadhojas()) return -1;
        return 0;
    }
        		
        		
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return 0;
    }
   
   
}