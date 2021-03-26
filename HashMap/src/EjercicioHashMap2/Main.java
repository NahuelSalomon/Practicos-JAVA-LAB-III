package EjercicioHashMap2;

import javax.swing.JOptionPane;

import org.json.JSONException;

  


/**
 * En el main se peremite realizar las distintas acciones con los libros. Ingresar, eliminar, buscar, y listar.
   Se puede acceder a la informacion de un libro en particular solo de a un libro a la vez a travez de su clave.
   Se puede acceder a las claves de todos los libros, de determinado titulo, genero o autor.
   Tanto eliminar como listar libros se hacen mediante su clave clave.
   Los metodos para buscar muestran las claves de los distintos libros segun el metodo de busqueda
 * @author nahuel salomon
 *
 */
public class Main {
	
	public static void main(String[] args) { 
		

		Biblioteca biblio = new Biblioteca(archivoLibros.leerBiblioteca());
				
		
		boolean mander = true;
		int op = 0, cantidadHojas, añoPublicacion, precioAdicional;
		String genero, titulo, clave, autor, libro, editorial, idioma;
		
		
		while(mander) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de libros: "+biblio.getCantidadLibro()+"\n1. Ingresar libro\n2. Ver claves de libros\n3. Listar libro\n4. Eliminar libro"
					+ "\n0. Salir"));
			
			switch(op) {
			 /*----------------------------------------------
			CASE PARA INGRESAR LIBROS
			-----------------------------------------------*/
			case 1:
				boolean manderTwo = true;
				while(manderTwo) {
				op = Integer.parseInt(JOptionPane.showInputDialog("1. Libro impreso\n2. Libro digital\n0. Volver"));
				
					switch (op) {
						case 1:
							titulo = JOptionPane.showInputDialog("Titulo");
							genero = JOptionPane.showInputDialog("Genero");
							autor = JOptionPane.showInputDialog("Autor");
							editorial = JOptionPane.showInputDialog("Editorial");
							idioma = JOptionPane.showInputDialog("Idioma");
							añoPublicacion = Integer.parseInt(JOptionPane.showInputDialog("Año de publicacion"));
							precioAdicional =  Integer.parseInt(JOptionPane.showInputDialog("Precio adicional"));
							cantidadHojas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de hojas"));
							biblio.addLibro(new LibroImpreso(titulo,autor,genero,editorial,idioma,añoPublicacion,cantidadHojas,precioAdicional));
							JOptionPane.showMessageDialog(null, "El libro se ha ingresado con exito");
							break;
						case 2:
							titulo = JOptionPane.showInputDialog("Titulo");
							genero = JOptionPane.showInputDialog("Genero");
							autor = JOptionPane.showInputDialog("Autor");
							editorial = JOptionPane.showInputDialog("Editorial");
							idioma = JOptionPane.showInputDialog("Idioma");
							añoPublicacion = Integer.parseInt(JOptionPane.showInputDialog("Año de publicacion"));
							precioAdicional =  Integer.parseInt(JOptionPane.showInputDialog("Precio adicional"));
							cantidadHojas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de hojas"));
							String formato = JOptionPane.showInputDialog("Formato");
							biblio.addLibro(new LibroElectronico(titulo, autor, genero, editorial,idioma,añoPublicacion,cantidadHojas,formato,precioAdicional));
							JOptionPane.showMessageDialog(null, "El libro se ha ingresado con exito");
							break;
						case 0: 
							manderTwo = false;
							break;
						default:
							JOptionPane.showMessageDialog(null, "Opcion no valida");
							break;
					}
				}
				break;
				 /*---------------------------------------------------------
				CASE PARA VER CLAVES DE LIBROS MEDIANTE METODOS DE BUSQUEDA
				------------------------------------------------------------*/
			case 2:
				boolean manderThree = true;
				while(manderThree) {
					op = Integer.parseInt(JOptionPane.showInputDialog("Ver claves de libros\n1. Todos\n2. Por titulo\n3. Por genero\n4. Por autores\n0. Volver"));
					switch(op) {
						
						case 1:
							JOptionPane.showMessageDialog(null, biblio.allLibros());
							break;
						case 2:
							titulo = JOptionPane.showInputDialog("Titulo");
							libro = biblio.clavesLibrosPorTitulo(titulo);
							if(!libro.isEmpty()) {
								JOptionPane.showMessageDialog(null, libro);
							}
							else {
								JOptionPane.showMessageDialog(null, "No hay libros con el titulo "+titulo);
							}
							break;
						case 3:
							genero = JOptionPane.showInputDialog("Genero");
							
							libro = biblio.clavesLibrosPorGenero(genero);
							
							if(!libro.isEmpty()) {
								JOptionPane.showMessageDialog(null, libro);
							}
							else {
								JOptionPane.showMessageDialog(null, "No hay libros con el genero "+genero);
							}
							break;
						case 4:
							autor = JOptionPane.showInputDialog("Autor");
							libro = biblio.clavesLibrosPorTitulo(autor);
							if(!libro.isEmpty()) {
								JOptionPane.showMessageDialog(null, libro);
							}
							else {
								JOptionPane.showMessageDialog(null, "No hay libros con el autor "+autor);
							}
							break;
						case 0:
							manderThree = false;
							break;
						default:
							JOptionPane.showMessageDialog(null, "Opcion no valida");
							break;
					}
				}
				break;
				
				 /*---------------------------------------
				CASE PARA LISTAR UN LIBRO EN PARTICULAR
				------------------------------------------*/
			case 3:
		
					clave = JOptionPane.showInputDialog("Clave del libro");
					if(biblio.existeClave(clave)) {
						JOptionPane.showMessageDialog(null, biblio.listarLibro(clave));
					}
					else {
						JOptionPane.showMessageDialog(null, "La clave es inexistente");
					}
					
				
				break;
			
				 /*--------------------------------------
				CASE PARA ELIMINAR UN LIBRO
				-----------------------------------------*/
			case 4:
				clave = JOptionPane.showInputDialog("Clave del libro a elminar");
				if(biblio.existeClave(clave)) {
					biblio.eliminarLibroPorClave(clave);
					JOptionPane.showMessageDialog(null, "El libro se ha eliminado con exito");
				} 
				else {
					JOptionPane.showMessageDialog(null, "La clave es inexistente");
				}
				break; 
			
				 /*------------------------------------
				CASE PARA SALIR
				---------------------------------------*/
			case 0:
				archivoLibros.escribirBiblioteca(biblio);
				mander = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida");
				break;
			}
		}
	
		try {
			System.out.println(biblio.toJsonArray());
		}
		catch(JSONException e) {
			e.printStackTrace();
		}
	}
	
	
	
}