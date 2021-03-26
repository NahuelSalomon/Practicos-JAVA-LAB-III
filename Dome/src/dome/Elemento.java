package dome;
/**
 * Clase elemento, reune caracteristicas de dvd, cds y alguna otra clase que se quiera agregar
 * @author Nahuel
 *
 */
public class Elemento
{	
	
	/***********************************************
    ATRIBUTOS
    ************************************************/
    private String titulo;
    private int duracion;
    private boolean loTengo;
    private String comentario;
    private String genero;
    private int año;
    
    
    /***********************************************
    METODOS
    ************************************************/
    
    /*-----------------------------------------------
    METODOS CONSTRUCTORES
    -----------------------------------------------*/
    /**
     * Metodo constructor, se inicializa vacio
     */
    public Elemento()
     {
         titulo = "";
         duracion = 0;
         loTengo =  true;
         comentario = "";
         genero = "";
         año = 0;
     }
   
    /**
     * Metodo constructor, se inicializa lleno
     */
    public Elemento(String titulo, int duracion,boolean loTengo,
    				String comentario, String genero,int año) {
        
        this.titulo = titulo;
        this.duracion = duracion;
        this.loTengo = loTengo;
        this.comentario = comentario;
        this.genero = genero;
        this.año = año;
    }
    
    
    
    /*-----------------------------------------------
    METODOS GETTERS Y SETTERS PARA título
    -----------------------------------------------*/
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
    /*-----------------------------------------------
    METODOS GETTERS Y SETTERS PARA duracion
    -----------------------------------------------*/
    public int getDuracion() {
        return duracion;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
   
    
    
    /*-----------------------------------------------
    METODOS GETTERS Y SETTERS PARA loTengo
    -----------------------------------------------*/
    public boolean getLoTengo() {
    	return loTengo;
    }
    
    public void setLoTengo(boolean loTengo) {
    	this.loTengo = loTengo;
    }
    
    
    /*-----------------------------------------------
    METODOS GETTERS Y SETTERS PARA comentario
    -----------------------------------------------*/
    public String getComentario() {
    	return comentario;
    }
    
    public void setComentario(String comentario) {
    	this.comentario = comentario;
    }
    
    
    
    /*-----------------------------------------------
    METODOS GETTERS Y SETTERS PARA genero
    -----------------------------------------------*/
    public String getGenero() {
    	return genero;
    }
    
    public void setGenero(String genero) {
    	this.genero = genero;
    }
    
    
    
    /*-----------------------------------------------
    METODOS GETTERS Y SETTERS PARA año
    -----------------------------------------------*/
    public int getAño() {
    	return año;
    }
    
    public void setAño (int año) {
    	 this.año = año;
    }
    
    
    /**
     * Metodo para cambiar si lo tengo o no lo tengo
     * @param estado se cambia a true si se recibe false, y
     */
    public void cambiarEstado(boolean estado) {
    	if(estado) loTengo = false;
    	else loTengo = true;
    }
    
    
    
    /**
     * Metodo para imprimir toda la informacion del elemento 
     * @return la informacion del elemento.
     */
    public String imprimir()
    {	
    	String siLoTengo = "";
    	if(loTengo) siLoTengo = "Si";
    	else siLoTengo = "No" ;
        return "Titulo: "+titulo+"\nComentario: "+comentario+"\nDuracion: "+duracion+
        		"\nGenero: "+genero+"\nLo tengo: "+siLoTengo;
    }
    
    /**
     * Metodo para convertir a string el elemento
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}