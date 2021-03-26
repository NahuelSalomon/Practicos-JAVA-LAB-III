package Clases;

import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONObject;

import Interfaces.IViajesYConcentracion;

public abstract class IntegranteSeleccion implements IViajesYConcentracion, Serializable{

	private String nombre;
	private String apellido;
	private int edad;
	
	public IntegranteSeleccion() {
		super();
	}
	
	
	public IntegranteSeleccion(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public abstract String tipoDeIntegrante();

	
	@Override
	public String toString() {
		return "\n\nNombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad();
	}

	public static IntegranteSeleccion fromJSONObject (JSONObject jsonObject) throws JSONException {
		IntegranteSeleccion integranteSeleccion = null;
		
		String nombre =  jsonObject.getString("Nombre");
		String apellido =  jsonObject.getString("Apellido");
		int edad = jsonObject.getInt("Edad");
		
		integranteSeleccion.setNombre(nombre);
		integranteSeleccion.setApellido(apellido);
		integranteSeleccion.setEdad(edad);
		
		return integranteSeleccion;
	}
	
	public JSONObject toJSONObject() throws JSONException {
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("Nombre", getNombre());
		jsonObject.put("Apellido", getApellido());
		jsonObject.put("Edad", getEdad());
		
	return jsonObject;
	}
	

	
}
