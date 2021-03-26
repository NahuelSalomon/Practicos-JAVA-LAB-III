package EjercicioHashMap2;

import java.io.Serializable;

import org.json.JSONException;
import org.json.JSONObject;

public class LibroImpreso extends Libro implements Serializable{
	
	
	private double  precioAdicional;
	
	
	/***********************************************
    METODOS
    ************************************************/
	
	public LibroImpreso(String titulo,String autor,String genero,String editorial,String idioma,int añoPublicacion, int CantidadHojas, int precio) {
		super(titulo, autor, genero ,editorial,idioma, añoPublicacion , CantidadHojas);
		this. precioAdicional = precio;
	}

	@Override
	public JSONObject toJSONObject() throws JSONException {
		JSONObject jsonObject = new JSONObject();
		
		jsonObject = super.toJSONObject();
		jsonObject.put("Formato: ", getFormato());
		jsonObject.put("Precio: ", getPrecio());
		
		return jsonObject;
	}
	
	@Override
	public String getFormato() {
		return "Impreso";
	}
	
	@Override
	public double getPrecio() {
		return 600 +  precioAdicional;
	}

}