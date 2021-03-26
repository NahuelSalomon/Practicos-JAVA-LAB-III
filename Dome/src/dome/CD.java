package dome;

import java.util.ArrayList;

/**
 * Clase CD para agregar y manipular la informacion de cds en la biblioteca
 * @author Nahuel
 *
 */
public class CD extends Elemento
{	
	/***********************************************
    ATRIBUTOS
    ************************************************/
	private String integrantes;
	private int cantidadDeTemas;
	
	
	/***********************************************
    METODOS
    ************************************************/
    
	
	/*-----------------------------------------------
    METODOS CONSTRUCTORES
    -----------------------------------------------*/
	/**
	 * Metodo constructor, se inicializa vacio.
	 */
	public CD()
    {
        super();
        cantidadDeTemas = 0;
        integrantes = new String();
    }
	/**
     * Metodo constructor, se inicializa lleno.
     */
	public CD (String titulo, int duracion,boolean loTengo,	String comentario, 
    		   String genero,int año,String integrantes, int cantidadDeTemas)
    {
    	super(titulo, duracion, loTengo, comentario, genero,año);
        this.cantidadDeTemas = cantidadDeTemas;
        this.integrantes = integrantes;
        this.cantidadDeTemas = cantidadDeTemas;
        
    }
   
	
	
    /*-----------------------------------------------
    METODOS SETTERS Y GETTERS PARA cantidadDeTemas
    -----------------------------------------------*/
    public void setCantidadDeTemas(int cantidadDeTemas) {
        this.cantidadDeTemas = cantidadDeTemas;
    }
   
    public int getCantidadDeTemas() {
        return cantidadDeTemas;
    }
    
    
    /*-----------------------------------------------
    METODOS SETTERS Y GETTERS PARA integrantes
    -----------------------------------------------*/
    public void setIntegrantes (String integrantes) {
    	this.integrantes = integrantes;
    }
    
    public String getIntegrantes () {
    	return integrantes;
    }
    
    
    /**
     * Metodo para imprimir la informacion del cd
     */
    @Override
    public String imprimir()
    {
        return "CD\n"+super.imprimir()+"\nCantidad de temas: "+cantidadDeTemas+
        	   "\nAnio de lanzamiento: "+getAño()+"\nIntegrantes: "+integrantes+"\n\n";
    }
    
    /**
     * Metodo para imprimir la informacion del cd
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
