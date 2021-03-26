package Ejecutable;

import org.json.JSONException;
import org.json.JSONObject;

import Archivo.ArchivoFederacion;
import Clases.AyudanteDeCampo;
import Clases.Entrenador;
import Clases.Futbolista;
import Clases.Masajista;
import Exepcion.CantidadPlantelExepcion;
import Federacion.Federacion;

public class Main {

	public static void main(String[] args) {
			
		Federacion federacion = new Federacion(ArchivoFederacion.leerArchivo());
		
		/**
		 * CARGA AUXILIAR DE INTEGRANTES EN CASO DE QUE SE ROPA EL ARCHIVO
		 * EN CASO DE QUE SE ROPA DESCOMENTAR TODO LO QUE ESTA A CONTINUACION Y COMENTAR LINEA DE ARRIBA 
		 */
	
		/*Federacion federacion = new Federacion("AFA","2/5/1905",2);
		try{
			
			federacion.agregarUnIntegrante(new Entrenador("Alejandro", "Sabela", 65, "Ultraofensivo", "tiki tiki"));
			federacion.agregarUnIntegrante(new Futbolista("Lionel", "Messi", 32, 10, "Delantero"));
			federacion.agregarUnIntegrante(new Futbolista("Javier", "Mascherado", 35, 5, "Mediocampista"));
			federacion.agregarUnIntegrante(new Futbolista("Sergio", "Aguero", 32, 9, "Delantero"));
			federacion.agregarUnIntegrante(new Futbolista("Nicolas", "Otamendi", 35, 2, "Defensor"));
			federacion.agregarUnIntegrante(new Futbolista("Carlos", "Tevez", 34, 11, "Delantero"));
			federacion.agregarUnIntegrante(new Futbolista("Franco", "Armani", 32, 1, "Arquero"));
			federacion.agregarUnIntegrante(new Masajista("Pablo", "Leña", 25, "Tecnico masajista", 5));
			federacion.agregarUnIntegrante(new Masajista("Franco", "Gonzalez", 45, "Linceciado masajista", 20));
			federacion.agregarUnIntegrante(new Masajista("Rocio", "Banega", 30, "Linceciada masajista", 8));
			federacion.agregarUnIntegrante(new AyudanteDeCampo("Pipo", "Gonzalez", 38, "Ataque"));
			federacion.agregarUnIntegrante(new AyudanteDeCampo("Pepe", "Gonzalez", 38, "Defensa"));
			
		}
		catch(CantidadPlantelExepcion e) {
			e.printStackTrace();
		} */
		
		
		
		System.out.println(federacion.listarIntegrantes());
		
		
	
		try {
			
			System.out.println("\n\n\n\nDE FEDERACION A JSON\n");
			System.out.println(federacion.toJSONObject()); 
			
			System.out.println("\n\n\n\nDE JSON A FEDERACION");
			
			JSONObject jsonObjectFederacion = federacion.toJSONObject();
			System.out.println(Federacion.fromJSONObject(jsonObjectFederacion).listarIntegrantes());
		}
		catch(CantidadPlantelExepcion e) {
			e.printStackTrace();
		}
		catch (JSONException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
