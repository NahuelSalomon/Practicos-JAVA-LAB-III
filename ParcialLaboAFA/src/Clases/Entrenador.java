package Clases;

import org.json.JSONException;
import org.json.JSONObject;

import Interfaces.IJugarPartidos;
import Interfaces.IPrepararEntrenamientos;


public class Entrenador extends IntegranteSeleccion  implements IJugarPartidos, IPrepararEntrenamientos {
	
	private String sistemaDeJuego;
	private String estilo;
	
	public Entrenador() {
		super();
	}
	
	public Entrenador(String nombre, String apellido, int edad, String sistemaDeJuego, String estilo) {
		super(nombre, apellido, edad);
		this.sistemaDeJuego = sistemaDeJuego;
		this.estilo = estilo;
	}

	public String getSistemaDeJuego() {
		return sistemaDeJuego;
	}

	public void setSistemaDeJuego(String sistemaDeJuego) {
		this.sistemaDeJuego = sistemaDeJuego;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nSistema de juego: "+getSistemaDeJuego()+"\nEstilo: "+getEstilo();
	}
	

	@Override
	public String viajar() {
		return "Viaja el entrenador: "+getNombre()+" "+getApellido();
	}

	@Override
	public String concentrar() {
		return "Concentra el entrenador: "+getNombre()+" "+getApellido();
	}

	@Override
	public String prepararEntrenamiento() {
		return "Prepara un entrenamiento el entrenador: "+getNombre()+" "+getApellido();
	}

	@Override
	public String jugarPartido() {
		return "Juega un partido el entrenador: "+getNombre()+" "+getApellido();
	}
	
	@Override
	public JSONObject toJSONObject() throws JSONException { 
		JSONObject jsonObject = new JSONObject();
		
		jsonObject = super.toJSONObject();
		jsonObject.put("Sistema de juego", getSistemaDeJuego());
		jsonObject.put("Estilo", getEstilo());
		
		return jsonObject;
	}
	
	public static Entrenador fromJSONObject(JSONObject jsonObject) throws JSONException {
		
		String nombre = jsonObject.getString("Nombre");
		String apellido = jsonObject.getString("Apellido");
		int edad = jsonObject.getInt("Edad");
		String sistemaDeJuego = jsonObject.getString("Sistema de juego");
		String estilo = jsonObject.getString("Estilo");
		
		Entrenador entrenador = new Entrenador(nombre, apellido, edad, sistemaDeJuego, estilo);
		
		return entrenador; 
	}
	
	@Override
	public String tipoDeIntegrante() {
		return "Entrenador";
	}
	
}
