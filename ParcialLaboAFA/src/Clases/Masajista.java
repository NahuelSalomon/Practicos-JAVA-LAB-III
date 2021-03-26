package Clases;

import org.json.JSONException;
import org.json.JSONObject;

import Interfaces.IAsistencia;


public class Masajista extends IntegranteSeleccion implements IAsistencia{
	
	private String titulo;
	private int añosDeExperiencia;
	
	public Masajista() {
		super();
	}
	
	public Masajista(String nombre, String apellido, int edad, String titulo, int añosDeExperiencia) {
		super(nombre, apellido, edad);
		this.titulo = titulo;
		this.añosDeExperiencia = añosDeExperiencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAñosDeExperiencia() {
		return añosDeExperiencia;
	}

	public void setAñosDeExperiencia(int añosDeExperiencia) {
		this.añosDeExperiencia = añosDeExperiencia;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nTitulo: "+getTitulo()+"\nAños de experiencia: "+getAñosDeExperiencia();
	}

	@Override
	public String viajar() {
		return "Viaja el masajista: "+getNombre()+" "+getApellido();
	}

	@Override
	public String concentrar() {
		return "Concentra el masajista: "+getNombre()+" "+getApellido();
	}

	@Override
	public String darAsistencia() {
		return "Da asistencia el masajista: "+getNombre()+" "+getApellido();
	}

	@Override
	public JSONObject toJSONObject() throws JSONException { 
		JSONObject jsonObject = new JSONObject();
		
		jsonObject = super.toJSONObject();
		jsonObject.put("Titulo", getTitulo());
		jsonObject.put("Años de experiencia", getAñosDeExperiencia());
		
		return jsonObject;
	}

	public static Masajista fromJSONObject(JSONObject jsonObject) throws JSONException {
		
		String nombre = jsonObject.getString("Nombre");
		String apellido = jsonObject.getString("Apellido");
		int edad = jsonObject.getInt("Edad");
		String titulo = jsonObject.getString("Titulo");
		int añosDeExperiencia = jsonObject.getInt("Años de experiencia");
		
		Masajista masajista = new Masajista(nombre, apellido, edad, titulo, añosDeExperiencia);
		
		return masajista; 
	}
	
	@Override
	public String tipoDeIntegrante() {
		return "Masajista";
	}

}
