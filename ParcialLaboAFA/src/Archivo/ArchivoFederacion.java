package Archivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import ClaseContenedora.ContenedorIntegrantesSeleccion;
import Federacion.Federacion;

public class ArchivoFederacion implements Serializable{

	private static String archivoIntegrantes = "integrantes.dat";

	public static void escribirArchivo(Federacion federacion) {
		
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		
		try {
			fileOutputStream = new FileOutputStream(archivoIntegrantes);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
			objectOutputStream.writeObject(federacion);
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				objectOutputStream.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	
	}

	public static Federacion leerArchivo() {
		
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		Federacion federacion = new Federacion();
		
		try {
			fileInputStream = new FileInputStream(archivoIntegrantes);
			objectInputStream = new ObjectInputStream(fileInputStream);
			federacion =  (Federacion) objectInputStream.readObject(); 
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				objectInputStream.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	return federacion;
	}

}
