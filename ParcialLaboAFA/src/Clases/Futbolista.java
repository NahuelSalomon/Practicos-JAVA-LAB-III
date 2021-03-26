package Clases;

import org.json.JSONException;
import org.json.JSONObject;

import Interfaces.IJugarPartidos;


public class Futbolista extends IntegranteSeleccion implements IJugarPartidos{

	
	private int nroDeCamiseta;
	private String puesto;
	
	public Futbolista() {
		super();
	}

	public Futbolista(String nombre, String apellido, int edad,int nroDeCamiseta, String puesto) {
		super(nombre, apellido, edad);
		this.nroDeCamiseta = nroDeCamiseta;
		this.puesto = puesto;
	}

	public int getNroDeCamiseta() {
		return nroDeCamiseta;
	}

	public void setNroDeCamiseta(int nroDeCamiseta) {
		this.nroDeCamiseta = nroDeCamiseta;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public String toString() {
		return super.toString()+"\nNumero de camiseta: "+getNroDeCamiseta()+"\nPuesto: "+getPuesto();
	}

	@Override
	public String viajar() {
		return "Viaja el jugador: "+getNombre()+" "+getApellido();
	}

	@Override
	public String concentrar() {
		return "Concentra el jugador: "+getNombre()+" "+getApellido();
	}

	@Override
	public String jugarPartido() {
		return "Juega un partido el jugador: "+getNombre()+" "+getApellido();
	}

	@Override
	public JSONObject toJSONObject() throws JSONException { 
		JSONObject jsonObject = new JSONObject();
		
		jsonObject = super.toJSONObject();
		jsonObject.put("Numero de camiseta", getNroDeCamiseta());
		jsonObject.put("Puesto", getPuesto());
		
		return jsonObject;
	}

	public static Futbolista fromJSONObject(JSONObject jsonObject) throws JSONException {
		
		String nombre = jsonObject.getString("Nombre");
		String apellido = jsonObject.getString("Apellido");
		int edad = jsonObject.getInt("Edad");
		int nroDeCamiseta = jsonObject.getInt("Numero de camiseta");
		String puesto = jsonObject.getString("Puesto");
		
		Futbolista futbolista = new Futbolista(nombre, apellido, edad, nroDeCamiseta, puesto);
		
		return futbolista;
	}
	
	
	@Override
	public String tipoDeIntegrante() {
		return "Futbolista";
	}

}
