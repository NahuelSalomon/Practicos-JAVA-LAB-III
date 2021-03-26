package dome;

import java.util.ArrayList;

/**
 * Clase DVD para agregar y manipular la informacion de dvds en la biblioteca
 * @author Nahuel
 *
 */
public class DVD extends Elemento{
	
	
	/***********************************************
    ATRIBUTOS
    ************************************************/
	private String director;
	private String sinopsis;
	private String reparto;
	
	
	/***********************************************
    METODOS
    ************************************************/
	
	/*-----------------------------------------------
    METODOS CONSTRUCTORES
    -----------------------------------------------*/
	/**
	 * Metodo constructor, se inicializa vacio.
	 */
	public DVD() {
		super();
		this.director = "";
		this.sinopsis = "";
		reparto = new String();
	}
	/**
	 * Metodo constructor, se inicializa lleno.
	 */
	public DVD(String titulo, int duracion,boolean loTengo,String comentario, 
			   String genero,int año, String director,String sinopsis,String reparto) {
		super(titulo, duracion, loTengo,comentario,genero,año);
		this.director = director;
		this.sinopsis = sinopsis;
		this.reparto = reparto;
	}

	
	
	/*-----------------------------------------------
    METODOS GETTERS Y SETTERS PARA director.
    -----------------------------------------------*/
	public void setDirector(String director) {
		this.director = director;
	}

	public String getDirector() {
		return director; 
	}

	
	
	/*-----------------------------------------------
    METODOS GETTERS Y SETTERS PARA sinopsis
    -----------------------------------------------*/
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	
	public String getSinopsis() {
		return sinopsis;
	}

	
	
	/*-----------------------------------------------
    METODOS GETTERS Y SETTERS PARA reparto
    -----------------------------------------------*/
	public void setReparto(String reparto) {
		this.reparto = reparto;
	}
	
	public String getReparto() {
		return reparto;
	}
	
	
	
	/**
	 * Metodo para imprimir toda la informacion sobre el dvd.
	 */
	@Override
    public String imprimir()
    {
        return "DVD\n"+super.imprimir()+"\nDirector: "+director+"\nSinopsis: "+sinopsis+
        	   "\nReparto: "+reparto+"\nAnio de estreno: "+getAño()+"\n\n";
    }
	
	@Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();

	}
}
