package Federacion;

import java.io.Serializable;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import ClaseContenedora.ContenedorIntegrantesSeleccion;
import Clases.AyudanteDeCampo;
import Clases.Entrenador;
import Clases.Futbolista;
import Clases.IntegranteSeleccion;
import Clases.Masajista;
import Exepcion.CantidadPlantelExepcion;

public class Federacion implements Serializable{
	
	
	private String nombre;
	private String fechaFundacion;
	private int cantidadDeCopasMundiales;
	private final int  LIMITE_FUTBOLISTAS = 23;
	private final int  LIMITE_ENTRENADOR = 1;
	private ContenedorIntegrantesSeleccion<IntegranteSeleccion> integrantes;
	
	public Federacion() {
		super();
		integrantes = new ContenedorIntegrantesSeleccion<IntegranteSeleccion>();
	}
	
	public Federacion(String nombre, String fechaFundacion, int cantidadDeCopasMundiales) {
		super();
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.cantidadDeCopasMundiales = cantidadDeCopasMundiales;
		this.integrantes = new ContenedorIntegrantesSeleccion<IntegranteSeleccion>();
	}

	public Federacion(Federacion federacion) {
		super();
		this.nombre = federacion.nombre;
		this.cantidadDeCopasMundiales = federacion.cantidadDeCopasMundiales;
		this.fechaFundacion = federacion.fechaFundacion;
		this.integrantes = federacion.integrantes;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(String fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public int getCantidadDeCopasMundiales() {
		return cantidadDeCopasMundiales;
	}

	public void setCantidadDeCopasMundiales(int cantidadDeCopasMundiales) {
		this.cantidadDeCopasMundiales = cantidadDeCopasMundiales;
	}

	public void agregarUnIntegrante(IntegranteSeleccion integrante) throws CantidadPlantelExepcion{
		
		
		if(integrante instanceof Futbolista) {
			if(cantidadFutbolistas() < LIMITE_FUTBOLISTAS) {
				integrantes.agregarUnIntegrante(integrante);
			} 
			else {
				throw new CantidadPlantelExepcion("Limite de futbolistas exedidos");
			}
		
		}
		else {
			if(integrante instanceof Entrenador) {
				if(!hayEntrenador()) {
					integrantes.agregarUnIntegrante(integrante);
				}
				else {
					throw new CantidadPlantelExepcion("Limite de entrenador exedidos");
				}
			}
			else {
				integrantes.agregarUnIntegrante(integrante);
			}
		}
		
	}
	
	public boolean quitarUnIntegrante(IntegranteSeleccion integrante) {
		return integrantes.quitarUnIntegrante(integrante);
	}
	
	public IntegranteSeleccion quitarUnIntegrante(int index) {
		return integrantes.quitarUnIntegrante(index);
	}
	
	public String listarIntegrantes() {
		return integrantes.listarIntegrantes();
	}
	
	public IntegranteSeleccion buscarUnIntegrante(int index) {
		return integrantes.buscarUnIntegrante(index);
	}

	public int cantidadFutbolistas() {
		int cantidad = 0;
		
		for(int i = 0; i < integrantes.cantidadDeIntegrantes(); i++) {
			if(integrantes.buscarUnIntegrante(i) instanceof Futbolista) {
				cantidad++;
			}
		}
		
	return cantidad;
	}
	
	public boolean hayEntrenador() {
		boolean hayEntrenador = false;
		int i = 0;
		
		while((i < integrantes.cantidadDeIntegrantes()) && (!hayEntrenador)) {
			if(integrantes.buscarUnIntegrante(i) instanceof Entrenador) {
				hayEntrenador = true;
			}
		} 
		
	return hayEntrenador;
	}
	
	
	
	public JSONObject toJSONObject() throws JSONException {
		
		JSONObject jsonObjectIntegrantes = new JSONObject();
		JSONArray jsonArrayAyudantesDeCampo = new JSONArray();
		JSONArray jsonArrayMasajistas = new JSONArray();
		JSONArray jsonArrayFutbolistas = new JSONArray();
		JSONArray jsonArrayEntrenador = new JSONArray();
		
		
		for(int i = 0 ; i < integrantes.cantidadDeIntegrantes(); i++) {
			
			if(integrantes.buscarUnIntegrante(i).tipoDeIntegrante().equals("Ayudante de campo")) {
				AyudanteDeCampo ayudanteDeCampoEncontrado = (AyudanteDeCampo) integrantes.buscarUnIntegrante(i);
				jsonArrayAyudantesDeCampo.put(ayudanteDeCampoEncontrado.toJSONObject());
			} 
			if(integrantes.buscarUnIntegrante(i).tipoDeIntegrante().equals("Entrenador")) {
				Entrenador entrenadorEncontrado = (Entrenador) integrantes.buscarUnIntegrante(i);
				jsonArrayEntrenador.put(entrenadorEncontrado.toJSONObject());
			} 
			if(integrantes.buscarUnIntegrante(i).tipoDeIntegrante().equals("Futbolista")) {
				Futbolista futbolistaEncontrado = (Futbolista) integrantes.buscarUnIntegrante(i);
				jsonArrayFutbolistas.put(futbolistaEncontrado.toJSONObject());
			} 
			if(integrantes.buscarUnIntegrante(i).tipoDeIntegrante().equals("Masajista")) {
				Masajista masajistaEncontrado = (Masajista) integrantes.buscarUnIntegrante(i);
				jsonArrayMasajistas.put(masajistaEncontrado.toJSONObject());
			} 
			
		}
		
		
		jsonObjectIntegrantes.put("Nombre", getNombre());
		jsonObjectIntegrantes.put("Fecha de fundacion", getFechaFundacion());
		jsonObjectIntegrantes.put("Cantidad de copas mundiales", getCantidadDeCopasMundiales());
		jsonObjectIntegrantes.put("Entrenador", jsonArrayEntrenador);
		jsonObjectIntegrantes.put("Futbolistas", jsonArrayFutbolistas);
		jsonObjectIntegrantes.put("Masajistas", jsonArrayMasajistas);
		jsonObjectIntegrantes.put("Ayudantes de campo", jsonArrayAyudantesDeCampo);
		
		
		return jsonObjectIntegrantes;
	}
	
	public static Federacion fromJSONObject(JSONObject jsonObjectFederacion) throws JSONException, CantidadPlantelExepcion{
		
		
		
		String nombre = jsonObjectFederacion.getString("Nombre");
		String fechaDeFundacion = jsonObjectFederacion.getString("Fecha de fundacion");
		int cantidadDeCopasMundiales = jsonObjectFederacion.getInt("Cantidad de copas mundiales");
		
		Federacion federacion = new Federacion(nombre, fechaDeFundacion, cantidadDeCopasMundiales);
		
		Entrenador entrenador = Entrenador.fromJSONObject ((JSONObject) jsonObjectFederacion.getJSONArray("Entrenador").get(0));
		federacion.agregarUnIntegrante(entrenador);	
		
		for(int i = 0; i < jsonObjectFederacion.getJSONArray("Futbolistas").length() ; i++)
		{
			Futbolista futbolista = Futbolista.fromJSONObject ((JSONObject) jsonObjectFederacion.getJSONArray("Futbolistas").get(0));
			federacion.agregarUnIntegrante(futbolista);
		}	
		
		for(int i = 0; i < jsonObjectFederacion.getJSONArray("Masajistas").length() ; i++)
		{
			Masajista masajista = Masajista.fromJSONObject ((JSONObject) jsonObjectFederacion.getJSONArray("Masajistas").get(0));
			federacion.agregarUnIntegrante(masajista);
		}		
		
		for(int i = 0; i < jsonObjectFederacion.getJSONArray("Ayudantes de campo").length() ; i++)
		{
			AyudanteDeCampo ayudanteDeCampo = AyudanteDeCampo.fromJSONObject ((JSONObject) jsonObjectFederacion.getJSONArray("Ayudantes de campo").get(0));
			federacion.agregarUnIntegrante(ayudanteDeCampo);
		}
		
		return federacion;
	}

}
