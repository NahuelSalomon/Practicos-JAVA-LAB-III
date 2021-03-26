package dome;

import java.util.ArrayList;



 /**
  * Clase biblioteca en la cual hay dos listas. Una de cds y otra de dvds.  	
  * FUNCIONALIDADES.
  * Agregar informacion.
  * Buscar informacion por titulo y por genero.
  * Comprobar existencia de informacion
  * imprimir listado de todos los dvd o todos los cd que tengo registrados
  * Eliminar informacion y recuperarla, eliminarla definitivamente. 
  * @author Nahuel
  * 
  */
public class Biblioteca
{
	/***********************************************
    ATRIBUTOS
    ************************************************/
    private ArrayList <CD> cds;
    private ArrayList <DVD> dvds;
   
    
    
    /***********************************************
    METODOS
    ************************************************/
    
    /*-----------------------------------------------
    METODOS CONSTRUCTORES
    -----------------------------------------------*/
    /**
     * Metodo constructor, se inicializa vacio.
     */
    public Biblioteca()
    {
        cds = new ArrayList<CD>();
        dvds = new ArrayList<DVD>();
 
    }
    /**
     * Metodo constructor, se inicializa lleno.
     * @param cds pasa una lista de cds para que la implementarla en la biblioteca
     * @param  dvds pasa una lista de dvds para que la implementarla en la biblioteca 
     */
    public Biblioteca(ArrayList <CD> cds, ArrayList <DVD> dvds) {
    	this.cds = cds;
    	this.dvds = dvds;
    }
    
    
    
    /*-----------------------------------------------
    METODOS PARA AGREGAR INFORMACION
    -----------------------------------------------*/
    /**
     * Funcion para agregar un cd a la lista.
     * @param unCd es el cd para agregar a la lista.
     */
    public void agregarCD(CD unCd)
    {	
       cds.add(unCd);
    }
    /**
     * Funcion para agregar un dvd a la lista.
     * @param unDvd es el cd para agregar a la lista.
     */
    public void agregarDVD(DVD unDvd)
    {
       dvds.add(unDvd);
    }
    
    
    
    /*-------------------------------------------------------
    METODOS PARA ELIMINAR INFORMACION  Y MANDARLA A PAPELERA
    ---------------------------------------------------------*/
    /**
     * Metodo para eliminar un cd de la lista y mandarlo a papelera.
     * @param titulo indica el titulo de la cd que se va a eliminar
     */
    public void eliminarCD(String titulo) {
    	int i = 0;
    	boolean flag = true;
    	while((i < cds.size()) && (flag)) {
    		if(cds.get(i).getTitulo().equals(titulo)) {
    			cds.get(i).setLoTengo(false);
    			flag = false;
    		}
    	i++;
    	}
    }
    /**
     * Metodo para eliminar un dvd de la lista y mandarlo a papelera.
     * @param titulo indica el titulo de la cd que se va a eliminar
     */
    public void eliminarDVD(String titulo) {
    	int i = 0;
    	boolean flag = true;
    	while((i < dvds.size()) && (flag)) {
    		if(dvds.get(i).getTitulo().equals(titulo)) {
    			dvds.get(i).setLoTengo(false);
    			flag = false;
    		}
    	i++;
    	}
    }
    

    
    /*-----------------------------------------------
    METODOS PARA ELIMINAR INFORMACION  DEFINITIVAMENTE
    -----------------------------------------------*/
    /**
     * Metodo para eliminar un cd de la lista y mandarlo a papelera.
     * @param titulo indica el titulo de la cd que se va a eliminar
     */
    public void eliminarCDdefinitivo(String titulo) {
    	int i = 0;
    	boolean flag = true;
    	while((i < cds.size()) && (flag)) {
    		if(cds.get(i).getTitulo().equals(titulo)) {
    			cds.remove(i);	
    			flag = false;
    		}
    	i++;
    	}
    }
    /**
     * Metodo para eliminar un dvd de la lista y mandarlo a papelera.
     * @param titulo indica el titulo de la cd que se va a eliminar
     */
    public void eliminarDVDdefinitivo(String titulo) {
    	int i = 0;
    	boolean flag = true;
    	while((i < dvds.size()) && (flag)) {
    		if(dvds.get(i).getTitulo().equals(titulo)) {
    			dvds.remove(i);	
    			flag = false;
    		}
    	i++;
    	}
    }
    

    
    
    /*-----------------------------------------------
    METODOS PARA IMPRIMIR INFORMACION
    -----------------------------------------------*/
    /**
     * Funcion para imprimir los cd de la lista. Pueden ser los de papelera o los que ya tengo
     * @param loTengo es por si se desea listar los cd que tengo o los que estan en papelera
     * @return todos los cd de la lista.
     */
    public String listarCD(boolean loTengo)
    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < cds.size() ;i++)
        {
            if(cds.get(i).getLoTengo() == loTengo) {
            	builder.append(cds.get(i).imprimir()+" ");	
            }
        }
        return builder.toString();
    }
    /**
     * Funcion para imprimir todos los dvds de la lista.
     * @param loTengo es por si se desea listar los cd que tengo o los que no
     * @return todos los dvds de la lista.
     */
    public String listarDVD(boolean loTengo)
    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < dvds.size() ;i++)
        {
        	if(dvds.get(i).getLoTengo() == loTengo) {
        		builder.append(dvds.get(i).imprimir()+" ");
        	}
        }
        return builder.toString();
    }
    
    
    
    /*-----------------------------------------------
    METODOS PARA BUSCAR INFORMACION
    -----------------------------------------------*/
    /**
     * Funcion para buscar un cd por titulo
     * @param titulo se utiliza para buscar el cd
     * @return el cd buscado
     */
    public CD buscarCDPorTitulo(String titulo) {
    	int i = 0;
    	boolean flag = true;
    	CD buscado = new CD();
    	while((i < cds.size()) && (flag)) {
    		if(cds.get(i).getTitulo().equals(titulo)) {
    			buscado = cds.get(i);	
    			flag = false;
    		}
    	i++;
    	}
    return buscado;
    }
    /**
     * Metodo para buscar un cd por genero
     * @param genero se utiliza para buscar el cd
     * @return el cd buscado convertido a string
     */
    public String buscarCDPorGenero(String genero) {
    	StringBuilder builder = new StringBuilder();
    	for(int i = 0;i < cds.size();i++) {
    		if(cds.get(i).getGenero().equals(genero)) {
    			builder.append(cds.get(i).imprimir());	
    		}
    	}
    return builder.toString();
    }
    /**
     * Metodo para buscar un dvd por titulo
     * @param titulo se utiliza para buscar el dvd
     * @return el dvd buscado convertido a string
     */
    public DVD buscarDVDPorTitulo(String titulo) {
    	int i = 0;
    	boolean flag = true;
    	DVD buscado = new DVD();
    	while((i < dvds.size()) && (flag)) {
    		if(dvds.get(i).getTitulo().equals(titulo)) {
    			buscado = dvds.get(i);	
    			flag = false;
    		}
    	i++;
    	}
    return buscado;
    }
    /**
     * Metodo para buscar un dvd por genero
     * @param genero se utiliza para buscar el dvd
     * @return el dvd buscado
     */
    
    public String buscarDVDPorGenero(String genero) {
    	StringBuilder builder = new StringBuilder();
    	for(int i = 0;i < dvds.size();i++) {
    		if(dvds.get(i).getGenero().equals(genero)) {
    			builder.append(dvds.get(i).imprimir());	
    		}
    	}
    return builder.toString();
    }
    
    
    
    /*-----------------------------------------------
    METODOS PARA COMPROBAR EXISTENCIA DE INFO.
    ------------------------------------------------*/
    /**
     * Metodo para comprobar existencia de cd en la lista por TITULO
     * @param titulo se busca por titulo el cd
     * @return su poscion en la lista si existe, y -1 si no existe.
     */
    public int existeCDPorTitulo(String titulo) {
    int pos = -1;
    int i = 0;
	boolean flag = true;
	while((i < cds.size()) && (flag)) {
		if(cds.get(i).getTitulo().equals(titulo)) {
			pos = i;
			flag = false;
		}
	i++;
	}
	return pos;
    }
    /**
     * Metodo para comprobar existencia de dvd en la lista por TITULO
     * @param titulo se busca por titulo el dvd
     * @return su poscion en la lista si existe, y -1 si no existe.
     */
    public int existeDVDPorTitulo(String titulo) {
        int pos = -1;
        int i = 0;
    	boolean flag = true;
    	while((i < dvds.size()) && (flag)) {
    		if(dvds.get(i).getTitulo().equals(titulo)) {
    			pos = i;
    			flag = false;
    		}
    	i++;
    	}
    	return pos;
        }
    
    
    /**
     * Metodo para comprobar existencia de cd en la lista por GENERO. Se
       comprueba que haya al menos un cd de determina genero para retornar true.
     * @param genero se busca por genero los cds.
     * @return true si existe al menos uno, y false si no existe ninguno.
     */
    public boolean existeCDPorGenero(String genero) {
    boolean existe = false;
    int i = 0;
	boolean flag = true;
	while((i < cds.size()) && (flag)) {
		if(cds.get(i).getGenero().equals(genero)) {
			existe = true;
			flag = false;
		}
	i++;
	}
	return existe;
    }
    /**
     * Metodo para comprobar existencia de dvd en la lista por GENERO. Se
       comprueba que haya al menos un dvd de determina genero para retornar true.
     * @param genero se busca por genero los dvds.
     * @return true si existe al menos uno, y false si no existe ninguno.
     */
    public boolean existeDVDPorGenero(String genero) {
        boolean existe = false;
        int i = 0;
    	boolean flag = true;
    	while((i < dvds.size()) && (flag)) {
    		if(dvds.get(i).getGenero().equals(genero)) {
    			existe = true;
    			flag = false;
    		}
    	i++;
    	}
    	return existe;
        }
    
    

}
