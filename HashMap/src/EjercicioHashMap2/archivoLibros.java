package EjercicioHashMap2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class archivoLibros implements Serializable{
	
	
	private static String archivoLibros = "biblioteca.dat";
	
	public static void escribirBiblioteca(Biblioteca biblioteca) {	
		
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		
		try {
			
			fileOutputStream = new FileOutputStream(archivoLibros);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
			objectOutputStream.writeObject(biblioteca);
			
			objectOutputStream.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		} 
	} 

	
	public static Biblioteca leerBiblioteca() {
		
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		Biblioteca aux = new Biblioteca();
		
		
		try {
			fileInputStream = new FileInputStream(archivoLibros);
			objectInputStream = new ObjectInputStream(fileInputStream);
			
			aux = (Biblioteca) objectInputStream.readObject();
			
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (EOFException e) {
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try  {
				objectInputStream.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	return aux;
	}

}
