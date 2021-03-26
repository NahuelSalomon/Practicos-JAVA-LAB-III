package Clases;

import org.json.JSONException;
import org.json.JSONObject;

import Interfaces.IJugarPartidos;
import Interfaces.IPrepararEntrenamientos;


public class AyudanteDeCampo extends IntegranteSeleccion implements IJugarPartidos, IPrepararEntrenamientos{

	private String metodologia;

	public AyudanteDeCampo() {
		super();
	}

	public AyudanteDeCampo(String nombre, String apellido, int edad, String metodologia) {
		super(nombre, apellido, edad);
		this.metodologia = metodologia;
	}

	public String getMetodologia() {
		return metodologia;
	}

	public void setMetodologia(String metodologia) {
		this.metodologia = metodologia;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nMetodologia: "+getMetodologia();
	}

	@Override
	public String viajar() {
		return "Viaja el ayudante de campo: "+getNombre()+" "+getApellido();
	}

	@Override
	public String concentrar() {
		return "Concentra el ayudante de campo: "+getNombre()+" "+getApellido();
	}

	@Override
	public String prepararEntrenamiento() {
		return "Prepara un entrenamiento el ayudante de campo: "+getNombre()+" "+getApellido();
	}

	@Override
	public String jugarPartido() {
		return "Juega un partido el ayudante de campo: "+getNombre()+" "+getApellido();
	}
	
	@Override
	public JSONObject toJSONObject() throws JSONException { 
		JSONObject jsonObject = new JSONObject();
		
		jsonObject = super.toJSONObject();
		jsonObject.put("Metodologia", getMetodologia());
		
		return jsonObject;
	}

	public static AyudanteDeCampo fromJSONObject(JSONObject jsonObject) throws JSONException {
		
		String nombre = jsonObject.getString("Nombre");
		String apellido = jsonObject.getString("Apellido");
		int edad = jsonObject.getInt("Edad");
		String metodologia = jsonObject.getString("Metodologia");
		
		
		AyudanteDeCampo ayudanteDeCampo = new AyudanteDeCampo(nombre, apellido, edad, metodologia);
	
		return ayudanteDeCampo;
	}
	
	@Override
	public String tipoDeIntegrante() {
		return "Ayudante de campo";
	}
	
}
