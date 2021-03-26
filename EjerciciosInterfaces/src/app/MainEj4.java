package app;

import javax.swing.JOptionPane;

import clasesEj4.Biblioteca;
import clasesEj4.Libro;
import clasesEj4.Revista;

public class MainEj4 {

	public static void main(String[] args) {
		Libro libro1 = new Libro(0011,"Simple",2008);
		Libro libro2 = new Libro(0012,"Pinpulines",2008);
		Libro libro3 = new Libro(0013,"Economia y politicas sobre el dinero",2008);
		Revista revista1 = new Revista(1111, "Caricatruras", 2011, 69326);
		Revista revista2 = new Revista(1112, "Los petodsa",1998, 69325);
		Revista revista3 = new Revista(1113, "arroba y un poco mas", 2018, 69327);
	
		Biblioteca biblio = new Biblioteca();
		biblio.agregarUnElemento(libro1);
		biblio.agregarUnElemento(libro2);
		biblio.agregarUnElemento(libro3);
		biblio.agregarUnElemento(revista1);
		biblio.agregarUnElemento(revista2);
		biblio.agregarUnElemento(revista3);
		
		boolean mander = true;
		int op ; 
		String titulo;
		int añoPublicacion, codigo;
		
		
		
		while(mander) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al sistema\n1. Crear libro\n2. Crear revista\n3. Borrar un libro\n4. Borrar una revista"
										+ "\n5. Devolver un libro\n6. Prestar un libro\n7. Mostrar elementos\n8. Salir"));
			switch (op) {
			case 1:
				titulo = JOptionPane.showInputDialog("Titulo");
				añoPublicacion = Integer.parseInt(JOptionPane.showInputDialog("Año de lanzamiento"));
				codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
				Libro nuevo = new Libro(codigo, titulo, añoPublicacion);
				biblio.agregarUnElemento(nuevo);
				break;
			
			case 2:
				titulo = JOptionPane.showInputDialog("Titulo");
				añoPublicacion = Integer.parseInt(JOptionPane.showInputDialog("Año de lanzamiento"));
				codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
				Revista nueva = new Revista(codigo, titulo, añoPublicacion, numero);
				biblio.agregarUnElemento(nueva);
				break;
			
			case 3:	
				titulo = JOptionPane.showInputDialog("Titulo del libro a borrar");
				biblio.borrarUnLibro(titulo);
				break;
			
			case 4:
				titulo = JOptionPane.showInputDialog("Titulo de la revista a borrar");
				biblio.borrarUnaResvista(titulo);
				break;				
			case 5: 
				titulo = JOptionPane.showInputDialog("Titulo del libro a devolver");
				biblio.devolverUnLibro(titulo);
				break;
			case 6:
				titulo = JOptionPane.showInputDialog("Titulo del libro a prestar");
				biblio.prestarUnLibro(titulo);
				break;
			case 7:
				JOptionPane.showMessageDialog(null, biblio.mostrarElementos());
				break;
			case 8:
				mander = false;
				break;
			default:
				break;
			}
			
		}
	}

}
